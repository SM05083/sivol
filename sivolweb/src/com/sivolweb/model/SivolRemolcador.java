package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_remolcador database table.
 * 
 */
@Entity
@Table(name="sivol_remolcador")
@NamedQuery(name="SivolRemolcador.findAll", query="SELECT s FROM SivolRemolcador s")
public class SivolRemolcador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="rem_codigo")
	private Integer remCodigo;

	@Column(name="rem_capacidad")
	private Integer remCapacidad;

	@Column(name="rem_descripcion")
	private String remDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="rem_fecha_creacion")
	private Date remFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="rem_fecha_modificacion")
	private Date remFechaModificacion;

	//bi-directional many-to-one association to SivolVehiculo
	@OneToMany(mappedBy="sivolRemolcador")
	private List<SivolVehiculo> sivolVehiculos;

	public SivolRemolcador() {
	}

	public Integer getRemCodigo() {
		return this.remCodigo;
	}

	public void setRemCodigo(Integer remCodigo) {
		this.remCodigo = remCodigo;
	}

	public Integer getRemCapacidad() {
		return this.remCapacidad;
	}

	public void setRemCapacidad(Integer remCapacidad) {
		this.remCapacidad = remCapacidad;
	}

	public String getRemDescripcion() {
		return this.remDescripcion;
	}

	public void setRemDescripcion(String remDescripcion) {
		this.remDescripcion = remDescripcion;
	}

	public Date getRemFechaCreacion() {
		return this.remFechaCreacion;
	}

	public void setRemFechaCreacion(Date remFechaCreacion) {
		this.remFechaCreacion = remFechaCreacion;
	}

	public Date getRemFechaModificacion() {
		return this.remFechaModificacion;
	}

	public void setRemFechaModificacion(Date remFechaModificacion) {
		this.remFechaModificacion = remFechaModificacion;
	}

	public List<SivolVehiculo> getSivolVehiculos() {
		return this.sivolVehiculos;
	}

	public void setSivolVehiculos(List<SivolVehiculo> sivolVehiculos) {
		this.sivolVehiculos = sivolVehiculos;
	}

	public SivolVehiculo addSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().add(sivolVehiculo);
		sivolVehiculo.setSivolRemolcador(this);

		return sivolVehiculo;
	}

	public SivolVehiculo removeSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().remove(sivolVehiculo);
		sivolVehiculo.setSivolRemolcador(null);

		return sivolVehiculo;
	}

}