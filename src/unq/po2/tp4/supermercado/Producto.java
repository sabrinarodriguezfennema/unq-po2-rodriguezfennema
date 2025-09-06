package unq.po2.tp4.supermercado;

public class Producto {
	
	String nombre;
	double precio;
	boolean precioCuidado;
	
	public Producto(String unNombre, double precio, boolean esPrecioCuidado){
		this.nombre = unNombre;
		this.precio = precio;
		this.precioCuidado= esPrecioCuidado;
	}
	public Producto(String unNombre, double precio){
		this (unNombre, precio, false);
	}
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
	public void aumentarPrecio(double d) {
		precio = precio + d;
		
	}
	
	
	
	
}
