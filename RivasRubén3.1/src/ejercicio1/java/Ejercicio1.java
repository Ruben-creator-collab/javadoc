/*
 * Descripción: Almacenar números dentro de un array y enseñarlos por pantalla
 * Autor: Rubén Rivas Flores
 * Fecha: 23/10/25
 */
package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		final int TOTAL_NUMEROS = 10;
		
		Scanner sc = new Scanner(System.in);
		
		int [] numeros;
		numeros = new int [TOTAL_NUMEROS];
		
		for (int contador = 0; contador < numeros.length; contador++) {
			
			System.out.print("Dime un número: ");
			numeros[contador] = sc.nextInt();
		}
		
		for (int contador = 0; contador < numeros.length; contador++) {
			
			System.out.println("Estos son tus número " + numeros[contador]);
		}
		
		
	}

}
