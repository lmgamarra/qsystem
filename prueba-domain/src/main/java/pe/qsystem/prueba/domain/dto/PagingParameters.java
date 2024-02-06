package pe.qsystem.prueba.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pe.qsystem.prueba.domain.enums.DirectionEnum;
/**
 * @deprecated Usar forma estándar de paginación con consultas nativas. 
 * Ver ejemplo en EmployeeRepositoryImpl.paginatedEmployeeList
 */
@Deprecated
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class PagingParameters<PAGE> {
	private Integer pageSize;
	private Integer pageNumber;
	private String query;
	private PAGE active;
	private DirectionEnum direction;

}
