package tp3;

import java.util.ArrayList;

public class ContadorDeDigitos {
	
	/**
	 * Devuelve el numero del arreglo que contiene mayor cantidad de numeros pares
	 * @param lista Lista que contiene los numeros a evaluar
	 * @return Devuelve el numero que contiene la mayor cantidad de numeros pares
	 */
	public int numeroConMayorCantidadDeDigitosPares (ArrayList<Integer> lista) {
		
		int numeroMax = lista.get(0);
		int maxPares = contarDigitosPares(numeroMax);
		
		for (int i = 1; i < lista.size(); i++) {
			int num = lista.get(i);
			int cantPares = contarDigitosPares(num); 
			if (cantPares > maxPares){
				numeroMax = num;
				maxPares = cantPares;
			}
		}
		
		return numeroMax;
	}
	
	private int contarDigitosPares(int num) {
		
		int contador = 0;
		num =  Math.abs(num);
		
		if (num == 0) return 1; 
		
		while (num > 0) {
			int ultimoDigito = num % 10;
			if(ultimoDigito % 2 == 0) {
				contador++;
			}
			num = num / 10; //quitar el ultimo digito
		}
		
		return contador;
	}
}
