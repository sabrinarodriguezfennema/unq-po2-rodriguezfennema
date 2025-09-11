package tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import tp3.Multioperador;


class MultioperadorTestCase {

	Multioperador multioperador;

	@Test
	void testSumarTodos() {
		multioperador = new Multioperador();
		ArrayList<Integer> listaPrueba = new ArrayList<Integer>();
		listaPrueba.add(1);
		listaPrueba.add(2);
		listaPrueba.add(3);
		listaPrueba.add(4);
		listaPrueba.add(5);
		assertEquals(15, multioperador.sumarTodos(listaPrueba));
	}

	@Test
	void testRestarTodos() {
		multioperador = new Multioperador();
		ArrayList<Integer> listaPrueba = new ArrayList<Integer>();
		listaPrueba.add(1);
		listaPrueba.add(2);
		listaPrueba.add(3);
		assertEquals(-6, multioperador.restarTodos(listaPrueba));
	}
	
	@Test
	void testMultiplicarTodos() {
		multioperador = new Multioperador();
		ArrayList<Integer> listaPrueba = new ArrayList<Integer>();
		listaPrueba.add(5);
		listaPrueba.add(5);
		listaPrueba.add(5);
		assertEquals(125, multioperador.multiplicarTodos(listaPrueba));
	}

}
