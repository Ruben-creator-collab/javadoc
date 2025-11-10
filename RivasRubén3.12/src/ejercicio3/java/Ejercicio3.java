/*
 * Descripción: Ejercicio en java que junta tu nombre y tus apellidos 
 * Autor: Rubén Rivas
 * Fecha: 10/11/25
 */
package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Dime tu primer apellido: ");
		String apellido1 = sc.nextLine();
		System.out.print("Dime tu segundo apellido: ");
		String apellido2 = sc.nextLine();

		nombre = nombre.substring(0, 3);
		apellido1 = apellido1.substring(0, 3);
		apellido2 = apellido2.substring(0, 3);

		nombre = nombre.toUpperCase();
		apellido1 = apellido1.toUpperCase();
		apellido2 = apellido2.toUpperCase();
		
		System.out.println(nombre + apellido1 + apellido2);
	}
}
