package ejercicio3.java;

import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anno = 0;

		do {
			try {
				System.out.print("Dime un año entre el 1900 y 2100: ");
				anno = sc.nextInt();
			} catch (java.util.InputMismatchException ex1) {
				System.out.println("Formato incorrecto");
			}
			sc.nextLine();
		} while (anno < 1900 || anno > 2100);

		System.out.println("\n Año elegido: " + anno);
		System.out.println("----------------------------");

		int totalDomingos = 0;

		for (int mes = 1; mes <= 12; mes++) {
			int domingoMes = 0;
			
			int diasMes = LocalDate.of(anno,mes,1).lengthOfMonth();
			
			for (int dia = 1; dia <= diasMes; dia++) {
				
				LocalDate fecha = LocalDate.of(anno,mes,dia);
				

                if (fecha.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    domingoMes++;
                    totalDomingos++;
                }
				
			}
			
			System.out.println("Mes " + mes + " Domingos: " + domingoMes);
			
		}
		
		System.out.println("Total de domingos del año " + anno + " = " + totalDomingos);

	}

}
