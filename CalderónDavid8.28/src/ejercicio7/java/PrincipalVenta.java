package ejercicio7.java;

import java.util.ArrayList;
import java.util.Scanner;

import ejercicio5.java.Poblacion;

public class PrincipalVenta {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		ArrayList<Venta> año = new ArrayList<Venta>();

		String opcion = "", letra = "A";

		do {

			System.out.println("");
			System.out.println("1) Introducir la venta de coches de cada uno de los meses del año");
			System.out.println("2) Mostrar las ventas introducidas en el punto anterior");
			System.out.println("3) Mostrar la suma total de ventas de coches del año");
			System.out.println("4) Mostrar las ventas totales de los meses que empiezan por la letra A");
			System.out.println("5) Mostrar el nombre del mes con más ventas");
			System.out.println("6) Salir del programa");
			System.out.println("");
			System.out.println("Elige una opcion: ");
			opcion = datos.next();

			if (opcion.equals("1")) {

				String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
						"Septiembre", "Octubre", "Noviembre", "Diciembre" };

				for (int cont = 0; cont < 12; cont++) {

					System.out.print("Dime la venta de coches de " + meses[cont] + ": ");
					int venta = datos.nextInt();

					Venta mes = new Venta(meses[cont], venta);
					año.add(mes);

				}

			} else if (opcion.equals("2")) {
				
				for (Venta i: año) {
					
					System.out.println(i.toString());
					
				}

			} else if (opcion.equals("3")) {
				
				int sumaTotal = 0;
				
				for (Venta i: año) {
					
					sumaTotal = sumaTotal + i.getVentaCoches();
					
				}
				
				System.out.printf("La suma total de coches vendidos en un año es de: %d" , sumaTotal);
				System.out.println("");
				
			} else if (opcion.equals("4")) {
				
				for (Venta i: año) {
					
					if (i.getNombreMes().toLowerCase().startsWith("a")) {
				        System.out.println(i.toString());
				    }
					
				}
				
			} else if (opcion.equals("5")) {

			}

		} while (!opcion.equalsIgnoreCase("6"));

	}

}
