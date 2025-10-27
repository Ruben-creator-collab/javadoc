package ejercicio10.java;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota, nota10 = 0;
		
		do {
			System.out.print("Dime una nota del 0 al 10 (-1 para salir): ");
			nota = sc.nextInt();
			if (nota == 10) {
				nota10++;
			}
		} while (nota != -1);
		
		if (nota10 > 0) {
		System.out.println("Hubo " + nota10 + " dieces");
		} else if (nota10 == 0) {
		System.out.println("No hubo ningún diez");
		}
	}

}
