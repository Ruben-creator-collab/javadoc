package ejemploBasicoHerencia;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Producto {

	private static int contador = 1;

	protected String codigo_producto;
	protected String nombre_producto;
	protected LocalDate fecha_caducidad;
	protected int numero_lote;

	protected Producto(String nombre_producto, LocalDate fecha_caducidad, int numero_lote) throws IllegalArgumentException {
		if (nombre_producto == null || nombre_producto.isEmpty() || fecha_caducidad == null || numero_lote <= 0) {
			throw new IllegalArgumentException("hay algun parámetro vacío o nulo");
		}

		this.codigo_producto = generarCodigo();
		this.nombre_producto = nombre_producto;
		this.fecha_caducidad = fecha_caducidad;
		this.numero_lote = numero_lote;
	}

	// Métodos
	// Metodos para generar códigos
	private String generarCodigo() {
		if (contador > 9999) {
			throw new IllegalStateException("No pueden haber más códigos");
		}

		String codigo = String.format("%04d", contador);
		contador++;

		return codigo;
	}

	// Método para decir si esta caducado o no
	public boolean estaCaducado() {
		return LocalDate.now().isAfter(fecha_caducidad);
	}

	// Método para decir cuando dias quedan para su caducidad
	public long diasHastaCaducidad() {
		return ChronoUnit.DAYS.between(LocalDate.now(), fecha_caducidad);
	}

	// Getters
	public String getCodigoProducto() {
		return codigo_producto;
	}

	public String getNombreProducto() {
		return nombre_producto;
	}

	public LocalDate getFechaCaducidad() {
		return fecha_caducidad;
	}

	public int getNumeroLote() {
		return numero_lote;
	}

	// Método abstracto
	public abstract String tipoProducto();

	@Override
	public String toString() {
		return "Código: " + codigo_producto + ", Nombre: " + nombre_producto + ", Caduca: " + fecha_caducidad
				+ ", Lote: " + numero_lote;
	}

}
