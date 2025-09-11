package tp4.trabajador.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp4.trabajador.Ingreso;
import tp4.trabajador.IngresoHorasExtras;
import tp4.trabajador.Trabajador;


class TrabajadorTestCase {

    private Trabajador juan;

    @BeforeEach
    public void setUp() {
        juan = new Trabajador();
        juan.agregarIngreso(new Ingreso("Sueldo", 1000));
        juan.agregarIngreso(new Ingreso("Sueldo", 1200));
        juan.agregarIngreso(new IngresoHorasExtras("Horas Extras", 200, 10));
    }
    
    @Test
    public void testTotalPercibido(){
        assertEquals(2400.0, juan.getTotalPercibido());
    }
    
    @Test
    public void testMontoImponible(){
        assertEquals(2200.0, juan.getMontoImponible());
    }

    @Test
    public void testImpuestoAPagar() {
        assertEquals(44.0, juan.getImpuestoAPagar());
    }
}

