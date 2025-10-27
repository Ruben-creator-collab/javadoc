/*
 * Descripción: Suma de números dentro de un array
 * Autor: Rubén Rivas Flores
 * Fecha: 23/10/25
 */
package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		final int TOTAL_NUMEROS = 10;
		
		Scanner sc = new Scanner(System.in);
		
		int suma = 0;
		int [] numeros;
		numeros = new int [TOTAL_NUMEROS];
		
		for (int contador = 0; contador < numeros.length; contador++) {
			
			System.out.print("Dime un número: ");
			numeros[contador] = sc.nextInt();
		}
		
		for (int contador = 0; contador < numeros.length; contador++) {
			
			suma = suma + numeros[contador];
		}
		System.out.println("Esta es la suma de tus números " + suma);
	}

}
