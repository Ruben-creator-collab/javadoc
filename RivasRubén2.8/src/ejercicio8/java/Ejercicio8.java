/*
 * Descripción: Programa de java el cuál pide 5 rutas al usuario, hace la media, dice la distancia más larga y la ciudad con la ruta más larga
 * Autor: Rubén Rivas
 * Fecha: 16/10/25
 */
package ejercicio8.java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Dime tus apellidos: ");
		String apellidos = sc.nextLine();
		
		int edad;
		
		do {
		System.out.print("Dime tu edad: ");
		edad = sc.nextInt();
		
		if (edad > 17 && edad < 45) {
			
		} else {
			System.out.println("Esa edad no es correcta");
		}
		
		} while (edad <= 17 || edad >= 45);
		
		System.out.print("Dime el número de rutas realizadas: ");
		int rutas = sc.nextInt();
		
		System.out.print("Dime la distancia de la última ruta: ");
		double distanciaUltimaRuta = sc.nextDouble();
		

		
		double distanciaRuta = 0;
		int numParticipantes;
		String ciudad;
		double distanciaMayor = 0;
		String ciudadMayor = "";
		double sumaDistancia = 0;
		
		System.out.println("Introduzca los siguientes datos de una serie de 5 caminatas");
		
		for (int contador = 0; contador < 5; contador++) {
			System.out.print("Dime la distancia: ");
			distanciaRuta = sc.nextDouble();
			sumaDistancia = sumaDistancia + distanciaRuta;
			System.out.print("Dime el número de participantes: ");
			numParticipantes = sc.nextInt();
			sc.nextLine();
			System.out.print("Dime la ciudad: ");
			ciudad = sc.nextLine();
			if (distanciaRuta > distanciaMayor) {
				distanciaMayor = distanciaRuta;
				ciudadMayor = ciudad;
			}
		}
		
		double mediaDistancia;
		mediaDistancia = sumaDistancia / 5;
		
		
		
		System.out.println("----------------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Número de rutas realizadas: " + rutas);
		System.out.println(" ");
		System.out.println("Distancia media (5 últimas rutas): " + mediaDistancia);
		System.out.println("Distancia más larga de las últimas 5 rutas: " + distanciaMayor);
		System.out.println("Ciudad de la ruta más larga: " + ciudadMayor);
		
	}

}
