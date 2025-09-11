package tp3;

import java.util.HashSet;
import java.util.Set;

public class EquipoDeTrabajo {
	private String nombre;
	private Set<Persona> integrantes;
	
	public EquipoDeTrabajo (String nombre) {
		this.nombre = nombre; 
		this.integrantes = new HashSet<>();
	}
	
	public void agregarIntegrante (Persona persona) {
		integrantes.add(persona);
	}
	
	public String getNombre() {
	        return nombre;
	}
	
	public double promedioEdad() {
        if (integrantes.isEmpty()) return 0;
        int suma = 0;
        for (Persona persona : integrantes) {
            suma += persona.getEdad();
        }
        return (double) suma / integrantes.size();
    }
	 
	
	
	
}
