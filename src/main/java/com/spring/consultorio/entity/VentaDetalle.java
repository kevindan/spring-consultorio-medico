package com.spring.consultorio.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "ventas_detalle")
public class VentaDetalle implements Serializable {

	@Id
	@Column(name = "id_detalle_venta")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetalleVenta;
	// relacionar
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_producto")
	private Producto producto;

	@NotEmpty
	@Column(name = "precio")
	private double precio;

	@NotEmpty
	@Column(name = "cantidad")
	private int cantidad;

	@NotEmpty
	@Column(name = "subtotal")
	private double subtotal;

	@Column(name = "eliminado")
	private int eliminado;

	public Long getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(Long idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public int getEliminado() {
		return eliminado;
	}

	public void setEliminado(int eliminado) {
		this.eliminado = eliminado;
	}
	
	public double calculaSubtotal(){
		return producto.getPrecioVenta() * cantidad;
	}

	private static final long serialVersionUID = 1L;

}
