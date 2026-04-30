package ejercicio1.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList <String> lista = new ArrayList<>();
		
		// apartado 1 Importar datos desde notas1.txt
        System.out.println("1. Añadiendo registros de notas1.txt a la lista...");
        
        try {
        	BufferedReader br = new BufferedReader(new FileReader("notas1.txt"));
        	String linea;
        	
        	while ((linea = br.readLine()) != null) {
        		lista.add(linea);
        	}
        	br.close();
        } catch (IOException e) {
        	System.out.println("Error leyendo archivo: " + e.getMessage());
        }
        
        // apartado 2 Mostrar numero de registros
        System.out.println("2. Número de registros añadidos a la lista: " + lista.size());
        
        // apartado 3 Ordenar por nombre y grupo
        System.out.println("3. Ordenamos la lista por grupo y nombre...");
        
        Collections.sort(lista, new Comparator<String>() {
        	@Override
        	public int compare(String a, String b) {
        		
        		String[] datosA = a.split(";");
        		String[] datosB = b.split(";");
        		
        		// primero compara grupo
        		int cmpGrupo = datosA[0].compareTo(datosB[0]);
        		
        		if (cmpGrupo != 0) {
        			return cmpGrupo;
        		}
        		
        		// Si el grupo es igual compara el nombre
        		return datosA[1].compareTo(datosB[1]);
        	}
        });
        
        // apartado 4 añadir el siguiente registro
        System.out.println("4. Añadimos el registro...");
        
        lista.add("1º ESO D;López Muro, Rosario;3;3;4;4;3");
        
        System.out.println("Número de registros: " + lista.size());
        
        // apartado 5 añadir un registro en la mitad de la lista
        System.out.println("5. Añadimos un registro en mitad de la lista...");
        
        int mitad = lista.size() / 2;
        lista.add(mitad, "1º ESO B;Duarte Durán, Alba;2;3;4;1;3");
        
        // apartado 6 mostrar la posicion del registro insertado
        int posicion = lista.indexOf("1º ESO B;Duarte Durán, Alba;2;3;4;1;3");
        System.out.println("6. Posición del nuevo registro: " + posicion);
        
        // apartado 7 importar notas2.txt a lista auxiliar y añadirlos
        System.out.println("7. Importando notas2.txt a una lista auxiliar y añadiendolo a la lista...");
        ArrayList<String> auxiliar = new ArrayList<>();
        
        try {
        	BufferedReader br = new BufferedReader(new FileReader("notas2.txt"));
        	String linea;
        	
        	while ((linea = br.readLine()) != null) {
        		auxiliar.add(linea);
        	}
        	br.close();
        	
        } catch (IOException e) {
        	System.out.println("Error leyendo archivo: " + e.getMessage());
        }
        
        System.out.println("Total antes: " + lista.size());
        System.out.println("Auxiliar: " + auxiliar.size());
        
        lista.addAll(auxiliar);
        
        System.out.println("Total después: " + lista.size());
        
        // apartado 8 buscar a “Cordero Benítez, Alejandro” y mostar toda la informacion
        System.out.println("8. Buscando a “Cordero Benítez, Alejandro”...");
        for (String alumno: lista) {
        	if(alumno.contains("Cordero Benítez, Alejandro")) {
        		System.out.println("Encontrado: " + alumno);
        		break;
        	}
        }
        
        // apartado 9 buscar a “Fernández Villalón, Carlos” y mostar toda la informacion
        System.out.println("9. Buscando a “Fernández Villalón, Carlos”...");
        boolean encontrado = false;

        for (String alumno : lista) {
            if (alumno.contains("Fernández Villalón, Carlos")) {
                System.out.println("Encontrado: " + alumno);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Registro no encontrado.");
        }
        
        // apartado 10 borrar la posición de la mitad +1
        System.out.println("10. Borrando la posicion de la mitad +1...");
        int pos = (lista.size() / 2) + 1;
        System.out.println("Borrado: " + lista.remove(pos));
        
	}

}
