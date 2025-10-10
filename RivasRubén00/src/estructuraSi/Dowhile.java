package estructuraSi;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, suma = 0;
		int contador = 0;
		
		do {
			System.out.println("Dame un número: (0 para terminar)");
			numero = sc.nextInt();
			suma = suma + numero;
			if (numero != 0) {
				contador++;
			}
		} while (numero != 0);
		
	//	contador = contador--; // También sirve para no contar el cero
		System.out.println("La suma es: " + suma + " y la cantidad de números es: " + contador);
		

	}

}
