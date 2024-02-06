package pe.qsystem.prueba.infrastructure.mapper;

import org.mapstruct.Mapper;

import pe.qsystem.prueba.domain.entity.ComportamientoDomEntity;
import pe.qsystem.prueba.infrastructure.qsystemdb.entity.ComportamientoInfEntity;


@Mapper(componentModel = "spring")
public interface ComportamientoMapper {

	ComportamientoDomEntity asComportamientoPerCenterEntity(ComportamientoInfEntity personaInfEntity);
	ComportamientoDomEntity asComportamientoPerSignatureEntity(ComportamientoInfEntity personaInfEntity);
	
}
