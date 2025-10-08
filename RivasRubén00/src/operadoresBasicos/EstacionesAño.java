/*
 * Descripción: Programa para decir estaciones del año
 * Autor: Rubén
 * Fecha: 26/09/25
 */

package operadoresBasicos;

	enum Estaciones {
		INVIERNO, PRIMAVERA, VERANO, OTOÑO
	}

public class EstacionesAño {

	public static void main(String[] args) {
		
		Estaciones invierno = Estaciones.INVIERNO;
		Estaciones verano = Estaciones.VERANO;
		Estaciones primavera = Estaciones.PRIMAVERA;
		Estaciones otoño = Estaciones.OTOÑO;
		
		System.out.println("Esta es la estación: " + invierno);
		System.out.println("Esta es la estación: " + verano);
		System.out.println("Esta es la estación: " + primavera);
		System.out.println("Esta es la estación: " + otoño);
		  
		
	}

}
