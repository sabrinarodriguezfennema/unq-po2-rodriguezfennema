package tp4.trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresos;
	
	public Trabajador() {
        ingresos = new ArrayList<>();
    }
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso);
	}

	public double getMontoImponible() {
		double total = 0;
	    for (Ingreso ingreso : ingresos) {
	    	if (!(ingreso instanceof IngresoHorasExtras)) {
	    		total += ingreso.getMonto();
	    	}
	    }
	    return total;
	}

	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
	
	public Double getTotalPercibido() {
		double total = 0;
	    for (Ingreso ingreso : ingresos) {
	    	total += ingreso.getMonto();
	    }
	    return total;
	}


}
