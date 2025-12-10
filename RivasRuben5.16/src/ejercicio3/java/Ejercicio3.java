package ejercicio3.java;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// apartado 1
		LocalTime inicio = LocalTime.of(8, 0);
		
		int hora = -1;
		int minutos = -1;
		boolean valido;
		
		// apartado 2
		// apartado 2.1
		do {
			valido = true;
			try {
				System.out.print("Dime una hora entre las 0 y 23: ");
				hora = sc.nextInt();
			} catch (IllegalArgumentException ex1) {
				System.out.println(ex1.getMessage());
				valido = false;
			} catch (java.util.InputMismatchException ex2) {
				System.out.println(ex2.getMessage());
				valido = false;
			}
		} while (hora < 0 || hora > 23);
		
		// apartado 2.2
		do {
			try {
				System.out.print("Dime los minutos entre 0 y 59: ");
				minutos = sc.nextInt();
			} catch (IllegalArgumentException ex1) {
				System.out.println(ex1.getMessage());
			} catch (java.util.InputMismatchException ex2) {
				System.out.println(ex2.getMessage());
			}
		} while (minutos < 0 || minutos > 59);
		
		// apartado 3
		LocalTime horaUsu = LocalTime.of(hora, minutos);
		
		LocalTime progFin = inicio.plusHours(2);
		LocalTime sistFin = progFin.plusHours(2);
		LocalTime entoFin = sistFin.plusHours(2);
		
		// apartado 4
		// apartado 4.1
//		ChronoUnit.MINUTES(horaUsu, inicio);
		
	}

}
