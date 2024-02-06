package pe.qsystem.prueba.api.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.valves.RemoteIpValve;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Nestor Hernandez Loli
 */
@Configuration
@Slf4j
public class AppConfig {

    @Bean
    public ServerCustomizer container() {
        return new ServerCustomizer();
    }

    public static class ServerCustomizer implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

        @Override
        public void customize(TomcatServletWebServerFactory factory) {
            //log.info("Custom Tomcat!");
            var valve = new RemoteIpValve();
            valve.setRemoteIpHeader("x-forwarded-for");
            factory.addContextValves(valve);
        }
    }
}
