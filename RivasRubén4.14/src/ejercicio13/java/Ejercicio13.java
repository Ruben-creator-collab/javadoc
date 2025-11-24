/*
 * Descripcion: Programa que calcula el porcentaje de descuento aplicado en una compra
 * Autor: Ruben Rivas
 * Fecha: 24/11/2025
 */
package ejercicio13.java;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime la cantidad de euros de la compra sin descuento: ");
		double precioSinDescuento = sc.nextDouble();
		System.out.print("El precio con el descuento aplicado es: ");
		double precioConDescuento = sc.nextDouble();
		
		System.out.println("El porcentaje de descuento aplicado es: " + porcentajeDescuento(precioSinDescuento, precioConDescuento) + "%");
	
	}
	public static double porcentajeDescuento(double a, double b) {
		return (a - b) / a * 100;
	}

}
