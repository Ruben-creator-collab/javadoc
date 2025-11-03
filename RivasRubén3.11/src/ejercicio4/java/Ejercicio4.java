package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] notaAlumnos = new int [4][5];
		
		for (int alumnos = 0; alumnos < notaAlumnos.length; alumnos++) {
			for (int asignatura = 0; asignatura < notaAlumnos[alumnos].length; asignatura++) {
				System.out.print("Dime la nota del alumno " + (alumnos + 1) + " en la asignatura " + (asignatura + 1) + " :");
				notaAlumnos [alumnos][asignatura] = sc.nextInt();
			}
		}
		for (int alumnos = 0; alumnos < notaAlumnos.length; alumnos++) {
			int notaMin = 10, notaMax = 0, suma = 0;
			
			for (int asignatura = 0; asignatura < notaAlumnos.length; asignatura++) {
				int nota = notaAlumnos[alumnos][asignatura];
				
				if (nota < notaMin) {
					notaMin = nota;
				}
				if (nota > notaMax) {
					notaMax = nota;
				}
				suma = suma + nota;
			}
			double media = (double) suma / notaAlumnos[alumnos].length;
			
		    System.out.println("Alumno " + (alumnos + 1) + ":");
		    System.out.println("  Nota mínima: " + notaMin);
		    System.out.println("  Nota máxima: " + notaMax);
		    System.out.println("  Nota media: " + media);
		    System.out.println("----------------------");
		}
		

	}
}
