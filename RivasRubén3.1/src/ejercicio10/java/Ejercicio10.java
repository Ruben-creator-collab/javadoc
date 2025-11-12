/*
 * Descripción: programa para realizar calculos con la altura en metros
 * Autor: Rubén Rivas Flores
 * Fecha: 23/10/25
 */
package ejercicio10.java;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un numero de personas: ");
		int N = sc.nextInt();
		
		double altMedia, altMax, altMin, suma = 0;
		
		double [] array = new double [N];
		
		for (int contador = 0; contador < array.length; contador++) {
			System.out.print("Dime " + N + " alturas: ");
			array[contador] = sc.nextDouble();
			suma = suma + array[contador];
		}
		altMedia = suma / N;
		
		
		altMax = array[0];
		altMin = array[0];
		
		for (int contador = 0; contador < array.length; contador++) {
			if (altMax < array[contador]) {
				altMax = array[contador];
			}
			if (altMin > array[contador]) {
				altMin = array[contador];
			}
		}
		
		int encima = 0, debajo = 0;
		for(int contador = 0; contador < array.length; contador++) {
			if(array[contador] > altMedia) {
				encima++;
			} else if (array[contador] < altMedia) {
				debajo++;
			}
		}
		
        System.out.println("Altura media: " + altMedia);
        System.out.println("Altura máxima: " + altMax);
        System.out.println("Altura mínima: " + altMin);
        System.out.println("Personas por encima de la media: " + encima);
        System.out.println("Personas por debajo de la media: " + debajo);
        
	}
}


