package supermercado;

public class ProductoPrimeraNecesidad extends Producto{

	public ProductoPrimeraNecesidad(String unNombre, double precio, boolean esPrecioCuidado) {
		super(unNombre, precio, esPrecioCuidado);
	}
	
	@Override
	public double getPrecio() {
		return precio - precio * 0.1;
	}

}
