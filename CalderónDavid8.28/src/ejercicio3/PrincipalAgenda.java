/*Descripción: Implemento un LinkedHashSet para hacer este ejercicio de agenda
 * Autor:David Calderón Navarro
 * Fecha:19/03/2026
 */


package ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import ejercicio2.Agenda;
import ejercicio2.ComparadorAgenda;

public class PrincipalAgenda {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		LinkedHashSet<Agenda> agenda = new LinkedHashSet<Agenda>();

		Random num = new Random();
		boolean repetido = false;

		int cantidad = num.nextInt(11) + 20;

		for (int i = 0; i < cantidad; i++) {

			String Nombre = "Contacto" + (i + 1);
			int telefono = num.nextInt(300000000) + 600000000;
			String email = "email" + (i + 1) + "@gmail.com";
			LocalDate fecha_nacimiento = LocalDate.of(num.nextInt(125) + 1900, (int) (Math.random() * 12) + 1,
					(int) (Math.random() * 28) + 1);

			agenda.add(new Agenda(Nombre, telefono, email, fecha_nacimiento));

		}

		List<Agenda> listaOrdenada = new ArrayList<>(agenda);

		String eleccion;

		do {

			System.out.println("");
			System.out.println("a) ingresar contacto");
			System.out.println("b) consultar un nombre y mostrar todos sus datos");
			System.out.println("c) mostrar todos los datos de los contactos ordenados por nombre");
			System.out.println("d) dada una fecha mostrar aquellos contactos que hayan nacido en ese año");
			System.out.println("e) salir");
			System.out.println("");
			System.out.println("Elige una opcion: ");
			eleccion = datos.next();

			if (eleccion.equals("a")) {

				System.out.println("Dime el nombre: ");
				String nombre = datos.next();
				System.out.println("Dime el telefono");
				int telefono = datos.nextInt();

				for (Agenda i : agenda) {

					if (i.getTelf() == telefono) {

						System.out.println("Telefono repetido");
						repetido = true;
					}

				}

				if (!repetido) {

					System.out.println("Dime tu email");
					String email = datos.next();
					System.out.println("Dime tu fecha de nacimiento");
					System.out.println("Año: ");
					int year = datos.nextInt();

					System.out.println("Mes: ");
					int month = datos.nextInt();

					System.out.println("Día: ");
					int day = datos.nextInt();

					LocalDate fechaNacimiento = LocalDate.of(year, month, day);

					agenda.add(new Agenda(nombre, telefono, email, fechaNacimiento));
					System.out.println("Contacto añadido!!");

				}

			} else if (eleccion.equals("b")) {

				System.out.println("Dime el nombre: ");
				String nombre = datos.next();

				for (Agenda i : agenda) {

					if (i.getNombre().equalsIgnoreCase(nombre)) {

						System.out.println("Nombre: " + i.getNombre());
						System.out.println("Telefono: " + i.getTelf());
						System.out.println("Email: " + i.getEmail());
						System.out.println("Fecha de nacimiento: " + i.getFechaNacimiento());

					}

				}

			} else if (eleccion.equals("c")) {

				Collections.sort(listaOrdenada, new ComparatorAgenda2());

				for (Agenda i : listaOrdenada) {
					System.out.println(i.getNombre());
				}

			} else if (eleccion.equals("d")) {

				System.out.println("Dime la fecha de nacimiento");
				System.out.println("Año: ");
				int year = datos.nextInt();

				System.out.println("Mes: ");
				int month = datos.nextInt();

				System.out.println("Día: ");
				int day = datos.nextInt();

				LocalDate fechaNacimiento = LocalDate.of(year, month, day);

				for (Agenda i : agenda) {

					if (i.getFechaNacimiento().equals(fechaNacimiento)) {

						System.out.println(i.getNombre() + " tiene la misma fecha de nacimiento");

					}

				}

			}

		} while (!eleccion.equalsIgnoreCase("e"));

	}

}
