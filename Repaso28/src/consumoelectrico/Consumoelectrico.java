package consumoelectrico;

public class Consumoelectrico {

    static final int HORAS = 24;
    static final int DIAS = 7;

    public static void main(String[] args) {

        // Nombres de los días de la semana
        String[] dias = {
            "Lunes", "Martes", "Miércoles",
            "Jueves", "Viernes", "Sábado", "Domingo"
        };

        // Consumo eléctrico por hora (filas) y día (columnas)
        int[][] consumo = {
            {21,5,39,1,8,28,2,2},
            {26,25,7,12,23,7,16},
            {40,28,17,37,37,27,16},
            {32,5,14,6,16,5,36},
            {32,10,2,7,0,21,33},
            {15,30,12,30,28,27,9},
            {27,14,34,31,5,37,34},
            {15,6,21,3,13,17,23},
            {31,35,3,15,35,39,4},
            {3,33,40,35,10,8,26},
            {20,29,29,2,22,29,14},
            {32,9,31,38,18,30,26},
            {2,32,1,6,28,22,10},
            {18,15,18,30,6,10,11},
            {27,8,14,32,12,6,12},
            {2,37,9,31,21,32,31},
            {40,15,31,2,12,39,27},
            {31,39,1,32,38,18,17},
            {24,19,6,6,26,34,20},
            {37,30,37,14,15,0,12},
            {15,40,11,14,39,25,24},
            {24,14,5,21,24,35,32},
            {10,18,37,21,37,4,11},
            {36,2,30,38,4,29,33}
        };

        // Llamadas a los distintos apartados del ejercicio
        consumoMinimo(consumo, dias);
        minimoSemanal(consumo);
        totalSemana(consumo);
        primerConsumomenos10(consumo, dias);
    }

    // a) Para cada hora, muestra el día con menor consumo eléctrico
    public static void consumoMinimo(int[][] consumo, String[] dias) {
        System.out.println("\na) Día con consumo mínimo por hora");

        for (int h = 0; h < HORAS; h++) {
            int min = consumo[h][0];
            int diaMin = 0;

            for (int d = 1; d < DIAS; d++) {
                if (consumo[h][d] < min) {
                    min = consumo[h][d];
                    diaMin = d;
                }
            }
            System.out.println("Hora " + h + ": " + dias[diaMin]);
        }
    }

    // b) Busca el consumo más bajo de toda la semana y la hora en la que ocurre
    public static void minimoSemanal(int[][] consumo) {
        int min = consumo[0][0];
        int horaMin = 0;

        for (int h = 0; h < HORAS; h++) {
            for (int d = 0; d < DIAS; d++) {
                if (consumo[h][d] < min) {
                    min = consumo[h][d];
                    horaMin = h;
                }
            }
        }

        System.out.println("\nb) Hora con consumo mínimo semanal: "
                + horaMin + " (" + min + ")");
    }

    // c) Suma todo el consumo eléctrico de la semana
    public static void totalSemana(int[][] consumo) {
        int total = 0;

        for (int h = 0; h < HORAS; h++) {
            for (int d = 0; d < DIAS; d++) {
                total += consumo[h][d];
            }
        }

        System.out.println("\nc) Consumo total de la semana: " + total);
    }

    // d) Para cada hora, muestra el primer día con consumo inferior a 10
    public static void primerConsumomenos10(int[][] consumo, String[] dias) {
        System.out.println("\nd) Primer día con consumo inferior a 10");

        for (int h = 0; h < HORAS; h++) {
            boolean encontrado = false;

            for (int d = 0; d < DIAS && !encontrado; d++) {
                if (consumo[h][d] < 10) {
                    System.out.println("Hora " + h + ": " + dias[d]);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Hora " + h + ": ninguno");
            }
        }
    }
}
