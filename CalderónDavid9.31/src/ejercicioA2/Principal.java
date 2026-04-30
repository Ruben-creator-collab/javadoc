package ejercicioA2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		String rutaUsu;

		boolean sigue = true;

		while (sigue) {

			System.out.println("Dime la ruta del archivo: (Enter para salir)");
			rutaUsu = datos.nextLine();

			if (rutaUsu.isEmpty()) {

				System.out.println("Ruta vacia");
				break;

			}

			File archivo = new File(rutaUsu);

			try {

				muestraInfoRuta(archivo, true);

			} catch (FileNotFoundException e) {

				System.out.println("Ruta no encontrada");

			} catch (Exception e1) {

				System.out.println("Error: " + e1.getMessage());

			}

		}

		datos.close();

	}

	public static void muestraInfoRuta(File ruta, boolean info) throws FileNotFoundException {

		if (!ruta.exists()) {
			throw new FileNotFoundException();
		}

		if (ruta.isFile()) {

			System.out.println("[A]" + ruta.getName());

		} else if (ruta.isDirectory()) {

			File[] lista = ruta.listFiles();

			Arrays.sort(lista);

			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

			for (File i : lista) {

				if (i.isDirectory()) {

					if (info) {

						String fecha = formato.format(new Date(i.lastModified()));

						System.out.println("[*] |Nombre: " + i.getName() + " \t\t|Tamaño: " + i.length()
								+ " \t| Fecha de ultima modificacion: " + fecha);

					} else {

						System.out.println("[*]" + i.getName());

					}

				}

			}

			for (File i : lista) {

				if (info) {

					String fecha = formato.format(new Date(i.lastModified()));

					System.out.println("[A] |Nombre: " + i.getName() + " \t\t|Tamaño: " + i.length()
							+ " \t| Fecha de ultima modificacion: " + fecha);

				} else {

					System.out.println("[A]" + i.getName());

				}

			}

		}

	}

}