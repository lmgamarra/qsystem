package pe.qsystem.prueba.domain.enums;

public enum UserSecurityPageableActiveEnum {
	USUARIOID("usuarioId"), NOMBRE("name"), NOMBRES("persona.nombres"), PATERNO("persona.paterno"),

	MATERNO("persona.materno"),

	EMAIL("persona.username");

	private String value;

	UserSecurityPageableActiveEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String toString() {
		return String.valueOf(value);
	}

}
