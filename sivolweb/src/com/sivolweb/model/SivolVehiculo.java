package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_vehiculo database table.
 * 
 */
@Entity
@Table(name="sivol_vehiculo")
@NamedQuery(name="SivolVehiculo.findAll", query="SELECT s FROM SivolVehiculo s")
public class SivolVehiculo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="veh_codigo")
	private Integer vehCodigo;

	@Column(name="veh_anio")
	private Integer vehAnio;

	@Column(name="veh_costo")
	private BigDecimal vehCosto;

	@Column(name="veh_costo_alquiler")
	private BigDecimal vehCostoAlquiler;

	@Column(name="veh_descripcion")
	private String vehDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="veh_fecha_impor")
	private Date vehFechaImpor;

	@Temporal(TemporalType.DATE)
	@Column(name="veh_fecha_modificacion")
	private Date vehFechaModificacion;

	@Column(name="veh_porc_avance")
	private BigDecimal vehPorcAvance;

	@Column(name="veh_ubicacion")
	private String vehUbicacion;

	//bi-directional many-to-one association to SivolDesperfectoVehiculo
	@OneToMany(mappedBy="sivolVehiculo")
	private List<SivolDesperfectoVehiculo> sivolDesperfectoVehiculos;

	//bi-directional many-to-one association to SivolMultimediaVehiculo
	@OneToMany(mappedBy="sivolVehiculo")
	private List<SivolMultimediaVehiculo> sivolMultimediaVehiculos;

	//bi-directional many-to-one association to SivolEstadoVehiculo
	@ManyToOne
	@JoinColumn(name="estveh_codigo")
	private SivolEstadoVehiculo sivolEstadoVehiculo;

	//bi-directional many-to-one association to SivolMarcaVehiculo
	@ManyToOne
	@JoinColumn(name="marveh_codigo")
	private SivolMarcaVehiculo sivolMarcaVehiculo;

	//bi-directional many-to-one association to SivolModeloMarca
	@ManyToOne
	@JoinColumn(name="modmar_codigo")
	private SivolModeloMarca sivolModeloMarca;

	//bi-directional many-to-one association to SivolOperacion
	@ManyToOne
	@JoinColumn(name="ope_codigo")
	private SivolOperacion sivolOperacion;

	//bi-directional many-to-one association to SivolPisoBodega
	@ManyToOne
	@JoinColumn(name="pisbod_codigo")
	private SivolPisoBodega sivolPisoBodega;

	//bi-directional many-to-one association to SivolRemolcador
	@ManyToOne
	@JoinColumn(name="rem_codigo")
	private SivolRemolcador sivolRemolcador;

	//bi-directional many-to-one association to SivolTallerAfiliado
	@ManyToOne
	@JoinColumn(name="talafi_codigo")
	private SivolTallerAfiliado sivolTallerAfiliado;

	public SivolVehiculo() {
	}

	public Integer getVehCodigo() {
		return this.vehCodigo;
	}

	public void setVehCodigo(Integer vehCodigo) {
		this.vehCodigo = vehCodigo;
	}

	public Integer getVehAnio() {
		return this.vehAnio;
	}

	public void setVehAnio(Integer vehAnio) {
		this.vehAnio = vehAnio;
	}

	public BigDecimal getVehCosto() {
		return this.vehCosto;
	}

	public void setVehCosto(BigDecimal vehCosto) {
		this.vehCosto = vehCosto;
	}

	public BigDecimal getVehCostoAlquiler() {
		return this.vehCostoAlquiler;
	}

	public void setVehCostoAlquiler(BigDecimal vehCostoAlquiler) {
		this.vehCostoAlquiler = vehCostoAlquiler;
	}

	public String getVehDescripcion() {
		return this.vehDescripcion;
	}

	public void setVehDescripcion(String vehDescripcion) {
		this.vehDescripcion = vehDescripcion;
	}

	public Date getVehFechaImpor() {
		return this.vehFechaImpor;
	}

	public void setVehFechaImpor(Date vehFechaImpor) {
		this.vehFechaImpor = vehFechaImpor;
	}

	public Date getVehFechaModificacion() {
		return this.vehFechaModificacion;
	}

	public void setVehFechaModificacion(Date vehFechaModificacion) {
		this.vehFechaModificacion = vehFechaModificacion;
	}

	public BigDecimal getVehPorcAvance() {
		return this.vehPorcAvance;
	}

	public void setVehPorcAvance(BigDecimal vehPorcAvance) {
		this.vehPorcAvance = vehPorcAvance;
	}

	public String getVehUbicacion() {
		return this.vehUbicacion;
	}

	public void setVehUbicacion(String vehUbicacion) {
		this.vehUbicacion = vehUbicacion;
	}

	public List<SivolDesperfectoVehiculo> getSivolDesperfectoVehiculos() {
		return this.sivolDesperfectoVehiculos;
	}

	public void setSivolDesperfectoVehiculos(List<SivolDesperfectoVehiculo> sivolDesperfectoVehiculos) {
		this.sivolDesperfectoVehiculos = sivolDesperfectoVehiculos;
	}

	public SivolDesperfectoVehiculo addSivolDesperfectoVehiculo(SivolDesperfectoVehiculo sivolDesperfectoVehiculo) {
		getSivolDesperfectoVehiculos().add(sivolDesperfectoVehiculo);
		sivolDesperfectoVehiculo.setSivolVehiculo(this);

		return sivolDesperfectoVehiculo;
	}

	public SivolDesperfectoVehiculo removeSivolDesperfectoVehiculo(SivolDesperfectoVehiculo sivolDesperfectoVehiculo) {
		getSivolDesperfectoVehiculos().remove(sivolDesperfectoVehiculo);
		sivolDesperfectoVehiculo.setSivolVehiculo(null);

		return sivolDesperfectoVehiculo;
	}

	public List<SivolMultimediaVehiculo> getSivolMultimediaVehiculos() {
		return this.sivolMultimediaVehiculos;
	}

	public void setSivolMultimediaVehiculos(List<SivolMultimediaVehiculo> sivolMultimediaVehiculos) {
		this.sivolMultimediaVehiculos = sivolMultimediaVehiculos;
	}

	public SivolMultimediaVehiculo addSivolMultimediaVehiculo(SivolMultimediaVehiculo sivolMultimediaVehiculo) {
		getSivolMultimediaVehiculos().add(sivolMultimediaVehiculo);
		sivolMultimediaVehiculo.setSivolVehiculo(this);

		return sivolMultimediaVehiculo;
	}

	public SivolMultimediaVehiculo removeSivolMultimediaVehiculo(SivolMultimediaVehiculo sivolMultimediaVehiculo) {
		getSivolMultimediaVehiculos().remove(sivolMultimediaVehiculo);
		sivolMultimediaVehiculo.setSivolVehiculo(null);

		return sivolMultimediaVehiculo;
	}

	public SivolEstadoVehiculo getSivolEstadoVehiculo() {
		return this.sivolEstadoVehiculo;
	}

	public void setSivolEstadoVehiculo(SivolEstadoVehiculo sivolEstadoVehiculo) {
		this.sivolEstadoVehiculo = sivolEstadoVehiculo;
	}

	public SivolMarcaVehiculo getSivolMarcaVehiculo() {
		return this.sivolMarcaVehiculo;
	}

	public void setSivolMarcaVehiculo(SivolMarcaVehiculo sivolMarcaVehiculo) {
		this.sivolMarcaVehiculo = sivolMarcaVehiculo;
	}

	public SivolModeloMarca getSivolModeloMarca() {
		return this.sivolModeloMarca;
	}

	public void setSivolModeloMarca(SivolModeloMarca sivolModeloMarca) {
		this.sivolModeloMarca = sivolModeloMarca;
	}

	public SivolOperacion getSivolOperacion() {
		return this.sivolOperacion;
	}

	public void setSivolOperacion(SivolOperacion sivolOperacion) {
		this.sivolOperacion = sivolOperacion;
	}

	public SivolPisoBodega getSivolPisoBodega() {
		return this.sivolPisoBodega;
	}

	public void setSivolPisoBodega(SivolPisoBodega sivolPisoBodega) {
		this.sivolPisoBodega = sivolPisoBodega;
	}

	public SivolRemolcador getSivolRemolcador() {
		return this.sivolRemolcador;
	}

	public void setSivolRemolcador(SivolRemolcador sivolRemolcador) {
		this.sivolRemolcador = sivolRemolcador;
	}

	public SivolTallerAfiliado getSivolTallerAfiliado() {
		return this.sivolTallerAfiliado;
	}

	public void setSivolTallerAfiliado(SivolTallerAfiliado sivolTallerAfiliado) {
		this.sivolTallerAfiliado = sivolTallerAfiliado;
	}

}