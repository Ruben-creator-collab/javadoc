package ejercicio1.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String rutaTexto;

        do {
            System.out.print("Dime una ruta del sistema de archivos: ");
            rutaTexto = sc.nextLine();

            if (!rutaTexto.isEmpty()) {
                try {
                    File ruta = new File(rutaTexto);
                    muestraInfoRuta(ruta);
                } catch (Exception e) {
                    System.out.println("Error al procesar la ruta");
                }
                System.out.println("----------------------");
            }

        } while (!rutaTexto.isEmpty());

        sc.close();
    }

    public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
    	
    	if (!ruta.exists()) {
    		throw new FileNotFoundException ("La ruta no existe");
    	}
    	
    	if (ruta.isFile()) {
    		System.out.println("Nombre del archivo: " + ruta.getName());
    	} else if (ruta.isDirectory()) {
    		File [] lista = ruta.listFiles();
    		
    		if (lista != null) {
    			
    			for (File i : lista) {
    				if (i.isDirectory()) {
    					System.out.println("[*] " + i.getName());
    				}
    			}
    			
    			for (File i : lista) {
    				if (i.isFile()) {
    					System.out.println("[A] " + i.getName());
    				}
    			}
    		}
    	}
    	
    }
}