package tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tp3.Cuadrado;
import tp3.Point;

class CuadradoTestCase {

	Point punto;
	Cuadrado cuadrado;
	
	@Test
	void testPerimetroCuadrado() {
		punto = new Point(2,3);
		cuadrado = new Cuadrado(punto, 5); 
		assertEquals(20 , cuadrado.getPerimetro());
	}
	
	@Test
	void testAreaCuadrado() {
		punto = new Point(2,3);
		cuadrado = new Cuadrado(punto, 10); 
		assertEquals(20, cuadrado.getArea());
	}

}
