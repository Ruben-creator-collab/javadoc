package rivas;

import java.time.LocalDate;

public class Camion extends Vehiculo {

	// atributos
	private float capacidadCarga; // capacidad de carga en toneladas

	// constructor
	public Camion(String ident, String matricula, LocalDate fechaMatriculacion, boolean itv, float precioDia,
			float capacidadCarga) {
		super(ident, matricula, fechaMatriculacion, itv, precioDia);
		this.capacidadCarga = capacidadCarga;
	}

	public Camion(float capacidadCarga) {
		super(generarIdent(), "abc-123", LocalDate.now(), false, 100);

		this.capacidadCarga = capacidadCarga;
	}

	public Camion() {
		super(generarIdent(), "abc-123", LocalDate.now(), false, 100);
		this.capacidadCarga = 10;
	}

	// metodos
	@Override
	public float calcularPrecio(short dias) {
		float calculo;

		calculo = precioDia * dias;
		if (capacidadCarga > 10) {
			calculo += 1.2f;
		}
		return calculo;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Carga máxima: " + capacidadCarga);
		System.out.println("----------------------");
	}

}
