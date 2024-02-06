package pe.qsystem.prueba.domain.entity;

import java.util.List;

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
public class UserSecurityEntity extends AuditEntity {
    
        public static final String CLAIM_PERSONAID = "personaId";
        public static final String CLAIM_USERID = "userId";
        public static final String CLAIM_PERFILID = "perfilId";
        public static final String CLAIM_EMPRESAID = "empresaId";
        public static final String CLAIM_AUTHORITIES = "authorities";
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 6880699989295182111L;
	private Integer usuarioId;	
	private Integer perfilId;	
	private String nombre;
	private PersonEntity persona;
	private UsuarioGrupoEntity usuarioGrupo; 
	private PointSaleEntity puntoVenta;
	private LocksEntity bloqueo;
	private boolean bloqueado;
	private Integer bloqueoAllApp;
	private String contrasena;
	private String ipUsuarioCreacion;
	private String ipUsuarioActualiza;
	private String ipUsuarioElimina;
	private List<CommercialChannelEntity> canalesComerciales;
	private List<Integer> canalesComercialesId;
	
	public UserSecurityEntity( Integer usuarioId ) {
		this.usuarioId=usuarioId;
	}

}