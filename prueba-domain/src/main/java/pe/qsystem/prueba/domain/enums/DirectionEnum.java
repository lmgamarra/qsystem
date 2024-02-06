package pe.qsystem.prueba.domain.enums;


public enum DirectionEnum {
	ASC("asc"),

	DESC("desc");

	private String value;

	DirectionEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

}
