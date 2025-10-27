/*
 * Descripción: 
 * Autor: Rubén Rivas Flores
 * Fecha: 23/10/25
 */
package ejercicio9.java;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		final int TOTAL_NUMEROS = 100;
		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int[TOTAL_NUMEROS];
		
		for (int contador = 0; contador < numeros.length; contador++ ) {
			numeros [contador] = (int) (1 + Math.random()*10);
		}
		System.out.print("Dime un valor desde el 1 hasta el 10: ");
		int N = sc.nextInt();
		
		for (int i = 0; i < numeros.length; i++) { // Bucle para saber la posición
			if (numeros[i] == N) {
				System.out.println("Tu numero " + N + " Esta en la posicion " + i + " ");
			}
		}	
	}
}
