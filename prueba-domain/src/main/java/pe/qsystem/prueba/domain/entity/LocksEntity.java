package pe.qsystem.prueba.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class LocksEntity extends AuditEntity{

	private static final long serialVersionUID = 1L;
	
	private Integer bloqueoId;
	private Integer usuarioId;
	private Boolean bloqueo;
	private String comentario;
	
}
