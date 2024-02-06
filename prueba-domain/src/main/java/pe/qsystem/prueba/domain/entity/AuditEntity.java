package pe.qsystem.prueba.domain.entity;

import java.io.Serializable;
import java.util.Date;
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
public class AuditEntity implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6386967895844058887L;
	private Integer userCreate;
	private Date createdAt;
	private Integer userDelete;
	private Date deleteAt;
	private Integer userUpdate;
	private Date updateAt;
	private boolean state;
	
	

}
