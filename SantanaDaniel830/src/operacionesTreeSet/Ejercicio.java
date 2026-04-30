/*
 * Autor: Daniel Santana Bueno
 * Descripción: Operaciones con TreeSet
 * Fecha: 25/04/2026
 */
package operacionesTreeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

import operacionesArraylist.Alumno;

public class Ejercicio {

	public static void main(String[] args) {
		// APARTADO 1
		System.out.println("1. Añadiendo registros de notas1hs.txt al conjunto ...");
		TreeSet<Alumno> conjunto = new TreeSet<>();
		operacionesHashSet.Ejercicio.importarArchivo("notas1hs.txt", conjunto);

		// APARTADO 2
		System.out.println("2. Número de registros añadidos al conjunto: " + conjunto.size());

		// APARTADO 3
		System.out.println("3. Ordenamos los objetos del conjunto por grupo y nombre ...");
		for (Alumno a : conjunto) {
			System.out.println(a);
		}

		// APARTADO 4
		System.out.println("4. Añadimos un registro de Juan ...");
		Alumno juan = new Alumno("1º ESO A", "Plaza Gallego, Juan", 1, 1, 3, 1, 1);
		conjunto.add(juan);
		System.out.println("El registro ya está en el conjunto? " + conjunto.contains(juan));
		System.out.println("Número de registros: " + conjunto.size());

		// APARTADO 5
		System.out.println("5. Añadimos un registro de Francisco José ...");
		Alumno francisco = new Alumno("1º ESO A", "Suárez Cano, Francisco José", 2, 3, 4, 1, 2);
		conjunto.add(francisco);
		System.out.println("Número de registros: " + conjunto.size());

		// APARTADO 6
		System.out.println("6. Añadiendo registros de notas2hs.txt a la lista ...");
		ArrayList<Alumno> listaAux = new ArrayList<>();
		operacionesHashSet.Ejercicio.importarArchivo("notas2hs.txt", listaAux);
		System.out.println("Total registros de la lista auxiliar: " + listaAux.size());

		// APARTADO 7
		System.out.println("7. Insertamos los registros del ArrayList en el TreeSet ...");
		int antes = conjunto.size();
		conjunto.addAll(listaAux);
		int despues = conjunto.size();
		System.out.println("Total antes: " + antes);
		System.out.println("Total después: " + despues);

		// APARTADO 8
		System.out.println("8. Comprobando registro de Juan ...");
		System.out.println("Está en el conjunto? " + conjunto.contains(juan));

		// APARTADO 9
		System.out.println("9. Comprobando registro de Francisco José ...");
		System.out.println("Está en el conjunto? " + conjunto.contains(francisco));

		// APARTADO 10
		System.out.println("10. Último elemento ...");
		System.out.println(conjunto.last());

		// APARTADO 11
		System.out.println("11. Primer elemento ...");
		System.out.println(conjunto.first());

		// // APARTADO 12
		System.out.println("12. Guardado en TreeSet12.txt");
		System.out.println("12. Guardado en TreeSet12.txt");
		operacionesHashSet.Ejercicio.exportarArchivo("TreeSet12.txt",
				conjunto.headSet(new Alumno("1º ESO C", "", 0, 0, 0, 0, 0)));

		// APARTADO 13
		System.out.println("13. Guardado en TreeSet13.txt");
		operacionesHashSet.Ejercicio.exportarArchivo("TreeSet13.txt",
				conjunto.tailSet(new Alumno("1º ESO C", "", 0, 0, 0, 0, 0)));

		// APARTADO 14
		System.out.println("14. Guardado en TreeSet14.txt");
		NavigableSet<Alumno> inverso = conjunto.descendingSet();
		operacionesHashSet.Ejercicio.exportarArchivo("TreeSet14.txt", inverso);
	}

}
