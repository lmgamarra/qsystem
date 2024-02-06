package pe.qsystem.prueba.infrastructure.qsystemdb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "comportamiento")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ComportamientoInfEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comportamiento_id")
    private Integer comportamientoId;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "centro_id")
	private CentroInfEntity centro;
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "firma_id")
	private FirmaInfEntity firma;

}
