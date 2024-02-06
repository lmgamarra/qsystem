package pe.qsystem.prueba.domain.enums;

public enum TicketPcPageableActiveEnum {

	TICKETID("ticketId"), 
	
	CREATEDAT("createdAt"),

	CANTIDADSOLICITUDES("cantidadSolicitudes");

	private String value; 

	TicketPcPageableActiveEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String toString() {
		return String.valueOf(value);
	}
}
