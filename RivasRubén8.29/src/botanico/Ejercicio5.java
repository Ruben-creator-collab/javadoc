package botanico;

/** Ejercicio 5. Ordenación de especies de plantas (por nombre y longitud)
 * @author Profesor
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        
        // Constantes
        final int CANTIDAD_ESPECIES_PLANTAS = 5;
        
        // Variables auxiliares
        ArrayList<String> lista;
        Set<String> usadas;

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        System.out.println("ORDENACIÓN DE ESPECIES DE PLANTAS");
        System.out.println("---------------------------------");

        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------

        lista = new ArrayList<>();
        usadas = new HashSet<>();

        // Rellenar sin repetidos
        while (lista.size() < CANTIDAD_ESPECIES_PLANTAS) {
            String especie = Utilidades.especiePlantaAleatoria();
            if (!usadas.contains(especie)) {
                usadas.add(especie);
                lista.add(especie);
            }
        }

        // Mostrar lista inicial
        System.out.println("Contenido inicial:");
        for (String e : lista) {
            System.out.println(e);
        }

        // Ordenar por nombre
        Collections.sort(lista, new ComparadorEspeciePlantaPorNombre());

        System.out.println("\nOrdenado por nombre:");
        for (String e : lista) {
            System.out.println(e);
        }

        // Ordenar por longitud
        Collections.sort(lista, new ComparadorEspeciePlantaPorLongitud());

        System.out.println("\nOrdenado por longitud:");
        for (String e : lista) {
            System.out.println(e);
        }
    }
}