package pe.qsystem.prueba.domain.enums;

public enum TicketRequestStatusEnum {

	REGISTRADO(1),
	APROBADO(2),
	RECHAZADO(3),
	EN_PROCESO(4),
	ATENTIDO(5);

	private Integer value;

	TicketRequestStatusEnum(Integer value) {
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
