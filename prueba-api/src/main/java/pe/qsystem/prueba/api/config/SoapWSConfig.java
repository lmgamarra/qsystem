package pe.qsystem.prueba.api.config;

import java.util.List;
import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.server.endpoint.interceptor.PayloadLoggingInterceptor;
import org.springframework.ws.soap.server.endpoint.SoapFaultDefinition;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
//import pe.qsystem.prueba.api.exception.DetailSoapFaultDefinitionExceptionResolver;
import pe.qsystem.prueba.domain.entity.ServiceStatusSOAP;
import pe.qsystem.prueba.domain.service.UserSecurityService;

@EnableWs
@Configuration("soapWsConfig")
public class SoapWSConfig extends WsConfigurerAdapter {


    @Autowired
    UserSecurityService service;

    @Value("${app.usuario.haross}")
    String usuarioHaross;

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(
            ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean
    public PayloadLoggingInterceptor payloadLoggingInterceptor() {
        return new PayloadLoggingInterceptor();
    }

    @Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        interceptors.add(payloadLoggingInterceptor());
        interceptors.add(new WsSecurityInterceptor(service, usuarioHaross));
    }

    @Bean
    public SoapFaultMappingExceptionResolver exceptionResolver() {
        //SoapFaultMappingExceptionResolver exceptionResolver = new DetailSoapFaultDefinitionExceptionResolver();

        SoapFaultDefinition faultDefinition = new SoapFaultDefinition();
        faultDefinition.setFaultCode(SoapFaultDefinition.SERVER);
        faultDefinition.setFaultStringOrReason("Internal server error");
        //exceptionResolver.setDefaultFault(faultDefinition);

        Properties errorMappings = new Properties();
        errorMappings.setProperty(Exception.class.getName(), SoapFaultDefinition.SERVER.toString());
        errorMappings.setProperty(ServiceStatusSOAP.class.getName(), SoapFaultDefinition.SERVER.toString());
        //exceptionResolver.setExceptionMappings(errorMappings);
        //exceptionResolver.setOrder(1);
        return null; //exceptionResolver;
    }

}
