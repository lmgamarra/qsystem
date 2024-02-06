package pe.qsystem.prueba.infrastructure.qsystemdb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "centro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CentroInfEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "centro_id")
    private Integer centroId;

    @Column(name = "nombre", length = 100)
    private String nombre;

}
