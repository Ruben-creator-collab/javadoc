/*
 * Descripción: Programa que calcula la calificación de un examen a partir de las preguntas acertadas, falladas y no contestadas
 */
package ejercicioPropuestoExamen.java;

import java.util.Scanner;

public class EjercicioPropuestoExamen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int PREGUNTAS_TOTALES = 20;
		
		System.out.print("Dime el número de preguntas acertadas: ");
		int preguntasAcertadas = sc.nextInt();
		
		System.out.print("Dime el número de preguntas falladas: ");
		int preguntasFalladas = sc.nextInt();
		
		if (preguntasAcertadas + preguntasFalladas > PREGUNTAS_TOTALES) {
			System.out.println("Datos erróneos");
		} else {
			
			double nota = ((preguntasAcertadas - (preguntasFalladas * 0.5)) / PREGUNTAS_TOTALES) * 10;
			
			
			if (nota < 5) {
				System.out.println("Insuficiente: " + nota);
			} else if (nota < 6) {
				System.out.println("Suficiente: " + nota);
			} else if (nota < 7) {
				System.out.println("Bien: " + nota);
			} else if (nota < 9) {
				System.out.println("Notable: " + nota);
			} else {
				System.out.println("Sobresaliente: " + nota);
			}
			
		}
		
	}
}
