/*
 * Descripción: Un programa de java el cuál pide datos y dice si cumple o no cumple los requisitos
 * Autor: Rubén Rivas
 * Fecha: 10/10/25
 */
package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Dime tus apellidos: ");
		String apellidos = sc.nextLine();
		
		System.out.print("Dime tu edad: ");
		int edad = sc.nextInt();
		
		System.out.print("Dime tu salario deseado: ");
		int salarioDeseado = sc.nextInt();
		
		if (salarioDeseado > 30000 || edad > 45) {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		} else {
			System.out.print("Dime tus años de experiencia: ");
			int annosExperiencia = sc.nextInt();
		
			System.out.print("Dime el número de proyectos trabajados anteriormente: ");
			int proyectos = sc.nextInt();
		
		if (annosExperiencia > 2 && proyectos > 3 ) {
			System.out.println("Enhorabuena. Ha sido contratado");	
		} else {
			System.out.println("Lo sentimos pero no cumple nuestro perfil");
		}
		}
	}

}
