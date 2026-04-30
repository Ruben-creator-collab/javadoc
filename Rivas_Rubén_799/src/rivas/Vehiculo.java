package rivas;

import java.time.LocalDate;

public abstract class Vehiculo {

	// atributos
	protected static short contadorIdent = 1;
	protected static short contadorVehiculo = 0;

	protected String ident;
	protected String matricula;
	protected LocalDate fechaMatriculacion;
	protected boolean itv;
	protected float precioDia;

	// constructor
	public Vehiculo(String ident, String matricula, LocalDate fechaMatriculacion, boolean itv, float precioDia) {
		this.ident = generarIdent();
		this.matricula = matricula;
		this.fechaMatriculacion = fechaMatriculacion;
		this.precioDia = precioDia;
		this.itv = itv;

		contadorVehiculo++;
	}

	// metodos
	public abstract float calcularPrecio(short dias);

	protected static String generarIdent() {

		if (contadorIdent > 999) {
			throw new IllegalStateException("No pueden haber más códigos");
		}

		String codigo = String.format("%03d", contadorIdent);
		contadorIdent++;

		return codigo;
	}

	// Mostrar info
	public void mostrarInfo() {
		System.out.println("Identificador: " + ident);
		System.out.println("Matricula: " + matricula);
		System.out.println("Fecha de matriculacion: " + fechaMatriculacion);
		System.out.println("Tiene itv: " + itv);
		System.out.println("Precio por dia: " + precioDia);
	}

	public void cambiarItv() {
		if (itv == true) {
			itv = false;
		} else {
			itv = true;
		}
	}

	// getters
	public boolean getItv() {
		return itv;
	}

	public float getPrecioDia() {
		return precioDia;
	}

}
