package unq.po2.tp3;
import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> numeros;

	public Counter() {
        this.numeros = new ArrayList<>();
    }
	
	public void agregarNumero(int numero) {
		numeros.add(numero);
	}
	
	/**
	 * Cuenta la cantidad de numeros pares.
	 * @return Cantidad de numeros pares que se encuentran en Counter.
	 */
	public int cantidadDeNumerosPares() {
		int contador = 0;
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				contador ++;
			}
		}
		return contador;
	}
	
	/**
	 * Cuenta la cantidad de numeros impares.
	 * @return Cantidad de numeros impares que se encuentran en Counter.
	 */
	public int cantidadDeNumerosImpares() {
		int contador = 0;
		for (int numero : numeros) {
			if (numero % 2 != 0) {
				contador ++;
			}
		}
		return contador;
	}
	
	/**
	 * Cuenta la cantidad de numeros que son divisibles por un int.
	 * @param divisor int a dividir los numeros que se encuentran en el Counter.
	 * @return Cantidad de numeros divisibles por el el divisor.
	 */
	public int cantidadDeMultiplos (int divisor) {
		int contador = 0;
		for (int numero : numeros) {
			if (numero % divisor == 0) {
				contador ++;
			}
		}
		return contador;
	}
}
