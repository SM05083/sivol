package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the sivol_maestro_persona database table.
 * 
 */
@Entity
@Table(name="sivol_maestro_persona")
@NamedQuery(name="SivolMaestroPersona.findAll", query="SELECT s FROM SivolMaestroPersona s")
public class SivolMaestroPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="maeper_codigo")
	private Integer maeperCodigo;

	@Column(name="maeper_apellido")
	private String maeperApellido;

	@Column(name="maeper_apellido_casada")
	private String maeperApellidoCasada;

	@Column(name="maeper_conteo_vehiculos")
	private Integer maeperConteoVehiculos;

	@Column(name="maeper_correo")
	private String maeperCorreo;

	@Column(name="maeper_direccion")
	private String maeperDireccion;

	@Temporal(TemporalType.DATE)
	@Column(name="maeper_fecha_nacimiento")
	private Date maeperFechaNacimiento;

	@Column(name="maeper_genero")
	private String maeperGenero;

	@Column(name="maeper_nit")
	private String maeperNit;

	@Column(name="maeper_nombre")
	private String maeperNombre;

	@Column(name="maeper_tel_casa")
	private Integer maeperTelCasa;

	@Column(name="maeper_tel_movil")
	private Integer maeperTelMovil;

	//bi-directional many-to-one association to SivolAlerta
	@OneToMany(mappedBy="sivolMaestroPersona")
	private List<SivolAlerta> sivolAlertas;

	//bi-directional many-to-one association to SivolMaestroPersona
	@ManyToOne
	@JoinColumn(name="siv_maeper_codigo")
	private SivolMaestroPersona sivolMaestroPersona;

	//bi-directional many-to-one association to SivolMaestroPersona
	@OneToMany(mappedBy="sivolMaestroPersona")
	private List<SivolMaestroPersona> sivolMaestroPersonas;

	//bi-directional many-to-one association to SivolOperacion
	@OneToMany(mappedBy="sivolMaestroPersona")
	private List<SivolOperacion> sivolOperacions;

	//bi-directional many-to-one association to SivolUsuario
	@OneToMany(mappedBy="sivolMaestroPersona")
	private List<SivolUsuario> sivolUsuarios;

	public SivolMaestroPersona() {
	}

	public Integer getMaeperCodigo() {
		return this.maeperCodigo;
	}

	public void setMaeperCodigo(Integer maeperCodigo) {
		this.maeperCodigo = maeperCodigo;
	}

	public String getMaeperApellido() {
		return this.maeperApellido;
	}

	public void setMaeperApellido(String maeperApellido) {
		this.maeperApellido = maeperApellido;
	}

	public String getMaeperApellidoCasada() {
		return this.maeperApellidoCasada;
	}

	public void setMaeperApellidoCasada(String maeperApellidoCasada) {
		this.maeperApellidoCasada = maeperApellidoCasada;
	}

	public Integer getMaeperConteoVehiculos() {
		return this.maeperConteoVehiculos;
	}

	public void setMaeperConteoVehiculos(Integer maeperConteoVehiculos) {
		this.maeperConteoVehiculos = maeperConteoVehiculos;
	}

	public String getMaeperCorreo() {
		return this.maeperCorreo;
	}

	public void setMaeperCorreo(String maeperCorreo) {
		this.maeperCorreo = maeperCorreo;
	}

	public String getMaeperDireccion() {
		return this.maeperDireccion;
	}

	public void setMaeperDireccion(String maeperDireccion) {
		this.maeperDireccion = maeperDireccion;
	}

	public Date getMaeperFechaNacimiento() {
		return this.maeperFechaNacimiento;
	}

	public void setMaeperFechaNacimiento(Date maeperFechaNacimiento) {
		this.maeperFechaNacimiento = maeperFechaNacimiento;
	}

	public String getMaeperGenero() {
		return this.maeperGenero;
	}

	public void setMaeperGenero(String maeperGenero) {
		this.maeperGenero = maeperGenero;
	}

	public String getMaeperNit() {
		return this.maeperNit;
	}

	public void setMaeperNit(String maeperNit) {
		this.maeperNit = maeperNit;
	}

	public String getMaeperNombre() {
		return this.maeperNombre;
	}

	public void setMaeperNombre(String maeperNombre) {
		this.maeperNombre = maeperNombre;
	}

	public Integer getMaeperTelCasa() {
		return this.maeperTelCasa;
	}

	public void setMaeperTelCasa(Integer maeperTelCasa) {
		this.maeperTelCasa = maeperTelCasa;
	}

	public Integer getMaeperTelMovil() {
		return this.maeperTelMovil;
	}

	public void setMaeperTelMovil(Integer maeperTelMovil) {
		this.maeperTelMovil = maeperTelMovil;
	}

	public List<SivolAlerta> getSivolAlertas() {
		return this.sivolAlertas;
	}

	public void setSivolAlertas(List<SivolAlerta> sivolAlertas) {
		this.sivolAlertas = sivolAlertas;
	}

	public SivolAlerta addSivolAlerta(SivolAlerta sivolAlerta) {
		getSivolAlertas().add(sivolAlerta);
		sivolAlerta.setSivolMaestroPersona(this);

		return sivolAlerta;
	}

	public SivolAlerta removeSivolAlerta(SivolAlerta sivolAlerta) {
		getSivolAlertas().remove(sivolAlerta);
		sivolAlerta.setSivolMaestroPersona(null);

		return sivolAlerta;
	}

	public SivolMaestroPersona getSivolMaestroPersona() {
		return this.sivolMaestroPersona;
	}

	public void setSivolMaestroPersona(SivolMaestroPersona sivolMaestroPersona) {
		this.sivolMaestroPersona = sivolMaestroPersona;
	}

	public List<SivolMaestroPersona> getSivolMaestroPersonas() {
		return this.sivolMaestroPersonas;
	}

	public void setSivolMaestroPersonas(List<SivolMaestroPersona> sivolMaestroPersonas) {
		this.sivolMaestroPersonas = sivolMaestroPersonas;
	}

	public SivolMaestroPersona addSivolMaestroPersona(SivolMaestroPersona sivolMaestroPersona) {
		getSivolMaestroPersonas().add(sivolMaestroPersona);
		sivolMaestroPersona.setSivolMaestroPersona(this);

		return sivolMaestroPersona;
	}

	public SivolMaestroPersona removeSivolMaestroPersona(SivolMaestroPersona sivolMaestroPersona) {
		getSivolMaestroPersonas().remove(sivolMaestroPersona);
		sivolMaestroPersona.setSivolMaestroPersona(null);

		return sivolMaestroPersona;
	}

	public List<SivolOperacion> getSivolOperacions() {
		return this.sivolOperacions;
	}

	public void setSivolOperacions(List<SivolOperacion> sivolOperacions) {
		this.sivolOperacions = sivolOperacions;
	}

	public SivolOperacion addSivolOperacion(SivolOperacion sivolOperacion) {
		getSivolOperacions().add(sivolOperacion);
		sivolOperacion.setSivolMaestroPersona(this);

		return sivolOperacion;
	}

	public SivolOperacion removeSivolOperacion(SivolOperacion sivolOperacion) {
		getSivolOperacions().remove(sivolOperacion);
		sivolOperacion.setSivolMaestroPersona(null);

		return sivolOperacion;
	}

	public List<SivolUsuario> getSivolUsuarios() {
		return this.sivolUsuarios;
	}

	public void setSivolUsuarios(List<SivolUsuario> sivolUsuarios) {
		this.sivolUsuarios = sivolUsuarios;
	}

	public SivolUsuario addSivolUsuario(SivolUsuario sivolUsuario) {
		getSivolUsuarios().add(sivolUsuario);
		sivolUsuario.setSivolMaestroPersona(this);

		return sivolUsuario;
	}

	public SivolUsuario removeSivolUsuario(SivolUsuario sivolUsuario) {
		getSivolUsuarios().remove(sivolUsuario);
		sivolUsuario.setSivolMaestroPersona(null);

		return sivolUsuario;
	}

}