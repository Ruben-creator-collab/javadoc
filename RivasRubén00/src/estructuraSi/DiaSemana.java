package estructuraSi;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String diaSemana;
		System.out.print ("Dime un dia de la semana: ");
		diaSemana = sc.nextLine();
		
		boolean JUEVESMin = diaSemana.equals("JUEVES");
		boolean JUEVES = diaSemana.equals("jueves");
		
		if (diaSemana.equals("jueves") || diaSemana.equals("JUEVES")) {
			System.out.println("Correcto es jueves");
		}
		

	}

}
