package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

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
			System.out.print("Dime tu experiencia en años: ");
			int experiencia = sc.nextInt();
			
			System.out.print("Dime tus proyectos trabajados anteriormente: ");
			int proyectos = sc.nextInt();
			
		if (experiencia > 2 && proyectos > 3) {
				System.out.println("Enhorabuena. Ha sido contratado");
		}
		
		if (experiencia > 5 || proyectos > 5) {
				System.out.println("Tendrá un salario de 30000 euros");
		} else {
				System.out.println("Tendrá un salario de 25000 euros");
		} 
				
			
			
			
		}
		
		
		
		
		
		
	}

}
