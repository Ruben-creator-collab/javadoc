/*
 * Descripción: Ejercicio en java que muestra los numeros pares entre el 1 y el 200 sumando de 1 en 1
 * Autor: Rubén Rivas
 * Fecha: 20/10/25
 */
package ejercicio3.java;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		
		for(int contador = 1; contador <= 200; contador++) {
			if(contador % 2 == 0) {
			System.out.print(contador + " ");
			}
		}

	}

}