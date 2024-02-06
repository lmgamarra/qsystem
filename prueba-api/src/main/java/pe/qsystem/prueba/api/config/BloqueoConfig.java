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
public class BloqueoConfig {

    public static final String NAMESPACE_BLOQUEO = "http://api.siam.telefonica.pe/schema/users";

    @Bean(name = "users-definition")
    public DefaultWsdl11Definition userDefinition(@Qualifier("usersSchema") XsdSchema usersSchema) {
        DefaultWsdl11Definition def = new DefaultWsdl11Definition();
        def.setPortTypeName("UserServicePort");
        def.setLocationUri("/ws");
        def.setTargetNamespace(NAMESPACE_BLOQUEO);
        def.setSchema(usersSchema);
        return def;
    }

    @Bean("usersSchema")
    public XsdSchema usersSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/users-schema.xsd"));
    }

    @Bean
    public PayloadValidatingInterceptor bloqueoValidatingInterceptor() {
        PayloadValidatingInterceptor interceptor = new PayloadValidatingInterceptor();
        interceptor.setSchema(new ClassPathResource("xsd/users-schema.xsd"));
        return interceptor;
    }

    @Bean
    public PayloadRootSmartSoapEndpointInterceptor bloqueoValidator() {
        return new PayloadRootSmartSoapEndpointInterceptor(
                bloqueoValidatingInterceptor(), NAMESPACE_BLOQUEO, null);
    }

}
