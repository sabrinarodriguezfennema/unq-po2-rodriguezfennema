package tp4.supermercado.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp4.supermercado.ProductoPrimeraNecesidad;

class ProductoPrimeraNecesidadDescuentoTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoPrimeraNecesidad("Arroz", 18d, 8.0, true);
		leche = new ProductoPrimeraNecesidad("Leche", 8d, 11.0, false);
	}
	
	@Test
	public void testCalcularPrecioDescuento10Porciento() {
		assertEquals(new Double(7.12), leche.getPrecio());
	}
	
	@Test
	public void testCalcularPrecioDescuento8Porciento() {
		leche = new ProductoPrimeraNecesidad("Arroz", 5.0, 8.0, false);
		assertEquals(new Double(16.56), arroz.getPrecio());
	}
}
