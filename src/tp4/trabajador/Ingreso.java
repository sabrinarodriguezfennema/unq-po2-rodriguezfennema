package tp4.trabajador;

public class Ingreso {
	
	private String concepto;
	private double monto;

	public Ingreso(String concepto, double monto) {
		this.concepto = concepto;
		this.monto = monto;
	}

	public String getConcepto() {
		return concepto;
	}

	public double getMonto() {
		return monto;
	}

}
