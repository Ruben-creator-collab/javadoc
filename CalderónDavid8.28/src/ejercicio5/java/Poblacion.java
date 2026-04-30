/*Descripción: Clase Poblacion con cuatro atributos, un constructor y varios metodos
 * Autor:David Calderón Navarro
 * Fecha:19/03/2026
 */

package ejercicio5.java;

public class Poblacion {

	// Atributos

	private String nombre;
	private String sexo;
	private String estado_civil;
	private int edad;

	// Contructor

	public Poblacion(String nombrep, String sexop, String estado_civilp, int edadp) {

		this.nombre = nombrep;
		this.sexo = sexop;
		this.estado_civil = estado_civilp;
		this.edad = edadp;

	}

	// Metodos

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public String getNombre() {

		return this.nombre;

	}

	public void setSexo(String sexo) {

		this.sexo = sexo;

	}

	public String getSexo() {

		return this.sexo;

	}

	public void setEstadoCivil(String estado) {

		this.estado_civil = estado;

	}

	public String getEstadoCivil() {

		return this.estado_civil;

	}

	public void setEdad(int edad) {

		this.edad = edad;

	}

	public int getEdad() {

		return this.edad;

	}

	public String toString() {

		return "Nombre: " + this.nombre + "\t | Edad: " + this.edad + "\t | Sexo: " + this.sexo + "\t | Estado civil: "
				+ this.estado_civil;

	}

}
