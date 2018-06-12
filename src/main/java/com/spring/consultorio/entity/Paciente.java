package com.spring.consultorio.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pacientes")
public class Paciente implements Serializable {

	@Id
	@Column(name = "id_paciente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaciente;

	@Column(name = "dni")
	@NotEmpty
	private String dni;

	@Column(name = "nombres")
	@NotEmpty
	private String nombres;

	@Column(name = "apellido_paterno")
	@NotEmpty
	private String apellidoPaterno;

	@Column(name = "apellido_materno")
	@NotEmpty
	private String apellidoMaterno;

	@Column(name = "sexo")
	private String sexo;

	@Column(name = "estado_civil")
	private String estadoCivil;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "fecha_nacimiento")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
	private Date fechaNacimiento;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "email")
	@Email
	@NotEmpty
	private String email;

	@Column(name = "contrasena")
	@NotEmpty
	private String contrasena;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_raza")
	private Raza raza;

	@Column(name = "grupo_sanguineo")
	private String grupoSanguineo;

	@Column(name = "factor_rh")
	private String factorRh;

	@Column(name = "ocupacion")
	private String ocupacion;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lugar_nacimiento")
	private Ubigeo lugarNacimiento;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lugar_procedencia")
	private Ubigeo lugarProcedencia;

	@Column(name = "persona_ayuda")
	private String personaAyuda;

	@Column(name = "fecha_registro")
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	// Relacionar
	// Un paciente -> Muchas ventas
	@OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Venta> ventas;
	// Relacionar
	@OneToMany(mappedBy = "paciente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<CitaMedica> citasMedicas;

	@Column(name = "eliminado")
	private int eliminado;

	public Paciente() {
		// Inicializamos el array de ventas
		ventas = new ArrayList<Venta>();
		citasMedicas = new ArrayList<CitaMedica>();

	}

	@PrePersist
	// Asigna la fecha al atributo fechaRegistro antes de grabarse en la base de
	// datos
	public void prePersist() {

		fechaRegistro = new Date();
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public String getFactorRh() {
		return factorRh;
	}

	public void setFactorRh(String factorRh) {
		this.factorRh = factorRh;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public Ubigeo getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(Ubigeo lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public Ubigeo getLugarProcedencia() {
		return lugarProcedencia;
	}

	public void setLugarProcedencia(Ubigeo lugarProcedencia) {
		this.lugarProcedencia = lugarProcedencia;
	}

	public String getPersonaAyuda() {
		return personaAyuda;
	}

	public void setPersonaAyuda(String personaAyuda) {
		this.personaAyuda = personaAyuda;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public void addVenta(Venta venta) {

		ventas.add(venta);
	}

	public List<CitaMedica> getCitasMedicas() {
		return citasMedicas;
	}

	public void setCitasMedicas(List<CitaMedica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}

	public void addCitaMedica(CitaMedica citaMedica) {
		citasMedicas.add(citaMedica);
	}

	public int getEliminado() {
		return eliminado;
	}

	public void setEliminado(int eliminado) {
		this.eliminado = eliminado;
	}

	private static final long serialVersionUID = 1L;

}
