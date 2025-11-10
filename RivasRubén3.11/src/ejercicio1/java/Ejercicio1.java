/*
 * Descripción: Ejercicio en java que almacena en una matriz 5x5 los numeros del 1 al 25
 * Autor: Rubén Rivas
 * Fecha: 30/10/25
 */
package ejercicio1.java;

public class Ejercicio1 {

	public static void main(String[] args) {
		int [][] numeros = new int [5][5];
		
		int nums = 1; // Podría haber metido esta variable en un bucle for también
		
		for (int contador = 0; contador < numeros.length; contador++) {
			for (int i = 0; i < numeros.length; i++) {
				numeros [contador][i] = nums;
				nums++;
			}
		}
		for (int contador = 0; contador < numeros.length; contador++) {
			for (int i = 0; i < numeros.length; i++) {
				System.out.print(numeros[contador][i] + "\t");			}
				System.out.println();
		}
	}

}
