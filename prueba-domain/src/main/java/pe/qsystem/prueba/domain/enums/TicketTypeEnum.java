package pe.qsystem.prueba.domain.enums;

public enum TicketTypeEnum {
	
	GESTION_ACCESOS(1), 
	BLOQUEO_DESBLOQUEO_USUARIO(2), 
	CAMBIO_CONTRASENA(3),
	CREAR_USUARIO_SIAM(4),
	MODIFICA_ROL_FUNCIONAL(5),
	CAMBIO_CERTIFICADO(6);

	private Integer value;

	TicketTypeEnum(Integer value) {
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
