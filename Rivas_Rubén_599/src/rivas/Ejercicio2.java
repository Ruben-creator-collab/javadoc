package rivas;

public class Ejercicio2 {

	public static void main(String[] args) {

		final int FILAS = 3;

		final int COLUMNAS = 12;

		String[] sucursales = {

				"Malaga", "Sevilla", "Granada" };

		String[] meses = { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" };

		int[][] numeros = new int[FILAS][COLUMNAS];

		rellenarmatriz(numeros);

		mostrarMatriz(numeros, sucursales, meses);

		System.out.printf("La venta total es de: %d", ventaTotal(numeros));

		mejorMes(numeros, meses);

		mejorSucursal(numeros, sucursales);

	}

	public static int[][] rellenarmatriz(int[][] numeros) {

		final int FILAS = 3;

		final int COLUMNAS = 12;

		for (int i = 0; i < FILAS; i++) {

			for (int a = 0; a < COLUMNAS; a++) {

				do {

					int numale = (int) (Math.random() * 19000 + 1000);

					if (numale % 500 == 0) {

						numeros[i][a] = numale;

					}

				} while (numeros[i][a] == 0);

			}

		}

		return numeros;

	}

	public static void mostrarMatriz(int[][] numeros, String[] sucursales, String[] meses) {

		final int FILAS = 3;

		final int COLUMNAS = 12;

		for (int m = 0; m < COLUMNAS; m++) {

			System.out.print("\t" + meses[m]);

		}

		System.out.println("");

		for (int i = 0; i < FILAS; i++) {

			System.out.print(sucursales[i]);

			for (int a = 0; a < COLUMNAS; a++) {

				System.out.print("\t" + numeros[i][a]);

			}

			System.out.println("");

		}

	}

	public static int ventaTotal(int[][] numeros) {

		final int FILAS = 3;

		final int COLUMNAS = 12;

		int suma = 0;

		for (int f = 0; f < FILAS; f++) {

			for (int c = 0; c < COLUMNAS; c++) {

				suma = suma + numeros[f][c];

			}

		}

		return suma;

	}

	public static void mejorMes(int[][] numeros, String[] meses) {

		final int FILAS = 3;

		final int COLUMNAS = 12;

		int mayorventa = 0;

		String mayormes = "";

		for (int c = 0; c < COLUMNAS; c++) {

			int suma = 0;

			for (int f = 0; f < FILAS; f++) {

				suma = suma + numeros[f][c];

				if (suma > mayorventa) {

					mayorventa = suma;

					mayormes = meses[c];

				}

			}

		}

		System.out.printf("\nEl mejor mes para las tres sucursales es: %s", mayormes);

	}

	public static void mejorSucursal(int[][] numeros, String[] sucursales) {

		final int FILAS = 3;

		final int COLUMNAS = 12;

		int mayorventasucu = 0;

		String mejorsucu = "";

		for (int f = 0; f < FILAS; f++) {

			int suma = 0;

			for (int c = 0; c < COLUMNAS; c++) {

				suma = suma + numeros[f][c];

				if (suma > mayorventasucu) {

					mayorventasucu = suma;

					mejorsucu = sucursales[f];

				}

			}

		}

		System.out.printf("\nLa sucursal que vendio mas en el anyo fue: %s", mejorsucu);

	}

}