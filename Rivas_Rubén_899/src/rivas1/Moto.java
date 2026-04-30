package rivas1;

import java.time.LocalDate;

public class Moto extends Vehiculo {

	public Moto(String id, String matricula, LocalDate fechaFab, float precioDia, boolean alquilado) {
		super(id, matricula, fechaFab, precioDia, alquilado);
	}

	public Moto(String matricula) {
		super(generarIdent(), DEFAULT_FECHA, DEFAULT_PRECIO_DIA, DEFAULT_ALQUILADO);
		this.matricula = matricula;
	}

	@Override
	public float calcularPrecio(int dias) {
		float calculo;
		float total;
		if (!this.alquilado) {
			calculo = this.precioDia * dias;
			return calculo;
		} else {
			System.out.println("No se puede calcular el precio ya que el vehiculo es alquilado.");
			return 0;
		}
	}
	// Mostrar info
	public void mostrarInfo() {
		System.out.println("Identificador: " + id);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Fecha de fabricacion: " + fechaFab);
		System.out.println("Precio del alquiler: " + precioDia);
		System.out.println("Es alquilado: " + alquilado);
	}

}
