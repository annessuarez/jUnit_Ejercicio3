package org.cuatrovientos.ed.Factura;

import java.util.Vector;

public class Factura {
	
	private Vector<Producto> productos = new Vector<>();
	
	public void meterProducto(Producto p) {
		productos.add(p);
	}
	
	public float totalFactura() {
		float precio = 0;
		for (Producto producto : productos) {
			precio += producto.precioTotal();
		}
		return precio;
	}
	
	public float aplicarIVA(float porcentajeIva) {
	    float totalSinIva = totalFactura();
	    return totalSinIva + (totalSinIva * (porcentajeIva / 100));
	}
	
}
