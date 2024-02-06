package pe.qsystem.prueba.domain.enums;

public enum TicketRequestExecutionStatusEnum {

	REGISTERED(1), 
	IN_EXECUTION(2), 
	FINISHED_ERROR(3), 
	FINISHED(4), 
	ERROR(5), 
	ALLOWED(6), 
	NOT_ALLOWED(7), 
	APPROVED(8),
	REJECTED(9);

	private Integer value;

	TicketRequestExecutionStatusEnum(Integer value) {
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
