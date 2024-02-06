package pe.qsystem.prueba.domain.enums;

public enum TicketRequestTypeEnum {

	ALTA(1), 
	BAJA(2), 
	MODIFICACION(3),
	CAMBIO_CONTRASENA(13),
	BLOQUEO_AP(4),
	DESBLOQUEO_AP(8),
	BLOQUEO_GENERAL(9),
	DESBLOQUEO_GENERAL(10),
	CAMBIO_CERTIFICADO(15);

	private Integer value;

	TicketRequestTypeEnum(Integer value) {
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
