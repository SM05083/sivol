package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sivol_alerta database table.
 * 
 */
@Entity
@Table(name="sivol_alerta")
@NamedQuery(name="SivolAlerta.findAll", query="SELECT s FROM SivolAlerta s")
public class SivolAlerta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ale_codigo")
	private Integer aleCodigo;

	@Column(name="ale_descripcion")
	private String aleDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="ale_fecha_creacion")
	private Date aleFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="ale_fecha_modificacion")
	private Date aleFechaModificacion;

	@Column(name="ale_nombre")
	private String aleNombre;

	//bi-directional many-to-one association to SivolMaestroPersona
	@ManyToOne
	@JoinColumn(name="maeper_codigo")
	private SivolMaestroPersona sivolMaestroPersona;

	//bi-directional many-to-one association to SivolTipoAlerta
	@ManyToOne
	@JoinColumn(name="tipale_codigo")
	private SivolTipoAlerta sivolTipoAlerta;

	public SivolAlerta() {
	}

	public Integer getAleCodigo() {
		return this.aleCodigo;
	}

	public void setAleCodigo(Integer aleCodigo) {
		this.aleCodigo = aleCodigo;
	}

	public String getAleDescripcion() {
		return this.aleDescripcion;
	}

	public void setAleDescripcion(String aleDescripcion) {
		this.aleDescripcion = aleDescripcion;
	}

	public Date getAleFechaCreacion() {
		return this.aleFechaCreacion;
	}

	public void setAleFechaCreacion(Date aleFechaCreacion) {
		this.aleFechaCreacion = aleFechaCreacion;
	}

	public Date getAleFechaModificacion() {
		return this.aleFechaModificacion;
	}

	public void setAleFechaModificacion(Date aleFechaModificacion) {
		this.aleFechaModificacion = aleFechaModificacion;
	}

	public String getAleNombre() {
		return this.aleNombre;
	}

	public void setAleNombre(String aleNombre) {
		this.aleNombre = aleNombre;
	}

	public SivolMaestroPersona getSivolMaestroPersona() {
		return this.sivolMaestroPersona;
	}

	public void setSivolMaestroPersona(SivolMaestroPersona sivolMaestroPersona) {
		this.sivolMaestroPersona = sivolMaestroPersona;
	}

	public SivolTipoAlerta getSivolTipoAlerta() {
		return this.sivolTipoAlerta;
	}

	public void setSivolTipoAlerta(SivolTipoAlerta sivolTipoAlerta) {
		this.sivolTipoAlerta = sivolTipoAlerta;
	}

}