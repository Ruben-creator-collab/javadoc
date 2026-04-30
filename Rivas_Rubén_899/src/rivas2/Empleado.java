package rivas2;

/*
 * Objetivo: modelar objetos de tipo Empleado para TE899
 * Autor: 
 * Fecha: 
 * 
 * Observaciones: completa esta clase con los métodos que consideres necesarios
 */

import java.time.LocalDate;

public class Empleado {
    private String dni;
    private String nombre;
    private int edad;
    private LocalDate fechaIncorporacion;

    // Constructor
    public Empleado(String dni, String nombre, int edad, LocalDate fechaIncorporacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    // Genera objetos de tipo Empleado con valores aleatorios
    public static Empleado generarAleatorio() {
        String[] nombres = {"Ana", "Luis", "Marta", "Carlos", "Elena", "Sofía"};
        int index = (int) (Math.random() * nombres.length);
        int numDni = (int) (Math.random() * 90000000) + 10000000;
        int edadAleatoria = (int) (Math.random() * (65 - 18 + 1)) + 18;
        LocalDate fechaAleatoria = LocalDate.of(2020, 1, 1); 

        return new Empleado(String.valueOf(numDni) + "Z", nombres[index], edadAleatoria, fechaAleatoria);
    }
    @Override
    public String toString() {
    	String cadena;
    	cadena = "Dni del empleado: " + this.dni + " Nombre del empleado: " + this.nombre + " Edad del empleado: " + this.edad + " Fecha de incorporacion del empleado: " + this.fechaIncorporacion;
		return cadena;
    }
    
    // getters
	public String getDni() {
		return dni;
	}
	
	public String getNombre() {
		return nombre;
	}

}

