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
public class ChannelEntity {
	
	private Integer canalId;
//	private Integer canalComercialId;
	private CommercialChannelEntity canalComercial;
	private GenericChannelEntity canalGenerico;

}
