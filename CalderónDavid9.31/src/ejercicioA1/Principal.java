package ejercicioA1;

import java.io.File;
import java.io.FileNotFoundException;
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
				
				muestraInfoRuta(archivo);
				
				
			}catch(FileNotFoundException e) {
				
				System.out.println("Ruta no encontrada");
				
			}catch(Exception e1) {
				
				System.out.println("Error: " + e1.getMessage());
				
			}

		}

	}

	public static void muestraInfoRuta(File ruta) throws FileNotFoundException{

		if (!ruta.exists()) {
            throw new FileNotFoundException();
        }
		
		if (ruta.isFile()) {
			
			System.out.println("[A]" + ruta.getName());

		}else if(ruta.isDirectory()) {
			
			File[] lista = ruta.listFiles();
			
			for(File i: lista) {
				
				if(i.isDirectory()) {
					
					System.out.println("[*]" + i.getName());
					
				}
				
			}
			
			for(File i: lista) {
				
				if(i.isFile()) {
					
					System.out.println("[A]" + i.getName());
					
				}
				
			}
			
		}
		
	}
	
}