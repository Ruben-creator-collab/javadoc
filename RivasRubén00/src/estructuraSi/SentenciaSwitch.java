package estructuraSi;

import java.util.Scanner;

public class SentenciaSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime la nota: ");
		int nota = sc.nextInt();
		
		String notaTexto;
		
		switch(nota) {
		case 1,2: {
			notaTexto = "Insuficiente";
			break;
		}
		case 3: case 4: {
			notaTexto = "Insuficiente";
			break;
		}
		case 5: {
			notaTexto = "Insuficiente"; 
			break;
		}
		case 6: {
			notaTexto = "Bien";
			break;
		}
		case 7,8: {
			notaTexto = "Notable";
			break;
		}
		case 9,10: {
			notaTexto = "Sobresaliente";
			break;
		}
		default:{
			notaTexto = "Valor no válido";
		}
		}
		if (notaTexto.equals("Valor no válido")) {
			System.out.println("La nota no es válida");
		} else {
			System.out.println("La nota es: " + notaTexto);
		}

	}

}
