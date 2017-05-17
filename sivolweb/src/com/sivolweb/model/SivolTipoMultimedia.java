package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_tipo_multimedia database table.
 * 
 */
@Entity
@Table(name="sivol_tipo_multimedia")
@NamedQuery(name="SivolTipoMultimedia.findAll", query="SELECT s FROM SivolTipoMultimedia s")
public class SivolTipoMultimedia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tipmul_codigo")
	private Integer tipmulCodigo;

	@Column(name="tipmul_descripcion")
	private String tipmulDescripcion;

	@Column(name="tipmul_extensiones")
	private String tipmulExtensiones;

	@Temporal(TemporalType.DATE)
	@Column(name="tipmul_fecha_creacion")
	private Date tipmulFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="tipmul_fecha_modificacion")
	private Date tipmulFechaModificacion;

	//bi-directional many-to-one association to SivolMultimediaVehiculo
	@OneToMany(mappedBy="sivolTipoMultimedia")
	private List<SivolMultimediaVehiculo> sivolMultimediaVehiculos;

	public SivolTipoMultimedia() {
	}

	public Integer getTipmulCodigo() {
		return this.tipmulCodigo;
	}

	public void setTipmulCodigo(Integer tipmulCodigo) {
		this.tipmulCodigo = tipmulCodigo;
	}

	public String getTipmulDescripcion() {
		return this.tipmulDescripcion;
	}

	public void setTipmulDescripcion(String tipmulDescripcion) {
		this.tipmulDescripcion = tipmulDescripcion;
	}

	public String getTipmulExtensiones() {
		return this.tipmulExtensiones;
	}

	public void setTipmulExtensiones(String tipmulExtensiones) {
		this.tipmulExtensiones = tipmulExtensiones;
	}

	public Date getTipmulFechaCreacion() {
		return this.tipmulFechaCreacion;
	}

	public void setTipmulFechaCreacion(Date tipmulFechaCreacion) {
		this.tipmulFechaCreacion = tipmulFechaCreacion;
	}

	public Date getTipmulFechaModificacion() {
		return this.tipmulFechaModificacion;
	}

	public void setTipmulFechaModificacion(Date tipmulFechaModificacion) {
		this.tipmulFechaModificacion = tipmulFechaModificacion;
	}

	public List<SivolMultimediaVehiculo> getSivolMultimediaVehiculos() {
		return this.sivolMultimediaVehiculos;
	}

	public void setSivolMultimediaVehiculos(List<SivolMultimediaVehiculo> sivolMultimediaVehiculos) {
		this.sivolMultimediaVehiculos = sivolMultimediaVehiculos;
	}

	public SivolMultimediaVehiculo addSivolMultimediaVehiculo(SivolMultimediaVehiculo sivolMultimediaVehiculo) {
		getSivolMultimediaVehiculos().add(sivolMultimediaVehiculo);
		sivolMultimediaVehiculo.setSivolTipoMultimedia(this);

		return sivolMultimediaVehiculo;
	}

	public SivolMultimediaVehiculo removeSivolMultimediaVehiculo(SivolMultimediaVehiculo sivolMultimediaVehiculo) {
		getSivolMultimediaVehiculos().remove(sivolMultimediaVehiculo);
		sivolMultimediaVehiculo.setSivolTipoMultimedia(null);

		return sivolMultimediaVehiculo;
	}

}