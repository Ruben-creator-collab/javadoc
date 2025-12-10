/*
 * Descripción: Programa que calcula año, meses y dias de la fecha escrita por el usuario
 * Auto: Rubén Rivas
 * Fecha: 04/12/25
 */
package fechanacimiento;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class FechaNacimiento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu fecha de nacimiento en el siguiente formato(aaaa-mm-dd): ");
		String fechaNacimiento = sc.nextLine();
		LocalDate objNacimiento = LocalDate.parse(fechaNacimiento);
		LocalDate objHoy = LocalDate.now();
		
		Period tiempoVivo = Period.between(objNacimiento, objHoy);
		System.out.println(tiempoVivo);
	}

}
