package estructuraSi;

import java.util.Scanner;

public class EjercicioFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame un número: ");
		int inicio = sc.nextInt();
		
		System.out.print("Dame un número: ");
		int fin = sc.nextInt();
		
		
		for(int contador = inicio; contador <= fin; contador++ ) {
			System.out.println("Analizando el valor " + contador);	
			if(contador % 5 == 0) {
					System.out.println(contador + " es múltiplo de 5 ");
				}
				
		}
		
	}

}
