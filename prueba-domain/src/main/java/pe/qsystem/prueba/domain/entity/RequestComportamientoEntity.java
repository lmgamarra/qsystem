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
public class RequestComportamientoEntity {
	
	ComportamientoDomEntity comportamiento;

	public ComportamientoDomEntity getComportamiento() {
		return comportamiento;
	}

	public void setComportamiento(ComportamientoDomEntity comportamiento) {
		this.comportamiento = comportamiento;
	}	
	
}
