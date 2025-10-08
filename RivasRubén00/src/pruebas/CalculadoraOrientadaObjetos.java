package pruebas;

import java.util.Scanner;

// Clase que representa una operación matemática
class Operacion {
    private double num1;
    private double num2;
    private String tipo;

    // Constructor
    public Operacion(double num1, double num2, String tipo) {
        this.num1 = num1;
        this.num2 = num2;
        this.tipo = tipo.toLowerCase();
    }

    // Método que realiza el cálculo según el tipo de operación
    public double calcular() {
        switch (tipo) {
            case "suma":
                return num1 + num2;
            case "resta":
                return num1 - num2;
            case "multiplicacion":
                return num1 * num2;
            case "division":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("No se puede dividir entre cero.");
                }
            default:
                throw new IllegalArgumentException("Operación no válida: " + tipo);
        }
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir operación
        System.out.println("Elige una operación: suma, resta, multiplicacion, division");
        String tipo = scanner.nextLine();

        // Pedir números
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        // Crear objeto Operacion
        Operacion op = new Operacion(num1, num2, tipo);

        try {
            double resultado = op.calcular();
            System.out.println("El resultado de la " + tipo + " es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

