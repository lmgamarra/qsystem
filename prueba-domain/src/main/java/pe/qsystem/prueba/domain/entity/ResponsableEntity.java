package pe.qsystem.prueba.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponsableEntity {

	private Integer responsableId;
	private String cip;
	private String cargo;
	private String direccion;
	private String gerencia;
	private ChannelEntity canal;
	private String ticketRemedy;
	private String tipo;
	private String sustento;
	
}
