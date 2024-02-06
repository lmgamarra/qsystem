package pe.qsystem.prueba.domain.exceptions;

public class GenericSIAMException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String customMessage;

	public GenericSIAMException() {
	}

        public GenericSIAMException(Throwable cause) {
            super(cause);
        }

	public GenericSIAMException(String customMessage) {
                super(customMessage);
		this.customMessage = customMessage;
	}

	public GenericSIAMException(String customMessage, Throwable cause) {
		super(customMessage, cause);
		this.customMessage = customMessage;
	}

	public String getCustomMessage() {
		return customMessage;
	}

}
