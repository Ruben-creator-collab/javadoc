/*
 * Descripción: Ejercicio en java que crea una matriz de NxM y dice cuantos valores son mayor, menor, igual que cero
 * Autor: Rubén Rivas
 * Fecha: 30/10/25
 */
package ejercicio3.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el tamaño de la columna de tu matriz: ");
		int columna = sc.nextInt();
		
		System.out.print("Dime el tamaño de la fila de tu matriz: ");
		int fila = sc.nextInt();
		
		int [][] matriz = new int [columna][fila];
		
		int val, mayorQueCero = 0, menorQueCero = 0, igualQueCero = 0;
		
		
		for (int contador = 0; contador < columna; contador++) {
			for(int i = 0; i < fila; i++) {
				System.out.print("Dime un valor (mayor, manor o igual que cero): ");
				val = sc.nextInt();
				matriz [contador][i] = val;
				if (val > 0) {
					mayorQueCero++;
				} else if (val < 0) {
					menorQueCero++;
				} else {
					igualQueCero++;
				}
			}
		
		}
		
		for (int contador = 0; contador < matriz.length; contador++) {
			for(int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[contador][i] + "\t");
			}
				System.out.println("");
		}
		
		System.out.println("Hay " + mayorQueCero + " valores mayor que cero");
		System.out.println("Hay " + menorQueCero + " valores menor que cero");
		System.out.println("Hay " + igualQueCero + " valores igual que cero");
		
	}

}
