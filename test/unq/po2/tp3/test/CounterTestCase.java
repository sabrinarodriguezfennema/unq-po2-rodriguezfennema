package unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unq.po2.tp3.Counter;

class CounterTestCase {

    private Counter counter;

    @BeforeEach
    public void setUp() throws Exception {
        counter = new Counter();
        counter.agregarNumero(1);
        counter.agregarNumero(3);
        counter.agregarNumero(5);
        counter.agregarNumero(7);
        counter.agregarNumero(9);
        counter.agregarNumero(1);
        counter.agregarNumero(1);
        counter.agregarNumero(1);
        counter.agregarNumero(1);
        counter.agregarNumero(4);
    }

    @Test
    public void testCantidadDeNumerosPares() {
        int cantidad = counter.cantidadDeNumerosPares();
        assertEquals(1, cantidad);
    }

    @Test
    public void testCantidadDeNumerosImpares() {
        int cantidad = counter.cantidadDeNumerosImpares();
        assertEquals(9, cantidad);
    }
}
