/*
 * Descripción: Ejercicio en java que guarda las vocales de una frase
 * Autor: Rubén Rivas
 * Fecha: 10/11/25
 */
package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime una frase: ");
		String frase = sc.nextLine();
		frase = frase.toUpperCase();
		int A = 0,E = 0,I = 0,O = 0,U = 0;
		
		
		for (int contador = 0; contador < frase.length(); contador++) {
			if (frase.charAt(contador) == 'A') {
				A++;
			}
			if (frase.charAt(contador) == 'E') {
				E++;
			}
			if (frase.charAt(contador) == 'I') {
				I++;
			}
			if (frase.charAt(contador) == 'O') {
				O++;
			}
			if (frase.charAt(contador) == 'U') {
				U++;
			}
		}
		System.out.println("Nº de A's: " + A);
		System.out.println("Nº de E's: " + E);
		System.out.println("Nº de I's: " + I);
		System.out.println("Nº de O's: " + O);
		System.out.println("Nº de U's: " + U);


	}

}
