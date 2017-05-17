package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sivol_menu_item database table.
 * 
 */
@Entity
@Table(name="sivol_menu_item")
@NamedQuery(name="SivolMenuItem.findAll", query="SELECT s FROM SivolMenuItem s")
public class SivolMenuItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="menite_codigo")
	private Integer meniteCodigo;

	@Column(name="menite_descripcion")
	private String meniteDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="menite_fecha_creacion")
	private Date meniteFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="menite_fecha_modificacion")
	private Date meniteFechaModificacion;

	@Column(name="menite_nombre")
	private String meniteNombre;

	@Column(name="menite_url")
	private String meniteUrl;

	//bi-directional many-to-one association to SivolPermiso
	@ManyToOne
	@JoinColumn(name="per_codigo")
	private SivolPermiso sivolPermiso;

	public SivolMenuItem() {
	}

	public Integer getMeniteCodigo() {
		return this.meniteCodigo;
	}

	public void setMeniteCodigo(Integer meniteCodigo) {
		this.meniteCodigo = meniteCodigo;
	}

	public String getMeniteDescripcion() {
		return this.meniteDescripcion;
	}

	public void setMeniteDescripcion(String meniteDescripcion) {
		this.meniteDescripcion = meniteDescripcion;
	}

	public Date getMeniteFechaCreacion() {
		return this.meniteFechaCreacion;
	}

	public void setMeniteFechaCreacion(Date meniteFechaCreacion) {
		this.meniteFechaCreacion = meniteFechaCreacion;
	}

	public Date getMeniteFechaModificacion() {
		return this.meniteFechaModificacion;
	}

	public void setMeniteFechaModificacion(Date meniteFechaModificacion) {
		this.meniteFechaModificacion = meniteFechaModificacion;
	}

	public String getMeniteNombre() {
		return this.meniteNombre;
	}

	public void setMeniteNombre(String meniteNombre) {
		this.meniteNombre = meniteNombre;
	}

	public String getMeniteUrl() {
		return this.meniteUrl;
	}

	public void setMeniteUrl(String meniteUrl) {
		this.meniteUrl = meniteUrl;
	}

	public SivolPermiso getSivolPermiso() {
		return this.sivolPermiso;
	}

	public void setSivolPermiso(SivolPermiso sivolPermiso) {
		this.sivolPermiso = sivolPermiso;
	}

}