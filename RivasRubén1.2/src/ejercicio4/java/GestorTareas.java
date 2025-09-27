package ejercicio4.java;

import java.util.*;
import java.util.concurrent.*;

// Interfaz para tareas
interface Tarea {
    void ejecutar();
}

public class GestorTareas {

    // Colores ANSI para consola
    public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String ROJO = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println("🚀 Gestor de Tareas Animado Iniciado!\n");

        ConcurrentHashMap<String, Integer> contador = new ConcurrentHashMap<>();
        List<Tarea> tareas = new ArrayList<>();

        tareas.add(() -> ejecutarTareaAnimada("Lavar platos", 2, contador));
        tareas.add(() -> ejecutarTareaAnimada("Estudiar Java", 5, contador));
        tareas.add(() -> ejecutarTareaAnimada("Hacer ejercicio", 3, contador));
        tareas.add(() -> ejecutarTareaAnimada("Ver serie", 1, contador));

        List<Thread> hilos = new ArrayList<>();
        for (Tarea tarea : tareas) {
            Thread hilo = new Thread(tarea::ejecutar);
            hilos.add(hilo);
            hilo.start();
        }

        // Esperar a que todas terminen
        hilos.forEach(h -> {
            try { h.join(); } catch (InterruptedException e) { e.printStackTrace(); }
        });

        // Mostrar tareas importantes
        System.out.println("\n📌 Tareas importantes (prioridad >= 3):");
        contador.entrySet().stream()
                .filter(e -> e.getValue() >= 3)
                .forEach(e -> System.out.println(AMARILLO + e.getKey() + " -> veces ejecutadas: " + e.getValue() + RESET));

        System.out.println("\n🎉 Todas las tareas completadas!");
    }

    static void ejecutarTareaAnimada(String nombre, int prioridad, ConcurrentHashMap<String, Integer> contador) {
        System.out.println("Iniciando: " + nombre + " (prioridad " + prioridad + ")");
        int total = 20;
        for (int i = 1; i <= total; i++) {
            try {
                Thread.sleep(200); // Simula tiempo de ejecución
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Barra de progreso con colores
            String barra = VERDE + "=".repeat(i) + RESET + "-".repeat(total - i);
            System.out.print("\r" + nombre + ": [" + barra + "]");
        }
        contador.merge(nombre, prioridad, Integer::sum);
        System.out.println(" " + ROJO + "✔" + RESET);
    }
}
