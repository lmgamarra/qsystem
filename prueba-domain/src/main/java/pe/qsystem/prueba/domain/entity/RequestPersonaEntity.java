package pe.qsystem.prueba.domain.entity;

import java.util.List;

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
public class RequestPersonaEntity {
	
	List<PersonaDomEntity> personas;

	public List<PersonaDomEntity> getPersonas() {
		return personas;
	}

	public void setPersonas(List<PersonaDomEntity> personas) {
		this.personas = personas;
	}
	
}
