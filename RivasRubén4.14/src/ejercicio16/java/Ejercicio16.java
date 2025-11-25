/*
 * Descripción: Programa que crea un array de tamaño N y lo rellena con num randoms
 * Autor: Ruben Rivas
 * Fecha: 24/11/2025
 */
package ejercicio16.java;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime de que tamaño quieres el array: ");
		int tamanno = sc.nextInt();
		
		int [] array = rellenarArray(tamanno);
		for (int contador = 0; contador < array.length; contador++) {
			System.out.print(array[contador] + "\t");
		}
		
	}
	
	// Método para rellenar un array con valores aleatorios
	public static int[] rellenarArray(int tamanno) {
		int [] array = new int[tamanno];
		for (int contador = 0; contador < array.length; contador++) {
			array[contador] = (int) (Math.random() * 100);
		}
		return array;
	}

}
