package pe.qsystem.prueba.domain.repository;

import pe.qsystem.prueba.domain.entity.ComportamientoDomEntity;


public interface ComportamientoDomRepository {

	ComportamientoDomEntity getBehaviorPerCenter(Integer centroId);
	ComportamientoDomEntity getBehaviorPerSignature(Integer centroId);

}
