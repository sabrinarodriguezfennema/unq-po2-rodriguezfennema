package tp3;

import java.util.Calendar;
import java.util.Date;

public class Persona {
	
	private String nombre;
	private Date fechaNacimiento;
	private int edad;
	private String apellido;
	
	public Persona (String nombre, Date fechaNacimiento) {
		
		this.nombre= nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = calcularEdad();
	}
	public Persona (String nombre, String apellido, int edad) {
		
		this.nombre= nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	/**
	 * Crea una persona con el nombre y la fecha de nacimiento indicados.
	 * @param nombre nombre de la persona
	 * @param fechaNacimiento fecha de nacimiento de la persona
	 * @return nueva instancia de Persona
	 */
	public static Persona persona(String nombre, Date fechaNacimiento) {
	        return new Persona(nombre, fechaNacimiento);
	}
	
	/**
	 * Devuelve el nombre de la persona.
	 * @return el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Devuelve la fecha de nacimiento de la persona.
	 * @return la fecha de nacimiento de la persona
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	/**
	 * Devuelve la edad de la persona.
	 * @return la edad de la persona
	 */
	private int calcularEdad() {
		Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(fechaNacimiento);

        Calendar hoy = Calendar.getInstance();

        int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

        if (hoy.get(Calendar.MONTH) < nacimiento.get(Calendar.MONTH) ||
           (hoy.get(Calendar.MONTH) == nacimiento.get(Calendar.MONTH) &&
            hoy.get(Calendar.DAY_OF_MONTH) < nacimiento.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }

        return edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public boolean menorQue(Persona persona) {
	    return (this.getEdad() < (persona.getEdad()));
	}
	
}
