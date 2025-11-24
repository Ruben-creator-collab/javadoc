/*
 * Descripcion: Programa que imprime un triángulo con el carácter y número de líneas indicadas
 * Autor: Ruben Rivas
 * Fecha: 24/11/2025
 */
package ejercicio14.java;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Que carácter deseas imprimir?: ");
		char caracter = sc.next().charAt(0);
		System.out.print("Cuántas líneas quieres imprimir?: ");
		int lineas = sc.nextInt();

		triangulo(caracter, lineas);
	}
	public static void triangulo(char a, int lineas) {
	    for (int fila = 1; fila <= lineas; fila++) {

	        // Imprime espacios
	        for (int espacio = 0; espacio < lineas - fila; espacio++) {
	            System.out.print(" ");
	        }

	        // Imprime caracteres (números impares 1, 3, 5...)
	        for (int car = 0; car < (fila * 2) - 1; car++) {
	            System.out.print(a);
	        }

	        System.out.println();
	    }
	}
}
