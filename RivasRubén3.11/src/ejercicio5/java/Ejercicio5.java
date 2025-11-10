/*
 * Descripción: Ejercicio en java que registra sueldos de hombres y mujeres y hace la media de cada género
 * Autor: Rubén Rivas
 * Fecha: 30/10/25
 */
package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sumaHombres = 0, sumaMujeres = 0, contHombres = 0, contMujeres = 0, mediaHombres, mediaMujeres;
		
		System.out.print("dime cuantas personas hay en tu empresa: ");
		int N = sc.nextInt();
		int [][] sueldos = new int [N] [2];
		
		for (int i = 0; i < sueldos.length; i++) {
		    System.out.print("Dime el género (0 = hombre, 1 = mujer): ");
		    sueldos[i][0] = sc.nextInt();

		    System.out.print("Dime el sueldo: ");
		    sueldos[i][1] = sc.nextInt();
		}
		for (int i = 0; i < sueldos.length; i++) {
			if (sueldos[i][0] == 0) {
				sumaHombres = sumaHombres + sueldos[i][1];
				contHombres++;
			} else {
				sumaMujeres = sumaMujeres + sueldos[i][1];
				contMujeres++;
			}
		}
		mediaHombres = sumaHombres / contHombres;
		mediaMujeres = sumaMujeres / contMujeres;
		
		System.out.println("El sueldo medio de los hombres sería: " + mediaHombres);
		System.out.println("El sueldo medio de las mujeres sería: " + mediaMujeres);
	}

}
