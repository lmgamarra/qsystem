package pe.qsystem.prueba.domain.service;

import pe.qsystem.prueba.domain.entity.RequestComportamientoEntity;


public interface ComportamientoService {

	RequestComportamientoEntity getBehaviorPerCenter(Integer centroId);
	RequestComportamientoEntity getBehaviorPerSignature(Integer firmaId);
	
}
