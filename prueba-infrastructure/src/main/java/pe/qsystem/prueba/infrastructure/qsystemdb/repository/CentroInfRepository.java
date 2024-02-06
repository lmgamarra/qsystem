package pe.qsystem.prueba.infrastructure.qsystemdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.qsystem.prueba.infrastructure.qsystemdb.entity.ComportamientoInfEntity;

public interface CentroInfRepository extends JpaRepository<CentroInfRepository, Integer> {
		
	@Query("SELECT a FROM ComportamientoEntity a, CentroEntity b "
			+ "WHERE b.centroId = a.centro.centroId AND b.centroId = :centroId")
	ComportamientoInfEntity getBehavior(Integer centroId);
	
}
