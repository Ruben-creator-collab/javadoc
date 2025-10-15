/*
 * Descripción: Programa de java usando el bucle while para hacer sumas y contar cuántas sumas ha hecho
 * Autor: Rubén Rivas
 * Fecha: 15/10/25
 */
package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int num1,contador,suma;
		contador = 0;
		
		System.out.print("Dime un valor positivo: ");
		num1 = sc.nextInt();		
		
		suma = num1;
		
		while (num1 != 0 ) {
			System.out.print("Dime un valor positivo (0 para salir): ");
			num1 = sc.nextInt();
			suma = suma + num1;
			contador++;
		}
		System.out.println("la suma de los números es " + suma + " y ha sumado " + contador + " números");

	}

}
