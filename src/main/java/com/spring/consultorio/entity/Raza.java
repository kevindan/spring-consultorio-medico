package com.spring.consultorio.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="razas")
public class Raza implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_raza;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="eliminado")
	private int eliminado;

	public Long getId_raza() {
		return id_raza;
	}

	public void setId_raza(Long id_raza) {
		this.id_raza = id_raza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEliminado() {
		return eliminado;
	}

	public void setEliminado(int eliminado) {
		this.eliminado = eliminado;
	}

	private static final long serialVersionUID = 1L;

}
