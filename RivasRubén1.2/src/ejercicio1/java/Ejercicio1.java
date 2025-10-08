/*
 * Descripción: Voy a hacer un programa el cuál solicite diferentes datos al usuario
 * Autor: Rubén
 * Fecha: 25/09/25
 */

package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);

		String nombre, apellidos, direccion;
		System.out.println("Dame tu nombre: ");
		nombre = datos.nextLine();
		System.out.println("Dame tus apellidos: ");
		apellidos = datos.nextLine();
		System.out.println("Dame tu dirección: ");
		direccion = datos.nextLine();
		
// Si hubiese puesto cualquier valor numérico antes de un carácter tendria que haber puesto datos.nextLine()
		
		int edad;
		System.out.println("Dame tu edad: ");
		edad = datos.nextInt();
		
		double altura, peso;
		System.out.println("Dame tu altura: ");
		altura = datos.nextDouble();
		System.out.println("Dame tu peso: ");
		peso = datos.nextDouble();
		
		System.out.println("Este es tu nombre: " + nombre);
		System.out.println("Este es tu apellido: " + apellidos);
		System.out.println("Esta es tu dirección: " + direccion);
		System.out.println("Esta es tu edad: " + edad);
		System.out.println("Esta es tu altura: " + altura);
		System.out.println("Esta es tu peso: " + peso);
		
		
	}

}
