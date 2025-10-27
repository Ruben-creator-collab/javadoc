/*
 * Descripción: Programa de java lee un número y da su cuadrado y repite el proceso hasta que lea un número negativo
 * Autor: Rubén Rivas
 * Fecha: 16/10/25
 */
package ejercicio6.java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,potencia;
		
		do {
			System.out.print("Dime un número (pon un número negativo para salir): ");
			num = sc.nextInt();
			if (num > 0) {
			potencia = num * num;
			System.out.println("El cuadrado de " + num + " = " + potencia);
			} else {
				System.out.println("El número introducido es erróneo");
			}
		} while (num > 0);
		
	}

}
