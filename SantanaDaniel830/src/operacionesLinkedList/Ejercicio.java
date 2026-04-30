/*
 * Autor: Daniel Santana Bueno
 * Descripción: Realización de operaciones con listas LinkedList
 * Fecha: 23/04/2026
 */
package operacionesLinkedList;

import java.io.File;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import operacionesArraylist.Alumno;

public class Ejercicio {

	public static void main(String[] args) {
		// 1. Importa los registros contenidos en el documento notas1.txt, donde la
		// información tiene el
		// iguiente formato:
		// grupo;nombre,matemáticas;lengua;física;química;inglés

		LinkedList<Alumno> lista = new LinkedList<>();
		lista = importarDeArchivo("notas1.txt");

		System.out.println("1. Añadiendo registros de notas1.txt a la lista");

		// 2. Muestra el número de registros que contiene.
		System.out.println("2. Número de registros añadidos a la lista: " + lista.size());

		// 3. Ordena los registros por grupo y nombre
		System.out.println("3. Ordenando lista por grupo y nombre");
		Collections.sort(lista);

		// 4. Añade el registro abajo indicado en la mitad de la lista.
		// 1º ESO A;Plaza Gallego, Juan;1;1;3;1;1
		Alumno alumnoPrueba = new Alumno("1º ESO A ", "Plaza Gallego ,Juan ", 1, 1, 3, 1, 1);

		System.out.println("Añadimos un registro en mitad de la lista...");

		int mitad = lista.size() / 2;
		try {
			lista.add(mitad, alumnoPrueba);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error : " + e.getMessage());
		}

		System.out.println("Posicion del nuevo registro: " + lista.indexOf(alumnoPrueba));

		// 5. Añade el mismo registro al principio de la lista
		lista.addFirst(alumnoPrueba);
		System.out.println("5. Añadiendo el registro...");
		System.out.println("Numero de registros: " + lista.size());
		System.out.println("Posicion del nuevo registro: " + lista.indexOf(alumnoPrueba));

		// 6. Importa los registros contenidos en el documento notas2.txt en una lista
		// auxiliar.
		LinkedList<Alumno> listaAux = new LinkedList<>();
		listaAux = importarDeArchivo("notas2.txt");
		System.out.println("6. Añadiendo registros de notas2.txt a la lista mediante una lista " + "auxiliar...");
		System.out.println("Total registros antes de añadir: " + lista.size());
		System.out.println("Total de registrs de la lista auxiliar: " + listaAux.size());

		// 7. Añade la lista auxiliar al principio de la lista original
		lista.addAll(0, listaAux);
		System.out.println("7. añade la lista auxiliar al principio de la lista original.");
		System.out.println("Total de registros despues de añadir: " + lista.size());

		// 8.Muestra el registro que está en la primera posición de la lista.
		System.out.println("8.Muestra el registro que está en la primera posición de la lista...");
		System.out.println(lista.getFirst());

		// 9. Muestra el registro que está en la última posición posición de la lista
		System.out.println("9. Muestra el registro que está en la última posición de la lista...");
		System.out.println(lista.getLast());

		// 10. Muestra el registro que está en la mitad de la lista...
		System.out.println("10.Muestra el registro que está en la mitad de la lista...");
		mitad = lista.size() / 2;
		System.out.println(mitad);

		System.out.println(lista.get(mitad));

		// 11. ¿Qué posición ocupa la primera ocurrencia del registro insertado?
		System.out.println("11. ¿Qué posición ocupa la primera ocurrencia del registro insertado?");
		System.out.println(lista.indexOf(alumnoPrueba));

		// 12. Qué posición ocupa la última ocurrencia del registro insertado
		System.out.println("Qué posición ocupa la última ocurrencia del registro insertado");
		System.out.println(lista.lastIndexOf(alumnoPrueba));

		// 13. ¿El siguiente registro está en la lista? 1º ESO E;Postigo Vázquez,
		// Salvador;3;6;5;3;4
		System.out.println(" ¿El siguiente registro está en la lista? 1º ESO E;Postigo Vázquez, Salvador;3;6;5;3;4");
		verificarRegistro(lista, "Postigo Vázquez, Salvador");

		// 14 ¿Y éste? 1º ESO A;García Fernández, María;6;5;6;5;5
		System.out.println("14. ¿Y éste? 1º ESO A;García Fernández, María;6;5;6;5;5");
		verificarRegistro(lista, "García Fernández, María");
		// 15 Elimina la primera ocurrencia del registro insertado y muestra su posición
		// y contenido.
		System.out.println("Elimina la primera ocurrencia del registro insertado y muestra su posición y contenido...");
		System.out.println(
				"Primera ocurriencia: " + " Posicion: " + lista.indexOf(alumnoPrueba) + " Registro: " + alumnoPrueba);
		lista.removeFirstOccurrence(alumnoPrueba);

		// 16 Elimina el registro que ocupa la posición media de la lista mostrando su
		// contenido.
		mitad = lista.size() / 2;
		System.out.println("Registro en la mitad del grupo: " + lista.get(mitad));
		System.out.println("Borramos el registro..");
		lista.remove(mitad);
		System.out.println("Nuevo registro a en la posicion: " + lista.get(mitad));

		// 17 Elimina el registro cuyo nombre es: Carrillo Segura, Féliz, indicando su
		// posición y contenido.
		System.out.println(
				"17 Elimina el registro cuyo nombre es: Carrillo Segura, Féliz, indicando su posición y contenido.");
		try {
			borrarRegistro(lista, "Carrillo Segura, Félix");
		} catch (ConcurrentModificationException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		// 18 Elimina el registro cuyo nombre: Robles Ortiz, Rafael, indicando su
		// posición y contenido.
		System.out.println(
				"18 Elimina el registro cuyo nombre: Robles Ortiz, Rafael, indicando su posición y contenido.");
		try {
			borrarRegistro(lista, "Robles Ortiz, Rafael");
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		// 19 Intenta simular una pila con la lista original. Realiza dos inserciones y
		// etracciones detallando
		// su funcionamiento
		System.out.println("\n19. Simulacion de una pila");
		Alumno a1 = new Alumno("1º ESO A", "Daniel", 7, 7, 7, 7, 7);
		Alumno a2 = new Alumno("2º ESO B", "Fernando", 8, 8, 8, 8, 8);

		System.out.println("\nInserción 1:");
		lista.push(a1);
		System.out.println("Registro añadido: " + a1 + "\n");
		System.out.println("Inserción 2:");
		lista.push(a2);
		System.out.println("Registro Añadido: " + a2 + "\n");

		System.out.println(lista.peek());

		System.out.println("\nExtracción 1:");
		Alumno ex1 = lista.pop();
		System.out.println("Registro extraido: " + ex1 + "\n");
		System.out.println("Extracción 2:");
		Alumno ex2 = lista.pop();
		System.out.println("Registro extraido: " + ex2 + "\n");

		System.out.println(lista.peek());

		// 20 Intenta simular una cola con la lista original. Realiza dos inserciones y
		// extracciones
		// detallando su funcionamiento.
		System.out.println("20. Simulación de cola\n");
		System.out.println("Inserción 1\n");
		lista.offer(a1);
		System.out.println("Registro añadido: " + a1 + "\n");
		System.out.println("Inserción 2\n");
		lista.offer(a2);
		System.out.println("Registro añadido: " + a2 + "\n");
		System.out.println("\nExtracción 1:");
		Alumno ex1Cola = lista.poll();
		System.out.println("Registro extraido: " + ex1Cola + "\n");
		System.out.println("Extracción 2:");
		Alumno ex2Cola = lista.poll();
		System.out.println("Registro extraido: " + ex2Cola + "\n");

	}

	public static LinkedList<Alumno> importarDeArchivo(String ruta) {
		LinkedList<Alumno> lista = new LinkedList<>();

		try (Scanner sc = new Scanner(new File(ruta))) {
			while (sc.hasNextLine()) {
				String[] d = sc.nextLine().split(";");
				lista.add(new Alumno(d[0], d[1], Byte.parseByte(d[2]), Byte.parseByte(d[3]), Byte.parseByte(d[4]),
						Byte.parseByte(d[5]), Byte.parseByte(d[6])));
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		return lista;
	}

	public static boolean buscarRegistro(LinkedList<Alumno> lista, String nombre) {
		for (Alumno alumno : lista) {
			if (alumno.getNombre().equalsIgnoreCase(nombre)) {
				return true;
			}
		}
		return false;
	}

	public static void verificarRegistro(LinkedList<Alumno> lista, String nombre) {
		boolean encontrado = buscarRegistro(lista, nombre);
		if (encontrado) {
			System.out.println("Registro encontrado: " + nombre);
		} else {
			System.out.println("Registro NO encontrado");
		}
	}

	public static void borrarRegistro(LinkedList<Alumno> lista, String nombre) {
		boolean encontrado = false;
		Iterator<Alumno> it = lista.iterator();
		while (it.hasNext()) {
			Alumno a = it.next();
			if (a.getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
				System.out.println("Registro eliminado: " + "Posicion: " + lista.indexOf(a) + " Registro: " + a);
				it.remove();
			}
		}
		if (!encontrado) {
			System.out.println("Registro no econtrado");
		}

	}

}
