/*
 * Descripción: 
 * Autor: Rubén Rivas Flores
 * Fecha: 23/10/25
 */
package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		final int TOTAL_NUMEROS = 20;
		
		Scanner sc = new Scanner(System.in);
		
		int suma = 0, numPos, numNeg;
		int [] numeros;
		numeros = new int [TOTAL_NUMEROS];
		
		for (int contador = 0; contador < numeros.length; contador++) {
			
			System.out.print("Dime un número positivo o negativo: ");
			numeros[contador] = sc.nextInt();

		}
		
		numPos = numeros[0];
		numNeg = numeros[0];
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (0 > numeros[i]){
				numNeg = numNeg + numeros[i];
			} 
			else {
				numPos = numPos + numeros[i];
			}
		}
		System.out.println("La suma de los números positivos es " + numPos + " y la de los negativos es " + numNeg);
	}

}
