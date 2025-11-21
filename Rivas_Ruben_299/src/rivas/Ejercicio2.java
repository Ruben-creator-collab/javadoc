/*
 * Descripción: Programa que genera 40 número aleatorios, enseña la media de las posiciones pares e impares que esten por debajo
 * Autor: Rubén Rivas
 * Fecha: 12/11/25
 */
package rivas;

public class Ejercicio2 {

	public static void main(String[] args) {
		int i = 0;
		int suma = 0;
		int media = 0;
		int [] numRandom = new int [40];
		
		// bucle para añadir valores
		for (int contador = 0; contador < numRandom.length; contador++) {
			numRandom[contador] = (int) (Math.random()*50);
		}
		// bucle para enseñar los valores en filas de 20
		for (int contador = 0; contador < numRandom.length; contador++) {
			System.out.print(numRandom[contador] + "\t");
			i++;
			if (i == 20) {
				System.out.println();
				i = 0;
			}
		}
		// bucle para guardar los números de las posiciones pares
		for (int contador = 0; contador < numRandom.length; contador++) {
			if (numRandom[contador] % 2 == 0) {
				suma = suma + numRandom[contador];
			}
		}
		media = suma / 20; // Hacemos la media de los numeros en posiciones pares dividiendo entre 20 ya que es la mitad de 40
		System.out.println("Media aritmética de los valores en posiciones pares: " + media);
		
		System.out.println();
		
		//bucle para enseñar los valores de las posiciones impares y debajo de la media
		for (int contador = 0; contador < numRandom.length; contador++) {
			if (numRandom[contador] % 1 == 0 && numRandom[contador] < media) {
				System.out.println("Los valores de las posiciones impares por debajo de la media: " + numRandom[contador]);
			}
		}
	}
}
