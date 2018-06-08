package com.spring.consultorio.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "consultorios")
public class Consultorio implements Serializable {

	@Id
	@Column(name = "id_consultorio")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConsultorio;

	@NotEmpty
	@Column(name = "nombre_consultorio")
	private String nombreConsultorio;
	// relacionar
	private Establecimiento establecimiento;

	@Column(name = "eliminado")
	private int eliminado;

	public Long getIdConsultorio() {
		return idConsultorio;
	}

	public void setIdConsultorio(Long idConsultorio) {
		this.idConsultorio = idConsultorio;
	}

	public String getNombreConsultorio() {
		return nombreConsultorio;
	}

	public void setNombreConsultorio(String nombreConsultorio) {
		this.nombreConsultorio = nombreConsultorio;
	}

	public Establecimiento getEstablecimiento() {
		return establecimiento;
	}

	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}

	public int getEliminado() {
		return eliminado;
	}

	public void setEliminado(int eliminado) {
		this.eliminado = eliminado;
	}

	private static final long serialVersionUID = 1L;

}
