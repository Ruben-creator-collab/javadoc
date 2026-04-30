package rivas;

import java.time.LocalDate;

public class Vivienda {

	// Atributos
	protected static short contadorIdent = 1;
	protected static short contadorVivienda = 0;

	protected String identificador;
	protected LocalDate fechaConstruccion;
	protected String direccion;
	protected float precioNoche;
	protected boolean disponible;

	// Constructor
	public Vivienda(LocalDate fechaConstruccion, String direccion, float precioNoche, boolean disponible) {

		this.identificador = generarIdent();
		this.fechaConstruccion = fechaConstruccion;
		this.direccion = direccion;
		this.precioNoche = precioNoche;
		this.disponible = disponible;

		contadorVivienda++;
	}

	// Generar código
	private String generarIdent() {

		if (contadorIdent > 999) {
			throw new IllegalStateException("No pueden haber más códigos");
		}

		String codigo = String.format("%03d", contadorIdent);
		contadorIdent++;

		return codigo;
	}

	// Número viviendas
	public static short getNumeroViviendas() {
		return contadorVivienda;
	}

	// Mostrar info
	public void mostrarVivienda() {

		System.out.println("ID: " + identificador);
		System.out.println("Fecha construcción: " + fechaConstruccion);
		System.out.println("Dirección: " + direccion);
		System.out.println("Precio/noche: " + precioNoche);
		System.out.println("Disponible: " + disponible);
	}

	// Calcular precio según días
	public float calcularPrecio(int dias) {
		return precioNoche * dias;
	}
}
