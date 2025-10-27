/*
 * Descripción: Programa de java para pedir 10 números, la media de los positivos, la de los negativos y la cantidad de ceros
 * Autor: Rubén Rivas
 * Fecha: 15/10/25
 */
package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double mediaPos, mediaNeg;
		int  contadorPos, contadorNeg, ceros;
		contadorPos = 0;
		contadorNeg = 0;
		ceros = 0;
		mediaPos = 0;
		mediaNeg = 0;
		
		for(int contador = 0; contador < 10; contador++) {
			System.out.print("Dame un número ya sea negativo o positivo: ");
			int num = sc.nextInt();
			
			if (num > 0) {
				mediaPos = mediaPos + num;
				contadorPos++;
			} else if (num < 0) {
				mediaNeg = mediaNeg + num;
				contadorNeg++;
			} else {
				ceros++;
			}
		}
		
		mediaPos = mediaPos / contadorPos;
		mediaNeg = mediaNeg / contadorNeg;
		
		System.out.println("La media de los números positivos es: " + mediaPos);
		System.out.println("La media de los números negativos es: " + mediaNeg);
		System.out.println("El número de ceros puestos son: " + ceros);
		
		
		
		
	}

}
