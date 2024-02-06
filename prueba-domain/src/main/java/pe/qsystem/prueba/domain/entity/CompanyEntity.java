package pe.qsystem.prueba.domain.entity;

import java.util.List;

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
public class CompanyEntity {
	
	private Integer empresaId;
	private String nombreEmpresa;
	private List<CompanyDomainEntity> dominios;
	private String ruc;
}
