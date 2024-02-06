package pe.qsystem.prueba.domain.enums;

public enum ProfilePageableActiveEnum {
	NOMBREPERFIL("name"),

	PERFILID("perfilId"),

	STATE("state");

	private String value;

	ProfilePageableActiveEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String toString() {
		return String.valueOf(value);
	}

}
