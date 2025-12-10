package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entero;
		boolean verdadero = true;
		
		do {
			System.out.print("Dame un entero:");
			try {
				entero = sc.nextInt();
			} catch (InputMismatchException exTipoDiferente) {
				System.out.println("Te has equivocado");
				verdadero = false;
			} catch (IllegalStateException ex1) {
				verdadero = false;
				System.out.println("No se puede acceder a la consola");
			}
			sc.nextLine();
		} while (verdadero != true);
		

	}

}
