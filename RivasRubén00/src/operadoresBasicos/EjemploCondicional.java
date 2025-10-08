/*
 * Descripción: cómo funciona el operador condicional
 * Autor: Rubén
 * Fecha: 26/09/25
 */
package operadoresBasicos;

import java.util.Scanner;

public class EjemploCondicional {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		String nombre;
		System.out.println("Dime tu nombre: ");
		nombre = datos.nextLine();
		int longitud = nombre.length();
		System.out.println("Número de carácteres" + longitud);
		
		String mayusculas;
		mayusculas = nombre.toUpperCase();
		System.out.println("Este es tu nombre en mayúsculas: " + mayusculas);
		
		String minusculas;
		minusculas = nombre.toLowerCase();
		System.out.println("Este es tu nombre en minusculas: " + minusculas);
		
		boolean esPepe;ç
		nombre = nombre.toLowerCase();
		esPepe = nombre.equals("pepe");
		System.out.prinln(esPepe);
		
/*		
		int edad;
		System.out.println("Dime tu edad: ");
		edad = datos.nextInt();
		
		
		String mayorEdad;
		mayorEdad = (edad > 18) ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(mayorEdad);

		
		
		
	*/	

	}

}
