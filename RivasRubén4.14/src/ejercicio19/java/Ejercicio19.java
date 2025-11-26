package ejercicio19.java;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un valor: ");
		double a = sc.nextDouble();
		System.out.print("Dime un valor: ");
		double b = sc.nextDouble();
		System.out.print("Dime un valor: ");
		double c = sc.nextDouble();
		
		if (ecuacionPitagoras(a,b,c) == true) {
			System.out.println("Tu resultado se ajusta a la ecuación de Pitágoras");
		} else {
			System.out.println("Tu resultado no se ajusta a la ecuación de Pitágoras");
		}
		
	}
	
	// Método para decir si una terna de ajusta a la ecuación de Pitágoras
	public static boolean ecuacionPitagoras (double a, double b, double c) {
		if (Math.pow(a, 2) + Math.pow(b,2) == Math.pow(c, 2)) {
			return true;
		}
		return false;
	}

}
