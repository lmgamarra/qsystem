package pe.qsystem.prueba.infrastructure.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import pe.qsystem.prueba.domain.entity.PersonaDomEntity;
import pe.qsystem.prueba.infrastructure.qsystemdb.entity.PersonaInfEntity;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PersonaMapper {
	
	PersonaDomEntity asPersonaEntity(PersonaInfEntity personaInfEntity);
	List<PersonaDomEntity> asPersonaEntitys(List<PersonaInfEntity> personaInfEntitys);
	
}
