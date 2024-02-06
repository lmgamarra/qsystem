package pe.qsystem.prueba.domain.enums;

public enum ChangeTypeEnum {

	SIN_CAMBIOS(1),
	CAMBIO_ROL_FUNCIONAL(2),
	CAMBIO_PUNTO_VENTA(3),
	CAMBIO_ENTIDAD(4),
	CAMBIO_CELULAR(5),
	CAMBIO_TELEFONO(6),
	CAMBIO_EMAIL(7),
	CAMBIO_NOMBRES(8),
	CAMBIO_APELLIDO_PATERNO(9),
	CAMBIO_APELLIDO_MATERNO(10),
	CAMBIO_DNI_REPRESENTANTE(11),
	CAMBIO_FECHA_NACIMIENTO(12),
	CAMBIO_ESTADO_VENDEDOR(13),
	CAMBIO_ESTADO_AUTENTICACION(14);

	private Integer value;

	ChangeTypeEnum(Integer value) {
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
