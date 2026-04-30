package rivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class Gestion {

	public static void main(String[] args) {

		HashSet<Libro> libros = new HashSet<>();

		// apartado 1
		System.out.println("Apartado 1:");
		try (BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\DAW1\\Documents\\javadoc\\Rivas_Rubén_999\\src\\libros.txt"))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split(";");

				Libro l = new Libro(partes[0], partes[1], partes[2], Float.parseFloat(partes[3]));

				libros.add(l);
			}
		} catch (IOException e) {
			e.getMessage();
		}

		for (Libro l : libros) {
			System.out.println(l);
		}
		System.out.println("-------------");
		System.out.println("Total Libros: " + libros.size());

		// apartado 2
		System.out.println("");
		System.out.println("Apartado 2:");
		Libro libro1 = new Libro("978-84-206-9999-0", "Alicia en el pais de las maravillas", "Lewis Carroll",
				(float) 9.90);
		boolean añadido1 = libros.add(libro1);

		System.out.println(libro1);
		System.out.println("Añadido: " + añadido1);
		System.out.println("Total: " + libros.size());

		// apartado 3
		System.out.println("");
		System.out.println("Apartado 3:");
		Libro libro2 = new Libro("978-84-975-9220-8", "1984", "George Orwell", (float) 12.00);
		boolean añadido2 = libros.add(libro2);

		System.out.println(libro2);
		System.out.println("Añadido: " + añadido2);
		System.out.println("Total: " + libros.size());

		// apartado 4
		System.out.println("");
		System.out.println("Apartado 4:");
		boolean encontrado = false;

		for (Libro l : libros) {
			if (l.getIsbn().equalsIgnoreCase("978-84-975-9220-8")) {
				System.out.println("Encontrado: " + l);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("No existe ningún libro con ese isbn");
		}

		// apartado 5
		System.out.println("");
		System.out.println("Apartado 5:");
		int contador = 0;

		for (Libro l : libros) {
			if (l.getAutor().equalsIgnoreCase("George Orwell")) {
				System.out.println(l);
				contador++;
			}
		}
		System.out.println("");
		System.out.println("----------------------------------------");
		System.out.println("Total de libros que tiene George Orwell: " + contador);

		// apartado 6
		System.out.println("");
		System.out.println("Apartado 6: ");

		System.out.println("");
		System.out.println("El tamaño de libros antes de eliminarlo: " + libros.size());

		Iterator<Libro> it = libros.iterator();
		boolean eliminado = false;
		while (!eliminado) {
			Libro l = it.next();

			if (l.getIsbn().equalsIgnoreCase("978-84-975-9220-8")) {
				it.remove();
				eliminado = true;

			}

		}
		System.out.println("");
		System.out.println("Eliminado: " + eliminado);
		System.out.println("El tamaño de libros después de eliminarlo: " + libros.size());

		// apartado 7
		System.out.println("");
		System.out.println("Apartado 7:");

		double media = calcularMedia(libros);
		System.out.println("Media precio de los libros: " + media);

		// apartado 8
		System.out.println("");
		System.out.println("Apartado 8:");
		exportarLibros(libros, media);

	}

	public static double calcularMedia(HashSet<Libro> libros) {
		int suma = 0;

		for (Libro l : libros) {
			suma += l.getPrecio();
		}

		if (libros.size() == 0)
			return 0;

		return (double) suma / libros.size();
	}

	public static void exportarLibros(HashSet<Libro> libros, double media) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("libros_baratos.txt"))) {

			for (Libro l : libros) {
				if (l.getPrecio() > media) {
					bw.write(l.toString());
					bw.newLine();
				}
			}

			System.out.println("Archivo creado correctamente");

		} catch (IOException e) {
			e.getMessage();
		}
	}

}
