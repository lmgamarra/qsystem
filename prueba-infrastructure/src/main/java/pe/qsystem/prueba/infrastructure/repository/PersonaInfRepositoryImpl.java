package pe.qsystem.prueba.infrastructure.repository;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;


import pe.qsystem.prueba.domain.entity.PersonaDomEntity;
import pe.qsystem.prueba.domain.repository.PersonaDomRepository;
import pe.qsystem.prueba.infrastructure.mapper.PersonaMapper;
import pe.qsystem.prueba.infrastructure.qsystemdb.repository.PersonaInfRepository;


@Slf4j
@Service
public class PersonaInfRepositoryImpl implements PersonaDomRepository {
	
	@Autowired
	private PersonaMapper personaMapper;
	
	@Autowired
	private PersonaInfRepository personaInfRepository;

	@Override
	public List<PersonaDomEntity> orderByDni() {
		return personaMapper
				.asPersonaEntitys(personaInfRepository.orderByDni());
	}

	@Override
	public List<PersonaDomEntity> orderByLastName() {
		return personaMapper
				.asPersonaEntitys(personaInfRepository.orderByLastName());
	}

	@Override
	public List<PersonaDomEntity> list() {
		return personaMapper
				.asPersonaEntitys(personaInfRepository.list());
	}	

}
