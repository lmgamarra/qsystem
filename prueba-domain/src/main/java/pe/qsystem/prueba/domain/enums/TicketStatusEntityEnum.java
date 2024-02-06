package pe.qsystem.prueba.domain.enums;

public enum TicketStatusEntityEnum {
	
	PENDIENTE(1),
	EN_PROCESO(2),
	ATENDIDO(3);	

	private Integer value;

	TicketStatusEntityEnum(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

}
