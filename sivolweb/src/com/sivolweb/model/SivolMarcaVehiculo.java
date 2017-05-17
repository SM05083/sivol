package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_marca_vehiculo database table.
 * 
 */
@Entity
@Table(name="sivol_marca_vehiculo")
@NamedQuery(name="SivolMarcaVehiculo.findAll", query="SELECT s FROM SivolMarcaVehiculo s")
public class SivolMarcaVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="marveh_codigo")
	private String marvehCodigo;

	@Temporal(TemporalType.DATE)
	@Column(name="marveh_fecha_creacion")
	private Date marvehFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="marveh_fecha_modificaion")
	private Date marvehFechaModificaion;

	@Column(name="marveh_nombre")
	private String marvehNombre;

	//bi-directional many-to-one association to SivolModeloMarca
	@OneToMany(mappedBy="sivolMarcaVehiculo")
	private List<SivolModeloMarca> sivolModeloMarcas;

	//bi-directional many-to-one association to SivolVehiculo
	@OneToMany(mappedBy="sivolMarcaVehiculo")
	private List<SivolVehiculo> sivolVehiculos;

	public SivolMarcaVehiculo() {
	}

	public String getMarvehCodigo() {
		return this.marvehCodigo;
	}

	public void setMarvehCodigo(String marvehCodigo) {
		this.marvehCodigo = marvehCodigo;
	}

	public Date getMarvehFechaCreacion() {
		return this.marvehFechaCreacion;
	}

	public void setMarvehFechaCreacion(Date marvehFechaCreacion) {
		this.marvehFechaCreacion = marvehFechaCreacion;
	}

	public Date getMarvehFechaModificaion() {
		return this.marvehFechaModificaion;
	}

	public void setMarvehFechaModificaion(Date marvehFechaModificaion) {
		this.marvehFechaModificaion = marvehFechaModificaion;
	}

	public String getMarvehNombre() {
		return this.marvehNombre;
	}

	public void setMarvehNombre(String marvehNombre) {
		this.marvehNombre = marvehNombre;
	}

	public List<SivolModeloMarca> getSivolModeloMarcas() {
		return this.sivolModeloMarcas;
	}

	public void setSivolModeloMarcas(List<SivolModeloMarca> sivolModeloMarcas) {
		this.sivolModeloMarcas = sivolModeloMarcas;
	}

	public SivolModeloMarca addSivolModeloMarca(SivolModeloMarca sivolModeloMarca) {
		getSivolModeloMarcas().add(sivolModeloMarca);
		sivolModeloMarca.setSivolMarcaVehiculo(this);

		return sivolModeloMarca;
	}

	public SivolModeloMarca removeSivolModeloMarca(SivolModeloMarca sivolModeloMarca) {
		getSivolModeloMarcas().remove(sivolModeloMarca);
		sivolModeloMarca.setSivolMarcaVehiculo(null);

		return sivolModeloMarca;
	}

	public List<SivolVehiculo> getSivolVehiculos() {
		return this.sivolVehiculos;
	}

	public void setSivolVehiculos(List<SivolVehiculo> sivolVehiculos) {
		this.sivolVehiculos = sivolVehiculos;
	}

	public SivolVehiculo addSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().add(sivolVehiculo);
		sivolVehiculo.setSivolMarcaVehiculo(this);

		return sivolVehiculo;
	}

	public SivolVehiculo removeSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().remove(sivolVehiculo);
		sivolVehiculo.setSivolMarcaVehiculo(null);

		return sivolVehiculo;
	}

}