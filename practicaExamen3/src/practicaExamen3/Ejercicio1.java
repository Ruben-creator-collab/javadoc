package practicaExamen3;

import java.io.*;
import java.util.*;

public class Ejercicio1 {
	    public static void main(String[] args) {

	        HashSet<Socio> socios = new HashSet<>();

	        // 1. Importar socios desde archivo
	        System.out.println("=== APARTADO 1 ===");
	        try (BufferedReader br = new BufferedReader(new FileReader("socios.txt"))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                String[] partes = linea.split(";");

	                Socio s = new Socio(
	                        Integer.parseInt(partes[0]),
	                        partes[1],
	                        Byte.parseByte(partes[2]) // 🔥 IMPORTANTE (byte)
	                );

	                socios.add(s);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        for (Socio s : socios) {
	            System.out.println(s);
	        }
	        System.out.println("Total socios: " + socios.size());


	        // 2. Añadir socio (10;Hugo Vera;4)
	        System.out.println("\n=== APARTADO 2 ===");
	        Socio s1 = new Socio(10, "Hugo Vera", (byte) 4);
	        boolean añadido1 = socios.add(s1);

	        System.out.println(s1);
	        System.out.println("Añadido: " + añadido1);
	        System.out.println("Total: " + socios.size());


	        // 3. Añadir socio (15;Hugo Vera;4)
	        System.out.println("\n=== APARTADO 3 ===");
	        Socio s2 = new Socio(15, "Hugo Vera", (byte) 4);
	        boolean añadido2 = socios.add(s2);

	        System.out.println(s2);
	        System.out.println("Añadido: " + añadido2);
	        System.out.println("Total: " + socios.size());


	        // 4. Buscar socio id 5
	        System.out.println("\n=== APARTADO 4 ===");
	        boolean encontrado = false;

	        for (Socio s : socios) {
	            if (s.getId() == 5) {
	                System.out.println("Encontrado: " + s);
	                encontrado = true;
	                break;
	            }
	        }

	        if (!encontrado) {
	            System.out.println("No existe el socio con id 5");
	        }


	        // 5. Cuántos se llaman Ana
	        System.out.println("\n=== APARTADO 5 ===");
	        int contador = 0;

	        for (Socio s : socios) {
	            if (s.getNombre().equalsIgnoreCase("Ana")) {
	                System.out.println(s);
	                contador++;
	            }
	        }

	        System.out.println("Total Ana: " + contador);


	        // 6. Eliminar socio id 15
	        System.out.println("\n=== APARTADO 6 ===");

	        // 🔥 truco: solo importa el id gracias a equals
	        Socio eliminar = new Socio(15, "", (byte) 0);
	        boolean eliminado = socios.remove(eliminar);

	        System.out.println("Eliminado: " + eliminado);
	        System.out.println("Total: " + socios.size());


	        // 7. Media antigüedad
	        System.out.println("\n=== APARTADO 7 ===");
	        double media = calcularMedia(socios);
	        System.out.println("Media antigüedad: " + media);


	        // 8. Exportar socios con antigüedad mayor a la media
	        System.out.println("\n=== APARTADO 8 ===");
	        exportarSociosAntiguos(socios, media);
	    }


	    public static double calcularMedia(HashSet<Socio> socios) {
	        int suma = 0;

	        for (Socio s : socios) {
	            suma += s.getAntiguedad(); // byte → se convierte a int solo
	        }

	        if (socios.size() == 0) return 0;

	        return (double) suma / socios.size();
	    }


	    public static void exportarSociosAntiguos(HashSet<Socio> socios, double media) {
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("socios_antiguos.txt"))) {

	            for (Socio s : socios) {
	                if (s.getAntiguedad() > media) {
	                    bw.write(s.toString());
	                    bw.newLine();
	                }
	            }

	            System.out.println("Archivo creado correctamente");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
