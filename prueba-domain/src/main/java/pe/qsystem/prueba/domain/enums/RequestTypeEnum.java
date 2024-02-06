package pe.qsystem.prueba.domain.enums;

public enum RequestTypeEnum {

	CREATE("CREATE"),
	PENDIENTE("PENDIENTE"),
	APPROVED("APPROVED"),
	REJECT("REJECT"),
	PROFILER("PROFILER"),
	CANCELLED("CANCELLED");
	
	private String codigo;
	
	RequestTypeEnum( String codigo ){
		this.codigo=codigo;
	}

	public String getCodigo() {
		return codigo;
	}
}
