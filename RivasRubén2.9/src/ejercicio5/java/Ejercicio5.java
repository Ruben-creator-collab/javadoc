/*
 * Descripción: Ejercicio en java que haga el factorial de N
 * Autor: Rubén Rivas
 * Fecha: 20/10/25
 */
package ejercicio5.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime un número para hacer su factorial: ");
		int num = sc.nextInt();
		int contador = num;
		long factorial = 1;
		
		while(contador > 0) {
			factorial = factorial * (contador);	
			contador--;
			

		}
		System.out.print(num + "! = " + factorial);

	}

}
