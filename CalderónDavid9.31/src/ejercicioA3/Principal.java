package ejercicioA3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		File archivoDocu1 = new File("C:\\Users\\DAW1\\eclipse-workspace\\CalderónDavid9.31\\Documentos");
		File archivoDocu2 = new File("C:\\Users\\DAW1\\eclipse-workspace\\CalderónDavid9.31\\DOCS");

		try {

			archivoDocu1.renameTo(archivoDocu2);

		} catch (Exception e1) {

			System.out.println("Error: " + e1.getMessage());

		}
		
		File archivoFotos1 = new File("C:\\Users\\DAW1\\eclipse-workspace\\CalderónDavid9.31\\DOCS\\Fotografias");
		File archivoFotos2 = new File("C:\\Users\\DAW1\\eclipse-workspace\\CalderónDavid9.31\\DOCS\\FOTOS");
		
		try {

			archivoFotos1.renameTo(archivoFotos2);

		} catch (Exception e1) {

			System.out.println("Error: " + e1.getMessage());

		}
		
		File archivoLibro1 = new File("C:\\Users\\DAW1\\eclipse-workspace\\CalderónDavid9.31\\DOCS\\Libros");
		File archivoLibro2 = new File("C:\\Users\\DAW1\\eclipse-workspace\\CalderónDavid9.31\\DOCS\\LECTURAS");
		
		try {

			archivoLibro1.renameTo(archivoLibro2);

		} catch (Exception e1) {

			System.out.println("Error: " + e1.getMessage());

		}
		
		
		
	}

}
