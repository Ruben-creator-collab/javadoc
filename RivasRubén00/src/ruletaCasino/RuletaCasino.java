/*
 * Descripción: programa de java el cuál simula una ruleta del casino, con sus pérdidas y ganancias
 * Autor: Rubén Rivas y el Sigma
 * Fecha: 16/10/25
 */
package ruletaCasino;

import java.util.Random;
import java.util.Scanner;

public class RuletaCasino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        double saldo = 50.0; // Bono inicial
        System.out.println("🎰 Bienvenido a la Ruleta del Sigma 🎰");
        System.out.println("-----------------------------------");
        System.out.println("💵 Tu bono inicial: 50€");
        System.out.println("Apuestas disponibles:");
        System.out.println("1️⃣ Número exacto (0-36) — paga x35");
        System.out.println("2️⃣ Par / Impar — paga x2");
        System.out.println("3️⃣ Rojo / Negro — paga x2");
        System.out.println("💬 Escribe 'salir' en cualquier momento para terminar.\n");

        while (saldo > 0) {
            System.out.println("💰 Saldo actual: " + String.format("%.2f", saldo) + "€");
            System.out.print("👉 ¿Qué tipo de apuesta quieres hacer? (1/2/3 o salir): ");
            String opcion = sc.nextLine().trim().toLowerCase();

            if (opcion.equals("salir")) break;

            if (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3")) {
                System.out.println("❌ Opción no válida, prueba otra vez.\n");
                continue;
            }

            // cantidad a apostar
            System.out.print("💸 ¿Cuánto quieres apostar? (€): ");
            String entradaApuesta = sc.nextLine().trim().toLowerCase();
            if (entradaApuesta.equals("salir")) break;
            double apuesta;
            try {
                apuesta = Double.parseDouble(entradaApuesta);
                if (apuesta <= 0 || apuesta > saldo) {
                    System.out.println("⚠️ Apuesta no válida. Debe ser positiva y no mayor a tu saldo.\n");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Eso no es un número válido.\n");
                continue;
            }

            int numeroApostado = -1;
            String textoApostado = "";

            switch (opcion) {
                case "1":
                    System.out.print("🎯 Elige un número (0-36): ");
                    String entradaNum = sc.nextLine().trim().toLowerCase();
                    if (entradaNum.equals("salir")) return;
                    try {
                        numeroApostado = Integer.parseInt(entradaNum);
                        if (numeroApostado < 0 || numeroApostado > 36) {
                            System.out.println("❌ El número debe estar entre 0 y 36.\n");
                            continue;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("⚠️ Eso no es un número válido.\n");
                        continue;
                    }
                    break;

                case "2":
                    System.out.print("⚖️ Apuestas a (par/impar): ");
                    textoApostado = sc.nextLine().trim().toLowerCase();
                    if (textoApostado.equals("salir")) return;
                    if (!textoApostado.equals("par") && !textoApostado.equals("impar")) {
                        System.out.println("❌ Solo puedes elegir 'par' o 'impar'.\n");
                        continue;
                    }
                    break;

                case "3":
                    System.out.print("🎨 Apuestas a (rojo/negro): ");
                    textoApostado = sc.nextLine().trim().toLowerCase();
                    if (textoApostado.equals("salir")) return;
                    if (!textoApostado.equals("rojo") && !textoApostado.equals("negro")) {
                        System.out.println("❌ Solo puedes elegir 'rojo' o 'negro'.\n");
                        continue;
                    }
                    break;
            }

            System.out.println("\n🎡 Girando la ruleta...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int resultado = random.nextInt(37);
            String color = obtenerColor(resultado);
            System.out.println("➡️ La bola cayó en el número " + resultado + " (" + color + ")\n");

            boolean gana = false;
            double multiplicador = 0;

            switch (opcion) {
                case "1":
                    if (resultado == numeroApostado) {
                        gana = true;
                        multiplicador = 35;
                    }
                    break;
                case "2":
                    if (resultado != 0 && 
                        ((resultado % 2 == 0 && textoApostado.equals("par")) ||
                         (resultado % 2 != 0 && textoApostado.equals("impar")))) {
                        gana = true;
                        multiplicador = 2;
                    }
                    break;
                case "3":
                    if (color.equals(textoApostado)) {
                        gana = true;
                        multiplicador = 2;
                    }
                    break;
            }

            if (gana) {
                double ganancia = apuesta * (multiplicador - 1); // ganancia neta
                saldo += ganancia;
                System.out.println("🎉 ¡Ganaste, Sigma! Ganancia: +" + String.format("%.2f", ganancia) + "€ 😎");
            } else {
                saldo -= apuesta;
                System.out.println("💸 Mala suerte, Sigma. Pierdes " + String.format("%.2f", apuesta) + "€ 😢");
            }

            if (saldo <= 0) {
                System.out.println("\n💀 Te has quedado sin dinero, Sigma. Fin del juego.");
                break;
            }

            System.out.println("-----------------------------------\n");
        }

        System.out.println("🏁 Saldo final: " + String.format("%.2f", saldo) + "€");
        System.out.println("👋 Gracias por jugar en la Ruleta del Sigma, vuelve cuando tengas más pasta 😏");
        sc.close();
    }

    // Método para obtener color
    public static String obtenerColor(int numero) {
        if (numero == 0) return "verde";
        int[] rojos = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
        for (int r : rojos) {
            if (r == numero) return "rojo";
        }
        return "negro";
    }
}
