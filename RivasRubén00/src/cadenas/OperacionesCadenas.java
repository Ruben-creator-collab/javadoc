package cadenas;

import java.util.Scanner;

public class OperacionesCadenas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cadena;
		System.out.print("Dime una cadena de caracteres: ");
		cadena = sc.nextLine();
		
		// Mostrar la longitud de la cadena
		System.out.println("Longitud de la cadena: " + cadena.length());
		// Mostrar el primer carácter de la cadena
		System.out.println("Primer carácter de la cadena: " + cadena.charAt(0));
		// Mostrar el último carácter de la cadena
		System.out.println("Último carácter de la cadena: " + cadena.charAt(cadena.length()-1));
		// Mostrar la segunda palabra de la cadena
		String [] palabra = cadena.split(" ");
		String segundaPalabra = palabra[1];
		System.out.println("Segunda palabra de la cadena: " + segundaPalabra);
		// Mostrar la cadena con la primera letra y la última en mayúscula
		String primLetra = cadena.substring(0, 1);
		primLetra = primLetra.toUpperCase();
		String ultLetra = cadena.substring(cadena.length()-1);
		ultLetra = ultLetra.toUpperCase();
		String medio = cadena.substring(1, cadena.length()-1);
		System.out.println("Primera letra de la cadena en mayúscula " + primLetra + " y la última también " + ultLetra);
		System.out.println(primLetra + medio + ultLetra);
		
		
		
		
	}

}
