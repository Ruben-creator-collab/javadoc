/*
 * Descripción: Programa java que crea un array con distintas opciones en un menú
 * Autor: Rubén Rivas 
 * Fecha: 12/11/25
 */
package ejercicio12.java;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] array = new int [10];
		
		while (true) {
		System.out.println("Indique la operación a realizar (Inserte una letra): ");
		System.out.println("a. Mostrar valores");
		System.out.println("b. Introducir valor");
		System.out.println("c. Salir");
		System.out.println("-------------------------- ");
		String opciones = sc.nextLine();
		
		switch (opciones.charAt(0)) {
		case 'a': {
			for (int contador = 0; contador < array.length; contador++) {
				System.out.print(array[contador] + "\t");
			}
			System.out.println();
			break;
		}
		case 'b': {
			System.out.print("Dime un valor: ");
			int V = sc.nextInt();
			System.out.print("Dime una posición: ");
			int P = sc.nextInt();
			sc.nextLine();
			array[P] = V;
			break;
		}
		case 'c': {
			return;
		}
		}
	}
}
}
