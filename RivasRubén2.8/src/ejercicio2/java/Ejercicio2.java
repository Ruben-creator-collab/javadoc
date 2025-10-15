/*
 * Descripción: Programa de java que muestra los números del 1 al 100 con el do-while
 * Autor: Rubén Rivas
 * Fecha: 15/10/25
 */
package ejercicio2.java;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int inicio, fin;
		inicio = 1;
		fin = 100;
		
		int contador = inicio;
		
		do {
			System.out.print(contador + " ");
			contador++;
		} while(contador <= fin);
		

	}

}
