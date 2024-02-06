package pe.qsystem.prueba.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
@Data
public class ComportamientoDomEntity {
	
	private Integer comportamientoId;
	private String descripcion;
	private Integer centroId;
	private Integer firmaId;
	
	public Integer getComportamientoId() {
		return comportamientoId;
	}
	public void setComportamientoId(Integer comportamientoId) {
		this.comportamientoId = comportamientoId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getCentroId() {
		return centroId;
	}
	public void setCentroId(Integer centroId) {
		this.centroId = centroId;
	}
	public Integer getFirmaId() {
		return firmaId;
	}
	public void setFirmaId(Integer firmaId) {
		this.firmaId = firmaId;
	}	
	
}
