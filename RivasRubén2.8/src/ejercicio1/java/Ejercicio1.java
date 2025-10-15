/*
 * Descripción: Programa de java que muestra los números del 1 al 100 con el while
 * Autor: Rubén Rivas
 * Fecha: 15/10/25
 */
package ejercicio1.java;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int inicio, fin;
		inicio = 1;
		fin = 100;
		
		int contador = inicio;
		
		while (contador <= fin) {
			System.out.print(contador + " ");
			contador++;
		}
		

	}

}
