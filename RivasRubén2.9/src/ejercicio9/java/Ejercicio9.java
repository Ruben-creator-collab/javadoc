/*
 * Descripción: programa que multiplica y suma los 10 primeros numeros naturales
 * Autor: Rubén Rivas
 * Fecha: 27/10/25
 */
package ejercicio9.java;

public class Ejercicio9  {

	public static void main(String[] args) {
		final int TOTAL_NUMEROS = 10;
		
		int suma = 0, multiplicacion = 1;
		
		for (int contador = 1; contador <= TOTAL_NUMEROS; contador++) {
			suma = suma + contador;
			multiplicacion = multiplicacion * contador;
		}
		System.out.println("Esta es la suma de de los primeros 10 números naturales " + suma);
		System.out.println("Esta es la multiplicación de los primeros 10 números naturales " + multiplicacion);
	 }
}
