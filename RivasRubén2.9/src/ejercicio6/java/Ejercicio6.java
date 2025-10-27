/*
 * Descripción: programa que lee 100 números y dice si ha leído algún negativo o no
 * Autor: Rubén Rivas
 * Fecha: 27/10/25
 */
package ejercicio6.java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		final int TOTAL_NUMEROS = 100;
		Scanner sc = new Scanner(System.in);
		
		int num, numNeg = 0;
		
		for (int contador = 0; contador < TOTAL_NUMEROS; contador++) {
			System.out.print("Dime un número positivo o negativo: ");
			num = sc.nextInt();
			if (num < 0) {
				numNeg++;
			}
		}
		if (numNeg > 0) {
			System.out.println("Se han leído " + numNeg + " números negativos");
		} else {
			System.out.println("No se han leído ningún número negativo");
		}
		
		
	}

}
