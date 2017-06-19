package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;

import com.sivolweb.util.Utilidades;

import java.util.Date;


/**
 * The persistent class for the sivol_usuario database table.
 * 
 */
@Entity
@Table(name="sivol_usuario")
@NamedQuery(name="SivolUsuario.findAll", query="SELECT s FROM SivolUsuario s")
public class SivolUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="usu_usuario")
	private String usuUsuario;

	@Column(name="usu_codigo")
	private Integer usuCodigo;

	@Column(name="usu_contrasena")
	private String usuContrasena;

	@Column(name="usu_estado")
	private Integer usuEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="usu_fecha_creacion")
	private Date usuFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="usu_fecha_modificacion")
	private Date usuFechaModificacion;

	@Column(name="usu_tipo")
	private Integer usuTipo;

	//bi-directional many-to-one association to SivolTipoUsuario
	@ManyToOne
	@JoinColumn(name="tipusu_codigo")
	private SivolTipoUsuario sivolTipoUsuario;

	public SivolUsuario() {
	}

	
	@Override
	public String toString() {
		return "{ usuUsuario : " + usuUsuario + ", usuCodigo : " + usuCodigo + ","
				+ " usuEstado : " + Utilidades.obtenerEstado(usuEstado) + ", usuFechaCreacion : '" + Utilidades.formatearFecha(usuFechaCreacion) + "', "
				+ " usuFechaModificacion : '" + Utilidades.formatearFecha(usuFechaModificacion) + "',"
				+ " usuTipo : " + usuTipo + " } ";
	}

	public String getUsuUsuario() {
		return this.usuUsuario;
	}

	public void setUsuUsuario(String usuUsuario) {
		this.usuUsuario = usuUsuario;
	}

	public Integer getUsuCodigo() {
		return this.usuCodigo;
	}

	public void setUsuCodigo(Integer usuCodigo) {
		this.usuCodigo = usuCodigo;
	}

	public String getUsuContrasena() {
		return this.usuContrasena;
	}

	public void setUsuContrasena(String usuContrasena) {
		this.usuContrasena = usuContrasena;
	}

	public Integer getUsuEstado() {
		return this.usuEstado;
	}

	public void setUsuEstado(Integer usuEstado) {
		this.usuEstado = usuEstado;
	}

	public Date getUsuFechaCreacion() {
		return this.usuFechaCreacion;
	}

	public void setUsuFechaCreacion(Date usuFechaCreacion) {
		this.usuFechaCreacion = usuFechaCreacion;
	}

	public Date getUsuFechaModificacion() {
		return this.usuFechaModificacion;
	}

	public void setUsuFechaModificacion(Date usuFechaModificacion) {
		this.usuFechaModificacion = usuFechaModificacion;
	}

	public Integer getUsuTipo() {
		return this.usuTipo;
	}

	public void setUsuTipo(Integer usuTipo) {
		this.usuTipo = usuTipo;
	}

	public SivolTipoUsuario getSivolTipoUsuario() {
		return this.sivolTipoUsuario;
	}

	public void setSivolTipoUsuario(SivolTipoUsuario sivolTipoUsuario) {
		this.sivolTipoUsuario = sivolTipoUsuario;
	}

}