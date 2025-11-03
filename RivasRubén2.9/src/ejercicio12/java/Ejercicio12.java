package ejercicio12.java;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un número: ");
		int A = sc.nextInt();
		
		System.out.print("Dime un número: ");
		int B = sc.nextInt();
		
		int elevado = 1;
		
		for(int contador = 0; contador < B; contador++) {
			elevado = elevado * A;
		}
		System.out.println("Este es tu número elevado: " + elevado);
	}

}
