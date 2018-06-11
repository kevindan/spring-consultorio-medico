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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "ventas")
public class Venta implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_venta")
	private Long idVenta;
	// relacionar
	// Muchas ventas --> Un clieente
	@ManyToOne(fetch = FetchType.LAZY)
	private Paciente paciente;

	@Column(name = "numero_operacion")
	@NotEmpty
	private String numeroOperacion;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha")
	private Date fecha;

	@Column(name = "igv")
	private double igv;

	@Column(name = "monto_total")
	private double montoTotal;
	// relacionar
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="id_venta")
	private List<VentaDetalle> ventasDetalle;

	@Column(name = "eliminado")
	private int eliminado;
	
	public Venta(){
		this.ventasDetalle = new ArrayList<VentaDetalle>();
	}
	
	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getNumeroOperacion() {
		return numeroOperacion;
	}

	public void setNumeroOperacion(String numeroOperacion) {
		this.numeroOperacion = numeroOperacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getIgv() {
		return igv;
	}

	public void setIgv(double igv) {
		this.igv = igv;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public List<VentaDetalle> getVentasDetalle() {
		return ventasDetalle;
	}

	public void setVentasDetalle(List<VentaDetalle> ventasDetalle) {
		this.ventasDetalle = ventasDetalle;
	}
	
	public void addVentaDetalle(VentaDetalle ventaDetalle){
		this.ventasDetalle.add(ventaDetalle);
	}

	public int getEliminado() {
		return eliminado;
	}

	public void setEliminado(int eliminado) {
		this.eliminado = eliminado;
	}

	private static final long serialVersionUID = 1L;

}
