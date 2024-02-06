package pe.qsystem.prueba.domain.exceptions;

public class NotFoundException extends GenericSIAMException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException() {
	}

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
