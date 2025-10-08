/*
 * Descripción: Programa que pide al usuario su nombre, apellidos, ciclo formativo y nota académica y la clasifica con el 10 como matrícula de honor.
 * Autor: Rubén Rivas
 * Fecha: 07/10/25
 */
package ejercicio6.java;

import java.util.Scanner;

public class Ejercicio6 {

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
		
		if (nota < 0 || nota > 10) {
			System.out.println("La nota académica indicada es incorrecta.");
		} else if (nota < 5) {
			System.out.println(nota + " (Insuficiente)");
		} else if (nota <= 5) {
			System.out.println(nota + " (Aprobado)"); 
		} else if (nota < 7) {
			System.out.println(nota + " (Bien)");
		} else if (nota < 9) {
			System.out.println(nota + " (Notable)");
		} else if (nota < 10) {
			System.out.println(nota + " (Sobresaliente)");
		} else {
			System.out.println(nota + " (Matrícula de Honor)");
		}
		
	}

}
<<<<<<< HEAD

=======
>>>>>>> 7f3c768e703eee54e825c6b1bb446ca75d4535e4
