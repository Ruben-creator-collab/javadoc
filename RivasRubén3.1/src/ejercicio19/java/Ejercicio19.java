package ejercicio19.java;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] puntuaciones = new int [8];
		
		for (int contador = 0; contador < puntuaciones.length; contador++) {
			System.out.print("Dime los valores de las puntuaciones una a una: ");
			puntuaciones[contador] = sc.nextInt();
		}
		
		Arrays.sort(puntuaciones);
		
		for (int contador = puntuaciones.length - 1; contador >= 0; contador--) {
			System.out.print(puntuaciones[contador] + "\t");
		}
	}

}
