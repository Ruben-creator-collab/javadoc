/*
 * Descripción: 
 * Autor: Rubén Rivas Flores
 * Fecha: 23/10/25
 */
package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		final int TOTAL_NUMEROS = 10;
		
		Scanner sc = new Scanner(System.in);
		
		int suma = 0, numMax, numMin;
		int [] numeros;
		numeros = new int [TOTAL_NUMEROS];
		
		for (int contador = 0; contador < numeros.length; contador++) {
			
			System.out.print("Dime un número: ");
			numeros[contador] = sc.nextInt();

		}
		
		numMax = numeros[0];
		numMin = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numMax < numeros[i]) {
				numMax = numeros[i];
			} 
			if (numMin > numeros[i]) {
				numMin = numeros[i];
			}
		}
		System.out.println("El número máximo es " + numMax + " y el número mínimo es " + numMin);
	}

}
