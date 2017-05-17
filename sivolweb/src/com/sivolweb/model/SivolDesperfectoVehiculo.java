package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the sivol_desperfecto_vehiculo database table.
 * 
 */
@Entity
@Table(name="sivol_desperfecto_vehiculo")
@NamedQuery(name="SivolDesperfectoVehiculo.findAll", query="SELECT s FROM SivolDesperfectoVehiculo s")
public class SivolDesperfectoVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="desveh_codigo")
	private Integer desvehCodigo;

	@Column(name="desveh_costo")
	private BigDecimal desvehCosto;

	@Column(name="desveh_descripcion")
	private String desvehDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="desveh_fecha_creacion")
	private Date desvehFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="desveh_fecha_modificacion")
	private Date desvehFechaModificacion;

	//bi-directional many-to-one association to SivolTipoEstadoReparacion
	@ManyToOne
	@JoinColumn(name="tipestrep_codigo")
	private SivolTipoEstadoReparacion sivolTipoEstadoReparacion;

	//bi-directional many-to-one association to SivolVehiculo
	@ManyToOne
	@JoinColumn(name="veh_codigo")
	private SivolVehiculo sivolVehiculo;

	public SivolDesperfectoVehiculo() {
	}

	public Integer getDesvehCodigo() {
		return this.desvehCodigo;
	}

	public void setDesvehCodigo(Integer desvehCodigo) {
		this.desvehCodigo = desvehCodigo;
	}

	public BigDecimal getDesvehCosto() {
		return this.desvehCosto;
	}

	public void setDesvehCosto(BigDecimal desvehCosto) {
		this.desvehCosto = desvehCosto;
	}

	public String getDesvehDescripcion() {
		return this.desvehDescripcion;
	}

	public void setDesvehDescripcion(String desvehDescripcion) {
		this.desvehDescripcion = desvehDescripcion;
	}

	public Date getDesvehFechaCreacion() {
		return this.desvehFechaCreacion;
	}

	public void setDesvehFechaCreacion(Date desvehFechaCreacion) {
		this.desvehFechaCreacion = desvehFechaCreacion;
	}

	public Date getDesvehFechaModificacion() {
		return this.desvehFechaModificacion;
	}

	public void setDesvehFechaModificacion(Date desvehFechaModificacion) {
		this.desvehFechaModificacion = desvehFechaModificacion;
	}

	public SivolTipoEstadoReparacion getSivolTipoEstadoReparacion() {
		return this.sivolTipoEstadoReparacion;
	}

	public void setSivolTipoEstadoReparacion(SivolTipoEstadoReparacion sivolTipoEstadoReparacion) {
		this.sivolTipoEstadoReparacion = sivolTipoEstadoReparacion;
	}

	public SivolVehiculo getSivolVehiculo() {
		return this.sivolVehiculo;
	}

	public void setSivolVehiculo(SivolVehiculo sivolVehiculo) {
		this.sivolVehiculo = sivolVehiculo;
	}

}