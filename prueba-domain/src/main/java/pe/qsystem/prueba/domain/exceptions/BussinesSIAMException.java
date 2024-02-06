package pe.qsystem.prueba.domain.exceptions;

public class BussinesSIAMException extends GenericSIAMException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BussinesSIAMException() {
	}

	public BussinesSIAMException(String message) {
		super(message);
	}

	public BussinesSIAMException(String message, Throwable cause) {
		super(message, cause);
	}

}
