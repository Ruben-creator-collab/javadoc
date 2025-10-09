package estructuraSi;

import java.util.Scanner;

public class EjercicioResuletoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el primer número: ");
        int inicio = sc.nextInt();

        System.out.print("Dime el segundo número: ");
        int fin = sc.nextInt();

        int secuencia = inicio;

        System.out.println("Esta es la secuencia de números desde " + inicio + " hasta " + fin + ":");
        
        if (inicio < fin) {
        while (secuencia <= fin) {
            System.out.print(secuencia + " ");
            secuencia++; 
        }
        } else {
        	while (secuencia >= fin) {
        	System.out.print(secuencia + " ");
        	secuencia--;
        	}
        }
    }
}
