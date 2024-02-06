package pe.qsystem.prueba.domain.repository;

import java.util.List;

import pe.qsystem.prueba.domain.entity.PersonaDomEntity;


public interface PersonaDomRepository {

	List<PersonaDomEntity> orderByDni();
	List<PersonaDomEntity> orderByLastName();
	List<PersonaDomEntity> list();

}
