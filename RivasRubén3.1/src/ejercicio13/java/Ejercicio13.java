/*
 * Descripción: Programa de java el cual almacena en un array una operación aritmética
 * Autor: Rubén Rivas
 * Fecha: 12/11/25
 */
package ejercicio13.java;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un valor: ");
		int V = sc.nextInt();
		
		System.out.print("Dime otro valor para incrementarlo: ");
		int I = sc.nextInt();
		
		System.out.print("Dime el numero de valores a crear: ");
		int N = sc.nextInt();
		
		int [] array = new int [N];
		array[0] = V;
		
		for (int contador = 1; contador < array.length; contador++) {
//			array[contador] = V + contador * I; 		También serviría esto
			array[contador] = V + I;
			V = V + I;
		}
		for (int contador = 0; contador < array.length; contador++) {
			System.out.print(array[contador] + "\t");
		}
	}

}
