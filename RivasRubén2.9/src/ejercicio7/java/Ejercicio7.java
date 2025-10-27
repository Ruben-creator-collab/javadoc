/*
 * Descripción: programa que lee 100 números y dice si ha leído algún positivo o no
 * Autor: Rubén Rivas
 * Fecha: 27/10/25
 */
package ejercicio7.java;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		final int TOTAL_NUMEROS = 3;
		Scanner sc = new Scanner(System.in);
		
		int num, numPos = 0;
		
		for (int contador = 0; contador < TOTAL_NUMEROS; contador++) {
			System.out.print("Dime un número positivo o negativo: ");
			num = sc.nextInt();
			if (num > 0) {
				numPos++;
			}
		}
		if (numPos > 0) {
			System.out.println("Se han leído " + numPos + " números positivos");
		} else {
			System.out.println("No se han leído ningún número positivos");
		}
		
		
	}

}
