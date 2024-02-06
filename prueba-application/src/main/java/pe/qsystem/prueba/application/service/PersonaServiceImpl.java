package pe.qsystem.prueba.application.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import lombok.extern.slf4j.Slf4j;
import pe.qsystem.prueba.domain.repository.PersonaDomRepository;
import pe.qsystem.prueba.domain.entity.*;
import pe.qsystem.prueba.domain.service.*;


@Slf4j
@Service
public class PersonaServiceImpl implements PersonaService {
    
    @Autowired
    private PersonaDomRepository personaDomRepository;
    

    @Override
    public RequestPersonaEntity orderByDni() {        
    	RequestPersonaEntity request = null;

        List<PersonaDomEntity> listPersons = personaDomRepository
                .orderByDni();

        if (!ObjectUtils.isEmpty(listPersons) && listPersons.size() > 0) {
        	request = new RequestPersonaEntity();
            List<PersonaDomEntity> personas = new ArrayList<>();            

            listPersons.stream().forEach((p) -> {
            	PersonaDomEntity persona = new PersonaDomEntity();                
            	persona.setPersonaId(p.getPersonaId());
            	persona.setDni(p.getDni());
            	persona.setApellidoPaterno(p.getApellidoPaterno());
            	persona.setApellidoMaterno(p.getApellidoMaterno());                
                personas.add(persona);                
            });
            request.setPersonas(personas);
        }

        return request;
    }

	@Override
	public RequestPersonaEntity orderByLastName() {
		RequestPersonaEntity request = null;

        List<PersonaDomEntity> listPersons = personaDomRepository
                .orderByLastName();

        if (!ObjectUtils.isEmpty(listPersons) && listPersons.size() > 0) {
        	request = new RequestPersonaEntity();
            List<PersonaDomEntity> personas = new ArrayList<>();            

            listPersons.stream().forEach((p) -> {
            	PersonaDomEntity persona = new PersonaDomEntity();                
            	persona.setPersonaId(p.getPersonaId());
            	persona.setDni(p.getDni());
            	persona.setApellidoPaterno(p.getApellidoPaterno());
            	persona.setApellidoMaterno(p.getApellidoMaterno());                
                personas.add(persona);                
            });
            request.setPersonas(personas);
        }

        return request;
	}

	@Override
	public RequestPersonaEntity list() {
		RequestPersonaEntity request = null;

        List<PersonaDomEntity> listPersons = personaDomRepository
                .list();

        if (!ObjectUtils.isEmpty(listPersons) && listPersons.size() > 0) {
        	request = new RequestPersonaEntity();
            List<PersonaDomEntity> personas = new ArrayList<>();            

            listPersons.stream().forEach((p) -> {
            	PersonaDomEntity persona = new PersonaDomEntity();                
            	persona.setPersonaId(p.getPersonaId());
            	persona.setDni(p.getDni());
            	persona.setApellidoPaterno(p.getApellidoPaterno());
            	persona.setApellidoMaterno(p.getApellidoMaterno());                
                personas.add(persona);                
            });
            request.setPersonas(personas);
        }

        return request;
	}

}
