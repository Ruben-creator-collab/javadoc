/*
 * Descripción: Programa en java el cuál dice quien esta admitido y quién no en el curso siguiendo unos requisitos
 * Autor: Rubén Rivas
 * Fecha: 06/10/25
 */
package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Dime tu edad: ");
		int edad = sc.nextInt();
		
		System.out.print("Dime tu nota académica: ");
		double nota = sc.nextDouble();
		
		if (edad > 18 && nota > 7) {
			System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas.");
		}
		else {
			System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos.");
		}
		
		
	}

}
