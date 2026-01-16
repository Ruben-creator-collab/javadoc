/*
 * Descripción: Esta es la clase que define un objeto Persona
 * Autor: Rubén Rivas
 * Fecha: 16/01/26
 */
package ejercicioA2;

public class Persona {
	
	public String dni;
	public String nombre;
	public String apellidos;
	public byte edad;
	
	public Persona(String dni, String nombre, String apellidos, byte edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
}
