package repaso;

import java.util.Scanner;

public class Ejercicio9repaso {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        int contador = 0;



        if (n >= 2) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    contador++;
                }
            }

            if (contador == 2) {
                System.out.println(n + " es un número primo.");
            } else {
                System.out.println(n + " no es un número primo.");
            }
        } else {
            System.out.println(n + " no es un número primo.");
        }
	}
}