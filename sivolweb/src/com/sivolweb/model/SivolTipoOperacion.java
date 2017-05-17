package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_tipo_operacion database table.
 * 
 */
@Entity
@Table(name="sivol_tipo_operacion")
@NamedQuery(name="SivolTipoOperacion.findAll", query="SELECT s FROM SivolTipoOperacion s")
public class SivolTipoOperacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tipope_codigo")
	private Integer tipopeCodigo;

	@Column(name="tipope_descripcion")
	private String tipopeDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="tipope_fecha_creacion")
	private Date tipopeFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="tipope_fecha_modificacion")
	private Date tipopeFechaModificacion;

	@Column(name="tipope_nombre")
	private String tipopeNombre;

	//bi-directional many-to-one association to SivolOperacion
	@OneToMany(mappedBy="sivolTipoOperacion")
	private List<SivolOperacion> sivolOperacions;

	public SivolTipoOperacion() {
	}

	public Integer getTipopeCodigo() {
		return this.tipopeCodigo;
	}

	public void setTipopeCodigo(Integer tipopeCodigo) {
		this.tipopeCodigo = tipopeCodigo;
	}

	public String getTipopeDescripcion() {
		return this.tipopeDescripcion;
	}

	public void setTipopeDescripcion(String tipopeDescripcion) {
		this.tipopeDescripcion = tipopeDescripcion;
	}

	public Date getTipopeFechaCreacion() {
		return this.tipopeFechaCreacion;
	}

	public void setTipopeFechaCreacion(Date tipopeFechaCreacion) {
		this.tipopeFechaCreacion = tipopeFechaCreacion;
	}

	public Date getTipopeFechaModificacion() {
		return this.tipopeFechaModificacion;
	}

	public void setTipopeFechaModificacion(Date tipopeFechaModificacion) {
		this.tipopeFechaModificacion = tipopeFechaModificacion;
	}

	public String getTipopeNombre() {
		return this.tipopeNombre;
	}

	public void setTipopeNombre(String tipopeNombre) {
		this.tipopeNombre = tipopeNombre;
	}

	public List<SivolOperacion> getSivolOperacions() {
		return this.sivolOperacions;
	}

	public void setSivolOperacions(List<SivolOperacion> sivolOperacions) {
		this.sivolOperacions = sivolOperacions;
	}

	public SivolOperacion addSivolOperacion(SivolOperacion sivolOperacion) {
		getSivolOperacions().add(sivolOperacion);
		sivolOperacion.setSivolTipoOperacion(this);

		return sivolOperacion;
	}

	public SivolOperacion removeSivolOperacion(SivolOperacion sivolOperacion) {
		getSivolOperacions().remove(sivolOperacion);
		sivolOperacion.setSivolTipoOperacion(null);

		return sivolOperacion;
	}

}