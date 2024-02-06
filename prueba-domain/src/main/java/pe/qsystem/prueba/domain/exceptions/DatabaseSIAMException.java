package pe.qsystem.prueba.domain.exceptions;

public class DatabaseSIAMException extends GenericSIAMException {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DatabaseSIAMException() {
	}

	public DatabaseSIAMException(String message) {
		super(message);
	}

	public DatabaseSIAMException(String message, Throwable cause) {
		super(message, cause);
	}

}
