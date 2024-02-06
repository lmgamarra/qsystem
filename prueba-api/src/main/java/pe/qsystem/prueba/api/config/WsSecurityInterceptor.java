package pe.qsystem.prueba.api.config;

import java.util.Iterator;
import java.util.Locale;
import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.SoapBody;
import org.springframework.ws.soap.SoapBodyException;
import org.springframework.ws.soap.SoapFaultException;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.server.SoapEndpointInterceptor;
import pe.qsystem.prueba.domain.service.UserSecurityService;

/**
 *
 * @author Nestor Hernandez Loli
 */
@Slf4j
public class WsSecurityInterceptor implements SoapEndpointInterceptor {

    private static final QName WSSE = new QName("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security", "wsse");

    private final UserSecurityService service;
    private final String usuario;

    public WsSecurityInterceptor(UserSecurityService service, String usuario) {
        this.service = service;
        this.usuario = usuario;
    }

    @Override
    public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {
        SoapMessage soapMessage = (SoapMessage) messageContext.getRequest();
        SoapHeader soapHeader = soapMessage.getSoapHeader();
        if (soapHeader == null) {
            //log.warn("No se envío headers. Se deniega acceso");
            writeFault(messageContext);
            return false;
        }
        Iterator<SoapHeaderElement> it = soapHeader.examineHeaderElements(WSSE);
        if (it.hasNext()) {
            var securityHeader = JAXB.unmarshal(it.next().getSource(), Security.class);
            boolean ok = evaluarAuthenticacion(securityHeader);
            if (!ok) {
                //log.warn("No se superó la autenticación. Se evaluó el header Security WS-Security. Usuario={}. Se deniega acceso",
                        //securityHeader.usernameToken.username);
                writeFault(messageContext);
            }
            return ok;
        } else {
            //log.warn("No se envía el header Security WS-Security. Se deniega acceso");
            writeFault(messageContext);
            return false;
        }
    }

    private void writeFault(MessageContext messageContext) throws SoapBodyException, SoapFaultException {
        SoapBody response = ((SoapMessage) messageContext.getResponse()).getSoapBody();
        response.addClientOrSenderFault("Bad credentials", Locale.ENGLISH);
    }

    @Override
    public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
        return true;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) throws Exception {
    }

    @Override
    public boolean understands(SoapHeaderElement header) {
        //log.debug("Evaluando header name = {}", header.getName());
        return header.getName().equals(WSSE);
    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(namespace = Security.SECURITY_NS, name = "Security")
    public static class Security {

        public static final String SECURITY_NS = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";

        @XmlElement(namespace = SECURITY_NS, name = "UsernameToken")
        private UsernameToken usernameToken;

    }

    @Data
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(namespace = Security.SECURITY_NS, name = "UsernameToken")
    public static class UsernameToken {

        @XmlElement(name = "Username", namespace = Security.SECURITY_NS)
        private String username;

        @XmlElement(name = "Password", namespace = Security.SECURITY_NS)
        private String password;

    }

    private boolean evaluarAuthenticacion(Security securityHeader) {
        //BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        boolean ok = false;
        if (usuario.equals(securityHeader.usernameToken.username)) {
            String hashCode = service.getHashUsuario(usuario);
            //ok = encoder.matches(securityHeader.usernameToken.password, hashCode);
        }
        return ok;
    }

}
