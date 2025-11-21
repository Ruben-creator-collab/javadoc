package ejercicio20.java;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[1000];
        
        // Rellenar el array con números aleatorios entre 0 y 99
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100);
        }

        System.out.print("Introduce un valor N para buscar en el array: ");
        int N = sc.nextInt();
        int NVeces = 0;

        // Contar cuántas veces aparece N
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == N) {
                NVeces++;
            }
        }

        if (NVeces > 0) {
            System.out.println("El número " + N + " aparece " + NVeces + " veces en el array.");
        } else {
            System.out.println("El número " + N + " no se encuentra en el array.");
        }
    }
}
