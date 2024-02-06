package pe.qsystem.prueba.domain.enums;


public enum FilterTypeEnum {
	
	TEXT("TEXT"),
	TEXTEQ("TEXTEQ"),
	SELECT_MULTIPLE("SELECT_MULTIPLE"),
	SELECT_NOT_MULTIPLE("SELECT_NOT_MULTIPLE"),
	RADIO_BUTTON("RADIO_BUTTON"),
	NUMBER("NUMBER"),
	TIME("TIME"),
	DATE("DATE"),
	DATE_RANGE("DATE_RANGE");

	private String value;

	FilterTypeEnum(String value) {
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
