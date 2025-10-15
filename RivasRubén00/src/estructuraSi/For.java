/*
 * 
 */
package estructuraSi;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		int numero = sc.nextInt();
		
		for(int contador = 10; contador >= 1; contador--) {
			System.out.println(numero + " multiplicado por " + contador + " = " + numero*contador);
		}

	}

}
