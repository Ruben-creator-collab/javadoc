package ejemploBasicoHerencia;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto {

	private String codigo_organismo;
	private int temperaturaMin;
	private LocalDate fecha_consumo_pref;

	public ProductoRefrigerado(String nombre_producto, LocalDate fecha_caducidad, int numero_lote,
			String codigo_organismo, int temperaturaMin, LocalDate fecha_consumo_pref) {

		super(nombre_producto, fecha_caducidad, numero_lote);

		if (codigo_organismo == null || codigo_organismo.isEmpty() || fecha_consumo_pref == null) {

			throw new IllegalArgumentException("Datos refrigerado inválidos");
		}

		this.codigo_organismo = codigo_organismo;
		this.temperaturaMin = temperaturaMin;
		this.fecha_consumo_pref = fecha_consumo_pref;
	}

	public String getCodigoOrganismo() {
		return codigo_organismo;
	}

	public int getTemperaturaMin() {
		return temperaturaMin;
	}

	public LocalDate getFechaConsumoPref() {
		return fecha_consumo_pref;
	}

	@Override
	public String tipoProducto() {
		return "Refrigerado";
	}

	@Override
	public String toString() {
		return super.toString() + ", Organismo: " + codigo_organismo + ", Temp mín: " + temperaturaMin
				+ "ºC, Consumo pref: " + fecha_consumo_pref;
	}
}
