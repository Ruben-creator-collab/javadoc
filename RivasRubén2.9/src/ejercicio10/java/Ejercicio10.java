/*
 * Descripción: Ejercicio en java que lee notas y dice si hay alguna con un 10 o no
 * Autor: Rubén Rivas
 * Fecha: 20/10/25
 */
package ejercicio10.java;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota, nota10 = 0;
		
		do {
			System.out.print("Dime una nota del 0 al 10 (-1 para salir): ");
			nota = sc.nextInt();
			if (nota == 10) {
				nota10++;
			}
		} while (nota != -1);
		
		if (nota10 > 0) {
		System.out.println("Hubo " + nota10 + " dieces");
		} else if (nota10 == 0) {
		System.out.println("No hubo ningún diez");
		}
	}

}
