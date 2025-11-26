package ejercicio17.java;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("Dime un número: ");
			n = sc.nextInt();
			if (esPrimo(n) == true) {
				System.out.println("Tu número es primo");
			} else {
				System.out.println("Tu número no es primo");
			}
		} while (n != 0);
		
	}
	// Método para decir si un número es primo o no
	public static boolean esPrimo(int a) {
		
		if (a <= 1) {
			return false;
		}
		
		for (int divisor = 2; divisor < a; divisor++) {
			if (a % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
