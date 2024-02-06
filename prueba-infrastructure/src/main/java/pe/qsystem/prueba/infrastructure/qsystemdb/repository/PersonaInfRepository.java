package pe.qsystem.prueba.infrastructure.qsystemdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.qsystem.prueba.infrastructure.qsystemdb.entity.PersonaInfEntity;

public interface PersonaInfRepository extends JpaRepository<PersonaInfRepository, Integer> {
		
	@Query("SELECT u FROM PersonaEntity u ORDER BY u.dni")
	List<PersonaInfEntity> orderByDni();
	
	@Query("SELECT u FROM PersonaEntity u ORDER BY u.apellidoPaterno")
	List<PersonaInfEntity> orderByLastName();
	
	@Query("SELECT u FROM PersonaEntity")
	List<PersonaInfEntity> list();
	
}
