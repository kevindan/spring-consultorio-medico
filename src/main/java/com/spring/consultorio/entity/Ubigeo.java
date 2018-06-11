package com.spring.consultorio.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "ubigeo")
public class Ubigeo implements Serializable {

	@Id
	@Column(name = "ubigeo")
	private String ubigeo;

	@NotEmpty
	@Column(name = "codigo_departamento")
	private String codigoDepartamento;

	@NotEmpty
	@Column(name = "departamento")
	private String departamento;

	@NotEmpty
	@Column(name = "codigo_provincia")
	private String codigoProvincia;

	@NotEmpty
	@Column(name = "provincia")
	private String provincia;

	@NotEmpty
	@Column(name = "codigo_distrito")
	private String codigoDistrito;

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public String getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(String codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCodigoProvincia() {
		return codigoProvincia;
	}

	public void setCodigoProvincia(String codigoProvincia) {
		this.codigoProvincia = codigoProvincia;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCodigoDistrito() {
		return codigoDistrito;
	}

	public void setCodigoDistrito(String codigoDistrito) {
		this.codigoDistrito = codigoDistrito;
	}

	private static final long serialVersionUID = 1L;

}
