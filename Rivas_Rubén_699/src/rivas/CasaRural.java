package rivas;

import java.time.LocalDate;

public class CasaRural extends Vivienda {

	private static final short METROS_DEFAULT = 100;
	private static final boolean MASCOTAS_DEFAULT = false;

	private short metrosCuadrados;
	private boolean admiteMascotas;

	public CasaRural(short metros, boolean mascotas, float precio, LocalDate fecha, String direccion) {

		super(fecha, direccion, precio, true);

		if (metros < 0) {
			throw new IllegalArgumentException("Metros inválidos");
		}

		this.metrosCuadrados = metros;
		this.admiteMascotas = mascotas;
	}

	public CasaRural() {

		this(METROS_DEFAULT, MASCOTAS_DEFAULT, 30f, LocalDate.now(), "Casa rural");
	}

	// Saber si admite mascotas
	public boolean isPetFriendly() {
		return admiteMascotas;
	}

	public void mostrarCasaRural() {

		mostrarVivienda();

		System.out.println("Metros: " + metrosCuadrados);
		System.out.println("Mascotas: " + admiteMascotas);
	}
}
