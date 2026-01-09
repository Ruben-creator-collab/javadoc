package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] array = new double[5];
		
		try {
			for (int contador = 0; contador < array.length; contador++) {
				System.out.print("Dime un valor decimal: ");
				array[contador] = sc.nextDouble();
			}
		} catch (java.util.InputMismatchException ex1) {
			System.out.println("Valor introducido incorrecto.");
		}
		
		
	}

}
