package tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tp3.Point;

class PointTestCase {
	Point punto;
	Point otroPunto;
	
	@Test
	void testConstructorVacioPuntoCeroCero() {
		punto = new Point();
		assertEquals(0, punto.getX());
		assertEquals(0, punto.getY());
	}
	
	@Test
	void testMoverAOtraPosicion() {
		punto = new Point(1,2);
		punto.moverA(4, 5);
		assertEquals(4, punto.getX());
		assertEquals(5, punto.getY());
	}
	
	@Test
	void testSumarPunto() {
		punto = new Point(2,2);
		otroPunto = new Point(1,1);
		assertEquals(3, punto.sumarPunto(otroPunto).getX());
		assertEquals(3, punto.sumarPunto(otroPunto).getY());
	}

}
