/*
 * Descripción: Ejercicio en java que dice si dos textos son iguales o no
 * Autor: Rubén Rivas
 * Fecha: 10/11/25
 */
package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime una cadena de texto: ");
		String texto1 = sc.nextLine();
//		texto1 = texto1.toLowerCase();
		System.out.print("Dime otra cadena de texto: ");
		String texto2 = sc.nextLine();
//		texto2 = texto2.toLowerCase();		serviria tambien, pero es mejor ponerlo en el if
		
		if (texto1.equalsIgnoreCase(texto2)) {
			System.out.println("Tus textos son iguales");
		} else {
			System.out.println("Tus textos son diferentes");
		}
		
		
	}

}
