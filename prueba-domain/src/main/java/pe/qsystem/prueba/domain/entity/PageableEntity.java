package pe.qsystem.prueba.domain.entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PageableEntity<T> implements java.io.Serializable{

    private Integer pageNumber;
    private Integer pageSize;
    private Integer totalPages;
    private String active;
    private String query;
    private Integer totalElements;
    private List<T> data;

    public PageableEntity(List<T> data, Integer totalElements) {
        this.totalElements = totalElements;
        this.data = data;
    }

}
