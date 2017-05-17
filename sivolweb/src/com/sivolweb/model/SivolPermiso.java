package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	@Column(name="per_estado")
	private String perEstado;

	//bi-directional many-to-one association to SivolMenuItem
	@OneToMany(mappedBy="sivolPermiso")
	private List<SivolMenuItem> sivolMenuItems;

	//bi-directional many-to-one association to SivolPerfil
	@OneToMany(mappedBy="sivolPermiso")
	private List<SivolPerfil> sivolPerfils;

	public SivolPermiso() {
	}

	public Integer getPerCodigo() {
		return this.perCodigo;
	}

	public void setPerCodigo(Integer perCodigo) {
		this.perCodigo = perCodigo;
	}

	public String getPerEstado() {
		return this.perEstado;
	}

	public void setPerEstado(String perEstado) {
		this.perEstado = perEstado;
	}

	public List<SivolMenuItem> getSivolMenuItems() {
		return this.sivolMenuItems;
	}

	public void setSivolMenuItems(List<SivolMenuItem> sivolMenuItems) {
		this.sivolMenuItems = sivolMenuItems;
	}

	public SivolMenuItem addSivolMenuItem(SivolMenuItem sivolMenuItem) {
		getSivolMenuItems().add(sivolMenuItem);
		sivolMenuItem.setSivolPermiso(this);

		return sivolMenuItem;
	}

	public SivolMenuItem removeSivolMenuItem(SivolMenuItem sivolMenuItem) {
		getSivolMenuItems().remove(sivolMenuItem);
		sivolMenuItem.setSivolPermiso(null);

		return sivolMenuItem;
	}

	public List<SivolPerfil> getSivolPerfils() {
		return this.sivolPerfils;
	}

	public void setSivolPerfils(List<SivolPerfil> sivolPerfils) {
		this.sivolPerfils = sivolPerfils;
	}

	public SivolPerfil addSivolPerfil(SivolPerfil sivolPerfil) {
		getSivolPerfils().add(sivolPerfil);
		sivolPerfil.setSivolPermiso(this);

		return sivolPerfil;
	}

	public SivolPerfil removeSivolPerfil(SivolPerfil sivolPerfil) {
		getSivolPerfils().remove(sivolPerfil);
		sivolPerfil.setSivolPermiso(null);

		return sivolPerfil;
	}

}