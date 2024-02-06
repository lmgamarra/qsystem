package pe.qsystem.prueba.domain.enums;

public enum RequestPageableActiveEnum {

	TICKETNUMERO("ticketNumero"),
	TIPOSOLICITUD_NOMBRE("tipoSolicitud.nombre"),
	APROBADOR_NOMBRES("aprobador.nombres"),
	APROBADOR_USERNAME("aprobador.username"),
	ESTADOSOLICITUD_NOMBRE("estadoSolicitud.nombre"),
	FECHASOLICITUD("fechaSolicitud");

	private String value;

	private RequestPageableActiveEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
