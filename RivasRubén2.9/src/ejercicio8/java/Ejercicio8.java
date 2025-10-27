/*
 * Descripción: programa que lee números no nulos y dice cuantos positivos y si hay algún negativo
 * Autor: Rubén Rivas
 * Fecha: 27/10/25
 */
package ejercicio8.java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, numNeg = 0, numPos = 0;
		
		do {
			System.out.print("Dime un número positivo o negativo (0 si quieres salir): ");
			num = sc.nextInt();
			if (num > 0) {
				numPos++;
			} else if (num < 0) {
				numNeg++;
			}
		} while (num != 0);
		if (numNeg == 0) {
			System.out.println("No se ha leído ningún número negativo");
		}else {
			System.out.println("Se han leído " + numNeg + " números negativos");
		}
			System.out.println("Se han leído " + numPos + " números positivos");
		
	 }
}
