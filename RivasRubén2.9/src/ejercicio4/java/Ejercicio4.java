package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un número: ");
		int num = sc.nextInt();
		int contador = 1;
		while (contador <= num) {
			System.out.print(contador + " ");
			contador++;	
		}
		
	}

}
