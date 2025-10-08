package ejercicio4.java;

<<<<<<< HEAD
	import java.util.*;
	import java.util.concurrent.*;

	// Interfaz para definir una acción
	interface Accion {
	    void ejecutar();
	}

	// Clase principal
	public class Ejercicio4 {

	    public static void main(String[] args) {
	        System.out.println("🚀 Programa avanzado de Java iniciado!");

	        // Usando una lista de Acciones
	        List<Accion> acciones = new ArrayList<>();

	        // Acción lambda
	        acciones.add(() -> System.out.println("Acción 1: Lambda ejecutada"));

	        // Acción anónima
	        acciones.add(new Accion() {
	            @Override
	            public void ejecutar() {
	                System.out.println("Acción 2: Clase anónima ejecutada");
	            }
	        });

	        // Acción con hilo
	        acciones.add(() -> {
	            Thread hilo = new Thread(() -> System.out.println("Acción 3: Hilo corriendo"));
	            hilo.start();
	            try {
	                hilo.join();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        // Ejecutar todas las acciones
	        for (Accion accion : acciones) {
	            accion.ejecutar();
	        }

	        // Uso de ConcurrentHashMap
	        ConcurrentHashMap<String, Integer> mapa = new ConcurrentHashMap<>();
	        mapa.put("Sigma", 1);
	        mapa.put("Java", 2);
	        mapa.put("Flex", 3);

	        System.out.println("Contenido del mapa concurrente:");
	        mapa.forEach((clave, valor) -> System.out.println(clave + " -> " + valor));

	        // Uso de Stream API para filtrar y mapear
	        System.out.println("Filtrando claves que contienen 'a':");
	        mapa.keySet().stream()
	            .filter(k -> k.toLowerCase().contains("a"))
	            .map(String::toUpperCase)
	            .forEach(System.out::println);

	        System.out.println("🎉 Programa terminado con éxito!");
	    }
	}
=======
public class Ejercicio4 {
    
    enum Talla {
        PEQUEÑA, MEDIANA, GRANDE, EXTRAGRANDE
    }

    public static void main(String[] args) {

        Talla S = Talla.PEQUEÑA;
        Talla M = Talla.MEDIANA;
        Talla XL = Talla.GRANDE;
        Talla XXL = Talla.EXTRAGRANDE;

        System.out.println("La talla S es: " + S + " Es la más chica.");
        System.out.println("La talla M es: " + M + " Es una talla intermedia.");
        System.out.println("La talla XL es: " + XL + " Es una talla grande.");
        System.out.println("La talla XXL es: " + XXL + " Es la más grande de todas.");
    }
}
>>>>>>> 7f3c768e703eee54e825c6b1bb446ca75d4535e4

