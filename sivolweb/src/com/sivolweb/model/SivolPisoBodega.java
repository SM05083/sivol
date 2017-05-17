package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the sivol_piso_bodega database table.
 * 
 */
@Entity
@Table(name="sivol_piso_bodega")
@NamedQuery(name="SivolPisoBodega.findAll", query="SELECT s FROM SivolPisoBodega s")
public class SivolPisoBodega implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pisbod_codigo")
	private Integer pisbodCodigo;

	@Column(name="pisbod_capacidad")
	private Integer pisbodCapacidad;

	@Column(name="pisbod_costo_alquiler")
	private BigDecimal pisbodCostoAlquiler;

	@Column(name="pisbod_total_vehiculo")
	private Integer pisbodTotalVehiculo;

	//bi-directional many-to-one association to SivolBodega
	@ManyToOne
	@JoinColumn(name="bod_codigo")
	private SivolBodega sivolBodega;

	//bi-directional many-to-one association to SivolVehiculo
	@OneToMany(mappedBy="sivolPisoBodega")
	private List<SivolVehiculo> sivolVehiculos;

	public SivolPisoBodega() {
	}

	public Integer getPisbodCodigo() {
		return this.pisbodCodigo;
	}

	public void setPisbodCodigo(Integer pisbodCodigo) {
		this.pisbodCodigo = pisbodCodigo;
	}

	public Integer getPisbodCapacidad() {
		return this.pisbodCapacidad;
	}

	public void setPisbodCapacidad(Integer pisbodCapacidad) {
		this.pisbodCapacidad = pisbodCapacidad;
	}

	public BigDecimal getPisbodCostoAlquiler() {
		return this.pisbodCostoAlquiler;
	}

	public void setPisbodCostoAlquiler(BigDecimal pisbodCostoAlquiler) {
		this.pisbodCostoAlquiler = pisbodCostoAlquiler;
	}

	public Integer getPisbodTotalVehiculo() {
		return this.pisbodTotalVehiculo;
	}

	public void setPisbodTotalVehiculo(Integer pisbodTotalVehiculo) {
		this.pisbodTotalVehiculo = pisbodTotalVehiculo;
	}

	public SivolBodega getSivolBodega() {
		return this.sivolBodega;
	}

	public void setSivolBodega(SivolBodega sivolBodega) {
		this.sivolBodega = sivolBodega;
	}

	public List<SivolVehiculo> getSivolVehiculos() {
		return this.sivolVehiculos;
	}

	public void setSivolVehiculos(List<SivolVehiculo> sivolVehiculos) {
		this.sivolVehiculos = sivolVehiculos;
	}

	public SivolVehiculo addSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().add(sivolVehiculo);
		sivolVehiculo.setSivolPisoBodega(this);

		return sivolVehiculo;
	}

	public SivolVehiculo removeSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().remove(sivolVehiculo);
		sivolVehiculo.setSivolPisoBodega(null);

		return sivolVehiculo;
	}

}