package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_bodega database table.
 * 
 */
@Entity
@Table(name="sivol_bodega")
@NamedQuery(name="SivolBodega.findAll", query="SELECT s FROM SivolBodega s")
public class SivolBodega implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bod_codigo")
	private String bodCodigo;

	@Column(name="bod_direccion")
	private String bodDireccion;

	@Temporal(TemporalType.DATE)
	@Column(name="bod_fecha_creacion")
	private Date bodFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="bod_fecha_modificacion")
	private Date bodFechaModificacion;

	@Column(name="bod_nombre")
	private String bodNombre;

	@Column(name="bod_tarifa_dia")
	private BigDecimal bodTarifaDia;

	//bi-directional many-to-one association to SivolPisoBodega
	@OneToMany(mappedBy="sivolBodega")
	private List<SivolPisoBodega> sivolPisoBodegas;

	public SivolBodega() {
	}

	public String getBodCodigo() {
		return this.bodCodigo;
	}

	public void setBodCodigo(String bodCodigo) {
		this.bodCodigo = bodCodigo;
	}

	public String getBodDireccion() {
		return this.bodDireccion;
	}

	public void setBodDireccion(String bodDireccion) {
		this.bodDireccion = bodDireccion;
	}

	public Date getBodFechaCreacion() {
		return this.bodFechaCreacion;
	}

	public void setBodFechaCreacion(Date bodFechaCreacion) {
		this.bodFechaCreacion = bodFechaCreacion;
	}

	public Date getBodFechaModificacion() {
		return this.bodFechaModificacion;
	}

	public void setBodFechaModificacion(Date bodFechaModificacion) {
		this.bodFechaModificacion = bodFechaModificacion;
	}

	public String getBodNombre() {
		return this.bodNombre;
	}

	public void setBodNombre(String bodNombre) {
		this.bodNombre = bodNombre;
	}

	public BigDecimal getBodTarifaDia() {
		return this.bodTarifaDia;
	}

	public void setBodTarifaDia(BigDecimal bodTarifaDia) {
		this.bodTarifaDia = bodTarifaDia;
	}

	public List<SivolPisoBodega> getSivolPisoBodegas() {
		return this.sivolPisoBodegas;
	}

	public void setSivolPisoBodegas(List<SivolPisoBodega> sivolPisoBodegas) {
		this.sivolPisoBodegas = sivolPisoBodegas;
	}

	public SivolPisoBodega addSivolPisoBodega(SivolPisoBodega sivolPisoBodega) {
		getSivolPisoBodegas().add(sivolPisoBodega);
		sivolPisoBodega.setSivolBodega(this);

		return sivolPisoBodega;
	}

	public SivolPisoBodega removeSivolPisoBodega(SivolPisoBodega sivolPisoBodega) {
		getSivolPisoBodegas().remove(sivolPisoBodega);
		sivolPisoBodega.setSivolBodega(null);

		return sivolPisoBodega;
	}

}