/*
 * Descripción: un programa de java el cuál utiliza la función Math de distintos tipos
 * Autor: Rubén Rivas
 * Fecha: 02/10/25
 */
package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		double a;
		System.out.print("Dame un número decimal: ");
		a = datos.nextDouble();
		
		double techo = Math.ceil(a);
		double suelo = Math.floor(a);
		long redondeo = Math.round(a); 
		
		System.out.println("----------------------");
		System.out.println("Número introducido: " + a);
        System.out.println("Math.ceil(" + a + ") = " + techo);
        System.out.println("Math.floor(" + a + ") = " + suelo);
        System.out.println("Math.round(" + a + ") = " + redondeo);
		
		
	}

}
