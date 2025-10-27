/*
 * Descripción: 
 * Autor: Rubén Rivas Flores
 * Fecha: 23/10/25
 */
package ejercicio8.java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		final int TOTAL_NUMEROS = 100;
		Scanner sc = new Scanner(System.in);
		
		double [] numeros = new double[TOTAL_NUMEROS];
		
		for (int contador = 0; contador < numeros.length; contador++ ) {
			numeros [contador] = (double) (Math.random()*1.0);
		}
		System.out.print("Dime un valor real desde el 0 hasta el 1,0: ");
		double R = sc.nextDouble();
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= R) {
				System.out.println("Estos son los valores iguales o superiores al número que has introducido antes: " + numeros[i]);
			}
		}
	}	
}
