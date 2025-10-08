/*
 * Descripción: Programa que pide al usuario su nombre, apellidos, ciclo formativo y nota académica y la clasifica.
 * Autor: Rubén Rivas
 * Fecha: 07/10/25
 */
package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Dime tus apellidos: ");
		String apellidos = sc.nextLine();
		
		System.out.print("Dime tu ciclo formativo: ");
		String ciclo = sc.nextLine();
		
		System.out.print("Dime tu nota académica: ");
		double nota = sc.nextDouble();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Ciclo formativo: " + ciclo);
		
		if (nota < 5) {
			System.out.println(nota + " (Insuficiente)");
		} else if (nota <= 5) {
			System.out.println(nota + " (Aprobado)"); 
		} else if (nota < 7) {
			System.out.println(nota + " (Bien)");
		} else if (nota < 9) {
			System.out.println(nota + " (Notable)");
		} else {
			System.out.println(nota + " (Sobresaliente)");
		}
		
	}

}