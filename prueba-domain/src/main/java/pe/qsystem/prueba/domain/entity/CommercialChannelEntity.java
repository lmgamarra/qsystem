package pe.qsystem.prueba.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CommercialChannelEntity extends AuditEntity{

	private static final long serialVersionUID = 1L;
	
	private Integer canalComercialId;
	private String canalComercialCod;
	private String nombre;
	private AmdocsChannelEntity canalAmdocs;
	//private List<ChannelEntity> canales;
	private String codigoAtis;
}
