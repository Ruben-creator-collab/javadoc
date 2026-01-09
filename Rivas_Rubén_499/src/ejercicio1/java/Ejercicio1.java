/*
 * Descripción: Programa que resuelve dudas sobre el consumo electrico semanal
 * Autor: Rubén Rivas
 * Fecha: 17/12/25
 */
package ejercicio1.java;

import java.time.LocalTime;

public class Ejercicio1 {

	public static void main(String[] args) {

		consumoTotalSemana();

	}
	// Los dias de la semana

	static String[] dias = {

			"Lunes", "Martes", "Miércoles", "Jueves",

			"Viernes", "Sábado", "Domingo",

	};

	static int[] horas = {

			0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23

	};

	// consumoElectrico [horas][días]
	static int[][] consumoElectrico = {

			{ 21, 26, 40, 32, 32, 15, 27, 15, 31, 3, 20, 32, 2, 18, 27, 2, 40, 31, 24, 37, 15, 24, 10, 36 },

			{ 5, 25, 28, 5, 10, 30, 14, 6, 35, 33, 29, 9, 32, 15, 8, 37, 15, 39, 19, 30, 40, 14, 18, 2 },

			{ 39, 7, 17, 14, 2, 12, 34, 21, 3, 40, 29, 31, 1, 18, 14, 9, 31, 1, 6, 37, 11, 5, 37, 30 },

			{ 1, 12, 37, 6, 7, 30, 31, 3, 15, 35, 2, 38, 6, 30, 32, 31, 2, 32, 6, 14, 14, 21, 21, 38 },

			{ 8, 23, 37, 16, 0, 28, 5, 13, 35, 10, 22, 18, 28, 6, 12, 21, 12, 38, 26, 15, 39, 24, 37, 4 },

			{ 28, 7, 27, 5, 21, 27, 37, 17, 39, 8, 29, 30, 22, 10, 6, 32, 39, 18, 34, 0, 25, 35, 4, 29 },

			{ 2, 16, 16, 36, 33, 9, 34, 23, 4, 26, 14, 26, 10, 11, 12, 31, 27, 17, 20, 12, 24, 32, 11, 33 }, };

	static void cadaHoraEnQueDiaSeProdujoConsumoMinimo() {

		System.out.println("A) Para cada hora, qué día se produjo el consumo mínimo");

		for (int j = 0; j < horas.length; j++) {

			int min = 0;
			String dia = "";

			for (int i = 0; i < dias.length; i++) {
				if (consumoElectrico[j][i] < 10) {
					min = consumoElectrico[j][i];
				}
			}

			System.out.println("Día " + dias[j] + ": " + dia);

		}

		System.out.println();

	}

	static void consumoTotalSemana() {

		int consumoTotal = 0;

		for (int j = 0; j < horas.length; j++) {

			int suma = 0;

			for (int i = 0; i < dias.length; i++) {

				suma += consumoElectrico[i][j];
				consumoTotal = suma;
			}

		}

		System.out.println("C) Consumo total de la semana: " + consumoTotal);

		System.out.println();

	}
}
