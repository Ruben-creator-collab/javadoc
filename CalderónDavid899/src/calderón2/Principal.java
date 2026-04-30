/*
 * Objetivo: Desarrollo el principal con Objetos empleado
 * Autor: David Calderón Navarro
 * Fecha: 15/04/2026
 */

package calderón2;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {

		// 1. LinkedList

		System.out.println("1. Meter 10 objetos en un linkedList");
		System.out.println("");

		LinkedList<Empleado> lista1 = new LinkedList();

		for (int i = 0; i < 10; i++) {

			Empleado empleado = Empleado.generarAleatorio();
			lista1.add(empleado);

		}

		System.out.println("Mostrar los objetos y el numero que hay");

		for (Empleado i : lista1) {

			System.out.println(i.toString());

		}

		System.out.println("");
		System.out.println("Hay " + lista1.size() + " objetos");

		// 2. Crea un objeto de tipo Empleado y añadelo a la mitad

		System.out.println("");
		System.out.println("2. Crea un objeto de tipo Empleado y añadelo a la mitad");

		Empleado empleado = Empleado.generarAleatorio();

		// 3. Ordena la lista por orden decreciente de dni

		System.out.println("");
		System.out.println("3. Ordena la lista por orden decreciente de dni");

		System.out.println("");
		System.out.println("Objetos ordenados por dni decreciente");

		Collections.sort(lista1, new ComparadorDni());

		for (Empleado i : lista1) {

			System.out.println(i.toString());

		}

		System.out.println("");
		System.out.println("Hay " + lista1.size() + " objetos");

		// 4.

		System.out.println("");
		System.out.println("4. Comprobar si el dni 101010101Z esta en la lista");
		System.out.println("");

		boolean esta = false;

		for (Empleado i : lista1) {

			if (i.getDni().equalsIgnoreCase("101010101Z")) {

				System.out.println(i.toString());
				esta = true;

			} else {

				esta = false;

			}

		}

		if (!esta) {

			System.out.println("El objeto con ese dni no esta en la lista");

		}

		// 5. Empleados Ana

		System.out.println("");
		System.out.println("5. Empleados que se llamen Ana");
		System.out.println("");

		for (Empleado i : lista1) {

			if (i.getNombre().equalsIgnoreCase("Ana")) {

				System.out.println(i.toString());

			}

		}

		// 6. Borrar el primer Luis

		Iterator<Empleado> it = lista1.iterator();

		boolean encontrado = false;

		while (!encontrado) {

			Empleado e = it.next();

			if (e.getNombre().equalsIgnoreCase("Luis")) {
				
				it.remove();
				System.out.println("");
				System.out.println("El luis que se borrara: ");
				System.out.println(e.toString());
				System.out.println("Primer Luis borrado");
				encontrado = true;

			}

		}
		
		System.out.println("");
		System.out.println("Hay " + lista1.size() + " objetos");
		
		

	}

}
