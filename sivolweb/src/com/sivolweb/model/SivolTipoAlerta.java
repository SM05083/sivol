package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_tipo_alerta database table.
 * 
 */
@Entity
@Table(name="sivol_tipo_alerta")
@NamedQuery(name="SivolTipoAlerta.findAll", query="SELECT s FROM SivolTipoAlerta s")
public class SivolTipoAlerta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tipale_codigo")
	private Integer tipaleCodigo;

	@Column(name="tipale_descripcion")
	private String tipaleDescripcion;

	@Column(name="tipale_estado")
	private String tipaleEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="tipale_fecha_creacion")
	private Date tipaleFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="tipale_fecha_modificacion")
	private Date tipaleFechaModificacion;

	@Column(name="tipale_nombre")
	private String tipaleNombre;

	//bi-directional many-to-one association to SivolAlerta
	@OneToMany(mappedBy="sivolTipoAlerta")
	private List<SivolAlerta> sivolAlertas;

	public SivolTipoAlerta() {
	}

	public Integer getTipaleCodigo() {
		return this.tipaleCodigo;
	}

	public void setTipaleCodigo(Integer tipaleCodigo) {
		this.tipaleCodigo = tipaleCodigo;
	}

	public String getTipaleDescripcion() {
		return this.tipaleDescripcion;
	}

	public void setTipaleDescripcion(String tipaleDescripcion) {
		this.tipaleDescripcion = tipaleDescripcion;
	}

	public String getTipaleEstado() {
		return this.tipaleEstado;
	}

	public void setTipaleEstado(String tipaleEstado) {
		this.tipaleEstado = tipaleEstado;
	}

	public Date getTipaleFechaCreacion() {
		return this.tipaleFechaCreacion;
	}

	public void setTipaleFechaCreacion(Date tipaleFechaCreacion) {
		this.tipaleFechaCreacion = tipaleFechaCreacion;
	}

	public Date getTipaleFechaModificacion() {
		return this.tipaleFechaModificacion;
	}

	public void setTipaleFechaModificacion(Date tipaleFechaModificacion) {
		this.tipaleFechaModificacion = tipaleFechaModificacion;
	}

	public String getTipaleNombre() {
		return this.tipaleNombre;
	}

	public void setTipaleNombre(String tipaleNombre) {
		this.tipaleNombre = tipaleNombre;
	}

	public List<SivolAlerta> getSivolAlertas() {
		return this.sivolAlertas;
	}

	public void setSivolAlertas(List<SivolAlerta> sivolAlertas) {
		this.sivolAlertas = sivolAlertas;
	}

	public SivolAlerta addSivolAlerta(SivolAlerta sivolAlerta) {
		getSivolAlertas().add(sivolAlerta);
		sivolAlerta.setSivolTipoAlerta(this);

		return sivolAlerta;
	}

	public SivolAlerta removeSivolAlerta(SivolAlerta sivolAlerta) {
		getSivolAlertas().remove(sivolAlerta);
		sivolAlerta.setSivolTipoAlerta(null);

		return sivolAlerta;
	}

}