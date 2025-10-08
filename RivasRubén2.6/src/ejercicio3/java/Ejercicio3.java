/*
 * Descripción: Programa de java el cuál pide su edad, si es mayor de edad se le pide su nombre y apellidos
 * Autor: Rubén Rivas
 * Fecha: 06/10/25
 */
package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime tu edad: ");
		int edad = sc.nextInt();
		sc.nextLine(); // Esta línea de codigo es para poder poner un string después de un valor decimal
		
		if (edad < 18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios.");
		}
		else {
			String nombre;
			System.out.print("Dime tu nombre: ");
			nombre = sc.nextLine();
			
			String apellidos;
			System.out.print("Dime tus apellidos: ");
			apellidos = sc.nextLine();
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Edad: " + edad);
			System.out.println(" ");
			System.out.println("Usted ha sido admitido");
			
		}
		
		
	}

}
