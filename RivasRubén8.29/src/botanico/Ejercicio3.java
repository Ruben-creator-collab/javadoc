package botanico;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/** Ejercicio 3. Calendario de especies de plantas
 * @author Profesor
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        
        // Constantes
    	
        // Variables de entrada
        
        // Variables auxiliares
    	Map<LocalDate, String> calendario = new TreeMap<>();
    	Set<String> usadas;
    	LocalDate fecha;
        // Variables de salida
        

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        
        System.out.println("CALENDARIO DE ESPECIES DE PLANTAS");
        System.out.println("---------------------------------");
        
        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------
        
        fecha = LocalDate.now();
        usadas = new HashSet<>();
        for (int i = 0; i < 7; i++) {
        	String especie;
        	
        	do {
        	    especie = Utilidades.especiePlantaAleatoria();
        	} while (usadas.contains(especie));
        	
    	    usadas.add(especie);
    	    calendario.put(fecha, especie);
    	    fecha = fecha.plusDays(1);
        }
        
        //----------------------------------------------
        //           Salida de resultados
        //----------------------------------------------
        System.out.println("Contenido final del mapa de especies de plantas organizado por fechas:");
        for (Map.Entry<LocalDate, String> entrada : calendario.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
 
    }
}