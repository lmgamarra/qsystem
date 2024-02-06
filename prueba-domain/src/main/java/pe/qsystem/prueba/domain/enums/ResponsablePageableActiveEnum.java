package pe.qsystem.prueba.domain.enums;

public enum ResponsablePageableActiveEnum {

	RESPONSABLEID("responsableId"),

	PERSONA_NUMDOCUMENTO("persona.numDocumento"),

	PERSONA_NOMBRES("persona.nombres"),

	CANAL_CANALGENERICO_NOMBRE("canal.canalGenerico.nombre"),

	DIRECCION("direccion"),

	GERENCIA("gerencia"),

	TIPO("tipo"),
	
	STATE("state");

	private String value;

	private ResponsablePageableActiveEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
