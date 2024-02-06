package pe.qsystem.prueba.domain.exceptions;

public class OrquestadorSIAMException extends GenericSIAMException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrquestadorSIAMException() {
	}

	public OrquestadorSIAMException(String message) {
		super(message);
	}

	public OrquestadorSIAMException(String message, Throwable cause) {
		super(message, cause);
	}

}
