package botanico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/** Ejercicio 4. Clasificación de especies de plantas coincidentes 
 * (con el mismo nombre y en la misma posición)
 * @author Profesor
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------

        // Constantes
        final int CANTIDAD_ESPECIES_PLANTAS = 20;
        // Variables de entrada
        
        // Variables auxiliares
        ArrayList<String> lista1;
        ArrayList<String> lista2;
        Map<String, ArrayList<Integer>> mapa1;
        // Variables de salida

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        
        System.out.println("CLASIFICACIÓN DE COINCIDENTES");
        System.out.println("-----------------------------");

        
        //----------------------------------------------
        //                 Procesamiento
        //----------------------------------------------
        lista1 = new ArrayList<>();
        lista2 = new ArrayList<>();
        mapa1 = new HashMap<>();
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
        
        for(int i = 0; i < lista1.size(); i++) {
        	if(lista1.get(i).equals(lista2.get(i))) {
        		String especie = lista1.get(i);
        		if(!mapa1.containsKey(especie)) {
        			mapa1.put(especie, new ArrayList<>());
        		}
        		mapa1.get(especie).add(i);
        	}
        }

        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------
        System.out.println();
        for (Map.Entry<String, ArrayList<Integer>> entrada : mapa1.entrySet()) {
            System.out.println(entrada.getKey() + "=" + entrada.getValue());
        }

    }
}