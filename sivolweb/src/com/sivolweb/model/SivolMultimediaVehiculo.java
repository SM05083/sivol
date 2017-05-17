package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sivol_multimedia_vehiculo database table.
 * 
 */
@Entity
@Table(name="sivol_multimedia_vehiculo")
@NamedQuery(name="SivolMultimediaVehiculo.findAll", query="SELECT s FROM SivolMultimediaVehiculo s")
public class SivolMultimediaVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mulveh_codigo")
	private Integer mulvehCodigo;

	@Temporal(TemporalType.DATE)
	@Column(name="mulveh_fecha_creacion")
	private Date mulvehFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="mulveh_fecha_modificacion")
	private Date mulvehFechaModificacion;

	@Column(name="mulveh_titulo")
	private String mulvehTitulo;

	@Column(name="mulveh_url")
	private String mulvehUrl;

	//bi-directional many-to-one association to SivolTipoMultimedia
	@ManyToOne
	@JoinColumn(name="tipmul_codigo")
	private SivolTipoMultimedia sivolTipoMultimedia;

	//bi-directional many-to-one association to SivolVehiculo
	@ManyToOne
	@JoinColumn(name="veh_codigo")
	private SivolVehiculo sivolVehiculo;

	public SivolMultimediaVehiculo() {
	}

	public Integer getMulvehCodigo() {
		return this.mulvehCodigo;
	}

	public void setMulvehCodigo(Integer mulvehCodigo) {
		this.mulvehCodigo = mulvehCodigo;
	}

	public Date getMulvehFechaCreacion() {
		return this.mulvehFechaCreacion;
	}

	public void setMulvehFechaCreacion(Date mulvehFechaCreacion) {
		this.mulvehFechaCreacion = mulvehFechaCreacion;
	}

	public Date getMulvehFechaModificacion() {
		return this.mulvehFechaModificacion;
	}

	public void setMulvehFechaModificacion(Date mulvehFechaModificacion) {
		this.mulvehFechaModificacion = mulvehFechaModificacion;
	}

	public String getMulvehTitulo() {
		return this.mulvehTitulo;
	}

	public void setMulvehTitulo(String mulvehTitulo) {
		this.mulvehTitulo = mulvehTitulo;
	}

	public String getMulvehUrl() {
		return this.mulvehUrl;
	}

	public void setMulvehUrl(String mulvehUrl) {
		this.mulvehUrl = mulvehUrl;
	}

	public SivolTipoMultimedia getSivolTipoMultimedia() {
		return this.sivolTipoMultimedia;
	}

	public void setSivolTipoMultimedia(SivolTipoMultimedia sivolTipoMultimedia) {
		this.sivolTipoMultimedia = sivolTipoMultimedia;
	}

	public SivolVehiculo getSivolVehiculo() {
		return this.sivolVehiculo;
	}

	public void setSivolVehiculo(SivolVehiculo sivolVehiculo) {
		this.sivolVehiculo = sivolVehiculo;
	}

}