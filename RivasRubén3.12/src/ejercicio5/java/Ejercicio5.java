/*
 * Descripción: Ejercicio en java que dice si una frase es palíndromo o no
 * Autor: Rubén Rivas
 * Fecha: 10/11/25
 */
package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String fraseInvertida = "";
		System.out.print("Dime una frase: ");
		String frase = sc.nextLine();
		frase = frase.toLowerCase();
		frase = frase.replace(" ", "");
		
		for (int contador = 0; contador < frase.length(); contador++) {
			fraseInvertida = fraseInvertida + frase.charAt(contador);
		}
		if (fraseInvertida.equals(frase)) {
			System.out.println("Tu frase es un palíndromo");
		} else {
			System.out.println("Tu frase no es un palíndromo");
		}
	}

}
