package rivas;

import java.time.LocalDate;

public class Hotel extends Vivienda {

	private byte estrellas;
	private short numHabitaciones;
	private boolean tieneSpa;

	public Hotel(byte estrellas, short numHab, boolean spa, float precio, LocalDate fecha, String direccion) {

		super(fecha, direccion, precio, true);

		this.estrellas = estrellas;
		this.numHabitaciones = numHab;
		this.tieneSpa = spa;
	}

	// Constructor por defecto
	public Hotel() {
		super(LocalDate.now(), "Hotel por defecto", 40f, true);

		this.estrellas = 3;
		this.numHabitaciones = 50;
		this.tieneSpa = false;
	}

	// Cambiar spa
	public void setSpa(boolean spa) {
		this.tieneSpa = spa;
	}

	public void mostrarHotel() {

		mostrarVivienda();

		System.out.println("Estrellas: " + estrellas);
		System.out.println("Habitaciones: " + numHabitaciones);
		System.out.println("Spa: " + tieneSpa);
	}
}
