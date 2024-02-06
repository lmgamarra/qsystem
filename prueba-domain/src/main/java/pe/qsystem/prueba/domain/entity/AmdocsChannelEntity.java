package pe.qsystem.prueba.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AmdocsChannelEntity extends AuditEntity{

private static final long serialVersionUID = 1L;
	
	private Integer canalAmdocsId;
	private String canalAmdocsCod;
	private String nombre;
	private String descripcionIngles;
}
