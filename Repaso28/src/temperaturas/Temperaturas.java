package temperaturas;

public class Temperaturas {

    static final int DIAS = 7;
    static final int HORAS = 6;

    public static void main(String[] args) {

        // Nombres de los días de la semana
        String[] dias = {
            "Lunes", "Martes", "Miércoles",
            "Jueves", "Viernes", "Sábado", "Domingo"
        };

        // Temperaturas por día y hora
        int[][] temperaturas = {
            {12,14,16,13,17,21},
            {11,13,15,17,16,14},
            {10,12,14,16,15,13},
            {13,15,17,19,18,16},
            {14,16,18,20,19,17},
            {15,17,19,21,20,18},
            {13,15,17,19,18,16}
        };

        // Llamadas a los distintos apartados del ejercicio
        horamayorTemp(temperaturas, dias);
        tempMaxima(temperaturas, dias);
        tempMedia(temperaturas);
        horamas18(temperaturas, dias);

        diaTempMediaMin(temperaturas, dias);
        horasMenos15(temperaturas, dias);
        tempMinima(temperaturas, dias);
        primeraHora20(temperaturas, dias);
    }

    // a) Muestra la hora con la temperatura más alta de cada día
    public static void horamayorTemp(int[][] temp, String[] dias) {
        System.out.println("\na) Hora con mayor temperatura por día");

        for (int d = 0; d < DIAS; d++) {
            int max = temp[d][0];
            int horaMax = 0;

            for (int h = 1; h < HORAS; h++) {
                if (temp[d][h] > max) {
                    max = temp[d][h];
                    horaMax = h;
                }
            }
            System.out.println(dias[d] + " → hora " + horaMax);
        }
    }

    // b) Busca la temperatura más alta de toda la semana y el día en el que ocurre
    public static void tempMaxima(int[][] t, String[] dias) {
        int max = t[0][0];
        int diaMax = 0;

        for (int d = 0; d < DIAS; d++) {
            for (int h = 0; h < HORAS; h++) {
                if (t[d][h] > max) {
                    max = t[d][h];
                    diaMax = d;
                }
            }
        }

        System.out.println("\nb) Día más caluroso: " + dias[diaMax] + " (" + max + "°C)");
    }

    // c) Calcula la temperatura media de toda la semana
    public static void tempMedia(int[][] t) {
        int suma = 0;

        for (int d = 0; d < DIAS; d++) {
            for (int h = 0; h < HORAS; h++) {
                suma += t[d][h];
            }
        }

        double media = (double) suma / (DIAS * HORAS);
        System.out.println("\nc) Temperatura media semanal: " + media);
    }

    // d) Muestra la primera hora de cada día en la que se superan los 18 grados
    public static void horamas18(int[][] t, String[] dias) {
        System.out.println("\nd) Primera hora con temperatura > 18");

        for (int d = 0; d < DIAS; d++) {
            boolean encontrada = false;

            for (int h = 0; h < HORAS && !encontrada; h++) {
                if (t[d][h] > 18) {
                    System.out.println(dias[d] + ": hora " + h);
                    encontrada = true;
                }
            }

            if (!encontrada) {
                System.out.println(dias[d] + ": ninguna");
            }
        }
    }

    // e) Calcula la temperatura media de cada día y muestra el día con la más baja
    public static void diaTempMediaMin(int[][] t, String[] dias) {
        double minMedia = Double.MAX_VALUE;
        int diaMin = 0;

        for (int d = 0; d < DIAS; d++) {
            int suma = 0;
            for (int h = 0; h < HORAS; h++) {
                suma += t[d][h];
            }
            double media = (double) suma / HORAS;

            if (media < minMedia) {
                minMedia = media;
                diaMin = d;
            }
        }

        System.out.println("\ne) Día con menor temperatura media: "
                + dias[diaMin] + " (" + minMedia + "°C)");
    }

    // f) Cuenta cuántas horas tiene cada día con temperatura inferior a 15 grados
    public static void horasMenos15(int[][] t, String[] dias) {
        System.out.println("\nf) Horas con temperatura inferior a 15");

        for (int d = 0; d < DIAS; d++) {
            int contador = 0;

            for (int h = 0; h < HORAS; h++) {
                if (t[d][h] < 15) {
                    contador++;
                }
            }
            System.out.println(dias[d] + ": " + contador + " horas");
        }
    }

    // g) Busca la temperatura mínima de toda la semana y el día en el que aparece
    public static void tempMinima(int[][] t, String[] dias) {
        int min = t[0][0];
        int diaMin = 0;

        for (int d = 0; d < DIAS; d++) {
            for (int h = 0; h < HORAS; h++) {
                if (t[d][h] < min) {
                    min = t[d][h];
                    diaMin = d;
                }
            }
        }

        System.out.println("\ng) Temperatura mínima semanal: "
                + min + "°C (" + dias[diaMin] + ")");
    }

    // h) Muestra la primera hora de cada día en la que la temperatura es exactamente 20 grados
    public static void primeraHora20(int[][] t, String[] dias) {
        System.out.println("\nh) Primera hora con temperatura = 20");

        for (int d = 0; d < DIAS; d++) {
            boolean encontrada = false;

            for (int h = 0; h < HORAS && !encontrada; h++) {
                if (t[d][h] == 20) {
                    System.out.println(dias[d] + ": hora " + h);
                    encontrada = true;
                }
            }

            if (!encontrada) {
                System.out.println(dias[d] + ": ninguna");
            }
        }
    }
}
