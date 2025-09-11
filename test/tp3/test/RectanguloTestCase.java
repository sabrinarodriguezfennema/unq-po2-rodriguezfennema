package tp3.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import tp3.Point;
import tp3.Rectangulo;

class RectanguloTestCase {
	Point punto;
	Rectangulo rectangulo;
	
	@Test
	void testPerimetroRectangulo() {
		punto = new Point(2,3);
		rectangulo = new Rectangulo(punto, 5, 10); 
		assertEquals(30 , rectangulo.getPerimetro());
	}
	
	@Test
	void testAreaRectangulo() {
		punto = new Point(2,3);
		rectangulo = new Rectangulo(punto, 5, 10); 
		assertEquals(15, rectangulo.getArea());
	}
	
	@Test
	void testEsHorizontal() {
		punto = new Point(2,3);
		rectangulo = new Rectangulo(punto, 15, 10); 
		assertEquals(true, rectangulo.esHorizontal());
		assertEquals(false, rectangulo.esVertical());
	}
	
	@Test
	void testEsVertical() {
		punto = new Point(2,3);
		rectangulo = new Rectangulo(punto, 5, 10); 
		assertEquals(false, rectangulo.esHorizontal());
		assertEquals(true, rectangulo.esVertical());
	}
}
