package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_tipo_usuario database table.
 * 
 */
@Entity
@Table(name="sivol_tipo_usuario")
@NamedQuery(name="SivolTipoUsuario.findAll", query="SELECT s FROM SivolTipoUsuario s")
public class SivolTipoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tipusu_codigo")
	private Integer tipusuCodigo;

	@Column(name="tipusu_descripcion")
	private String tipusuDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="tipusu_fecha_creacion")
	private Date tipusuFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="tipusu_fecha_modif")
	private Date tipusuFechaModif;

	//bi-directional many-to-one association to SivolPerfil
	@ManyToOne
	@JoinColumn(name="pef_codigo")
	private SivolPerfil sivolPerfil;

	//bi-directional many-to-one association to SivolUsuario
	@OneToMany(mappedBy="sivolTipoUsuario")
	private List<SivolUsuario> sivolUsuarios;

	public SivolTipoUsuario() {
	}

	public Integer getTipusuCodigo() {
		return this.tipusuCodigo;
	}

	public void setTipusuCodigo(Integer tipusuCodigo) {
		this.tipusuCodigo = tipusuCodigo;
	}

	public String getTipusuDescripcion() {
		return this.tipusuDescripcion;
	}

	public void setTipusuDescripcion(String tipusuDescripcion) {
		this.tipusuDescripcion = tipusuDescripcion;
	}

	public Date getTipusuFechaCreacion() {
		return this.tipusuFechaCreacion;
	}

	public void setTipusuFechaCreacion(Date tipusuFechaCreacion) {
		this.tipusuFechaCreacion = tipusuFechaCreacion;
	}

	public Date getTipusuFechaModif() {
		return this.tipusuFechaModif;
	}

	public void setTipusuFechaModif(Date tipusuFechaModif) {
		this.tipusuFechaModif = tipusuFechaModif;
	}

	public SivolPerfil getSivolPerfil() {
		return this.sivolPerfil;
	}

	public void setSivolPerfil(SivolPerfil sivolPerfil) {
		this.sivolPerfil = sivolPerfil;
	}

	public List<SivolUsuario> getSivolUsuarios() {
		return this.sivolUsuarios;
	}

	public void setSivolUsuarios(List<SivolUsuario> sivolUsuarios) {
		this.sivolUsuarios = sivolUsuarios;
	}

	public SivolUsuario addSivolUsuario(SivolUsuario sivolUsuario) {
		getSivolUsuarios().add(sivolUsuario);
		sivolUsuario.setSivolTipoUsuario(this);

		return sivolUsuario;
	}

	public SivolUsuario removeSivolUsuario(SivolUsuario sivolUsuario) {
		getSivolUsuarios().remove(sivolUsuario);
		sivolUsuario.setSivolTipoUsuario(null);

		return sivolUsuario;
	}

}