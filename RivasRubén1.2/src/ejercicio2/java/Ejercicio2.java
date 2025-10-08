/*
 * Descripción: Voy a hacer un programa el cuál pide datos relativos a un equipo de fútbol
 * Autor: Rubén
 * Fecha: 25/09/25
 */
package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		String nombreEquipo;
		System.out.println("Dime el nombre de tu equipo: ");
		nombreEquipo = datos.nextLine();
		
		int añoFundacion;
		System.out.println("Dime el año de fundación de tu equipo: ");
		añoFundacion = datos.nextInt();
		
		datos.nextLine();
		String nombreEstadio, nombreCapitan;
		System.out.println("Dime el nombre del estadio: ");
		nombreEstadio = datos.nextLine();
		System.out.println("Dime el nombre del capitán: ");
		nombreCapitan = datos.nextLine();
		
		System.out.println("Nombre del Equipo: " + nombreEquipo);
		System.out.println("Fundado en: " + añoFundacion);
		System.out.println("Estadio: " + nombreEstadio);
		System.out.println("Capitán: " + nombreCapitan);
		

	}

}
