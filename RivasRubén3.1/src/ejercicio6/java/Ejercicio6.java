/*
 * Descripción: Programa en java el cuál pide dos valores y crea un array con esos valores
 * Autor: Rubén Rivas
 * Fecha: 23/10/25
 */
package ejercicio6.java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Dime un valor entero: ");
		int N = sc.nextInt();
		
		System.out.print("Dime un valor entero: ");
		int M = sc.nextInt();
		
		int [] array = new int[N];
		
		for (int contador = 0; contador < array.length; contador++) {
			array[contador] = M;
		}
		
		for (int contador = 0; contador < array.length; contador++) {
			System.out.print(array[contador] + "\t");
		}
	}
}
