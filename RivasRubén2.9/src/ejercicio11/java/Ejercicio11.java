/*
 * Descripción: Ejercicio en java que suma pares e impares entre 100 a 200
 * Autor: Rubén Rivas
 * Fecha: 20/10/25
 */
package ejercicio11.java;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int numPar = 0, numImpar = 0;
		
		for (int contador = 100;  contador <= 200; contador++) {
			if (contador % 2 == 0) {
				numPar = numPar + contador;
			} else if (contador % 1 == 0) {
				numImpar = numImpar + contador;
			}
		}
		System.out.println("Estas son las sumas de los números pares: " + numPar + " y de los impares: " + numImpar);
		
	}

}
