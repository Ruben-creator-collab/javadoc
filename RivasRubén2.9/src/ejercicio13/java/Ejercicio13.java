package ejercicio13.java;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = 1;
		int max = 100;
		int numRan;
		String respuesta;
		
		System.out.println("Piensa un número del 1 al 100");

		
		do {
			numRan = (min + max) / 2; // prueba el número del medio
			System.out.println("¿Es este tu número?: " + numRan);
			System.out.print("Dime si es mayor, menor o igual: ");
			respuesta = sc.nextLine().toLowerCase();
			if (respuesta.equalsIgnoreCase("mayor")) {
				min = numRan + 1; // si el número es mayor, sube el mínimo
			} else if (respuesta.equalsIgnoreCase("menor")) {
				max = numRan - 1; // si es menor, baja el máximo
			}
		} while (!respuesta.equalsIgnoreCase("igual"));
		System.out.print("Tu número es: " + numRan);
	}

}
