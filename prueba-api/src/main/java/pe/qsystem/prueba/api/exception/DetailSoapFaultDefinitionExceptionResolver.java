package pe.qsystem.prueba.api.exception;

import javax.xml.namespace.QName;

import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.SoapFaultDetail;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;

import pe.qsystem.prueba.domain.entity.ServiceStatusSOAP;
import pe.qsystem.prueba.domain.exceptions.HarossServiceFaultException;

public class DetailSoapFaultDefinitionExceptionResolver extends SoapFaultMappingExceptionResolver {

    private static final QName CODE = new QName("statusCode");
    private static final QName MESSAGE = new QName("message");

    @Override
    protected void customizeFault(Object endpoint, Exception ex, SoapFault fault) {
        logger.error("Error de servidor! ", ex);
        if (ex instanceof HarossServiceFaultException) {
            ServiceStatusSOAP status = ((HarossServiceFaultException) ex).getServiceStatusSOAP();
            SoapFaultDetail detail = fault.addFaultDetail();
            detail.addFaultDetailElement(CODE).addText(String.valueOf(status.getCode()));
            detail.addFaultDetailElement(MESSAGE).addText(status.getDescription());
        } else {
            SoapFaultDetail detail = fault.addFaultDetail();
            detail.addFaultDetailElement(CODE).addText("100");
            detail.addFaultDetailElement(MESSAGE).addText("Error interno de servidor");
        }
    }
}
