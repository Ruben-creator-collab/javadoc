/*
 * Descripcion: Programa que convierte millas a kilometros
 * Autor: Ruben Rivas
 * Fecha: 24/11/2025
 */
package ejercicio12.java;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de millas: ");
		double millas = sc.nextDouble();
		
		System.out.println("Tus millas en kilometros son: " + millasAKilometros(millas));
		
	}
	public static double millasAKilometros(double kilometros) {
		
		return kilometros / 1.609;
	}

}
