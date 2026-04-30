package ejercicio2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class PrincipalEvento {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		LinkedList<Evento> agenda = new LinkedList<>();

		String opcion = "";

		do {

			System.out.println("a) Añadir evento");
			System.out.println("b) Buscar evento por nombre");
			System.out.println("c) Mostrar todos los eventos ordenados por fecha");
			System.out.println("d) Mostrar eventos con más numero de asistentes");
			System.out.println("e) Salir");
			opcion = datos.next();

			if (opcion.equalsIgnoreCase("a")) {

				datos.nextLine();
				boolean correcta = false;

				System.out.println("Dime el nombre del evento: ");
				String nombre = datos.nextLine();
				System.out.println("Dime el lugar del evento: ");
				String lugar = datos.nextLine();
				LocalDate fecha = null;

				while (!correcta) {

					try {

						System.out.println("Dime la fecha del evento");
						System.out.println("Año: ");
						int anyo = datos.nextInt();
						System.out.println("Mes: ");
						int mes = datos.nextInt();
						System.out.println("Dia: ");
						int dia = datos.nextInt();

						fecha = LocalDate.of(anyo, mes, dia);
						correcta = true;

					} catch (InputMismatchException e) {

						System.out.println("Error: debes introducir números");
						datos.nextLine();

					} catch (DateTimeException e) {

						System.out.println("Error: fecha no válida");

					}
				}

				System.out.println("Dime el numero de asistentes: ");
				int num = datos.nextInt();

				Evento evento = new Evento(nombre, lugar, fecha, num);

				agenda.add(evento);

			} else if (opcion.equalsIgnoreCase("b")) {

				System.out.println("Dime el nombre del evento: ");
				String nombre = datos.next();

				for (Evento i : agenda) {

					if (i.getNombre().equalsIgnoreCase(nombre)) {

						System.out.println(i.toString());
						System.out.println("");

					}

				}

			} else if (opcion.equalsIgnoreCase("c")) {

				Collections.sort(agenda, new ComparadorEvento());

				for (Evento i : agenda) {

					System.out.println(i.toString());

				}

				System.out.println("");

			} else if (opcion.equalsIgnoreCase("d")) {

				System.out.println("Dime el numero de asistentes minimos: ");
				int minimos = datos.nextInt();

				for (Evento i : agenda) {

					if (i.getNumAsistentes() >= minimos) {

						System.out.println(i.toString());

					}

				}
				
				System.out.println("");

			}

		} while (!opcion.equalsIgnoreCase("e"));

	}

}
