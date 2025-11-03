package repaso;

import java.util.Scanner;

public class Ejercicio8repaso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un número para decir su tabla de multiplicar: ");
		int num = sc.nextInt();
		int mul = 1;
		
		for (int contador = 1; contador <= 10; contador++) {
			mul = num * contador;
			System.out.println(num + " * " + contador + " = " +mul);
		}
		
	}

}
