package ejercicio1.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// apartado 1
		Humano humano1 = new Humano("Rubén", "Rivas");
		Ciudadano ciudadano1 = new Ciudadano("Pepe", "López", "26827323E");
		Ciudadano ciudadano2 = new Ciudadano("María", "Quijada", "26827324A");
		System.out.println();
		
		// apartado 2
		System.out.println(humano1.getNombreCompleto());
		System.out.println(ciudadano1.identificacion());
		System.out.println(ciudadano2.identificacion());
		System.out.println();
		
		// apartado 3
		Humano humano2 = new Humano();
		System.out.println("Antes del cambio: ");
		System.out.println(humano2.getNombreCompleto());
		System.out.println();
		
		String nombre;
		String apellidos;
		
		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine();
		System.out.print("Dime tu apellido: ");
		apellidos = sc.nextLine();
		
		humano2.cambiarNombre(nombre);
		humano2.cambiarApellido(apellidos);
		
		// apartado 4
		System.out.println("Después del cambio: ");
		System.out.println(humano2.getNombreCompleto());

		
	}

}
