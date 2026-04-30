/*
 * Objetivo: Desarrollo el principal con Objetos Coche y Moto
 * Autor: David Calderón Navarro
 * Fecha: 15/04/2026
 */

package calderón1;

import java.time.LocalDate;
import java.util.Random;

public class Principal {
	
    public static void main(String[] args) {

        // 1. Crear coche por defecto
        Coche coche = new Coche();
        System.out.println("Coche creado");

        // 2. Alquiler 10 días
        System.out.println("Precio coche 10 días: " + coche.calcularAlquiler(10));

        // 3. Crear moto
        Moto moto = new Moto("1234 ABC");
        System.out.println("Moto creada");

        // 4. Alquiler 5 días
        System.out.println("Precio moto 5 días: " + moto.calcularAlquiler(5));

        // 5. Fecha aleatoria válida
        Random r = new Random();
        boolean valida = false;

        while (!valida) {
            try {
                int año = 1990 + r.nextInt(21);
                LocalDate fecha = LocalDate.of(año, 1, 1);
                System.out.println("Probando fecha: " + fecha);

                coche.setFechaFabricacion(fecha);
                valida = true;

                System.out.println("Fecha válida asignada: " + fecha);

            } catch (Exception e) {
                System.out.println("Fecha inválida");
            }
        }
    }
}