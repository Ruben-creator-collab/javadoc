package calderón1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moto extends Vehiculo {
	
	
	private static int contador = 0;

	public Moto(String matricula) {
		super();
		this.matricula = matricula;
		contador++;
		this.id = generarId();
	}

	private String generarId() {
		int año = fechaFabricacion.getYear() % 100;
		return año + "-M-" + contador;
	}

	@Override
	public double calcularAlquiler(int dias) {
		if (alquilado)
			return 0;

		double total = 25 * dias;

		long años = ChronoUnit.YEARS.between(fechaFabricacion, LocalDate.now());

		if (años > 5) {
			total *= 0.9;
		}

		return total;
	}
}