package org.cuatrovientos.ed.Factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {

	@Test
	void testNuevo() {
		Producto p = new Producto("pan", 0.50f, 1);

		String expected = "pan";
		String actual = p.getNombre();

		assertEquals(expected, actual, "El nombre del producto debe iniciarse correctamente como 'pan'");
	}
	
	@Test
    void testPrecioTotal() {
        Producto p = new Producto("leche", 1.20f, 2);
        
        float expected = 2.40f;
        float actual = p.precioTotal();
        
        assertEquals(expected, actual, 0.01f, "El cálculo del precio total (precio * cantidad) falló");
    }
}
