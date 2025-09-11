package tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	
	private double descuento;

	public ProductoPrimeraNecesidad(String unNombre, double precio, boolean esPrecioCuidado) {
		super(unNombre, precio, esPrecioCuidado);
		this.descuento = 10.0;
	}
	
	public ProductoPrimeraNecesidad(String unNombre, double precio, double descuento, boolean esPrecioCuidado) {
		super(unNombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	@Override
	public double getPrecio() {
		return precio - (precio * descuento / 100);
	}

}
