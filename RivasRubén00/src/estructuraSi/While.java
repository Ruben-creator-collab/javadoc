package estructuraSi;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime un número: ");
		int num = sc.nextInt();
		int suma = num;
		int contador = 1;
		
		while (num != 0 && contador != 8) {
			System.out.print("Dime un número: ");
			num = sc.nextInt();
			contador++; // contador
			suma = suma + num; // Acumulador
		}
		System.out.println("La suma es: " + suma);
		
	}

}
