/*
 * Descripción: Ejercicio en java que hace las tablas de multiplicar del 1 al 10
 * Autor: Rubén Rivas
 * Fecha: 30/10/25
 */
package ejercicio2.java;

public class Ejercicio2 {

	public static void main(String[] args) {
		int [][] numeros = new int [10][10];
		
		
		for (int columna = 0; columna < numeros.length; columna++) {
			for (int fila = 0; fila < numeros.length; fila++) {
				numeros [columna][fila] = (fila + 1) * (columna + 1);
			}
		}
		for (int columna = 0; columna < numeros.length; columna++) {
			for (int fila = 0; fila < numeros.length; fila++) {
				System.out.print(numeros[columna][fila] + "\t");			
			}
				System.out.println();
		}

	}

}
