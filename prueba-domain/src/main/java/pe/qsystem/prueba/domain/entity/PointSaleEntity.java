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
public class PointSaleEntity extends AuditEntity implements Serializable {
	
	private Integer puntoVentaId;
	private String codigo;
	private String nombrePuntoVenta;
	private CorporationEntity entidad;
	private String grupoAd;
	private String codigoAtis;
	private String codigoAgencia;
	private String codigoFranquicia;
	private String direccion;
	private String ubigeo;
	private UbigeoPointSale ubigeoPuntoVenta;
	private Date createdate;
	private Date expirydate;
	private String connection;
	private String grupoAdAnt;
}
