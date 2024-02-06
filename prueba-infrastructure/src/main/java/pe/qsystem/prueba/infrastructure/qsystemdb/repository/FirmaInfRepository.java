package pe.qsystem.prueba.infrastructure.qsystemdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.qsystem.prueba.infrastructure.qsystemdb.entity.ComportamientoInfEntity;

public interface FirmaInfRepository extends JpaRepository<FirmaInfRepository, Integer> {
		
	@Query("SELECT a FROM ComportamientoEntity a, FirmaEntity b "
			+ "WHERE b.firmaId = a.firma.firmaId AND b.firmaId = :firmaId")
	ComportamientoInfEntity getBehavior(Integer firmaId);
	
}
