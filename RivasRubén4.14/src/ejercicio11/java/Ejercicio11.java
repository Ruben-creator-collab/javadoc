package ejercicio11.java;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un número para su tabla de multiplicar: ");
		int num = sc.nextInt();
		
		tablaMultiplicar(num);
	}
	public static void tablaMultiplicar(int num) {
	    for (int i = 1; i <= 10; i++) {
	        System.out.println(num + " x " + i + " = " + (num * i));
	    }
	}
}
