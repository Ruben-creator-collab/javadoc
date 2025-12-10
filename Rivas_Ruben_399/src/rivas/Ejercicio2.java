/*
 * Descripción: Programa para calcular los nacimientos en la provincia
 * Autor: Rubén Rivas 
 * Fecha: 26/11/25
 */
package rivas;

public class Ejercicio2 {

	public static void main(String[] args) {
		int [][] nacimientos = new int [10][16];
		int provincias = 0;
		int dias = 16;
		
		inicializacion(nacimientos, dias);
		
	}
	// Inicialización de la matriz
	public static void inicializacion (int[][] nacimientos, int dias) {		
		for (int provincia = 0; provincia < nacimientos.length; provincia++) {		
			for (int dia = 0; dia < nacimientos[provincia].length; dia++) {
				nacimientos [provincia][dia] = dias++;
			}
		}
	}
}