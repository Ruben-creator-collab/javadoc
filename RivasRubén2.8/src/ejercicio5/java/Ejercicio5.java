/*
 * Descripción: Programa de java para pedir 10 números, la media de los positivos, la de los negativos y la cantidad de ceros
 * Autor: Rubén Rivas
 * Fecha: 15/10/25
 */
package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int media;
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.print("Dame un número ya sea negativo o positivo: ");
			int num = sc.nextInt();
			int suma = num;
			
			if (num >= 0) {
				media = suma / contador;
			}
		}

	}

}
