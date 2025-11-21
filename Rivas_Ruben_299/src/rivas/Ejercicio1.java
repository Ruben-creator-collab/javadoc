/*
 * Descripción: Programa que solicita dos numeros y calcula los multiplos de 3 y 5 de cada uno
 * Autor: Rubén Rivas
 * Fecha: 12/11/25
 */
package rivas;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int multiplo = 0;
		int N, M;
		
		do {
		System.out.print("Dime un número entero: ");
		N = sc.nextInt();
		System.out.print("Dime un número entero: ");
		M = sc.nextInt();
		
		if (N < M) {
			
		} else {
			System.out.print("El primer número tiene que ser menor que el segundo");
			System.out.println();
		}
		} while (N > M);
		
		multiplo = M / N;
		System.out.println("Para " + N + " y " + M + ", el único múltiplo de 3 y 5 es el " + multiplo);
	}

}
