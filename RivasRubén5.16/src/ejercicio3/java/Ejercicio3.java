package ejercicio3.java;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Hora de inicio de las clases
        LocalTime inicioClases = LocalTime.of(8, 0);

        int hora = -1;
        int minuto = -1;

        // Lectura y validación de la hora
        while (true) {
            try {
                System.out.print("Introduce la hora (0-23): ");
                hora = sc.nextInt();
                if (hora >= 0 && hora <= 23) {
                    break;
                } else {
                    System.out.println("Hora fuera de rango.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número entero.");
                sc.next();
            }
        }

        // Lectura y validación del minuto
        while (true) {
            try {
                System.out.print("Introduce el minuto (0-59): ");
                minuto = sc.nextInt();
                if (minuto >= 0 && minuto <= 59) {
                    break;
                } else {
                    System.out.println("Minuto fuera de rango.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número entero.");
                sc.next();
            }
        }

        // Hora introducida por teclado
        LocalTime horaIntroducida = LocalTime.of(hora, minuto);

        // Horas de fin de cada clase
        LocalTime finProgramacion = inicioClases.plusHours(2);
        LocalTime finSistemas = finProgramacion.plusHours(2);
        LocalTime finEntornos = finSistemas.plusHours(2);

        String mensaje;

        if (horaIntroducida.isBefore(inicioClases)) {
            long minutos = horaIntroducida.until(inicioClases, ChronoUnit.MINUTES);
            mensaje = "Aún no han comenzado las clases. Faltan " + minutos + " minutos.";
        } 
        else if (!horaIntroducida.isAfter(finProgramacion)) {
            mensaje = "Estás en clase de Programación.";
        } 
        else if (!horaIntroducida.isAfter(finSistemas)) {
            mensaje = "Estás en clase de Sistemas Informáticos.";
        } 
        else if (!horaIntroducida.isAfter(finEntornos)) {
            mensaje = "Estás en clase de Entornos de Desarrollo.";
        } 
        else {
            long minutos = finEntornos.until(horaIntroducida, ChronoUnit.MINUTES);
            mensaje = "Las clases ya han terminado. Han pasado " + minutos + " minutos.";
        }

        // Salida final
        System.out.println("\nHora introducida: " + horaIntroducida);
        System.out.println(mensaje);

        sc.close();
    }
}
