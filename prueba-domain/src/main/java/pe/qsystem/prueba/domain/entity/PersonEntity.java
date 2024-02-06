package pe.qsystem.prueba.domain.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@EqualsAndHashCode(callSuper = true)
public class PersonEntity extends AuditEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7810165005616249295L;
    private Integer personaId;
    private String email;
    private String nombres;
    private String paterno;
    private String materno;
    private String numDocumento;
    private String celular;
    private String telefonoFijo;
    private boolean autenticacionBiometrica;
    private boolean esVendedor;
    private DocumentTypeEntity tipoDocumento;
    private Integer estado;
    private boolean hasUser;
    private ResponsableEntity responsable;
    private Date fechaNacimiento;
    private String docNumResponsable;

    public PersonEntity(Integer personaId) {
        this.personaId = personaId;
    }
}
