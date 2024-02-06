package pe.qsystem.prueba.infrastructure.qsystemdb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "firma")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FirmaInfEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "firma_id")
    private Integer firmaId;

    @Column(name = "firma_imagen")
    private byte[] firmaImagen;

}
