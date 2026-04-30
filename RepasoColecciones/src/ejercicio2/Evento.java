package ejercicio2;

import java.time.LocalDate;

public class Evento {
	
	//Atributos
	
	private String nombre;
	private String lugar;
	private LocalDate fecha;
	private int numAsistentes;
	
	//Constructor
	
	public Evento(String nombrep, String lugarp, LocalDate fechap, int numAsistentes) {
		
		this.nombre = nombrep;
		this.lugar = lugarp;
		this.fecha = fechap;
		this.numAsistentes = numAsistentes;
		
	}
	
	//Metodos
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public String getLugar() {
		
		return this.lugar;
		
	}
	
	public LocalDate getFecha() {
		
		return this.fecha;
		
	}
	
	public int getNumAsistentes() {
		
		return this.numAsistentes;
		
	}
	
	public String toString() {
		
		return "Nombre: " + this.nombre + "| Lugar: " + this.lugar + "| Fecha: " + this.fecha + 
				"| Numero de Asistentes: " + this.numAsistentes;
		
	}
	
}
