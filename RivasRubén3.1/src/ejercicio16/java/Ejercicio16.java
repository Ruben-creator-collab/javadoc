package ejercicio16.java;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		
        int[] array = new int[55];
        int inicio = 0;  // posición inicial del bloque
        int fin = 0;     // posición final del bloque

        // del 1 al 10
        for (int num = 1; num <= 10; num++) {
            fin = inicio + num; // cada número se repite 'num' veces
            Arrays.fill(array, inicio, fin, num); // rellenamos con Arrays.fill
            inicio = fin; // el siguiente bloque empieza donde acaba el anterior
        }

        // mostrar el array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}