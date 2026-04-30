package ejercicio1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PrincipalLibro {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		ArrayList<Libro> libros = new ArrayList();

		Random num = new Random();

		String opcion = "";

		int totalnumPaginas = 0;

		int cantidad = num.nextInt(11) + 20;

		for (int i = 0; i < cantidad; i++) {

			String titulo = "Titulo" + (i + 1);
			String nombre = "Nombre" + (i + 1);
			int paginas = (int) (Math.random() * 400) + 100;

			Libro libro = new Libro(titulo, nombre, paginas);

			libros.add(libro);

		}

		do {

			System.out.println("a) Calcular el número medio de páginas");
			System.out.println("b) Mostrar cuántos libros tienen más de 300 páginas");
			System.out.println("c) Mostrar los títulos de los libros con menos páginas que la media");
			System.out.println("d) Salir");
			opcion = datos.next();

			if (opcion.equalsIgnoreCase("a")) {

				int suma = 0;

				for (Libro i : libros) {

					suma += i.getNumPaginas();

				}

				int media = suma / libros.size();

				System.out.printf("El numero medio de páginas es de: %d", media);
				System.out.println();

			} else if (opcion.equalsIgnoreCase("b")) {

				int contador = 0;

				for (Libro i : libros) {

					if (i.getNumPaginas() > 300) {

						contador++;

					}

				}

				System.out.printf("Libros con mas de 300 páginas: %d", contador);
				System.out.println("");

			} else if (opcion.equalsIgnoreCase("c")) {

				int suma = 0;

				for (Libro i : libros) {

					suma += i.getNumPaginas();

				}

				int media = suma / libros.size();

				for (Libro i : libros) {

					if (i.getNumPaginas() < media) {

						System.out.printf("\nTitulo: %s || Páginas: %d",i.getTitulo() , i.getNumPaginas());
						System.out.println("");
						
					}

				}

			}

		} while (!opcion.equalsIgnoreCase("d"));

	}

}
