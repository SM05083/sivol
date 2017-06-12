package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sivol_permiso database table.
 * 
 */
@Entity
@Table(name="sivol_permiso")
@NamedQuery(name="SivolPermiso.findAll", query="SELECT s FROM SivolPermiso s")
public class SivolPermiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="per_codigo")
	private Integer perCodigo;

	@Column(name="menite_codigo")
	private Integer meniteCodigo;

	@Column(name="pef_codigo")
	private Integer pefCodigo;

	@Column(name="per_estado")
	private String perEstado;

	public SivolPermiso() {
	}

	public Integer getPerCodigo() {
		return this.perCodigo;
	}

	public void setPerCodigo(Integer perCodigo) {
		this.perCodigo = perCodigo;
	}

	public Integer getMeniteCodigo() {
		return this.meniteCodigo;
	}

	public void setMeniteCodigo(Integer meniteCodigo) {
		this.meniteCodigo = meniteCodigo;
	}

	public Integer getPefCodigo() {
		return this.pefCodigo;
	}

	public void setPefCodigo(Integer pefCodigo) {
		this.pefCodigo = pefCodigo;
	}

	public String getPerEstado() {
		return this.perEstado;
	}

	public void setPerEstado(String perEstado) {
		this.perEstado = perEstado;
	}

}