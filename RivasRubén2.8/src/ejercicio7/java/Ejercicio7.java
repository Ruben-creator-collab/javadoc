package ejercicio7.java;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Random rand = new Random();
		int numAleatorio = rand.nextInt(51); // genera un número aleatorio entre el 0 al 50, no llega al 51 porque el máximo no lo cuenta	
		int num;
		
		do {
			System.out.print("Adivina el número del 0 al 50: ");
			num = sc.nextInt();
			if (num > numAleatorio) {
				System.out.println("menor");
			} else if (num < numAleatorio) {
				System.out.println("mayor");
			} else {
				System.out.println("Correcto, has acertado");
			}
		} while (num != numAleatorio);
		
	}

}
