package ejercicio8.java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un número entero: ");
		int N = sc.nextInt();
		System.out.println("Sumatorio: " + suma1aN(N));
		System.out.println("Productorio: " + producto1aN(N));
		System.out.println("Intermedio: " + intermedio1aN(N));
	}
	public static int suma1aN(int n) {
		int sumatorio = 0;
		for (int contador = 1; contador <= n; contador++) {
			sumatorio = sumatorio + contador;
		}
		return sumatorio;
	}
	public static int producto1aN(int n) {
		int producto = 1;
		for (int contador = 1; contador <= n; contador++) {
			producto = producto * contador;
		}
		return producto;
	}
	public static double intermedio1aN(int n) {
		double intermedio = 1;
		intermedio = n / 2.0;
		return intermedio;
	}

}
