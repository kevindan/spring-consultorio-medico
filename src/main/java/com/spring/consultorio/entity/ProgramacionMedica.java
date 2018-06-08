package com.spring.consultorio.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "programacion_medica")
public class ProgramacionMedica implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_programacion_medica")
	private Long idProgramacionMedica;
	// Relacionar
	private Usuario usuario;
	// Relacionar
	private Consultorio consultorio;
	@Temporal(TemporalType.DATE)
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "fecha")
	private Date fecha;

	@NotEmpty
	@Column(name = "dia_semana")
	private String diaSemana;

	@NotEmpty
	@Column(name = "hora_inicio")
	private String horaInicio;

	@NotEmpty
	private String horaFin;

	@Column(name = "fecha_registro")
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date fechaRegistro;

	@Column(name = "eliminado")
	private int eliminado;

	public Long getIdProgramacionMedica() {
		return idProgramacionMedica;
	}

	public void setIdProgramacionMedica(Long idProgramacionMedica) {
		this.idProgramacionMedica = idProgramacionMedica;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Consultorio getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
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
