package com.spring.consultorio.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Long id;

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

	@Column(name = "raza")
	// relacionar
	private Raza raza;

	@Column(name = "grupo_sanguineo")
	private String grupoSanguineo;

	@Column(name = "factor_rh")
	private String factorRh;

	@Column(name = "ocupacion")
	private String ocupacion;

	@Column(name = "lugar_nacimiento")
	// relacionar
	private Ubigeo lugarNacimiento;

	@Column(name = "lugar_procedencia")
	// relacionar
	private Ubigeo lugarProcedencia;

	@Column(name = "persona_ayuda")
	private String personaAyuda;

	@Column(name = "fecha_registro")
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;

	// Relacionar
	private List<Venta> ventas;
	// Relacionar
	private List<CitaMedica> citasMedicas;

	@Column(name = "eliminado")
	private int eliminado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<CitaMedica> getCitasMedicas() {
		return citasMedicas;
	}

	public void setCitasMedicas(List<CitaMedica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}

	public int getEliminado() {
		return eliminado;
	}

	public void setEliminado(int eliminado) {
		this.eliminado = eliminado;
	}

	private static final long serialVersionUID = 1L;

}
