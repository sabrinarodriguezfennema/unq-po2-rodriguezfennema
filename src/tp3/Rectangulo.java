package tp3;

public class Rectangulo {
	
	private Point origen;
	private int ancho;
	private int alto;
    
	
	 /**
	 * Constructor de Rectangulo.
     * Crea un rectángulo en una posición determinada (origen) con ancho y alto específicos.
     * @param origen Punto de origen (esquina superior izquierda o inferior izquierda según convención)
     * @param ancho Ancho del rectángulo (debe ser positivo)
     * @param alto Alto del rectángulo (debe ser positivo)
     * @throws IllegalArgumentException si ancho o alto no son positivos
     */
    public Rectangulo(Point origen, int ancho, int alto) {
    	if (ancho <= 0 || alto <= 0) {
    		throw new IllegalArgumentException("El ancho y el alto deben ser positivos.");
        }
        this.origen= origen;
        this.ancho = ancho;
        this.alto = alto;
        
    }
    
    public int getPerimetro() {
    	return 2 * (ancho + alto);
    }
    
    public int getArea() {
    	return ancho + alto;
    }
    
    public boolean esHorizontal() {
    	return ancho > alto;
    }
    
    public boolean esVertical() {
    	return ancho < alto;
    }
    
}
