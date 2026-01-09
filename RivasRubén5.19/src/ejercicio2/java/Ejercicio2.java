package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0;
		
		try {
			System.out.print("Dame un valor: ");
			A = sc.nextInt();
			System.out.print("Dame otro valor: ");
			B = sc.nextInt();
		} catch (java.util.InputMismatchException ex1) {
			System.out.println("Valor introducido incorrecto.");
		}
		
		try {
			System.out.println("El resultado de la division es: " + (A/B));
		} catch (java.lang.ArithmeticException ex2) {
			System.out.println("Operación no válida.");
		}
		
	}

}
