package ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		HashSet<Persona> personas = new HashSet<>();

		HashMap<String, Alumno> alumnos = new HashMap();

		ArrayList<Double> notas = new ArrayList();

		String opcion = "";

		do {

			System.out.println("1) Añadir alumno");
			System.out.println("2) Añadir profesor");
			System.out.println("3) Añadir nota a un alumno");
			System.out.println("4) Mostrar todas las personas");
			System.out.println("5) Mostrar alumnos aprobados");
			System.out.println("6) Mostrar profesor con mayor salario");
			System.out.println("7) Mostrar media de notas de un alumno");
			System.out.println("8) Salir");
			opcion = datos.nextLine();

			if (opcion.equalsIgnoreCase("1")) {

				System.out.println("Dime el dni del alumno: ");
				String dni = datos.nextLine();
				System.out.println("Dime el nombre del alumno: ");
				String nombre = datos.nextLine();
				System.out.println("Dime la edad del alumno: ");
				int edad = datos.nextInt();
				datos.nextLine();
				System.out.println("Dime el curso del alumno: ");
				String curso = datos.nextLine();

				Alumno alumno = new Alumno(dni, nombre, edad, curso, notas);

				if (personas.add(alumno)) {

					alumnos.put(dni, alumno);
					System.out.println("Alumno añadido");
					System.out.println("");

				} else {

					System.out.println("Error: DNI duplicado");

				}

			} else if (opcion.equalsIgnoreCase("2")) {

				System.out.println("Dime el dni del profesor: ");
				String dni = datos.nextLine();
				System.out.println("Dime el nombre del profesor: ");
				String nombre = datos.nextLine();
				System.out.println("Dime la edad del profesor: ");
				int edad = datos.nextInt();
				datos.nextLine();
				System.out.println("Dime la especialidad del profesor: ");
				String espe = datos.nextLine();
				System.out.println("Dime el salario del profesor: ");
				double salario = datos.nextDouble();
				datos.nextLine();

				Profesor profesor = new Profesor(dni, nombre, edad, espe, salario);

				if (personas.add(profesor)) {

					System.out.println("Profesor añadido");
					System.out.println("");

				}

			} else if (opcion.equalsIgnoreCase("3")) {

				System.out.println("Dime el dni del alumno: ");
				String dni = datos.nextLine();

				Alumno alumno = alumnos.get(dni);

				if (alumno != null) {

					System.out.println("Dime la nota que quieres añadir: ");
					double nota = datos.nextDouble();
					datos.nextLine();

					notas.add(nota);

				} else {

					System.out.println("No existe ese alumno");
					datos.nextLine();

				}

			} else if (opcion.equalsIgnoreCase("4")) {
				
				for (Persona i: personas) {
					
					System.out.println(i.toString());
					
				}
				
			}

		} while (!opcion.equalsIgnoreCase("8"));

	}

}
