package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime la primera nota media obtenida: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Dime la segunda nota media obtenida: ");
		double nota2 = sc.nextDouble();
		
		System.out.print("Dime la tercera nota media obtenida: ");
		double nota3 = sc.nextDouble();
		
		System.out.print("Dime la cuarta nota media obtenida: ");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("La nota media del curso es: " + media);
		
		double mediaRedondeadaAbajo = Math.floor(media);
		double mediaRedondeadaArriba = Math.ceil(media);
		System.out.println("Tu nota media redondeada hacia abajo: " + mediaRedondeadaAbajo);
		System.out.println("Tu nota media redondeada hacia arriba: " + mediaRedondeadaArriba);
		
		if (media >8) {
			System.out.println("Enhorabuena, puedes acceder a los estudios superiores.");
		} else {
			System.out.println("Lo sentimos, tu nota media no es suficiente para acceder a los estudios que deseabas.");
		}
	}
}
