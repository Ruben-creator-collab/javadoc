/*
 * Descripción; Programa en Java que demuestre el uso de un sistema métrico
 * Autor: Rubén
 * Fecha: 27/09/25
 */
package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		double metros;
		
		double decimetros, centimetros, milimetros;
		
		double pulgadas, pies, yardas;

		
		System.out.print("Introduzca la longitud en metros que deasea transformar: ");
		metros = datos.nextDouble();
				
		System.out.println("RESULTADO");
		System.out.println("---------------------");
		
		System.out.println("SISTEMA INTERNACIONAL");
		System.out.println("---------------------");
		
		decimetros = metros * 10;
		centimetros = metros * 100;
		milimetros = metros * 1000;
		
		
		System.out.println("La medida " + metros + " en metros son:");
		System.out.println(decimetros + " decímetros");
		System.out.println(centimetros + " centímetros");
		System.out.println(milimetros + " milímetros");
		
		System.out.println("SISTEMA ANGLOSAJÓN");
		System.out.println("---------------------");
		
		pulgadas = centimetros / 2.54;
		pies = pulgadas / 12;
		yardas = pies / 3;
		
		System.out.println("La medida " + metros + " en metros son:");
		System.out.println(pulgadas + " pulgadas");
		System.out.println(pies + " pies");
		System.out.println(yardas + " yardas");
		

	}

}
