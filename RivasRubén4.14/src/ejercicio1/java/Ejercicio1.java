/*
 * Descripción: Programa que utiliza un metodo para multiplicar dos valores
 * Autor: Rubén Rivas
 * Fecha: 13/11/25
 */
package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un valor: ");
		double a = sc.nextDouble();
		System.out.print("Dime un valor: ");
		double b = sc.nextDouble();
		
		System.out.print(multiplica(a,b));
		
	}
	
	public static double multiplica(double a, double b) {
		double multiplicacion = a * b;
		
		return multiplicacion;
	}

}
