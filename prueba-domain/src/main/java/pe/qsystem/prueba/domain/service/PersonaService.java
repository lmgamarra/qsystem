package pe.qsystem.prueba.domain.service;


import pe.qsystem.prueba.domain.entity.RequestPersonaEntity;

public interface PersonaService {

	RequestPersonaEntity orderByDni();
	RequestPersonaEntity orderByLastName();
	RequestPersonaEntity list();
	
}
