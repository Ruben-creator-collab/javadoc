package ejercicio5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		
		HashSet<String> ids = new HashSet<>();
		
		// 1. Crear varias publicaciones
		Publicacion libro1 = new Libro();
		Publicacion libro2 = new Libro("002", "POO", 25, true, "Ana", 350);
		Publicacion revista1 = new Revista();
		Publicacion revista2 = new Revista("R2", "Ciencia", 15, true, 10, "semanal");

		// 2. Guardarlas en un ArrayList
		ArrayList<Publicacion> publicaciones = new ArrayList<>();
		
		//3.
		
		System.out.println(agregar(publicaciones, ids, libro1));
		System.out.println(agregar(publicaciones, ids, libro2));
		System.out.println(agregar(publicaciones, ids, revista1));
		System.out.println(agregar(publicaciones, ids, revista2));
        
        // Intento duplicado
        Publicacion duplicado = new Libro("003", "Duplicado", 30, true, "X", 100);
        System.out.println(agregar(publicaciones, ids, duplicado));
        
        //4.
        
        for (Publicacion i: publicaciones) {
        	
        	System.out.println(i.toString());
        	
        }
        
        //5.
        
        System.out.println("Publicaciones creadas: " + Publicacion.ContarPublicaciones());
	
        
        //6. Borra la publicacion con el id 002
        
        Iterator<Publicacion> it = publicaciones.iterator();
        
        boolean encontrado = false;
        
        while(it.hasNext()) {
        	
        	Publicacion p = it.next();
        	
        	if(p.getId().equals("002")) {
        		
        		it.remove();
        		System.out.println("Publicacion eliminada");
        		encontrado = true;
        		
        	}
        	
        }
        
        if(!encontrado) {
    		
    		System.out.println("No se ha encontrado la publicacion");
    		
    	}
        
	}
	
	public static String agregar(ArrayList<Publicacion> lista, HashSet<String> ids, Publicacion p) {
        
		if (ids.add(p.getId())) {
			
            lista.add(p);
            
            return "Añadido";
            
        } else {
        	
            return "ID duplicado: " + p.getId();
            
        }
		
    }

}
