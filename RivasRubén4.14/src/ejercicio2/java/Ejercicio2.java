/*
 * Descripción: Programa que dice con un metodo si eres mayor de edad o no
 * Autor: Rubén Rivas
 * Fecha: 13/11/25
 */
package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu edad: ");
		int edad = sc.nextInt();
		
		System.out.println(esMayorEdad(edad));
		
	}
	
	public static boolean esMayorEdad(int a) {
		boolean mayor;
		if (a >= 18) {
			mayor = true;
		} else {
			mayor = false;
		}
		return mayor;
	}
}
