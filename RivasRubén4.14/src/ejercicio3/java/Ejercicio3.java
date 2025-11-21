package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un valor: ");
		int a = sc.nextInt();
		System.out.print("Dime un valor: ");
		int b = sc.nextInt();
		
		System.out.print(minimo(a,b));
	}
	
	public static int minimo(int a, int b) {
		int menor = 0;
		if (a < b) {
			menor = a;
		} else if (b < a) {
			menor = b;
		}
		return menor;
	}
	
}
