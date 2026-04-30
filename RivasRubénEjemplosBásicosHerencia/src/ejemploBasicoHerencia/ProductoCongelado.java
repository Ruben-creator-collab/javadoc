package ejemploBasicoHerencia;

import java.time.LocalDate;

public class ProductoCongelado extends Producto {

	private int temperatura_congelacion;
	private int meses_congelador;

	public ProductoCongelado(String nombre_producto, LocalDate fecha_caducidad, int numero_lote,
			int temperatura_congelacion, int meses_congelador) {

		super(nombre_producto, fecha_caducidad, numero_lote);

		if (meses_congelador <= 0) {
			throw new IllegalArgumentException("Meses inválidos");
		}

		this.temperatura_congelacion = temperatura_congelacion;
		this.meses_congelador = meses_congelador;
	}

	public int getTemperaturaCongelacion() {
		return temperatura_congelacion;
	}

	public int getMesesCongelador() {
		return meses_congelador;
	}

	@Override
	public String tipoProducto() {
		return "Congelado";
	}

	@Override
	public String toString() {
		return super.toString() + ", Temp congelación: " + temperatura_congelacion + "ºC, Meses: " + meses_congelador;
	}
}
