package unq.po2.tp4.supermercado;
import java.util.ArrayList;
import java.util.List;


public class Supermercado {
	
	private String nombre;
	private String direccion;
	private List <Producto> productos;
	
	public Supermercado (String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<>();
	}

	public Integer getCantidadDeProductos() {
		
		return productos.size();
	}

	public void agregarProducto(Producto nombre) {
		productos.add(nombre);
		
	}

	public Double getPrecioTotal() {
		Double total = (double) 0;
		for (Producto producto : productos ) {
			total += producto.getPrecio();
		}
		return total;
	}
	
}
