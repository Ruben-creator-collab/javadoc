/*
 * Descripción: Un programa de java el cuál pide una nota y la califíca
 * Autor: Rubén Rivas
 * Fecha: 10/10/25
 */
package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime una nota en valor entero: ");
		int nota = sc.nextInt();
		
		switch (nota) {
		
			case 0:{
				System.out.println("La calificación es: Muy deficiente");
				break;
			}
			case 1, 2, 3, 4: {
				System.out.println("La calificación es: Insuficiente");
				break;
			}
			case 5: {
				System.out.println("La calificación es: Suficiente");
				break;
			}
			case 6: {
				System.out.println("La calificación es: Bien");
				break;
			}
			case 7, 8: {
				System.out.println("La calificación es: Notable");
				break;
			}
			case 9, 10: {
				System.out.println("La calificación es: Sobresaliente");
				break;
			}
			default: {
				System.out.println("La calificación indicada es incorrecta.");
			}
		}
	}
}
