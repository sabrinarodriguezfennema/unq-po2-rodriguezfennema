package tp4.trabajador;

public class IngresoHorasExtras extends Ingreso {

	private double cantHorasExtra;
	
	public IngresoHorasExtras(String concepto, double monto, double cantHorasExtra) {
		super(concepto, monto);
		this.cantHorasExtra = cantHorasExtra;
	}

}
