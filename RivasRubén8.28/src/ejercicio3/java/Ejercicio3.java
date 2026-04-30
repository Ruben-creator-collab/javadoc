package ejercicio3.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import agenda.Agenda;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashSet<Agenda> agenda = new LinkedHashSet<>();
		
        generarContactos(agenda);
		
		char opcion;
		
		do {
			System.out.println("\n--- MENÚ ---");
			System.out.println("a) Insertar contacto");
			System.out.println("b) Buscar por nombre");
			System.out.println("c) Mostrar ordenados por nombre");
			System.out.println("d) Buscar por año nacimiento");
			System.out.println("e) Salir");
			System.out.println("--------------");
			System.out.print("Escribe tu opción aqui: ");

			opcion = sc.next().charAt(0);
			sc.nextLine();

			switch (opcion) {
			case 'a':
				insertarContacto(agenda, sc);
				break;
			case 'b':
				buscarNombre(agenda, sc);
				break;
			case 'c':
				mostrarOrdenados(agenda);
				break;
			case 'd':
				buscarPorAnno(agenda, sc);
				break;
			case 'e':
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 0);

	}

	// metodo para generar contactos aleatorios
	public static void generarContactos(LinkedHashSet<Agenda> agenda) {
		Random r = new Random();
		int cantidad = r.nextInt(11) + 20;

		for (int i = 0; i < cantidad; i++) {
			String nombre = "Contacto" + i;
			String telefono = "6" + (int) (Math.random() * 100000000);
			String email = nombre + "@gmail.com";
			LocalDate fechaNac = LocalDate.of((int) (Math.random() * 108) + 1900, (int) (Math.random() * 12) + 1,
					(int) (Math.random() * 28) + 3);

			agenda.add(new Agenda(nombre, telefono, email, fechaNac));
		}
	}

	// metodo para insertar contactos
	public static void insertarContacto(LinkedHashSet<Agenda> agenda, Scanner sc) {
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Teléfono: ");
		String telefono = sc.nextLine();

		for (Agenda a : agenda) {
			if (a.getTelefono().equals(telefono)) {
				System.out.println("Ese teléfono ya existe");
				return;
			}
		}

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Año de nacimiento: ");
		int annoNac = sc.nextInt();
		System.out.print("Mes de nacimiento: ");
		int mes = sc.nextInt();
		System.out.print("Dia de nacimiento: ");
		int dia = sc.nextInt();

		LocalDate fechaNac = LocalDate.of(annoNac, mes, dia);

		agenda.add(new Agenda(nombre, telefono, email, fechaNac));
	}

	// metodo para buscar por nombre de contacto
	public static void buscarNombre(LinkedHashSet<Agenda> agenda, Scanner sc) {
		System.out.print("Nombre del contacto: ");
		String nombre = sc.nextLine();

		for (Agenda a : agenda) {
			if (a.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(a);
			}
		}
	}
	
	// metodo para ordenar
	private static void mostrarOrdenados(LinkedHashSet<Agenda> agenda) {
		ArrayList<Agenda> lista = new ArrayList<>(agenda);
		
		Collections.sort(lista, Comparator.comparing(Agenda::getNombre));
		
		for (Agenda a: lista) {
			System.out.println(a);
		}
	}
	
	// metodo para buscar por año
	private static void buscarPorAnno(LinkedHashSet<Agenda> agenda, Scanner sc) {
		System.out.print("Año para buscar: ");
		int anno = sc.nextInt();
		sc.nextLine();
		
		for (Agenda a: agenda) {
			if (a.getFechaNac().getYear() == anno) {
				System.out.println(a);
			}
		}
	}
}
