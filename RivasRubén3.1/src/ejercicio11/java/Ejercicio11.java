/*
 * Descripción: Programa en java que crea dos array de tamaño 100 contando del 1 al 100 e invierte el segundo
 * Autor: Rubén Rivas
 * Fecha: 12/11/25
 */
package ejercicio11.java;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int acumulador = 1;
		int [] array1 = new int [100];
		int [] array2 = new int [100];
		
		for (int contador = 0; contador < array1.length; contador++) {
			array1[contador] = acumulador++;
		}
		
		for (int contador = 0; contador < array1.length; contador++) {
			array2[contador] = array1[array1.length - 1 - contador];
		}
		for (int contador = 0; contador < array1.length; contador++) {
			System.out.print(array1[contador] + "\t");
			System.out.println(array2[contador] + "\t");
		}
	}

}
