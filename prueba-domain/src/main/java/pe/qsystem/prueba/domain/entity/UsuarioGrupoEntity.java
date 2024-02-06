package pe.qsystem.prueba.domain.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@EqualsAndHashCode(callSuper = true)
public class UsuarioGrupoEntity extends AuditEntity implements Serializable {
		
	
	private static final long serialVersionUID = 1L;
	
	private Integer usuarioGrupoId;
	private String numeroDoc;
	private String certificado;
	private Integer usuarioIdRemplazo;
	
    public UsuarioGrupoEntity(Integer usuarioGrupoId) {
        this.usuarioGrupoId = usuarioGrupoId;
    }
	  
	  

}
