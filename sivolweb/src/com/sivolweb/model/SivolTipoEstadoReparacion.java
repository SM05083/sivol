package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_tipo_estado_reparacion database table.
 * 
 */
@Entity
@Table(name="sivol_tipo_estado_reparacion")
@NamedQuery(name="SivolTipoEstadoReparacion.findAll", query="SELECT s FROM SivolTipoEstadoReparacion s")
public class SivolTipoEstadoReparacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tipestrep_codigo")
	private Integer tipestrepCodigo;

	@Column(name="tipestrep_descripcion")
	private String tipestrepDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="tipestrep_fecha_creacion")
	private Date tipestrepFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="tipestrep_fecha_modificacion")
	private Date tipestrepFechaModificacion;

	@Column(name="tipestrep_nombre")
	private String tipestrepNombre;

	//bi-directional many-to-one association to SivolDesperfectoVehiculo
	@OneToMany(mappedBy="sivolTipoEstadoReparacion")
	private List<SivolDesperfectoVehiculo> sivolDesperfectoVehiculos;

	public SivolTipoEstadoReparacion() {
	}

	public Integer getTipestrepCodigo() {
		return this.tipestrepCodigo;
	}

	public void setTipestrepCodigo(Integer tipestrepCodigo) {
		this.tipestrepCodigo = tipestrepCodigo;
	}

	public String getTipestrepDescripcion() {
		return this.tipestrepDescripcion;
	}

	public void setTipestrepDescripcion(String tipestrepDescripcion) {
		this.tipestrepDescripcion = tipestrepDescripcion;
	}

	public Date getTipestrepFechaCreacion() {
		return this.tipestrepFechaCreacion;
	}

	public void setTipestrepFechaCreacion(Date tipestrepFechaCreacion) {
		this.tipestrepFechaCreacion = tipestrepFechaCreacion;
	}

	public Date getTipestrepFechaModificacion() {
		return this.tipestrepFechaModificacion;
	}

	public void setTipestrepFechaModificacion(Date tipestrepFechaModificacion) {
		this.tipestrepFechaModificacion = tipestrepFechaModificacion;
	}

	public String getTipestrepNombre() {
		return this.tipestrepNombre;
	}

	public void setTipestrepNombre(String tipestrepNombre) {
		this.tipestrepNombre = tipestrepNombre;
	}

	public List<SivolDesperfectoVehiculo> getSivolDesperfectoVehiculos() {
		return this.sivolDesperfectoVehiculos;
	}

	public void setSivolDesperfectoVehiculos(List<SivolDesperfectoVehiculo> sivolDesperfectoVehiculos) {
		this.sivolDesperfectoVehiculos = sivolDesperfectoVehiculos;
	}

	public SivolDesperfectoVehiculo addSivolDesperfectoVehiculo(SivolDesperfectoVehiculo sivolDesperfectoVehiculo) {
		getSivolDesperfectoVehiculos().add(sivolDesperfectoVehiculo);
		sivolDesperfectoVehiculo.setSivolTipoEstadoReparacion(this);

		return sivolDesperfectoVehiculo;
	}

	public SivolDesperfectoVehiculo removeSivolDesperfectoVehiculo(SivolDesperfectoVehiculo sivolDesperfectoVehiculo) {
		getSivolDesperfectoVehiculos().remove(sivolDesperfectoVehiculo);
		sivolDesperfectoVehiculo.setSivolTipoEstadoReparacion(null);

		return sivolDesperfectoVehiculo;
	}

}