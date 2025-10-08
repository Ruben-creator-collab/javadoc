package entradaDatos;

import java.util.Scanner;

public class PeticionesDatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edadAlumno;
		System.out.print("Dame tu edad: ");
		edadAlumno = teclado.nextInt();
		System.out.println("La edad es: " + edadAlumno);
		
		teclado.nextLine(); // Después de pedir numérico y antes de pedir cadena de caracteres
		String nombreAlumno;
		System.out.print("Dame tu nombre: ");
		nombreAlumno = teclado.nextLine();
		System.out.println("Tu nombre es: " + nombreAlumno);
		
		double pesoAlumno;
		System.out.print("Dame tu peso: ");
		pesoAlumno = teclado.nextDouble();
		System.out.println("Tu peso es: " + pesoAlumno + "Kgs ");
		
	}

}
