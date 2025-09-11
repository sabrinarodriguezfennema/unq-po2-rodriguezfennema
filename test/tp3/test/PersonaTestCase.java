package tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import tp3.Persona;

class PersonaTestCase {

	@Test
	void testNombre() {
		Persona ana = new Persona("Ana", new Date("2000/07/01"));
		assertEquals("Ana", ana.getNombre());
	}
	
	@Test
	void testEdad() {
		Persona ana = new Persona("Ana", new Date("2000/07/01"));
		assertEquals(25, ana.getEdad());
	}
	
	@Test
	void testFechaNacimiento() {
		Persona ana = new Persona("Ana", new Date("2000/07/01"));
		assertEquals(new Date("2000/07/01"), ana.getFechaNacimiento());
	}

}
