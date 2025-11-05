package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime una cadena de texto: ");
		String cadena = sc.nextLine();
		String[] palabras = cadena.split(" ");
		
		for (int contador = 0; contador < palabras.length; contador++) {
			System.out.println(palabras[contador]);
		}

	}

}
