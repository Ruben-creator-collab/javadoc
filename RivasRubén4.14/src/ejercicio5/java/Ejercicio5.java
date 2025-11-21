package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un valor entero en millas: ");
		int millas = sc.nextInt();
		
		System.out.println(millas_a_kilometros(millas));
		
	}
	public static double millas_a_kilometros(int millas) {
		double kilometros = 1.60934;
		double conversion = millas * kilometros;
		return conversion;
	}

}
