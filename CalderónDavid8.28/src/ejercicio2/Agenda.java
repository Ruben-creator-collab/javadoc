/*Descripción: Clase agenda con cuatro atributos, un constructor y varios metodos
 * Autor:David Calderón Navarro
 * Fecha:18/03/2026
 */

package ejercicio2;

import java.time.LocalDate;
import java.util.LinkedList;

import ejercicio1.Atleta;

public class Agenda {
	
	//Atributos

	private String nombre;
	private int telefono;
	private String email;
	private LocalDate fecha_nacimiento;
	
	//Constructores
	
	public Agenda(String nombrep, int telefonop, String emailp, LocalDate fechap) {
		
		this.nombre = nombrep;
		this.telefono = telefonop;
		this.email = emailp;
		this.fecha_nacimiento = fechap;
		
	}
	
	//Metodos
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public void setTelefono(int telf) {
		
		this.telefono = telf;
		
	}
	
	public int getTelf() {
		
		return this.telefono;
		
	}
	
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	
	public String getEmail() {
		
		return this.email;
		
	}
	
	public void setFechaNacimiento(LocalDate fecha) {
		
		this.fecha_nacimiento = fecha;
		
	}
	
	public LocalDate getFechaNacimiento() {
		
		return this.fecha_nacimiento;
		
	}
	
}
