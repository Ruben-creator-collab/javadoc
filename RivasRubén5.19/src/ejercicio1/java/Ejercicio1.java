package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		
		try {
			System.out.print("Dime un número entero: ");
			A = sc.nextInt();
			System.out.println("Valor introduccido: " + A);
		} catch (java.util.InputMismatchException ex1) {
			System.out.println("Valor introducido incorrecto.");
		}
		


		


	}

}
