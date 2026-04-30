package rivas;

import java.time.LocalDate;

public class Apartamento extends Vivienda {

	// Constantes
	private static final short NUM_HAB_DEFAULT = 3;
	private static final byte DIST_DEFAULT = 1;
	private static final LocalDate REFORMA_DEFAULT = LocalDate.of(2025, 1, 1);
	private static final float PRECIO_DEFAULT = 20f;

	// Atributos
	private short numHabitaciones;
	private byte distanciaCiudad;
	private LocalDate ultimaReforma;

	// Constructor principal
	public Apartamento(short numHabitaciones, byte distanciaCiudad, LocalDate ultimaReforma, float precioNoche,
			LocalDate fecha, String direccion, boolean disponible) {

		super(fecha, direccion, precioNoche, disponible);

		if (ultimaReforma.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Fecha inválida");
		}

		this.numHabitaciones = numHabitaciones;
		this.distanciaCiudad = distanciaCiudad;
		this.ultimaReforma = ultimaReforma;
	}

	// Constructor reducido
	public Apartamento(float precio, byte distancia, LocalDate fecha, String direccion) {

		this(NUM_HAB_DEFAULT, distancia, REFORMA_DEFAULT, precio, fecha, direccion, true);
	}

	// Constructor por defecto
	public Apartamento() {

		this(NUM_HAB_DEFAULT, DIST_DEFAULT, REFORMA_DEFAULT, PRECIO_DEFAULT, LocalDate.now(), "Sin dirección", true);
	}

	// Calcular precio
	@Override
	public float calcularPrecio(int dias) {

		float total = super.calcularPrecio(dias);

		if (distanciaCiudad < 2) {
			total *= 1.15f;
		}

		return total;
	}

	// Mostrar info
	public void mostrarApartamento() {

		mostrarVivienda();

		System.out.println("Habitaciones: " + numHabitaciones);
		System.out.println("Distancia: " + distanciaCiudad);
		System.out.println("Última reforma: " + ultimaReforma);
	}
}
