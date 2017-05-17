package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sivol_taller_afiliado database table.
 * 
 */
@Entity
@Table(name="sivol_taller_afiliado")
@NamedQuery(name="SivolTallerAfiliado.findAll", query="SELECT s FROM SivolTallerAfiliado s")
public class SivolTallerAfiliado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="talafi_codigo")
	private Integer talafiCodigo;

	@Column(name="talafi_contacto")
	private String talafiContacto;

	@Column(name="talafi_direccion")
	private String talafiDireccion;

	@Column(name="talafi_estado")
	private String talafiEstado;

	@Column(name="talafi_nombre")
	private String talafiNombre;

	@Column(name="talafi_telefono")
	private Integer talafiTelefono;

	//bi-directional many-to-one association to SivolVehiculo
	@OneToMany(mappedBy="sivolTallerAfiliado")
	private List<SivolVehiculo> sivolVehiculos;

	public SivolTallerAfiliado() {
	}

	public Integer getTalafiCodigo() {
		return this.talafiCodigo;
	}

	public void setTalafiCodigo(Integer talafiCodigo) {
		this.talafiCodigo = talafiCodigo;
	}

	public String getTalafiContacto() {
		return this.talafiContacto;
	}

	public void setTalafiContacto(String talafiContacto) {
		this.talafiContacto = talafiContacto;
	}

	public String getTalafiDireccion() {
		return this.talafiDireccion;
	}

	public void setTalafiDireccion(String talafiDireccion) {
		this.talafiDireccion = talafiDireccion;
	}

	public String getTalafiEstado() {
		return this.talafiEstado;
	}

	public void setTalafiEstado(String talafiEstado) {
		this.talafiEstado = talafiEstado;
	}

	public String getTalafiNombre() {
		return this.talafiNombre;
	}

	public void setTalafiNombre(String talafiNombre) {
		this.talafiNombre = talafiNombre;
	}

	public Integer getTalafiTelefono() {
		return this.talafiTelefono;
	}

	public void setTalafiTelefono(Integer talafiTelefono) {
		this.talafiTelefono = talafiTelefono;
	}

	public List<SivolVehiculo> getSivolVehiculos() {
		return this.sivolVehiculos;
	}

	public void setSivolVehiculos(List<SivolVehiculo> sivolVehiculos) {
		this.sivolVehiculos = sivolVehiculos;
	}

	public SivolVehiculo addSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().add(sivolVehiculo);
		sivolVehiculo.setSivolTallerAfiliado(this);

		return sivolVehiculo;
	}

	public SivolVehiculo removeSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().remove(sivolVehiculo);
		sivolVehiculo.setSivolTallerAfiliado(null);

		return sivolVehiculo;
	}

}