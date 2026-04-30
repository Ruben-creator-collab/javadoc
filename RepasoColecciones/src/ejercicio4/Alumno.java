package ejercicio4;

import java.util.ArrayList;

public class Alumno extends Persona {

	// Atributos

	private String curso;
	private ArrayList<Double> notas;

	// Constructor

	public Alumno(String dni, String nombre, int edad, String cursop, ArrayList<Double> notasp)
			throws IllegalArgumentException {

		super(dni, nombre, edad);

		if (cursop == null || cursop.isEmpty()) {

			throw new IllegalArgumentException("El curso no puede ser nulo o estar vacio");

		}

		this.curso = cursop;
		this.notas = notasp;

	}

	// Metodos

	public void addNota(double nota) {

		if (nota >= 0 && nota <= 10) {
			
			notas.add(nota);
			
		}

	}
	
	public ArrayList<Double> getNota() {
		
		return this.notas;
		
	}
	
	public double mediaNotas() {
		
		double suma = 0;
		
		for(Double i: notas) {
			
			suma += i;
			
		}
		
		return suma / notas.size();
		
	}
	
	public boolean estaAprobado() {
		
		boolean aprobado = false;
		
		if(mediaNotas() >= 5.0) {
			
			aprobado = true;
			
		}
		
		return aprobado;
		
	}
	
	@Override
	public String toString() {
		
		return "\nDni: " + this.dni + "| Nombre: " + this.nombre + "| Edad: " + this.edad + "| Curso: " + this.curso + "| Notas: " + this.notas;
		
	}

}
