package ejercicio3;

import java.util.HashSet;
import java.util.Scanner;

public class PrincipalProducto {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		HashSet<Producto> lista = new HashSet<Producto>();

		String opcion = "";

		int cantidad = ((int) (Math.random() * 11) + 20);

		for (int i = 0; i < cantidad; i++) {

			String nombre = "Producto" + (i + 1);
			int precio = (int) (Math.random() * 50) + 5;

			String categoria;

			int numeroCategoria = ((int) (Math.random() * 3));

			if (numeroCategoria == 1) {

				categoria = "Hogar";

			} else if (numeroCategoria == 2) {

				categoria = "Deporte";

			} else {

				categoria = "Videojuegos";

			}

			lista.add(new Producto(nombre, precio, categoria));

		}

		do {

			System.out.println("a) Mostrar todos los productos");
			System.out.println("b) Contar cuántos productos hay por categoría");
			System.out.println("c) Calcular el precio total de todos los productos");
			System.out.println("d) Salir");
			System.out.println("");
			System.out.println("Elige una opcion: ");
			opcion = datos.next();

			if (opcion.equalsIgnoreCase("a")) {

				for (Producto i : lista) {

					System.out.println(i.toString());

				}

			} else if (opcion.equalsIgnoreCase("b")) {
				
				int hogar = 0, deportes = 0, videojuegos = 0;
				
				for(Producto i: lista) {
					
					if(i.getCategoria().equalsIgnoreCase("hogar")) {
						
						hogar++;
						
					}else if(i.getCategoria().equalsIgnoreCase("deporte")) {
						
						deportes++;
						
					}else if(i.getCategoria().equalsIgnoreCase("videojuegos")) {
						
						videojuegos++;
						
					}
					
				}
				
				System.out.println("Hay " + hogar + " productos de Hogar");
				System.out.println("Hay " + deportes + " productos de Deportes");
				System.out.println("Hay " + videojuegos + " productos de Videojuegos");

			} else if(opcion.equalsIgnoreCase("c")) {
				
				int total = 0;
				
				for (Producto i : lista) {
					
					total += i.getPrecio();
					
				}
				
				System.out.println("El precio total de todos los productos es de: " + total + "€");
				
			}

		} while (!opcion.equalsIgnoreCase("d"));

	}

}
