/*Descripción: Implemento un ArrayList para hacer este ejercicio
 * Autor:David Calderón Navarro
 * Fecha:19/03/2026
 */

package ejercicio5.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import ejercicio4.java.ComparadorTrabajador;
import ejercicio4.java.Trabajador;

public class PrincipalPoblacion {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		ArrayList<Poblacion> censo = new ArrayList<Poblacion>();

		int cantidad = ((int) (Math.random() * 11) + 20);

		String opcion = "";

		for (int i = 0; i < cantidad; i++) {

			String nombre = "Persona" + (i + 1);
			int edad = ((int) (Math.random() * 40) + 18);

			String sexo;
			int numeroSexo = ((int) (Math.random() * 2));

			if (numeroSexo == 1) {

				sexo = "Masculino";

			} else {

				sexo = "Femenino";

			}

			String estado_civil;
			int numeroEstado = ((int) (Math.random() * 4));

			if (numeroEstado == 0) {

				estado_civil = "Casado/a";

			} else if (numeroEstado == 1) {

				estado_civil = "Soltero/a";

			} else if (numeroEstado == 2) {

				estado_civil = "Divorciado/a";

			} else {

				estado_civil = "Viudo/a";

			}
			
			censo.add(new Poblacion(nombre, sexo, estado_civil, edad));

		}

		do {

			System.out.println("");
			System.out.println("a) Buscar por sexo");
			System.out.println("b) Buscar por estado civil");
			System.out.println("c) Buscar por rango de edad");
			System.out.println("d) Buscar por sexo y estado civil");
			System.out.println("e) Salir");
			System.out.println("");
			System.out.println("Elige una opcion: ");
			opcion = datos.next();

			if (opcion.equals("a")) {

				System.out.println("Introduce el sexo: ");
				String sexoUsuario = datos.next();
				
				for (Poblacion i: censo) {
					
					if(i.getSexo().equalsIgnoreCase(sexoUsuario)) {
						
						System.out.println(i.toString());
						
					}
					
				}
				
			} else if (opcion.equals("b")) {
				
				System.out.println("Introduce el estado civil: ");
				String estadoUsuario = datos.next();
				
				for (Poblacion i: censo) {
					
					if(i.getEstadoCivil().equalsIgnoreCase(estadoUsuario)) {
						
						System.out.println(i.toString());
						
					}
					
				}

			} else if (opcion.equals("c")) {
				
				System.out.println("Introduce el anyo: ");
				int numanyo = datos.nextInt();
				
				for (Poblacion i : censo) {
					
					int anyo = 2026 - i.getEdad();
					
					if(numanyo > 1989 && numanyo < 2000 && anyo > 1989 && anyo < 2000) {
						
						System.out.println(i.toString());
						
					}else if(numanyo > 1999 && numanyo < 2010 && anyo > 1999 && anyo < 2010) {
						
						System.out.println(i.toString());
						
					}else if(numanyo > 1979 && numanyo < 1989 && anyo > 1979 && anyo < 1989) {
						
						System.out.println(i.toString());
						
					}else if(numanyo > 1969 && numanyo < 1979 && anyo > 1969 && anyo < 1979) {
						
						System.out.println(i.toString());
						
					}
					
				}

			} else if (opcion.equals("d")) {
				
				System.out.println("Introduce el sexo: ");
				String sexoUsuario2 = datos.next();
				
				System.out.println("Introduce el estado civil: ");
				String estadoUsuario2 = datos.next();
				
				for (Poblacion i: censo) {
					
					if(i.getSexo().equalsIgnoreCase(sexoUsuario2) && i.getEstadoCivil().equalsIgnoreCase(estadoUsuario2)) {
						
						System.out.println(i.toString());
						
					}
					
				}

			}

		} while (!opcion.equalsIgnoreCase("e"));

	}

}
