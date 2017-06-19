package com.sivolweb.model.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
/**
 * Pojo para items por usuario
 * @author DS-EEHH
 *
 */
import javax.persistence.Id;
@Entity
public class MenuItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="menite_codigo")
	private Integer codigo;
	
	@Column(name="menite_nombre")
	private String nombre;
	
	@Column(name="menite_descripcion")
	private String descripcion;
	
	@Column(name="menite_url")
	private String url;

	public MenuItem(){
		super();
	}
	
	public MenuItem(Integer codigo, String nombre, String descripcion, String url) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.url = url;
	}
	
	@Override
	public String toString(){	
		return new StringBuffer("{ codigo : ").append(this.codigo).append(",")
				.append(" nombre : ").append(this.nombre).append(",")
				.append(" descripcion : ").append(this.descripcion).append(",")
				.append(" url : ").append(this.url).append(" }").toString();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
