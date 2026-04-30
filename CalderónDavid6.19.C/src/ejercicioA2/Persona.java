/*Descripción: Declaro cuatro atributos, un constructor Persona y metodos getters y setters
 * Autor:David Calderón Navarro
 * Fecha:26/01/2026
 */

package ejercicioA2;

public class Persona {
	
	//Atributo
	
	private  String dni;
	private  String nombre;
	private String apellidos;
	private int edad;
	
	//Constructor
	
	public Persona(String dnip, String nombrep, String apellidosp, int edadp) {
		
		if (dnip != null && dnip.matches("\\d{8}[A-Za-z]")) {
	        this.dni = dnip.toUpperCase();
	    } else {
	        
	    	throw new IllegalArgumentException("Dni incorrecto");
	    	
	    }
		
		this.dni = dnip;
		this.nombre = nombrep;
		this.apellidos = apellidosp;
		this.edad = edadp;
		
	}
	
	//Metodos
	
	public String getdni() {
		
		return this.dni;
		
	}
	
	public String getnombre() {
		
		return this.nombre;
		
	}

	public String getapellidos() {
	
	return this.apellidos;
	
}

	public int getedad() {
	
	return this.edad;
	
}
	
	public void setdni(String dni) {
		
		this.dni = dni;
		
	}
	
	public void setnombre(String nombre) {
		
		this.nombre = nombre;
		
	}

	public void setapellidos(String apellidos) {
	
		this.apellidos = apellidos;
	
	}

	public void setedad(int edad) {
	
		this.edad = edad;
	
	}
	
}
