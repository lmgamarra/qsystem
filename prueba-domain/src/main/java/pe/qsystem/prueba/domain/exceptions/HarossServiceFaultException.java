package pe.qsystem.prueba.domain.exceptions;

import pe.qsystem.prueba.domain.entity.ServiceStatusSOAP;

public class HarossServiceFaultException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private ServiceStatusSOAP serviceStatusSOAP;

	public HarossServiceFaultException(String message, ServiceStatusSOAP serviceStatusSOAP) {
		super(message);
		this.serviceStatusSOAP = serviceStatusSOAP;
	}

	public HarossServiceFaultException(String message, Throwable e, ServiceStatusSOAP serviceStatusSOAP) {
		super(message, e);
		this.serviceStatusSOAP = serviceStatusSOAP;
	}

	public ServiceStatusSOAP getServiceStatusSOAP() {
		return serviceStatusSOAP;
	}

	public void setServiceStatusSOAP(ServiceStatusSOAP serviceStatusSOAP) {
		this.serviceStatusSOAP = serviceStatusSOAP;
	}
}
