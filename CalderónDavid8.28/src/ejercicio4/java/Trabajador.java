/*Descripción: Clase en la que tengo cinco atributos, un constructor y varios metodos
 * Autor:David Calderón Navarro
 * Fecha:19/03/2026
 */

package ejercicio4.java;

import java.time.LocalDate;

public class Trabajador {

	// Atributos

	private String nombre;
	private int edad;
	private String sexo;
	private String estado_civil;
	private double salario_base;

	// Constructor

	public Trabajador(String nombrep, int edadp, String sexop, String estado_civilp, double salario_basep) {

		this.nombre = nombrep;
		this.edad = edadp;
		this.sexo = sexop;
		this.estado_civil = estado_civilp;
		this.salario_base = salario_basep;

	}

	// Metodos

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public String getNombre() {

		return this.nombre;

	}

	public void setEdad(int edad) {

		this.edad = edad;

	}

	public int getEdad() {

		return this.edad;

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

	public void setSalarioBase(double salario) {

		this.salario_base = salario;

	}

	public double getSalarioBase() {

		return this.salario_base;

	}
	
	public String toString(){
		
		return "Nombre: " + this.nombre + "\t | Edad: " + this.edad + "\t | Sexo: " + this.sexo + "\t | Estado civil: " + this.estado_civil
				+ "\t | Salario base: " + this.salario_base;
		
	}

}
