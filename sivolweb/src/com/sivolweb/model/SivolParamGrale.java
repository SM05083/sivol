package com.sivolweb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sivol_param_grales database table.
 * 
 */
@Entity
@Table(name="sivol_param_grales")
@NamedQuery(name="SivolParamGrale.findAll", query="SELECT s FROM SivolParamGrale s")
public class SivolParamGrale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pargra_codigo_empresa")
	private Integer pargraCodigoEmpresa;

	@Column(name="pargra_antigu_permitida")
	private Integer pargraAntiguPermitida;

	@Column(name="pargra_imgs_x_vehiculo")
	private Integer pargraImgsXVehiculo;

	@Column(name="pargra_logo_empresa")
	private String pargraLogoEmpresa;

	@Column(name="pargra_nombre_empresa")
	private String pargraNombreEmpresa;

	@Column(name="pargra_veh_permitidos")
	private Integer pargraVehPermitidos;

	public SivolParamGrale() {
	}

	public Integer getPargraCodigoEmpresa() {
		return this.pargraCodigoEmpresa;
	}

	public void setPargraCodigoEmpresa(Integer pargraCodigoEmpresa) {
		this.pargraCodigoEmpresa = pargraCodigoEmpresa;
	}

	public Integer getPargraAntiguPermitida() {
		return this.pargraAntiguPermitida;
	}

	public void setPargraAntiguPermitida(Integer pargraAntiguPermitida) {
		this.pargraAntiguPermitida = pargraAntiguPermitida;
	}

	public Integer getPargraImgsXVehiculo() {
		return this.pargraImgsXVehiculo;
	}

	public void setPargraImgsXVehiculo(Integer pargraImgsXVehiculo) {
		this.pargraImgsXVehiculo = pargraImgsXVehiculo;
	}

	public String getPargraLogoEmpresa() {
		return this.pargraLogoEmpresa;
	}

	public void setPargraLogoEmpresa(String pargraLogoEmpresa) {
		this.pargraLogoEmpresa = pargraLogoEmpresa;
	}

	public String getPargraNombreEmpresa() {
		return this.pargraNombreEmpresa;
	}

	public void setPargraNombreEmpresa(String pargraNombreEmpresa) {
		this.pargraNombreEmpresa = pargraNombreEmpresa;
	}

	public Integer getPargraVehPermitidos() {
		return this.pargraVehPermitidos;
	}

	public void setPargraVehPermitidos(Integer pargraVehPermitidos) {
		this.pargraVehPermitidos = pargraVehPermitidos;
	}

}