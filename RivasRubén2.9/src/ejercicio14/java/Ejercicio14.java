package ejercicio14.java;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una cantidad múltiplo de 5€: ");
		int dineroUsu = sc.nextInt();
		int billetes;
		
		while (dineroUsu > 0) {
			if (dineroUsu >= 500) {
				billetes = dineroUsu / 500;
				System.out.println(billetes + " billete(s) de 500€");
				dineroUsu %= 500;
			} else if (dineroUsu >= 200) {
				billetes = dineroUsu / 200;
				System.out.println(billetes + " billete(s) de 200€");
				dineroUsu %= 200;
			} else if (dineroUsu >= 100) {
				billetes = dineroUsu / 100;
				System.out.println(billetes + " billete(s) de 100€");
				dineroUsu %= 100;
			} else if (dineroUsu >= 50) {
				billetes = dineroUsu / 50;
				System.out.println(billetes + " billete(s) de 50€");
				dineroUsu %= 50;
			} else if (dineroUsu >= 20) {
				billetes = dineroUsu / 20;
				System.out.println(billetes + " billete(s) de 20€");
				dineroUsu %= 20;
			} else if (dineroUsu >= 10) {
				billetes = dineroUsu / 10;
				System.out.println(billetes + " billete(s) de 10€");
				dineroUsu %= 10;
			} else if (dineroUsu >= 5) {
				billetes = dineroUsu / 5;
				System.out.println(billetes + " billete(s) de 5€");
				dineroUsu %= 5;
			}
		}
	}	
}
