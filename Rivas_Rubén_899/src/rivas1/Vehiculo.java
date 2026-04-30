package rivas1;

import java.time.LocalDate;

public abstract class Vehiculo {
	// atributos	
	protected static final String DEFAULT_MATRICULA = "0000 AAA";
	protected static final LocalDate DEFAULT_FECHA = LocalDate.of(2020, 01, 01);
	protected static final float DEFAULT_PRECIO_DIA = 100;
	protected static final boolean DEFAULT_ALQUILADO = false;
	
	protected static short contadorIdent = 1;
	
	protected String id;
	protected String matricula;
	protected LocalDate fechaFab;
	protected float precioDia;
	protected boolean alquilado;
	
	// constructor
	public Vehiculo(String id, String matricula, LocalDate fechaFab, float precioDia, boolean alquilado) {
		this.id = generarIdent();
		this.matricula = matricula;
		this.fechaFab = fechaFab;
		this.precioDia = precioDia;
		this.alquilado = alquilado;
	}
	
	public Vehiculo(String id, LocalDate fechaFab, float precioDia, boolean alquilado) {
		this.id = generarIdent();
		this.fechaFab = fechaFab;
		this.precioDia = precioDia;
		this.alquilado = alquilado;
	}
	
	public Vehiculo(String matricula) {
		this(generarIdent(),DEFAULT_FECHA, DEFAULT_PRECIO_DIA, DEFAULT_ALQUILADO);
	}



	// metodos
	public abstract float calcularPrecio(int dias);
	
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
		System.out.println("Identificador: " + id);
		System.out.println("Matricula: " + matricula);
		System.out.println("Fecha de fabricacion: " + fechaFab);
		System.out.println("Precio del alquiler: " + precioDia);
		System.out.println("Es alquilado: " + alquilado);
	}
	
}
