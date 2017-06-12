package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_perfil database table.
 * 
 */
@Entity
@Table(name="sivol_perfil")
@NamedQuery(name="SivolPerfil.findAll", query="SELECT s FROM SivolPerfil s")
public class SivolPerfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pef_codigo")
	private Integer pefCodigo;

	@Column(name="pef_descripcion")
	private String pefDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="pef_fecha_creacion")
	private Date pefFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="pef_fecha_modificacion")
	private Date pefFechaModificacion;

	@Column(name="pef_nombre")
	private String pefNombre;

	//bi-directional many-to-one association to SivolTipoUsuario
	@OneToMany(mappedBy="sivolPerfil")
	private List<SivolTipoUsuario> sivolTipoUsuarios;

	public SivolPerfil() {
	}

	public Integer getPefCodigo() {
		return this.pefCodigo;
	}

	public void setPefCodigo(Integer pefCodigo) {
		this.pefCodigo = pefCodigo;
	}

	public String getPefDescripcion() {
		return this.pefDescripcion;
	}

	public void setPefDescripcion(String pefDescripcion) {
		this.pefDescripcion = pefDescripcion;
	}

	public Date getPefFechaCreacion() {
		return this.pefFechaCreacion;
	}

	public void setPefFechaCreacion(Date pefFechaCreacion) {
		this.pefFechaCreacion = pefFechaCreacion;
	}

	public Date getPefFechaModificacion() {
		return this.pefFechaModificacion;
	}

	public void setPefFechaModificacion(Date pefFechaModificacion) {
		this.pefFechaModificacion = pefFechaModificacion;
	}

	public String getPefNombre() {
		return this.pefNombre;
	}

	public void setPefNombre(String pefNombre) {
		this.pefNombre = pefNombre;
	}

	public List<SivolTipoUsuario> getSivolTipoUsuarios() {
		return this.sivolTipoUsuarios;
	}

	public void setSivolTipoUsuarios(List<SivolTipoUsuario> sivolTipoUsuarios) {
		this.sivolTipoUsuarios = sivolTipoUsuarios;
	}

	public SivolTipoUsuario addSivolTipoUsuario(SivolTipoUsuario sivolTipoUsuario) {
		getSivolTipoUsuarios().add(sivolTipoUsuario);
		sivolTipoUsuario.setSivolPerfil(this);

		return sivolTipoUsuario;
	}

	public SivolTipoUsuario removeSivolTipoUsuario(SivolTipoUsuario sivolTipoUsuario) {
		getSivolTipoUsuarios().remove(sivolTipoUsuario);
		sivolTipoUsuario.setSivolPerfil(null);

		return sivolTipoUsuario;
	}

}