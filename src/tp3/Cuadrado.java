package tp3;

public class Cuadrado extends Rectangulo{

	 /**
	 * Constructor de cuadrado.
     * Crea un cuadrado en una posición determinada (origen) con ancho .
     * @param origen Punto de origen (esquina superior izquierda o inferior izquierda según convención)
     * @param ancho Ancho del rectángulo (debe ser positivo)
     * @throws IllegalArgumentException si ancho o alto no son positivos
     */
    public Cuadrado(Point origen, int ancho) {
    	super (origen, ancho, ancho);
    }
}
