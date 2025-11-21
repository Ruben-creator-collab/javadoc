/*
 * Descripción: Programa en java que crea un array con los valores N y M
 * Autor: Rubén Rivas
 * Fecha: 12/11/25
 */
package ejercicio15.java;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un valor: ");
		int N = sc.nextInt();
		System.out.print("Dime un valor: ");
		int M = sc.nextInt();
		
		int [] array = new int [N];
		
		for (int contador = 0; contador < array.length; contador++) {
			array[contador] = M;
		}
		for (int contador = 0; contador < array.length; contador++) {
			System.out.print(array[contador] + "\t");
		}
		
		
		
		
	}

}
