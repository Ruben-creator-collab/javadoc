package ejemploBasicoHerencia;

import java.time.LocalDate;

public class ProductoFresco extends Producto {

	private LocalDate fecha_envasado;
	private String pais_origen;

	// Constructores

	// Constructor con todos los parámetros
	ProductoFresco(String nombre_producto, LocalDate fecha_caducidad, int numero_lote, LocalDate fecha_envasado,
			String pais_origen) {
		super(nombre_producto, fecha_caducidad, numero_lote);
		if (fecha_envasado == null || pais_origen == null || pais_origen.isEmpty()) {
			throw new IllegalArgumentException("Datos de producto fresco inválidos");
		}
		this.fecha_envasado = fecha_envasado;
		this.pais_origen = pais_origen;
	}

	// Métodos

	public LocalDate getFechaEnvasado() {
		return fecha_envasado;
	}

	public String getPaisOrigen() {
		return pais_origen;
	}

	@Override
	public String tipoProducto() {
		return "Fresco";
	}

	@Override
	public String toString() {
		return super.toString() + ", Envasado: " + fecha_envasado + ", País: " + pais_origen;
	}
}
