package pe.qsystem.prueba.api.config;

import java.time.Duration;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pe.qsystem.prueba.api.controller.SiamSessionArgumentsResolver;
//import pe.qsystem.prueba.wsutils.TrustAllHttpRequestFactory;

/**
 *
 * @author Nestor Hernandez Loli
 */
@Configuration
@Slf4j
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        //resolvers.add(sessionArgumentsResolver());
    }

    @Bean
    public SiamSessionArgumentsResolver sessionArgumentsResolver() {
        return null; //new SiamSessionArgumentsResolver();
    }

    @Bean
    public RestTemplate restTemplate(
            @Value("${app.timeoutws:60000}") int timeout,
            @Value("${app.trustallcerts:false}") boolean trustAllCerts) {
        //var rf = trustAllCerts ? new TrustAllHttpRequestFactory() : new SimpleClientHttpRequestFactory();
        //rf.setConnectTimeout(timeout);
        //rf.setReadTimeout(timeout);
        return null; //new RestTemplate(rf);
    }
}
