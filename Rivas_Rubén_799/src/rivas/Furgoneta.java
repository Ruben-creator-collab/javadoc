package rivas;

import java.time.LocalDate;

public class Furgoneta extends Vehiculo {

	// atributos
	private float volumenMax;
	private boolean sistemaRefrigeracion;

	// constructor
	public Furgoneta(String ident, String matricula, LocalDate fechaMatriculacion, boolean itv, float precioDia,
			float volumenMax, boolean sistemaRefrigeracion) {
		super(ident, matricula, fechaMatriculacion, itv, precioDia);
		this.volumenMax = volumenMax;
		this.sistemaRefrigeracion = sistemaRefrigeracion;
	}

	public Furgoneta(float volumenMax, boolean sistemaRefrigeracion) {
		super(generarIdent(), "abc-123", LocalDate.now(), true, 100);
		this.volumenMax = volumenMax;
		this.sistemaRefrigeracion = sistemaRefrigeracion;
	}

	// metodos
	@Override
	public float calcularPrecio(short dias) {
		float calculo;
		float calculoDias;
		if (sistemaRefrigeracion == true) {
			calculoDias = 25 * dias;
			calculo = precioDia * dias + calculoDias;
		} else {
			calculo = precioDia * dias;
		}
		return calculo;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Volumen máximo: " + volumenMax);
		System.out.println("Tiene sistema de refrigeración: " + sistemaRefrigeracion);
		System.out.println("----------------------");
	}

	public void cambiarPrecioDia(float precioUsu) {
		this.precioDia = precioUsu;
	}

	// getters
	public boolean getRefrigeracion() {
		return sistemaRefrigeracion;
	}

}
