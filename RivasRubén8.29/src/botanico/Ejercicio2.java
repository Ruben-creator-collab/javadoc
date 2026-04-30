package botanico;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/** Ejercicio 2. Búsqueda de especies de plantas populares
 * @author Profesor
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        
        // Constantes
        final int CANTIDAD_ESPECIES_PLANTAS = 10;
        // Variables de entrada
        
        // Variables auxiliares
    	ArrayList<String> lista1;
    	ArrayList<String> lista2;
    	Set<String> conjuntoPlantasPopulares;
    	ArrayList<Integer> listaPosicionesPopulares;
        // Variables de salida
    	ArrayList<String> listaPlantasPopulares;


        
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        System.out.println("BÚSQUEDA DE ESPECIES DE PLANTAS POPULARES");
        System.out.println("-----------------------------------------");
        
        
        // No hay, pues se usa un número fijo de elementos aleatorios

        // Rellenamos la lista con aleatorios hasta que haya CANTIDAD_ESPECIES_PLANTAS
        lista1 = new ArrayList<>();
        lista2 = new ArrayList<>();
        listaPosicionesPopulares = new ArrayList<>();
        listaPlantasPopulares = new ArrayList<>();
        while (lista1.size() < CANTIDAD_ESPECIES_PLANTAS) {
        	String especie = Utilidades.especiePlantaAleatoria();
        	lista1.add(especie);
        }
        System.out.println("Contenido inicial de la lista 1: " + lista1);
        while (lista2.size() < CANTIDAD_ESPECIES_PLANTAS) {
        	String especie = Utilidades.especiePlantaAleatoria();
        	lista2.add(especie);
        }
        System.out.println("Contenido inicial de la lista 2: " + lista2);
        
        // apartado 2.1, 2.3 y 2.4
        for (int i = 0; i < lista1.size(); i++) {
        	if(lista1.get(i).equals(lista2.get(i))) {
        		String marcada = "*" + lista1.get(i) + "*";

        		listaPlantasPopulares.add(lista1.get(i));
        		lista1.set(i, marcada);
        		lista2.set(i, marcada);
                listaPosicionesPopulares.add(i);
        	}
        }
        // apartado 2.2
        conjuntoPlantasPopulares = new HashSet<>(listaPlantasPopulares);
        
        // apartado 3.1
        

        
        //----------------------------------------------
        //               Procesamiento
        //----------------------------------------------


        // Recorremos a la vez las dos listas
        

        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------
        System.out.println(); 

        System.out.println("1. Contenido final de la lista 1: " + lista1);
        System.out.println("2. Contenido final de la lista 2: " + lista2);
        System.out.println("3. Contenido final de la lista de especies de plantas populares: " + listaPlantasPopulares);
        System.out.println("4. Contenido final de la lista de posiciones populares: " + listaPosicionesPopulares);
        System.out.println("5. Contenido final del conjunto de especies de plantas populares: " + conjuntoPlantasPopulares);

    }
}