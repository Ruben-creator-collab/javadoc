/*
 * Descripción: Programa en java el cual coge dos valores por teclado y hace un array metiendo los valores desde P hasta Q
 * Autor: Rubén Rivas
 * Fecha: 23/10/25
 */
package ejercicio7.java;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un valor entero: ");
		int P = sc.nextInt();
		
		System.out.print("Dime un valor entero: ");
		int Q = sc.nextInt();
		
		int[] array = new int[Q];
		
		for (int contador = 0; contador < array.length; contador++) {
			array[contador] = P++;
		}
		
		for (int contador = 0; contador < array.length; contador++) {
			System.out.print(array[contador] + "\t");
		}
	}

}
