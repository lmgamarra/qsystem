package pe.qsystem.prueba.domain.enums;

import java.util.TreeMap;

public enum EmployeePageableActiveEnum {

	ALLTEXTCOLUMNS("*"), 
//        TIPODOCUMENTO("p.tipo_documento_id"),
        TIPODOCUMENTO("p.tipoDocumento.tipoDocumentoId"),
	
        NUMERODOCUMENTO("p.numero_doc"),
//        NUMERODOCUMENTO("persona.numDocumento"),

	NOMBRES("p.nombres"),
//	NOMBRES("persona.nombres"),

	PATERNO("persona.paterno"),

	ROLFUNCIONAL("rolFuncional.nombre"),

//	PUNTOVENTA("puntoVenta.nombrePuntoVenta"),
	PUNTOVENTA("puntoVenta.nombrePuntoVenta"),

	EMPRESA("puntoVenta.entidad.empresa.nombreEmpresa"),
	
	EMPRESAGENERICID("puntoVenta.entidad.empresa.empresaId"),

	MATERNO("persona.materno");

	private static TreeMap<String, FilterTypeEnum> tipoFiltro;

	private String value;

	EmployeePageableActiveEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public String toString() {
		return String.valueOf(value);
	}

	static {
		tipoFiltro = new TreeMap<>();
		tipoFiltro.put(EmployeePageableActiveEnum.ALLTEXTCOLUMNS.getValue(), FilterTypeEnum.TEXT);
		tipoFiltro.put(EmployeePageableActiveEnum.TIPODOCUMENTO.getValue(), FilterTypeEnum.SELECT_MULTIPLE);
		tipoFiltro.put(EmployeePageableActiveEnum.NUMERODOCUMENTO.getValue(), FilterTypeEnum.TEXT);
		tipoFiltro.put(EmployeePageableActiveEnum.NOMBRES.getValue(), FilterTypeEnum.TEXT);
		tipoFiltro.put(EmployeePageableActiveEnum.PATERNO.getValue(), FilterTypeEnum.TEXT);
		tipoFiltro.put(EmployeePageableActiveEnum.ROLFUNCIONAL.getValue(), FilterTypeEnum.TEXT);
		tipoFiltro.put(EmployeePageableActiveEnum.PUNTOVENTA.getValue(), FilterTypeEnum.TEXT);
		tipoFiltro.put(EmployeePageableActiveEnum.EMPRESA.getValue(), FilterTypeEnum.TEXT);
		tipoFiltro.put(EmployeePageableActiveEnum.MATERNO.getValue(), FilterTypeEnum.TEXT);

	}

	public static TreeMap<String, FilterTypeEnum> getFiltros() {
		return tipoFiltro;

	}

}
