package rellenamatriz;

public class Rellenamatriz {

	public static void main(String[] args) {

		int[][] matriz = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 }, { 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35 }, { 36, 37, 38, 39, 40 },
				{ 41, 42, 43, 44, 45 }, { 46, 47, 48, 49, 50 } };

		

		for (int i = 0; i < matriz.length; i++) {

			

			for (int columnas = 0; columnas < matriz[i].length; columnas++) {

				System.out.println(matriz[i][columnas]);


			}
			
		}
		
		mayorPorFila(matriz);
		
		int max = mayorMatriz(matriz);

		System.out.println("El maximo total es: " + max);

	}
	
	

	public static int mayorMatriz(int[][] matriz) {

		int max = matriz[0][0];

		for (int i = 0; i < matriz.length; i++) {
			for (int columnas = 0; columnas < matriz[i].length; columnas++) {

				if (matriz[i][columnas] > max) {
					max = matriz[i][columnas];
				}
			}
		}

		return max;
	}

	public static void mayorPorFila(int[][] matriz) {

		for (int filas = 0; filas < matriz.length; filas++) {

			int max = matriz[filas][0];

			for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
				if (matriz[filas][columnas] > max) {
					max = matriz[filas][columnas];
				}
			}

			System.out.println("Mayor de la fila " + filas + ": " + max);
		}
	}

}
