package rivas1;

import java.time.LocalDate;

public class Coche extends Vehiculo {
	// atributos
	private final String DEFAULT_COMBUSTIBLE = "gasolina";

	private String tipoCombustible;

	// constructor
	public Coche(String id, String matricula, LocalDate fechaFab, float precioDia, boolean alquilado,
			String tipoCombustible) {
		super(id, matricula, fechaFab, precioDia, alquilado);
		this.tipoCombustible = tipoCombustible;
	}

	public Coche(String tipoCombustible) {
		super(generarIdent(), DEFAULT_MATRICULA, DEFAULT_FECHA, DEFAULT_PRECIO_DIA, DEFAULT_ALQUILADO);
		this.tipoCombustible = tipoCombustible;
	}

	public Coche() throws IllegalArgumentException {
		super(generarIdent(), DEFAULT_MATRICULA, DEFAULT_FECHA, DEFAULT_PRECIO_DIA, DEFAULT_ALQUILADO);
		this.tipoCombustible = this.DEFAULT_COMBUSTIBLE;
	}

	public float calcularPrecio(int dias) {
		float calculo;
		float total;
		if (!this.alquilado) {
			calculo = this.precioDia * dias;
			if (this.tipoCombustible.equalsIgnoreCase("electrico")) {
				total = calculo * 0.5f;
				return total;
			} else {
				return calculo;
			}
		} else {
			System.out.println("No se puede calcular el precio ya que el vehiculo es alquilado.");
			return 0;
		}
	}

	@Override
	// Mostrar info
	public void mostrarInfo() {
		System.out.println("Identificador: " + id);
		System.out.println("Matricula: " + matricula);
		System.out.println("Fecha de fabricacion: " + fechaFab);
		System.out.println("Precio del alquiler: " + precioDia);
		System.out.println("Es alquilado: " + alquilado);
		System.out.println("Tipo de combustible: " + this.tipoCombustible);
	}

}
