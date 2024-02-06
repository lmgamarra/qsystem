package pe.qsystem.prueba.domain.enums;

public enum TicketExecutionStatusEnum {

	REGISTERED(1), 
	SENT(2), 
	APPROVED(3), 
	REJECTED(4), 
	ALLOWED(5), 
	NOT_ALLOWED(6), 
	PARTIAL_ALLOWED(7), 
	IN_EXECUTION(8),
	FINISHED(9), 
	ERROR(10), 
	FINISHED_ERROR(11);

	private Integer value;

	TicketExecutionStatusEnum(Integer value) {
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
