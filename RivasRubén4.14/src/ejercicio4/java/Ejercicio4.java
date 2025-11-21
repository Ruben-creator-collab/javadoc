package ejercicio4.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un valor: ");
		int valor = sc.nextInt();
		int signo;
		signo = dimeSigno(valor);
		
		if (signo == -1) {
			System.out.println("Tu número es negativo");
		} else if (signo == 0) {
			System.out.println("Tu número es igual a cero");
		} else {
			System.out.println("Tu número es positivo");
		}
		
	}
	public static int dimeSigno(int a) {
		int negativo = -1, igual = 0, positivo = 1;
		int signo;
		
		if (a < 0) {
			signo = negativo;
		} else if (a == 0) {
			signo = igual;
		} else {
			signo = positivo;
		}
		return signo;
	}
	
	
}
