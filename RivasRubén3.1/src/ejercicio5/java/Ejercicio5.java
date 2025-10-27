/*
 * Descripción: 
 * Autor: Rubén Rivas Flores
 * Fecha: 23/10/25
 */
package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		final int TOTAL_NUMEROS = 20;
		
		Scanner sc = new Scanner(System.in);
		
		int suma = 0, media;
		int [] numeros;
		numeros = new int [TOTAL_NUMEROS];
		
		for (int contador = 0; contador < numeros.length; contador++) {
			
			System.out.print("Dime un número: ");
			numeros[contador] = sc.nextInt();

		}
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			suma = suma + numeros[i];
		}
		media = suma / TOTAL_NUMEROS;
		System.out.println("La media de los números es: " + media);
	}

}
