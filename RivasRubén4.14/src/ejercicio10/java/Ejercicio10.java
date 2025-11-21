package ejercicio10.java;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el día: ");
		int dia = sc.nextInt();
		System.out.print("Dime el mes: ");
		int mes = sc.nextInt();
		System.out.print("Dime el año: ");
		int anno = sc.nextInt();
		
		if (fechaCorrecta(dia, mes, anno)) {
			System.out.println("La fecha es correcta. ");
		} else {
			System.out.println("La fecha es incorrecta. ");
		}

	}
	public static boolean fechaCorrecta(int dia, int mes, int anno) {
	    if (dia < 1 || mes < 1 || mes > 12 || anno < 1) {
	        return false;
	    }

	    int diasMes;

	    switch (mes) {
	        case 4: case 6: case 9: case 11:
	            diasMes = 30;
	            break;
	        case 2:
	            diasMes = 28; 
	            break;
	        default:
	            diasMes = 31;
	    }

	    return dia <= diasMes;
	}

}
