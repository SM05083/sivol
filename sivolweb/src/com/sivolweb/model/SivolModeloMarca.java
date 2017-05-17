package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_modelo_marca database table.
 * 
 */
@Entity
@Table(name="sivol_modelo_marca")
@NamedQuery(name="SivolModeloMarca.findAll", query="SELECT s FROM SivolModeloMarca s")
public class SivolModeloMarca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="modmar_codigo")
	private Integer modmarCodigo;

	@Temporal(TemporalType.DATE)
	@Column(name="modmar_fecha_creacion")
	private Date modmarFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="modmar_fecha_modificacion")
	private Date modmarFechaModificacion;

	@Column(name="modmar_nombre")
	private String modmarNombre;

	//bi-directional many-to-one association to SivolMarcaVehiculo
	@ManyToOne
	@JoinColumn(name="marveh_codigo")
	private SivolMarcaVehiculo sivolMarcaVehiculo;

	//bi-directional many-to-one association to SivolVehiculo
	@OneToMany(mappedBy="sivolModeloMarca")
	private List<SivolVehiculo> sivolVehiculos;

	public SivolModeloMarca() {
	}

	public Integer getModmarCodigo() {
		return this.modmarCodigo;
	}

	public void setModmarCodigo(Integer modmarCodigo) {
		this.modmarCodigo = modmarCodigo;
	}

	public Date getModmarFechaCreacion() {
		return this.modmarFechaCreacion;
	}

	public void setModmarFechaCreacion(Date modmarFechaCreacion) {
		this.modmarFechaCreacion = modmarFechaCreacion;
	}

	public Date getModmarFechaModificacion() {
		return this.modmarFechaModificacion;
	}

	public void setModmarFechaModificacion(Date modmarFechaModificacion) {
		this.modmarFechaModificacion = modmarFechaModificacion;
	}

	public String getModmarNombre() {
		return this.modmarNombre;
	}

	public void setModmarNombre(String modmarNombre) {
		this.modmarNombre = modmarNombre;
	}

	public SivolMarcaVehiculo getSivolMarcaVehiculo() {
		return this.sivolMarcaVehiculo;
	}

	public void setSivolMarcaVehiculo(SivolMarcaVehiculo sivolMarcaVehiculo) {
		this.sivolMarcaVehiculo = sivolMarcaVehiculo;
	}

	public List<SivolVehiculo> getSivolVehiculos() {
		return this.sivolVehiculos;
	}

	public void setSivolVehiculos(List<SivolVehiculo> sivolVehiculos) {
		this.sivolVehiculos = sivolVehiculos;
	}

	public SivolVehiculo addSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().add(sivolVehiculo);
		sivolVehiculo.setSivolModeloMarca(this);

		return sivolVehiculo;
	}

	public SivolVehiculo removeSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().remove(sivolVehiculo);
		sivolVehiculo.setSivolModeloMarca(null);

		return sivolVehiculo;
	}

}