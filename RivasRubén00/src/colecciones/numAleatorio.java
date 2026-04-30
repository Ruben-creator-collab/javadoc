package colecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class numAleatorio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contadorConjunto = 0;
		int contadorConjunto2 = 0;

		Integer numRan = new Integer((int) (Math.random() * 50 + 50));

		Set<Integer> conjunto = new HashSet<Integer>(numRan);

		for (int contador = 0; contador < numRan; contador++) {
			Integer numRan2 = new Integer((int) (Math.random() * 100));

			if (!conjunto.add(numRan2)) {
				System.out.println("No se pudo añadir el número " + numRan2 + " porque ya está en la lista.");
			} else {
				contadorConjunto++;
			}
		}
		System.out.println("Se han añadido: " + contadorConjunto + " números.");
		System.out.println("Hay dentro del conjunto los siguientes números: " + conjunto);

		System.out.println("-----------------------------------------------");

		System.out.print("Dime un número: ");
		Integer numUsu = new Integer(sc.nextInt());

		if (conjunto.contains(numUsu)) {
			System.out.println("El número " + numUsu + " está en el conjunto.");
			conjunto.remove(numUsu);
			System.out.println("Se ha eliminado el número: " + numUsu);
		} else {
			System.out.println("El número " + numUsu + " no está en el conjunto.");
			conjunto.add(numUsu);
			System.out.println("Se ha añadido el número: " + numUsu);
		}

		System.out.println("-----------------------------------------------");

		System.out.println("Hay dentro del conjunto los siguientes números: " + conjunto);

		System.out.println("---------------------Segundo conjunto-----------------------");

		Set<Integer> conjunto2 = new HashSet<Integer>(10);

		for (int contador = 0; contador < 10; contador++) {
			Integer numRan2 = new Integer((int) (Math.random() * 100));

			if (!conjunto2.add(numRan2)) {
				System.out.println();
				System.out.println("No se pudo añadir el número " + numRan2
						+ " en el segundo conjunto porque ya estaba en la lista.");
			} else {
			}
		}
		System.out.println();
		System.out.println("Estos son los números que hay en el segundo conjunto: " + conjunto2);
		System.out.println();
		
		System.out.println("--------------------Intersección retainAll-------------------");

		Set<Integer> copiaConjunto = new HashSet<>(conjunto);
		copiaConjunto.retainAll(conjunto2);
		
		System.out.println();
		System.out.println("Números que están en ambos conjuntos: " + copiaConjunto);
		System.out.println();

		System.out.println("--------------------Antes del addAll-------------------");
		System.out.println();
		System.out.println("Este es el tamaño del primer conjunto: " + conjunto.size());
		System.out.println("Este es el tamaño del segundo conjunto: " + conjunto2.size());

		try {
			conjunto.addAll(conjunto2);
		} catch (NullPointerException ex1) {
			System.out.println(ex1.getMessage());
		} catch (UnsupportedOperationException ex2) {
			System.out.println(ex2.getMessage());
		}
		System.out.println();
		System.out.println("--------------------Después del addAll-------------------");
		System.out.println();
		System.out.println("Este es el tamaño del primer conjunto: " + conjunto.size());
		System.out.println();
		System.out.println("-------------------Ver números pares e impares-----------");
		System.out.println("Esta es la suma de los números pares: " + sumaNumPar(conjunto));
		System.out.println("Esta es la suma de los números impares: " + sumaNumImpar(conjunto));
			
	}
	public static Integer sumaNumPar (Set<Integer> conjunto) {
		int suma = 0;
		for (Integer i: conjunto) {
			if(i % 2 == 0) {
				suma += i;
			}
		}
		
		return suma;
	}
	
	public static Integer sumaNumImpar (Set<Integer> conjunto) {
		int suma = 0;
		for (Integer i: conjunto) {
			if(i % 2 != 0) {
				suma += i;
			}
		}
		
		return suma;
	}
}
