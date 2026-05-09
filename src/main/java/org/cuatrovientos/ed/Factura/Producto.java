package org.cuatrovientos.ed.Factura;

public class Producto {

	private String nombre;
	private float precio;
	private int cantidad;
	
	public Producto(String nombre, float precio, int cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public float precioTotal() {
		return precio * cantidad;
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

	public String getNombre() {
		return this.nombre;
	}
	
	
}
