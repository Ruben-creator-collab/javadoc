/*
 * Descripción: Programa de java que muestra los números del 100 al 1 con el do-while
 * Autor: Rubén Rivas
 * Fecha: 15/10/25
 */
package ejercicio3.java;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int inicio, fin;
		inicio = 1;
		fin = 100;
		
		int contador = fin;
		
		do {
			System.out.print(contador + " ");
			contador--;
		} while(contador >= inicio);
		

	}

}
