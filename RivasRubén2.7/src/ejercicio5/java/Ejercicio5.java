package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el primer valor: ");
		int num1 = sc.nextInt();
		
		System.out.print("Dime el segundo valor: ");
		int num2 = sc.nextInt();
		
		System.out.println("Indique la operación a realizar (Inserte un número): ");
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicación");
		System.out.println("(4) División");
		System.out.println("-------------------------- ");
		int operacion = sc.nextInt();
		
		switch (operacion) {
			case 1: {
				int suma = num1 + num2;
				System.out.println("Resultado: " + suma);
			break;
			}
			case 2: {
				int resta = num1 - num2;
				System.out.println("Resultado: " + resta);
			break;
			}
			case 3: {
				int multiplicacion = num1 * num2;
				System.out.println("Resultado: " + multiplicacion);
			break;
			}
			case 4: {
				double division = num1 / num2;
				System.out.println("Resultado: " + division);
			break;
			}
			default: {
				System.out.println("La operación indicada es incorrecta.");
			}
		}

	}

}
