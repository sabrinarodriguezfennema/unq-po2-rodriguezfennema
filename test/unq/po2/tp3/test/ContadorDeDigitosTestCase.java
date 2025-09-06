package unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import unq.po2.tp3.ContadorDeDigitos;

class ContadorDeDigitosTestCase {
	
	private ArrayList<Integer> lista;



    @Test
    public void testNumeroConMayorCantidadDeDigitosPares1() {
    	lista = new ArrayList<>(Arrays.asList(123, 246, 13579, 222, 0));
        ContadorDeDigitos contadorDeDigitos = new ContadorDeDigitos();
        assertEquals(246, contadorDeDigitos.numeroConMayorCantidadDeDigitosPares(lista));
    }
    @Test
    public void testNumeroConMayorCantidadDeDigitosPares2() {
    	lista = new ArrayList<>(Arrays.asList(123, 2468, 13579, 222, 0));
        ContadorDeDigitos contadorDeDigitos = new ContadorDeDigitos();
        assertEquals(2468, contadorDeDigitos.numeroConMayorCantidadDeDigitosPares(lista));
    }
    @Test
    public void testNumeroConMayorCantidadDeDigitosPares3() {
    	lista = new ArrayList<>(Arrays.asList(123, 246, 13579, 22244, 0));
        ContadorDeDigitos contadorDeDigitos = new ContadorDeDigitos();
        assertEquals(22244, contadorDeDigitos.numeroConMayorCantidadDeDigitosPares(lista));
    }

   

}
