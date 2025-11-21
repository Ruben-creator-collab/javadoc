package ejercicio9.java;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroPequenno = 0;
		
		System.out.print("Dime un valor entero: ");
		int val1 = sc.nextInt();
		System.out.print("Dime otro valor entero: ");
		int val2 = sc.nextInt();
		System.out.print("Dime otro valor entero: ");
		int val3 = sc.nextInt();
		
		numeroPequenno = numMasPequenno(val1, val2);
		System.out.println("El número más pequeño es: " + numMasPequenno(numeroPequenno, val3));
		
		
		
	}
	public static int numMasPequenno(int a, int b) {
		int numeroPequenno = a;
		if (a < b) {
			numeroPequenno = a;
		} else if (b < a) {
			numeroPequenno = b;
		}
		return numeroPequenno;
	}

}
