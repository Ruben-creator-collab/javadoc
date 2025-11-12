/*
 * Programa de java que crea un array y hace una secuencia de gauss
 * Autor: Rubén Rivas
 * Fecha: 12/11/25
 */
package ejercicio14.java;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int [] array = new int [55];
		int numAcumulador = 1;
		int i = 0;
		
		for (int contador = 0; contador < array.length; contador++) {
			array[contador] = numAcumulador;
			i++;
			if (numAcumulador == i) {
				i = 0;
				numAcumulador++;
			}
		}
		for (int contador = 0; contador < array.length; contador++) {
			System.out.print(array[contador] + "\t");
		}
	}

}
