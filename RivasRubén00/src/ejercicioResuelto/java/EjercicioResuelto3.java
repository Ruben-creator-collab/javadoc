package ejercicioResuelto.java;

import java.util.Scanner;

public class EjercicioResuelto3 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		double metros;
		System.out.println("Introduzca la longitud en metros que desea transformar: ");
		metros = datos.nextDouble();
		
		System.out.println("Resultado");
	
		System.out.println("SISTEMA INTERNACIONAL");
		
		System.out.println("La medida " + metros + " en metros son:");

		double decimetros, centimetros, milimetros;
		decimetros = metros * 10;
		centimetros = metros * 100;
		milimetros = metros * 1000;
		
		
		

	}

}
