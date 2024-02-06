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
public class CorporationEntity {

	private Integer entidadId;
	private String codigo;
	private String nombreEntidad;
	private Integer canalComercialId;
	private String nombreCanalComercial;
	private CompanyEntity empresa;

}
