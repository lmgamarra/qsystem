package pe.qsystem.prueba.api.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadRootSmartSoapEndpointInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 *
 * @author Néstor Hernández Loli
 */
@Configuration
@DependsOn("soapWsConfig")
public class MuerteInformaticaConfig {

    public static final String NAMESPACE_MUERTE_INFORMATICA = "http://api.siam.telefonica.pe/schema/muerte-informatica";

    @Bean(name = "muerte-informatica-definition")
    public DefaultWsdl11Definition muerteInformaticaDefinition(@Qualifier("muerteInformaticaSchema") XsdSchema muerteInformaticaSchema) {
        DefaultWsdl11Definition def = new DefaultWsdl11Definition();
        def.setPortTypeName("MuerteInformaticaPort");
        def.setLocationUri("/ws");
        def.setTargetNamespace(NAMESPACE_MUERTE_INFORMATICA);
        def.setSchema(muerteInformaticaSchema);
        return def;
    }

    @Bean("muerteInformaticaSchema")
    public XsdSchema muerteInformaticaSchema() {
        return new SimpleXsdSchema(new ClassPathResource("schema/muerte-informatica.xsd"));
    }

    @Bean
    public PayloadValidatingInterceptor muerteInformaticaInterceptor() {
        PayloadValidatingInterceptor interceptor = new PayloadValidatingInterceptor();
        interceptor.setSchema(new ClassPathResource("schema/muerte-informatica.xsd"));
        return interceptor;
    }

    @Bean
    public PayloadRootSmartSoapEndpointInterceptor muerteInformaticaValidator() {
        return new PayloadRootSmartSoapEndpointInterceptor(
                muerteInformaticaInterceptor(), NAMESPACE_MUERTE_INFORMATICA, null);
    }
    
}
