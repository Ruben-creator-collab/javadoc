/*
 * Descripción: Programa de java el cuál muestra distintos cálculos de la función Math
 * Autor: Rubén Rivas
 * Fecha: 03/10/25
 */
package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		int num1;
		System.out.print("Dime el primer número entero: ");
		num1 = datos.nextInt();
		
		int num2;
		System.out.print("Dime el segundo número entero: ");
		num2 = datos.nextInt();
		
		int numeroMenor = Math.min(num1, num2);
		double raizCuadrada = Math.sqrt(num1);
		double numRandom = Math.random();
		double numElevado = Math.pow(num1, num2);
		
		System.out.println("El número menor es: " + numeroMenor);
		System.out.println("Tu primer número elevado al segundo es: " + numElevado);
		System.out.println("La raíz cuadrada del primer número es: " + raizCuadrada);
		System.out.println("El número random es: " + numRandom);
		
		
	}

}
