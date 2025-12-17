package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = (int)(Math.random()*100)+1;
		int [] vector = new int [N];
		
		for (int contador = 0; contador < vector.length; contador++) {
			vector[contador] = (int)(Math.random()*10)+1;
		}
		
		int posicion;
		
		while (true) {
			try {
				System.out.print("Dime una posición del vector (entre 0 y " + (N - 1) + "): ");
				posicion = sc.nextInt();

				if (posicion < 0) {
					break;
				}

				System.out.println("El valor en la posición " + posicion + " es: " + vector[posicion]);

			} catch (ArrayIndexOutOfBoundsException ex1) {
				System.out.println("Posición fuera de los límites del vector.");
			} catch (java.util.InputMismatchException ex2) {
				System.out.println("Valor introducido incorrecto.");
				sc.next(); // limpiar buffer
			}
		}
		
	}

}
