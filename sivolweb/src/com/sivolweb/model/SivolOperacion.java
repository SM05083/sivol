package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_operacion database table.
 * 
 */
@Entity
@Table(name="sivol_operacion")
@NamedQuery(name="SivolOperacion.findAll", query="SELECT s FROM SivolOperacion s")
public class SivolOperacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ope_codigo")
	private Integer opeCodigo;

	@Column(name="ope_cod_autoriza")
	private Integer opeCodAutoriza;

	@Column(name="ope_descripcion")
	private String opeDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="ope_fecha_creacion")
	private Date opeFechaCreacion;

	@Temporal(TemporalType.DATE)
	@Column(name="ope_fecha_modificacion")
	private Date opeFechaModificacion;

	//bi-directional many-to-one association to SivolMaestroPersona
	@ManyToOne
	@JoinColumn(name="maeper_codigo")
	private SivolMaestroPersona sivolMaestroPersona;

	//bi-directional many-to-one association to SivolTipoOperacion
	@ManyToOne
	@JoinColumn(name="tipope_codigo")
	private SivolTipoOperacion sivolTipoOperacion;

	//bi-directional many-to-one association to SivolVehiculo
	@OneToMany(mappedBy="sivolOperacion")
	private List<SivolVehiculo> sivolVehiculos;

	public SivolOperacion() {
	}

	public Integer getOpeCodigo() {
		return this.opeCodigo;
	}

	public void setOpeCodigo(Integer opeCodigo) {
		this.opeCodigo = opeCodigo;
	}

	public Integer getOpeCodAutoriza() {
		return this.opeCodAutoriza;
	}

	public void setOpeCodAutoriza(Integer opeCodAutoriza) {
		this.opeCodAutoriza = opeCodAutoriza;
	}

	public String getOpeDescripcion() {
		return this.opeDescripcion;
	}

	public void setOpeDescripcion(String opeDescripcion) {
		this.opeDescripcion = opeDescripcion;
	}

	public Date getOpeFechaCreacion() {
		return this.opeFechaCreacion;
	}

	public void setOpeFechaCreacion(Date opeFechaCreacion) {
		this.opeFechaCreacion = opeFechaCreacion;
	}

	public Date getOpeFechaModificacion() {
		return this.opeFechaModificacion;
	}

	public void setOpeFechaModificacion(Date opeFechaModificacion) {
		this.opeFechaModificacion = opeFechaModificacion;
	}

	public SivolMaestroPersona getSivolMaestroPersona() {
		return this.sivolMaestroPersona;
	}

	public void setSivolMaestroPersona(SivolMaestroPersona sivolMaestroPersona) {
		this.sivolMaestroPersona = sivolMaestroPersona;
	}

	public SivolTipoOperacion getSivolTipoOperacion() {
		return this.sivolTipoOperacion;
	}

	public void setSivolTipoOperacion(SivolTipoOperacion sivolTipoOperacion) {
		this.sivolTipoOperacion = sivolTipoOperacion;
	}

	public List<SivolVehiculo> getSivolVehiculos() {
		return this.sivolVehiculos;
	}

	public void setSivolVehiculos(List<SivolVehiculo> sivolVehiculos) {
		this.sivolVehiculos = sivolVehiculos;
	}

	public SivolVehiculo addSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().add(sivolVehiculo);
		sivolVehiculo.setSivolOperacion(this);

		return sivolVehiculo;
	}

	public SivolVehiculo removeSivolVehiculo(SivolVehiculo sivolVehiculo) {
		getSivolVehiculos().remove(sivolVehiculo);
		sivolVehiculo.setSivolOperacion(null);

		return sivolVehiculo;
	}

}