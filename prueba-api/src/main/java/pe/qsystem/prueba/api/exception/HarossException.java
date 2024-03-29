package pe.qsystem.prueba.api.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CUSTOM, 
	customFaultCode = "{" + HarossException.NAMESPACE_URI + "}custom_fault",
	faultStringOrReason = "@faultString")
public class HarossException extends Exception{

	private static final long serialVersionUID = 1L;
	public static final String NAMESPACE_URI = "http://api.siam.telefonica.pe/exception";

    public HarossException(String message) {
        super(message);
    }
}
