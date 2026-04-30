package calderón1;

import java.time.LocalDate;

public abstract class Vehiculo {
	
	protected String id;
	protected String matricula;
	protected LocalDate fechaFabricacion;
	protected double precioDia;
	protected boolean alquilado;

	public Vehiculo() {
		this.matricula = "0000 AAA";
		this.fechaFabricacion = LocalDate.of(2020, 1, 1);
		this.precioDia = 100;
		this.alquilado = false;
	}

	public abstract double calcularAlquiler(int dias);

	// Getters y setters necesarios
	public void setFechaFabricacion(LocalDate fecha) {
		
		if (fecha.isBefore(LocalDate.of(2000, 1, 1)) || fecha.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Fecha no válida");
			
		}
		
		this.fechaFabricacion = fecha;
	}

	public boolean isAlquilado() {
		
		return alquilado;
		
	}

	public enum Combustible {
		
		GASOLINA, GASOIL, ELECTRICO
		
	}
}