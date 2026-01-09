package temperaturas;

import java.util.Random;

public class Temperaturas {

	public static void main(String[] args) {

		int[][] temperaturas = new int[5][6]; // 30 días de junio

		generarTemperaturas(temperaturas);
		mayorTemperaturafila(temperaturas);
		mostrarTemperaturas(temperaturas);
		

		int mayor = mayorTemperatura(temperaturas);
		System.out.println("\nLa temperatura más alta de junio es: " + mayor + "ºC");
	}

	// Método para generar temperaturas aleatorias entre 16 y 31
	public static void generarTemperaturas(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random() * 16 + 15); // 16 a 31
			}
		}
	}

	// Método para mostrar la matriz
	public static void mostrarTemperaturas(int[][] matriz) {
		System.out.println("Temperaturas de junio:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Método para obtener la mayor temperatura
	public static int mayorTemperatura(int[][] matriz) {

		int max = matriz[0][0];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > max) {
					max = matriz[i][j];
				}
			}
		}
		return max;
	}

	// Método para obtener la mayor temperatura de cada fila
	public static void mayorTemperaturafila(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			
			int min = matriz[i][0];
			
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < min) {
					min = matriz[i][j];
				}
				
			}
			
			System.out.println("La temperatura mas baja de la semana " + i + " es: " + min);
			
		}
		
	}

}