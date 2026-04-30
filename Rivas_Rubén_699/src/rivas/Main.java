package rivas;

import java.time.LocalDate;

/*
 * ENUNCIADO:
 *
 * 1. Crear un apartamento por defecto.
 * 2. Calcular precio para 3 días.
 * 3. Crear apartamento con precio y distancia por teclado.
 * 4. Calcular precio para 5 días.
 * 5. Crear casa rural por defecto.
 * 6. Crear casa rural con precio por teclado.
 * 7. Calcular precio para 10 días.
 * 8. Indicar si es pet friendly.
 * 9. Crear hotel por defecto.
 * 10. Crear hotel con datos por teclado mediante método.
 * 11. Calcular precio para 1 día.
 * 12. Modificar spa a true.
 * 13. Calcular precio para 1 día.
 * 14. Mostrar número total de viviendas.
 */

public class Main {

	public static void main(String[] args) {

		// -----------------------------------------
		// 1. Apartamento por defecto
		// -----------------------------------------

		System.out.println("1. APARTAMENTO POR DEFECTO");

		Apartamento ap1 = new Apartamento();

		ap1.mostrarApartamento();

		// -----------------------------------------
		// 2. Precio 3 días
		// -----------------------------------------

		System.out.println("\n2. PRECIO 3 DÍAS");

		System.out.println("Precio: " + ap1.calcularPrecio(3) + " €");

		// -----------------------------------------
		// 3. Apartamento con datos usuario
		// -----------------------------------------

		System.out.println("\n3. APARTAMENTO PERSONALIZADO");

		System.out.print("Dirección: ");
		String dir = Entrada.cadena();

		System.out.print("Precio/noche: ");
		float precio = (float) Entrada.real();

		System.out.print("Distancia centro: ");
		byte dist = (byte) Entrada.entero();

		Apartamento ap2 = new Apartamento(precio, dist, LocalDate.now(), dir);

		ap2.mostrarApartamento();

		// -----------------------------------------
		// 4. Precio 5 días
		// -----------------------------------------

		System.out.println("\n4. PRECIO 5 DÍAS");

		System.out.println("Precio: " + ap2.calcularPrecio(5) + " €");

		// -----------------------------------------
		// 5. Casa rural por defecto
		// -----------------------------------------

		System.out.println("\n5. CASA RURAL POR DEFECTO");

		CasaRural casa1 = new CasaRural();

		casa1.mostrarCasaRural();

		// -----------------------------------------
		// 6. Casa rural con precio usuario
		// -----------------------------------------

		System.out.println("\n6. CASA RURAL PERSONALIZADA");

		System.out.print("Precio/noche: ");
		float precioCasa = (float) Entrada.real();

		CasaRural casa2 = new CasaRural((short) 120, true, precioCasa, LocalDate.now(), "Casa usuario");

		casa2.mostrarCasaRural();

		// -----------------------------------------
		// 7. Precio 10 días
		// -----------------------------------------

		System.out.println("\n7. PRECIO 10 DÍAS");

		System.out.println("Precio: " + (precioCasa * 10) + " €");

		// -----------------------------------------
		// 8. Pet friendly
		// -----------------------------------------

		System.out.println("\n8. PET FRIENDLY");

		System.out.println("¿Admite mascotas?: " + casa2.isPetFriendly());

		// -----------------------------------------
		// 9. Hotel por defecto
		// -----------------------------------------

		System.out.println("\n9. HOTEL POR DEFECTO");

		Hotel h1 = new Hotel((byte) 3, (short) 50, false, 40f, LocalDate.now(), "Hotel Centro");

		h1.mostrarHotel();

		// -----------------------------------------
		// 10. Hotel por método
		// -----------------------------------------

		System.out.println("\n10. HOTEL PERSONALIZADO");

		Hotel h2 = crearHotel();

		h2.mostrarHotel();

		// -----------------------------------------
		// 11. Precio 1 día
		// -----------------------------------------

		System.out.println("\n11. PRECIO 1 DÍA");

		System.out.println("Precio: 1 día → 40 €");

		// -----------------------------------------
		// 12. Cambiar Spa
		// -----------------------------------------

		System.out.println("\n12. MODIFICAR SPA");

		h2.setSpa(true);

		h2.mostrarHotel();

		// -----------------------------------------
		// 13. Precio 1 día otra vez
		// -----------------------------------------

		System.out.println("\n13. PRECIO 1 DÍA CON SPA");

		System.out.println("Precio: 1 día → 40 €");

		// -----------------------------------------
		// 14. Total viviendas
		// -----------------------------------------

		System.out.println("\n14. TOTAL VIVIENDAS");

		System.out.println("Viviendas creadas: " + Vivienda.getNumeroViviendas());
	}

	// Método para crear hotel
	public static Hotel crearHotel() {

		System.out.print("Estrellas: ");
		byte est = (byte) Entrada.entero();

		System.out.print("Habitaciones: ");
		short hab = (short) Entrada.entero();

		System.out.print("¿Tiene spa? (true/false): ");
		boolean spa = Boolean.parseBoolean(Entrada.cadena());

		System.out.print("Precio/noche: ");
		float precio = (float) Entrada.real();

		System.out.print("Dirección: ");
		String dir = Entrada.cadena();

		return new Hotel(est, hab, spa, precio, LocalDate.now(), dir);
	}
}
