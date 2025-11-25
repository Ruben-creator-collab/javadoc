/*
 * Descripción: Programa que crea array y hace su suma y media
 * Autor: Ruben Rivas
 * Fecha: 24/11/2025
 */
package ejercicio15.java;

public class Ejercicio15 {

	public static void main(String[] args) {
		int [] array = crearArray();
		
		System.out.println("La suma total del array es: " + sumaTotal(array));
		System.out.println("La media del array es: " + mediaArray(array));
		
		}
	
	// Método para crear un array de tamaño 50 con los números naturas entre 50 y 99
	public static int[] crearArray() {
		int[] array = new int[50];
		for (int contador = 0; contador < array.length; contador++) {
			array[contador] = (int) (Math.random() * 50) + 50;
		}
		return array;
	}
	
	// Método para calcular la suma total del array
	public static int sumaTotal(int[] array) {
		int suma = 0;
		for (int contador = 0; contador < array.length; contador++) {
			suma = suma + array[contador];
		}
		return suma;
	}
	
	// Método para calcular la media del array
	public static double mediaArray(int[] array) {
		double media;
		media = (double) sumaTotal(array) / array.length;
		return media;
	}
}
