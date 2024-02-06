package pe.qsystem.prueba.domain.service;

import java.util.List;

public interface CrudService<T, ID, PAGE> extends PageableService<T, ID, PAGE> {

	T insert(T t);

	List<T> findAll();

	void delete(ID id);

	T update(T t);

	T findById(ID id);
}
