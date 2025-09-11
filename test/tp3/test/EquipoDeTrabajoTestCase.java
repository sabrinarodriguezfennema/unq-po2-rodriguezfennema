package tp3.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tp3.EquipoDeTrabajo;
import tp3.Persona;

class EquipoDeTrabajoTestCase {
	
	@Test
	void testPromedioDeEdadEquipo() {
		EquipoDeTrabajo equipo = new EquipoDeTrabajo("Equipo A");

        Persona p1 = new Persona("Ana", "Gomez", 30);
        Persona p2 = new Persona("Luis", "Perez", 30);
        Persona p3 = new Persona("Sofia", "Diaz", 30);
        Persona p4 = new Persona("Juan", "Lopez", 30);
        Persona p5 = new Persona("Maria", "Fernandez", 30);
        
        equipo.agregarIntegrante(p1);
        equipo.agregarIntegrante(p2);
        equipo.agregarIntegrante(p3);
        equipo.agregarIntegrante(p4);
        equipo.agregarIntegrante(p5);
        
        assertEquals(30, equipo.promedioEdad());
	}
	
	@Test
	void testPromedioDeEdadEquipo2() {
		EquipoDeTrabajo equipo = new EquipoDeTrabajo("Equipo A");

        assertEquals(0, equipo.promedioEdad());
	}
	
	@Test
	void testNombreEquipo() {
		EquipoDeTrabajo equipo = new EquipoDeTrabajo("Equipo A");

        assertEquals("Equipo A", equipo.getNombre());
	}

}
