package pe.qsystem.prueba.api.mapper;

import java.util.List;

import pe.qsystem.prueba.api.dto.RequestResponseDto;
import pe.qsystem.prueba.domain.entity.RequestComportamientoEntity;
import pe.qsystem.prueba.domain.entity.RequestPersonaEntity;


public interface RequestMapper {

	RequestResponseDto asRequestDto( RequestPersonaEntity requestEntity );	
	RequestResponseDto asRequestDto( RequestComportamientoEntity requestEntity );
	List<RequestResponseDto> asRequestDTO( List<RequestPersonaEntity> requestEntities );
	
}
