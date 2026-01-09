/*Descripción: Programa que al introducir tu fecha de nacimiento te dice que dia de la semana de los siguientes años cae en tu cumpleaños
 * Autor:Rubén Rivas Flores
 * Fecha:12/12/2025
 */

package ejercicio2.java;

import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int anyo, mes, dia;

//1

		do {

			try {

				System.out.println("Dime tu anyo de nacimiento: (En numero entero)");
				anyo = datos.nextInt();

			} catch (InputMismatchException ex1) {

				System.out.println("Formato incorrecto; Porfavor introduzca un numero entero");
				anyo = 0;

			}

			datos.nextLine();

		} while (anyo < 1900 || anyo > 2025);

//2

		do {

			try {

				System.out.println("Dime tu mes de nacimiento: (1-12)(En numero entero)");
				mes = datos.nextInt();

			} catch (InputMismatchException ex2) {

				System.out.println("Formato incorrecto; Porfavor introduzca un numero entero");
				mes = 0;

			}

			datos.nextLine();

		} while (mes < 1 || mes > 12);

//3

		do {

			try {

				System.out.println("Dime tu dia de nacimiento: (1-31)(En numero entero)");
				dia = datos.nextInt();

			} catch (InputMismatchException ex2) {

				System.out.println("Formato incorrecto; Porfavor introduzca un numero entero");
				dia = 0;

			}

			datos.nextLine();

			try {

				LocalDate nacimientousu = LocalDate.of(anyo, mes, dia);

				System.out.println(nacimientousu.getDayOfWeek());

			} catch (DateTimeException ex3) {

				System.out.println("Dia incorrecto; vuelve a introducirlo");
				dia = 0;

			}

		} while (dia < 1 || dia > 31);

//4

		LocalDate fechacomprobacion;

		DateTimeFormatter formatofecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		for (int i = anyo; i <= 2025; i++) {

			try {

				fechacomprobacion = LocalDate.of(i, mes, dia);

				LocalDate fechausu = LocalDate.of(anyo, mes, dia);

				if (fechacomprobacion.getDayOfWeek() == fechausu.getDayOfWeek()) {

					System.out.println(fechacomprobacion.format(formatofecha));

				}

			} catch (DateTimeException ex4) {

			}

		}

	}

}
