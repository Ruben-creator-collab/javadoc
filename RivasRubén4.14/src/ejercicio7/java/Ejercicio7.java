package ejercicio7.java;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ancho, alto;
		
		System.out.print("Dime el ancho de un rectángulo: ");
		ancho = sc.nextDouble();
		System.out.print("Dime el alto de un rectángulo: ");
		alto = sc.nextDouble();
		
		System.out.println("Esta es el área de tu rectángulo: " + areaRectangulo(ancho, alto));
		System.out.println("Este es el perímetro de tu rectángulo: " + perimetroRectangulo(ancho, alto));
		
	}
	public static double perimetroRectangulo(double ancho, double alto) {
		double perimetro;
		perimetro = 2 * (ancho + alto);
		return perimetro;
	}
	public static double areaRectangulo(double ancho, double alto) {
		double area;
		area = ancho * alto;
		return area;
	}
}
