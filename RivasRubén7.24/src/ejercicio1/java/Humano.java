package ejercicio1.java;

public class Humano {
	// Atributos
	
	protected String nombre;
	protected String apellido;
	
	// Constructores
	
	// Constructor sin parámetros
	protected Humano() {
		this.nombre = "Juan";
		this.apellido = "García";
	}
	
	// Constructor con dos parámetros
	protected Humano(String nombre, String apellidos) {
		this.nombre	= nombre;
		this.apellido = apellidos;
	}
	
	// Métodos
	
	public String getNombreCompleto() {
		return this.apellido + ", " + this.nombre;
	}
	
	public void cambiarNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void cambiarApellido(String apellido) {
		this.apellido = apellido;
	}
}
