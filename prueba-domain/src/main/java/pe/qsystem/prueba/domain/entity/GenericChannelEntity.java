package pe.qsystem.prueba.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GenericChannelEntity extends AuditEntity {
	
	private static final long serialVersionUID = 1L;

	private Integer canalGenericoId;
	private String nombre;
	//private List<ChannelEntity> canales;

}
