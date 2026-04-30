/*
 * Autor: Daniel Santana Bueno
 * Descripción: Realización de operaciones con HashSet
 * Fecha: 25/04/2026
 */
package operacionesHashSet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

import operacionesArraylist.Alumno;

public class Ejercicio {

	public static void main(String[] args) {
		// 1. Importa los registros contenidos en el documento notas1hs.txt a un
		// HashSet, donde la
		// información tiene el
		// iguiente formato:
		// grupo;nombre,matemáticas;lengua;física;química;inglés
		System.out.println("1.Añadiendo registros de notas1hs.txt al conjunto...\n");
		HashSet<Alumno> conjuntoAlumno = new HashSet<>();
		importarArchivo("notas1hs.txt", conjuntoAlumno);

		// 2.Muestra el número de registros que contiene.
		System.out.println("2. Muestra el número de registros que contiene.");
		System.out.println("Nº de registros: " + conjuntoAlumno.size() + "\n");

		// 3. Ordena los registros por grupo y nombre.
		System.out.println(
				"3.Ordenamos los objetos del conjunto por grupo y nombre mediante un\r\n" + "ArrayList...\r\n" + "");
		ArrayList<Alumno> conjuntoOrdenado = new ArrayList<>(conjuntoAlumno);
		Collections.sort(conjuntoOrdenado);
		for (Alumno a : conjuntoOrdenado) {
			System.out.println(a);
		}

		// 4 Añade el registro abajo indicado.
		System.out.println("\n4.Añade el registro abajo indicado. ");
		Alumno aNuevo = new Alumno("1º ESO A", "Plaza Gallego, Juan", 1, 1, 3, 1, 1);
		conjuntoAlumno.add(aNuevo);
		System.out.println("El registro ya está en el conjunto. " + " Número de registros: " + conjuntoAlumno.size());

		// 5. Añadimos un registro: 1º ESO A; Suárez Cano, Francisco José 2;3;4;1;2...
		System.out.println("System.out.println(\"\\n4.Añade el registro abajo indicado.");
		Alumno aNuevo2 = new Alumno("1º ESO A", "Suárez Cano, Francisco José", 2, 3, 4, 1, 2);
		conjuntoAlumno.add(aNuevo2);
		System.out.println(
				"El registro ya está en el conjunto. " + " Número de registro: " + conjuntoAlumno.size() + "\n");

		// 6. Importa los registros contenidos en el documento notas2hs.txt en un
		// arraylist.
		System.out.println("6. Importa los registros contenidos en el documento notas2hs.txt en un arraylist");
		ArrayList<Alumno> lista2Alumnos = new ArrayList<>();
		System.out.println("Añadiendo registro de notas2sh.txt a la lista mediante una lista auxiliar... ");
		importarArchivo("notas2hs.txt", lista2Alumnos);

		System.out.println("Total de registros de la lista auxiliar: " + lista2Alumnos.size());

		// 7. Inserta los registros contenidos en el arralist anterior en el HashSet
		System.out.println("\n7. Insertamos los registro contenidos en el arraylist anterior en el hashSet ");
		System.out.println("Total registros antes de añadir: " + conjuntoAlumno.size());
		conjuntoAlumno.addAll(lista2Alumnos);
		System.out.println("Total registro después de añadir: " + conjuntoAlumno.size() + "\n");

		// 8.Comprueba que el registro del punto 4 está en el conjunto.
		System.out.println("8.Comprueba que el registro del punto 4 está en el conjunto...");
		System.out.println("El registro de Juan está en la lista: " + conjuntoAlumno.contains(aNuevo) + "\n");

		// 9. Comprueba que el registro del punto 5 está en el conjunto.
		System.out.println("9. Comprueba que el registro del punto 5 está en el conjunto...");
		System.out
				.println("El registro de Francisco José está en la lista: " + conjuntoAlumno.contains(aNuevo2) + "\n");

		// 10. Crea un arraylist con los registros contenidos en notas3hs.txt.
		System.out.println("10. Creando ArrayList con notas3hs.txt..." + "\n");
		ArrayList<Alumno> lista3Alumnos = new ArrayList<>();
		importarArchivo("notas3hs.txt", lista3Alumnos);

		// 11. Aplica la intersección del HashSet y del arraylist del punto anterior.
		// Muestra el resultado.
		System.out.println(
				"11. Aplica la intersección del HashSet y del arraylist del punto anterior. Muestra el resultado.");

		System.out.println("Registros antes de la intersección: " + conjuntoAlumno.size());

		HashSet<Alumno> interseccion11 = new HashSet<>(conjuntoAlumno);

		interseccion11.retainAll(lista3Alumnos);

		System.out.println("Registros después de la intersección: " + interseccion11.size() + "\n");

		for (Alumno a : interseccion11) {
			System.out.println(a);
		}

		// 12. Crea un HashSet e inserta el arraylist anterior. Inserta los objetos
		// creados en el punto 4 y 5.
		System.out.println(
				"Crea un HashSet e inserta el arraylist anterior. Inserta los objetos creados en el punto 4 y 5.");
		HashSet<Alumno> conjuntoAlumno2 = new HashSet<>();
		conjuntoAlumno2.addAll(lista3Alumnos);
		conjuntoAlumno2.add(aNuevo);
		conjuntoAlumno2.add(aNuevo2);
		System.out.println("Numero de registro del nuevo HashSet: " + conjuntoAlumno2.size() + "\n");

		// 13.Aplica la intersección de los dos HashSet. Muestra su contenido.
		System.out.println("13. Aplica la intersección de los dos HashSet. Muestra su contenido.");
		System.out.println("Total de registros del HashSet 1: " + conjuntoAlumno.size());
		System.out.println("Total de registros del HashSet 2: " + conjuntoAlumno2.size());

		HashSet<Alumno> interseccion13 = new HashSet<>(conjuntoAlumno);
		interseccion13.retainAll(conjuntoAlumno2);

		System.out.println("Total de registros en la intersección: " + interseccion13.size());

		for (Alumno a : conjuntoOrdenado) {
			System.out.println(a);
		}

		// 14. Busca y muestra el registro con nombre “Romero Farfán, Estefanía”
		System.out.println("\n14. Busca y muestra el registro con nombre “Romero Farfán, Estefanía\n");
		buscarRegistro("Romero Farfán, Estefanía", conjuntoAlumno);

		// 15. Busca y muestra el registro con nombre “Gutiérrez Martín, Marina”
		System.out.println("\n15. Busca y muestra el registro con nombre “Gutiérrez Martín, Marina”...\n");
		buscarRegistro("Gutierrez Martín, Marina", conjuntoAlumno);
		
		// 16. Elimina el objeto insertado en el punto 4.
		System.out.println("\n16. Elimina el objeto insertado en el punto 4.");
		System.out.println("Registros antes de eliminar: "+ conjuntoAlumno.size());
		conjuntoAlumno.remove(aNuevo);
		System.out.println("Registros despues de eliminar: "+ conjuntoAlumno.size()+"\n");
		
		// 17. Elimina el objeto insertado en el punto 5.
		System.out.println("17. Elimina el objeto insertado en el punto 5");
		System.out.println("Registros antes de eliminar: "+ conjuntoAlumno.size());
		conjuntoAlumno.remove(aNuevo2);
		System.out.println("Registros despues de eliminar: "+ conjuntoAlumno.size()+"\n");
		
		// 18. Exporta el HashSet original a un documento de texto.
		System.out.println("18. Exporta el HashSet original a un documento de texto.");
		exportarArchivo("SantanaDaniel830", conjuntoAlumno);
		
	}

	public static void importarArchivo(String ruta, Collection<Alumno> destino) {
		try (Scanner sc = new Scanner(new File(ruta))) {
			while (sc.hasNextLine()) {
				String[] d = sc.nextLine().split(";");
				destino.add(new Alumno(d[0], d[1], Byte.parseByte(d[2]), Byte.parseByte(d[3]), Byte.parseByte(d[4]),
						Byte.parseByte(d[5]), Byte.parseByte(d[6])));
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void exportarArchivo(String ruta, Collection<Alumno> conjunto) {
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
	        for (Alumno a : conjunto) {
	            bw.write(a.toString());
	            bw.newLine();
	        }
	        System.out.println("Archivo exportado correctamente a: " + ruta);
	    } catch (Exception e) {
	        System.out.println("Error al exportar archivo: " + e.getMessage());
	    }
	}


	public static Alumno buscarRegistro(String nombre, Collection<Alumno> objetivo) {
		for (Alumno a : objetivo) {
			if (a.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Registro encontrado: " + a);
				return a;
			}
		}
		System.out.println("Registro no encontrado.");
		return null;
	}

}
