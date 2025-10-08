package pruebas;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos la operación
        System.out.println("Elige una operación: suma, resta, multiplicacion, division");
        String operacion = scanner.nextLine().toLowerCase();

        // Pedimos los números
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacionValida = true;

        // Dependiendo de la operación, hacemos el cálculo
        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num1 - num2;
                break;
            case "multiplicacion":
                resultado = num1 * num2;
                break;
            case "division":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: no se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operación no reconocida.");
                operacionValida = false;
        }

        if (operacionValida) {
            System.out.println("El resultado de la " + operacion + " es: " + resultado);
        }

        scanner.close();
    }
}
