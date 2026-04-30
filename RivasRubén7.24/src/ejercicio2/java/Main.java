package ejercicio2.java;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Crear coches normales
        try {

            Coche c1 = new Coche(
                    "1234 ABC",
                    "Juan Pérez",
                    LocalDate.of(2020, 5, 10),
                    1800,
                    130
            );

            Coche c2 = new Coche();
            c2.setMatricula("5678 DEF");
            c2.setPropietario("Ana López");

            System.out.println(c1);
            System.out.println(c2);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Crear deportivo usando método
        Deportivo d1 = obtenerDeportivo();

        System.out.println("\nDeportivo creado:");
        System.out.println(d1);
    }

    // Método para crear deportivos por teclado
    public static Deportivo obtenerDeportivo() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- Crear Deportivo ---");

        System.out.print("Matrícula (9999 AAA): ");
        String matricula = sc.nextLine();

        System.out.print("Propietario: ");
        String propietario = sc.nextLine();

        System.out.print("Año matriculación: ");
        int año = sc.nextInt();

        System.out.print("Mes: ");
        int mes = sc.nextInt();

        System.out.print("Día: ");
        int dia = sc.nextInt();

        LocalDate fecha = LocalDate.of(año, mes, dia);

        System.out.print("Cilindrada: ");
        int cilindrada = sc.nextInt();

        System.out.print("Potencia: ");
        int potencia = sc.nextInt();

        sc.nextLine(); // limpiar buffer

        System.out.print("Tracción (total/delantera): ");
        String traccion = sc.nextLine();

        return new Deportivo(
                matricula,
                propietario,
                fecha,
                cilindrada,
                potencia,
                traccion
        );
    }
}