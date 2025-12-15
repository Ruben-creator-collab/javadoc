package ejercicio2.java;

import libtarea3.Bombo;

public class Ejercicio2 {

	public static void main(String[] args) {

		// apartado 1
		// apartado 1.1
		// apartado 1.1.1
		Bombo bombo1;
		try {
			bombo1 = new Bombo(Bombo.MINIMA_CAPACIDAD - 1);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("%s\n", ex1.getMessage());
			bombo1 = new Bombo();
		}

		// apartado 1.1.2
		Bombo bombo2;
		try {
			bombo2 = new Bombo(Bombo.MAXIMA_CAPACIDAD + 1);
		} catch (IllegalArgumentException ex1) {
			System.out.printf("%s\n", ex1.getMessage());
			bombo2 = new Bombo();
		}

		// apartado 1.2
		// apartado 1.2.1
		Bombo bombo3;
		bombo3 = new Bombo();

		// apartado 1.2.2
		Bombo bombo4;
		bombo4 = new Bombo(15);

		// apartado 1.2.3
		// apartado 1.2.3.1
		System.out.printf("Capacidad del bombo: %d\n", bombo4.getCapacidad());
		System.out.printf("Bolas extraidas del bombo: %d\n", bombo4.getCantidadBolasExtraidas());
		System.out.printf("Bolas restantes del bombo: %d\n", bombo4.getCantidadBolasRestantes());

		// apartado 1.2.3.2
		System.out.printf("Listado de las bolas extraídas del bombo: %s\n", bombo4.getBolasExtraidas());

		// apartado 1.2.3.3
		System.out.printf("Número total de bolas extraídas del bombo hasta el momento: %d\n",
				bombo4.getCantidadBolasExtraidas());

		// apartado 1.2.3.4
		System.out.printf("Listado de las bolas restantes del bombo: %s\n", bombo4.getBolasRestantes());

		// apartado 1.2.3.5
		System.out.printf("Número total de bolas restantes del bombo hasta el momento: %d\n",
				bombo4.getCantidadBolasRestantes());

		// apartado 2
		// apartado 2.1
		System.out.printf("Extrayendo todas las bolas del bombo...\n");
		for (int contador = 0; contador < 15; contador++) {
			System.out.printf("Extraída la bola: %d\n", bombo4.extraerBola());
		}
		System.out.println("");
		System.out.println("Tras extraer todas las bolas del bombo queda así: ");
		System.out.printf("Capacidad del bombo: %d\n", bombo4.getCapacidad());
		System.out.printf("Bolas extraidas del bombo: %d\n", bombo4.getCantidadBolasExtraidas());
		System.out.printf("Bolas restantes del bombo: %d\n", bombo4.getCantidadBolasRestantes());
		
		// apartado 2.2
		bombo4.reset();
		
		// apartado 2.3
		int numRan = (int)(Math.random()*4) + 10;
		for (int contador = 0; contador < numRan; contador++) {
			bombo4.extraerBola();
		}
		System.out.printf("Capacidad del bombo: %d\n", bombo4.getCapacidad());
		System.out.printf("Bolas extraidas del bombo: %d\n", bombo4.getCantidadBolasExtraidas());
		System.out.printf("Bolas restantes del bombo: %d\n", bombo4.getCantidadBolasRestantes());
		
	}
}
