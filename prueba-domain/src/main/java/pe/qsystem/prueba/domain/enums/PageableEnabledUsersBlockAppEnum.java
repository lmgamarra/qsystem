package pe.qsystem.prueba.domain.enums;

public enum PageableEnabledUsersBlockAppEnum {
	USUARIOID("usuarioId"),
	NOMBRE("username"),
	NOMBRES("nombre"),
	PATERNO("paterno"),
	MATERNO("materno"),
	EMAIL("usuarioId");

	private String value;

	PageableEnabledUsersBlockAppEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String toString() {
		return String.valueOf(value);
	}

}
