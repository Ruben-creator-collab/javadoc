package botanico;

import java.util.HashSet;
import java.util.Set;

/**
 * Ejercicio 1. Creando jardín botánico
 * 
 * @author Profesor
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// ----------------------------------------------
		// Declaración de variables
		// ----------------------------------------------

		// Constantes
		final int CANTIDAD_ESPECIES_PLANTAS = 5;
		// Variables de entrada

		// Variables auxiliares
		Set<String> conjunto1;
		Set<String> conjunto2;
		Set<String> conjuntoUnion;
		Set<String> conjuntoInterseccion;
		Set<String> conjuntoDiferencia;
		// Variables de salida

		// ----------------------------------------------
		// Entrada de datos
		// ----------------------------------------------

		// No hay, pues se usa un número fijo de elementos aleatorios

		System.out.println("CONJUNTOS DE ESPECIES DE PLANTAS");
		System.out.println("--------------------------------");

		// ----------------------------------------------
		// Procesamiento
		// ----------------------------------------------

		// Rellenamos los conjuntos con especies de plantas aleatorias hasta que haya
		// CANTIDAD_ESPECIES_PLANTAS
		conjunto1 = new HashSet<>();
		conjunto2 = new HashSet<>();

		while (conjunto1.size() < CANTIDAD_ESPECIES_PLANTAS) {
			String especie = Utilidades.especiePlantaAleatoria();
			conjunto1.add(especie);
		}

		while (conjunto2.size() < CANTIDAD_ESPECIES_PLANTAS) {
			String especie = Utilidades.especiePlantaAleatoria();
			conjunto2.add(especie);
		}

		// Unión de los dos conjuntos
		conjuntoUnion = new HashSet<>(conjunto1);
		conjuntoUnion.addAll(conjunto2);

		// Intersección de los conjuntos
		conjuntoInterseccion = new HashSet<>(conjunto1);
		conjuntoInterseccion.retainAll(conjunto2);

		// Diferencia de los conjuntos
		conjuntoDiferencia = new HashSet<>(conjunto2);
		conjuntoDiferencia.removeAll(conjunto1);

		// ----------------------------------------------
		// Salida de Resultados
		// ----------------------------------------------

		// Recorremos el conjunto y mostramos su contenido por pantalla
		System.out.println("Contenido del conjunto 1:");

		for (String elemento : conjunto1) {
			System.out.println(elemento);
		}
		System.out.println("--------------------------------");
		System.out.println("Contenido del conjunto 2:");

		for (String elemento : conjunto2) {
			System.out.println(elemento);
		}
		System.out.println("--------------------------------");
		System.out.println("Contenido del conjunto union:");

		for (String elemento : conjuntoUnion) {
			System.out.println(elemento);
		}
		System.out.println("--------------------------------");
		System.out.println("Contenido del conjunto intersección:");

		for (String elemento : conjuntoInterseccion) {
			System.out.println(elemento);
		}
		System.out.println("---------------------------------");
		System.out.println("Contenido del conjunto diferencia:");

		for (String elemento : conjuntoDiferencia) {
			System.out.println(elemento);
		}
		System.out.println("---------------------------------");
		System.out.println("Conjunto C1: " + conjunto1);
		System.out.println("Conjunto C2: " + conjunto2);
		System.out.println("Unión C1 y C2: " + conjuntoUnion);
		System.out.println("Intersección C1 y C2: " + conjuntoInterseccion);
		System.out.println("Diferencia C2-C1: " + conjuntoDiferencia);

	}
}