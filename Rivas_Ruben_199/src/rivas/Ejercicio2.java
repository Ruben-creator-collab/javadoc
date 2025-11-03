/*
 * Descripción: años y siglos
 * Autor: Rubén Rivas
 * Fecha: 29/10/25
 */
package rivas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anno;
		String siglo;
		int resta = 0, suma = 0, contador = 0;
		
		System.out.println("ANÁLISIS DEL AÑO");
		System.out.println(" ");
		System.out.println("----------------");
		System.out.println(" ");
		
		do {
			System.out.print("Dime un año entre el 1801 y 2100: ");
			anno = sc.nextInt();
			if (anno < 1801 || anno > 2100) {
				System.out.println("Ese año no es válido");
				contador++;
				
			} if (anno <= 1900) {
				siglo = "XIX";
				resta = anno - 2025;
			} else if (anno > 1900 && anno <= 2000) {
				siglo = "XX";
				resta = anno - 2025;
			} else if (anno >= 2001) {
				siglo = "XXI";
			} else {
				siglo = "XXI";
				suma = anno + 2025;
			}
			
			
			if (anno == 2025) {
				System.out.println("El año coincide con el actual");
			} else if (anno < 1900) {
				System.out.print("El año introducido es anterior al actual. " + " Han pasado " + resta + " años.");
				System.out.println("El año pertenece al siglo " + siglo + ".");
			} else if (anno > 1900 || anno <= 2000) {
				System.out.print("El año introducido es anterior al actual. " + " Han pasado " + resta + " años.");
				System.out.println("El año pertenece al siglo " + siglo + ".");
			} else if (anno >= 2001) {
				System.out.print("El año introducido es posterior al actual. " + " Han pasado " + suma + " años.");
				System.out.println("El año pertenece al siglo " + siglo + ".");
			}
			
		} while (anno != -1 || contador < 3);
		
		if (contador == 3) {
			System.out.println("Has introducido tres años no válidos");
		}

		
			

	}

}
