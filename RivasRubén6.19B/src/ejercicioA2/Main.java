package ejercicioA2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("22222222E", "Ruben", "Rivas", (byte)18);
		Persona p2 = new Persona("22222222A", "Alejandro", "Morales", (byte)16);
		
//		pedirDatos(p1);
//		pedirDatos(p2);
		
		mostrarMensaje(p1);
		mostrarMensaje(p2);
		
	}
	
	public static void pedirDatos(Persona p) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Nombre: ");
        p.nombre = sc.nextLine();

        System.out.print("Apellidos: ");
        p.apellidos = sc.nextLine();

        System.out.print("DNI: ");
        p.dni = sc.nextLine();

        System.out.print("Edad: ");
        p.edad = sc.nextByte();
	}
	
    public static void mostrarMensaje(Persona p) {
        if (p.edad >= 18) {
            System.out.println(
                p.nombre + " " + p.apellidos + " con DNI " + p.dni + " es mayor de edad"
            );
        } else {
            System.out.println(
                p.nombre + " " + p.apellidos + " con DNI " + p.dni + " no es mayor de edad"
            );
        }
    }
}
