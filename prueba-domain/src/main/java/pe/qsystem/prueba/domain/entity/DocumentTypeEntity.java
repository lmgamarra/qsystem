package pe.qsystem.prueba.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class DocumentTypeEntity {

	private Integer tipoDocumentoId;
	private String codigo;
	private String nombre;
	private String tipoCodificacion;
	private Integer caracteresMax;
	private String mascara;
	private boolean state;
	private Integer tipo;
	private boolean longitudExacta;
	private String regExp;

}
