package pe.qsystem.prueba.domain.service;

import pe.qsystem.prueba.domain.dto.PagingParameters;
import pe.qsystem.prueba.domain.entity.PageableEntity;
/**
 * @deprecated Usar forma estándar de paginación con consultas nativas. 
 * Ver ejemplo en EmployeeRepositoryImpl.paginatedEmployeeList
 */
@Deprecated
public interface PageableService<T, ID, PAGE>  {

	PageableEntity<T> findPageableAll(PagingParameters<PAGE>  pagingParameters);
}
