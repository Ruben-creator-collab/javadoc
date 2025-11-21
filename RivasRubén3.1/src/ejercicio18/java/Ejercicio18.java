package ejercicio18.java;

import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		int [] array = new int [30];
		
		for (int contador = 0; contador < array.length; contador++) {
			array[contador] = (int) (Math.random()*10);
		}
		Arrays.sort(array);
		
		for (int contador = 0; contador < array.length; contador++) {
			System.out.print(array[contador] + "\t");
		}
		
	}

}
