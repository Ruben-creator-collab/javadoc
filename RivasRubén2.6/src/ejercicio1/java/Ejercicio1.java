/*
 * Descripción: Programa de java el cuál dice si el primer número es menor, mayor o igual que el segundo
 * Autor: Rubén Rivas
 * Fecha: 03/10/25
 */
package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime el primer número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Dime el segundo número: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("Tu primer número es mayor que el segundo");
		}
		else if (num1 == num2) {
			System.out.println("Tu primer número es igual al segundo");
		}
		if (num1 < num2) {
			System.out.println("Tu primer número es menor que el segundo");
		}
		
		
		
		
	}

}
