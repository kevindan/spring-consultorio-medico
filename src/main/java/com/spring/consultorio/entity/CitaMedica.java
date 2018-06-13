package com.spring.consultorio.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "citas_medicas")
public class CitaMedica implements Serializable {

	@Id
	@Column(name = "id_cita_medica")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCitaMedica;
	// relacionar
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_programacion_medica")
	private ProgramacionMedica programacionMedica;
	// relacionar
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_paciente")
	private Paciente paciente;

	@Column(name = "estado_cita")
	private String estadoCita;

	@Column(name = "fecha_registro")
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date fechaRegistro;

	@Column(name = "eliminado")
	private int eliminado;

	public Long getIdCitaMedica() {
		return idCitaMedica;
	}

	public void setIdCitaMedica(Long idCitaMedica) {
		this.idCitaMedica = idCitaMedica;
	}

	public ProgramacionMedica getProgramacionMedica() {
		return programacionMedica;
	}

	public void setProgramacionMedica(ProgramacionMedica programacionMedica) {
		this.programacionMedica = programacionMedica;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getEstadoCita() {
		return estadoCita;
	}

	public void setEstadoCita(String estadoCita) {
		this.estadoCita = estadoCita;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public int getEliminado() {
		return eliminado;
	}

	public void setEliminado(int eliminado) {
		this.eliminado = eliminado;
	}

	private static final long serialVersionUID = 1L;

}
