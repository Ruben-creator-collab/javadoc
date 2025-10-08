/*
 *
 */
package operadoresBasicos;

import java.util.Scanner;

public class DatosOperadores {

	public static void main(String[] args) {
		Scanner numeros = new Scanner (System.in);
		
		int num1, num2;
		System.out.println("Dame un número entero para hacer una suma: ");
		num1 = numeros.nextInt();
		
		System.out.println("Dame otro número entero para terminar la suma: ");
		num2 = numeros.nextInt();
		
		int suma = num1 + num2;
		System.out.println("Aqui esta la suma de tus números: " + suma);

	}

}
