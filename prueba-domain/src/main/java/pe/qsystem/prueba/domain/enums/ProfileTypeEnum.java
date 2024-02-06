package pe.qsystem.prueba.domain.enums;

public enum ProfileTypeEnum {
	SUPER_ADMIN(126),
	GESTOR_CANAL(130),
	GESTOR_TDP_GU(129),
	GESTOR_SOCIO(131),
	ADMIN_SIAM(127),
	ADMIN_ACCESOS(128),
	USUARIO_ACCESOS(132),
	ADMIN_SEGREGACION(133),
	RESPONSABLE_DE_ROLES_Y_USUARIOS(134),
	ANALISTA_RIESGO_SEGREGACION(135),
	ANALISTA_PERFILAMIENTO_SEGREGACIÓN(136),
	TRABAJADOR(144),
	GESTOR_FRANQUICIA(137);

	private Integer value;

	ProfileTypeEnum(Integer value) {
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
