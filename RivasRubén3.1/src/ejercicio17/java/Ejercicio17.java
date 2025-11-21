package ejercicio17.java;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] todos = new int[20];

        // Pedir 20 números al usuario
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < 20; i++) {
            todos[i] = sc.nextInt();
        }

        // Copiar los 10 primeros al primer array
        for (int i = 0; i < 10; i++) {
            array1[i] = todos[i];
        }

        // Copiar los 10 últimos al segundo array
        for (int i = 0; i < 10; i++) {
            array2[i] = todos[i + 10];
        }

        // Comparar los dos arrays
        if (Arrays.equals(array1, array2)) {
            System.out.println("Los dos arrays son iguales");
        } else {
            System.out.println("Los dos arrays son diferentes");
        }
    }
}
