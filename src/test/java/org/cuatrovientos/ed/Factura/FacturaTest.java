package org.cuatrovientos.ed.Factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacturaTest {

	@Test
	void testTotalFactura() {
		Factura factura = new Factura();
		Producto p1 = new Producto("Pan", 0.50f, 2); // Total: 1.00
		Producto p2 = new Producto("Leche", 1.20f, 1); // Total: 1.20

		factura.meterProducto(p1);
		factura.meterProducto(p2);

		float expected = 2.20f;
		float actual = factura.totalFactura();

		assertEquals(expected, actual, 0.01f, "La suma total de la factura es incorrecta");
	}

	@Test
	void testAplicarIva() {
		Factura factura = new Factura();
		factura.meterProducto(new Producto("Refresco", 1.00f, 1));

		float iva = 21f;
		float expected = 1.21f;
		float actual = factura.aplicarIVA(iva);

		assertEquals(expected, actual, 0.01f, "El cálculo del IVA sobre el total falló");
	}

}
