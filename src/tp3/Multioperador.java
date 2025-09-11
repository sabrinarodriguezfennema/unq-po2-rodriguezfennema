package tp3;

import java.util.ArrayList;

public class Multioperador {
	
	public int sumarTodos (ArrayList <Integer> numeros) {
		int acumulador = 0;
		for (int numeroActual : numeros) {
			acumulador += numeroActual;
		}
		return acumulador;
	}
	
	public int restarTodos (ArrayList <Integer> numeros) {
		int acumulador = 0;
		for (int numeroActual : numeros) {
			acumulador -= numeroActual;
		}
		return acumulador;
	}
	
	public int multiplicarTodos (ArrayList <Integer> numeros) {
		int acumulador = 1;
		for (int numeroActual : numeros) {
			acumulador *= numeroActual;
		}
		return acumulador;
	}

}
