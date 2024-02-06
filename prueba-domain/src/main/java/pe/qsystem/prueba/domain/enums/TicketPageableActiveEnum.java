package pe.qsystem.prueba.domain.enums;

public enum TicketPageableActiveEnum {

	TICKETID("ticketId"), TICKETNUMERO("ticketNumero"), FECHA("createdAt"),
	
	CREATEDAT("createdAt"),

	TIPOTICKET("tipoTicket.nombreTipoTicket"),

	CANTIDADSOLICITUDES("cantidadSolicitudes"),

	ESTADOTICKET("estadoTicket.nombreEstadoTicket");

	private String value;

	TicketPageableActiveEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String toString() {
		return String.valueOf(value);
	}

}
