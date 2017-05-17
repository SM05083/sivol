package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_estado_vehiculo database table.
 * 
 */
@Entity
@Table(name="sivol_estado_vehiculo")
@NamedQuery(name="SivolEstadoVehiculo.findAll", query="SELECT s FROM SivolEstadoVehiculo s")
public class SivolEstadoVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="estveh_codigo")
	private Integer estvehCodigo;

	@Column(name="estveh_descripcion")
	private String estvehDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="estveh_fecha_creacion")
	private Date estvehFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="estveh_fecha_modificacion")
	private Date estvehFechaModificacion;

	@Column(name="estveh_nombre")
	private String estvehNombre;

	//bi-directional many-to-one association to SivolVehiculo
	@OneToMany(mappedBy="sivolEstadoVehiculo")
	private List<SivolVehiculo> sivolVehiculos;

	public SivolEstadoVehiculo() {
	}

	public Integer getEstvehCodigo() {
		return this.estvehCodigo;
	}

	public void setEstvehCodigo(Integer estvehCodigo) {
		this.estvehCodigo = estvehCodigo;
	}

	public String getEstvehDescripcion() {
		return this.estvehDescripcion;
	}

	public void setEstvehDescripcion(String estvehDescripcion) {
		this.estvehDescripcion = estvehDescripcion;
	}

	public Date getEstvehFechaCreacion() {
		return this.estvehFechaCreacion;
	}

	public void setEstvehFechaCreacion(Date estvehFechaCreacion) {
		this.estvehFechaCreacion = estvehFechaCreacion;
	}

	public Date getEstvehFechaModificacion() {
		return this.estvehFechaModificacion;
	}

	public void setEstvehFechaModificacion(Date estvehFechaModificacion) {
		this.estvehFechaModificacion = estvehFechaModificacion;
	}

	public String getEstvehNombre() {
		return this.estvehNombre;
	}

	public void setEstvehNombre(String estvehNombre) {
		this.estvehNombre = estvehNombre;
	}

	public List<SivolVehiculo> getSivolVehiculos() {
		return this.sivolVehiculos;
	}

	public void setSivolVehiculos(List<SivolVehiculo> sivolVehiculos) {
		this.sivolVehiculos = sivolVehiculos;
	}

	public SivolVehiculo addSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().add(sivolVehiculo);
		sivolVehiculo.setSivolEstadoVehiculo(this);

		return sivolVehiculo;
	}

	public SivolVehiculo removeSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().remove(sivolVehiculo);
		sivolVehiculo.setSivolEstadoVehiculo(null);

		return sivolVehiculo;
	}

}