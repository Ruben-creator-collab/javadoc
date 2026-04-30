package rivas2;

import java.util.Collections;
import java.util.LinkedList;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Constante
		final int CANTIDAD_EMPLEADOS = 10;
		
		// apartado 1
        System.out.println("Apartado1:");
		LinkedList<Empleado> lista1 = new LinkedList<>();
		
		while (lista1.size() < CANTIDAD_EMPLEADOS) {
			Empleado empleados = Empleado.generarAleatorio();
			lista1.add(empleados);
		}
		
        System.out.println("Contenido inicial de la lista 1: " + lista1);
        System.out.println("Numero de objetos en la coleccion: " + lista1.size());
        
        // apartado 2
        System.out.println();
        System.out.println("Apartado2:");
        Empleado empleado1 = Empleado.generarAleatorio();
        int mitadLista = lista1.size() / 2;
        lista1.add(mitadLista, empleado1);
        System.out.println("Contenido de la lista 1 despues de meter al empleado: " + lista1);
        System.out.println("Numero de objetos en la coleccion: " + lista1.size());
        
        // apartado 3
        System.out.println();
        System.out.println("Apartado3:");
        Collections.sort(lista1, new ComparadorPorOrdenDecrecienteDni());
        System.out.println("\nOrdenado por Dni decreciente:");
        for (Empleado e : lista1) {
            System.out.println(e);
        }
        System.out.println("Numero de objetos en la coleccion: " + lista1.size());
        
        // apartado 4
        System.out.println();
        System.out.println("Apartado4:");
        boolean encontrado = false;
        for (Empleado i: lista1) {
        	if(i.getDni().equalsIgnoreCase("101010101Z")) {
        		System.out.println("Encontrado: " + lista1.indexOf(i));
        		encontrado = true;
        	}
        }
        if (encontrado == false) {
        	System.out.println("El dni no ha sido encontrado");
        }
        
        // apartado 5
        System.out.println();
        System.out.println("Apartado5:");
        boolean encontradoNombre = false;
        for (Empleado i: lista1) {
        	if(i.getNombre().equalsIgnoreCase("ana")) {
        		System.out.println("Encontrado: " + i.toString());
        		encontradoNombre = true;
        	}
        }
        if(encontradoNombre == false) {
        	System.out.println("No hay nadie con ese nombre");
        }
        
	}

}
