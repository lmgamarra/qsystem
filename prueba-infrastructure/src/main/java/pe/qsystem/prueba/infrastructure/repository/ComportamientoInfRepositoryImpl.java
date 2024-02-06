package pe.qsystem.prueba.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import pe.qsystem.prueba.domain.entity.ComportamientoDomEntity;
import pe.qsystem.prueba.domain.repository.ComportamientoDomRepository;
import pe.qsystem.prueba.infrastructure.mapper.ComportamientoMapper;
import pe.qsystem.prueba.infrastructure.qsystemdb.repository.CentroInfRepository;
import pe.qsystem.prueba.infrastructure.qsystemdb.repository.FirmaInfRepository;


@Slf4j
@Service
public class ComportamientoInfRepositoryImpl implements ComportamientoDomRepository {
	
	@Autowired
	private ComportamientoMapper comportamientoMapper;
	
	@Autowired
	private CentroInfRepository centroInfRepository;
	
	@Autowired
	private FirmaInfRepository firmaInfRepository;

	@Override
	public ComportamientoDomEntity getBehaviorPerCenter(Integer centroId) {
		return comportamientoMapper
				.asComportamientoPerCenterEntity(centroInfRepository.getBehavior(centroId));
	}

	@Override
	public ComportamientoDomEntity getBehaviorPerSignature(Integer firmaId) {
		return comportamientoMapper
				.asComportamientoPerSignatureEntity(firmaInfRepository.getBehavior(firmaId));
	}
	
}
