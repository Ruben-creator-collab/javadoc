package nacimientos;

public class Nacimientos {



    public static void main(String[] args) {



        diaConMasNacimientosPorMunicipio();

        municipioConMasNacimientosPorDia();

        diaConMasNacimientosTotales();

        comprobarNacimiento(30, "Ronda");

    }



    // Municipios

    static String[] municipios = {

        "Antequera", "Ardales", "Benagalbón", "Coín",

        "Estepona", "Marbella", "Mijas", "Nerja",

        "Ronda", "Torrox"

    };



    // Días del mes (16 al 31)

    static int[] dias = {

        16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31

    };



    // Nacimientos [municipio][día]

    static int[][] nacimientos = {

        {0,31,1,0,0,0,0,0,0,0,0,7,0,33,42,22},

        {24,56,7,0,0,0,0,0,0,0,2,12,2,10,30,29},

        {17,22,5,0,0,0,0,0,0,1,2,9,1,13,36,32},

        {2,41,2,0,0,0,0,0,0,0,1,7,0,11,13,32},

        {0,3,0,0,0,0,0,0,0,0,0,6,0,11,58,3},

        {18,8,2,0,0,0,0,0,0,0,0,11,1,7,50,36},

        {1,14,0,0,0,0,0,0,0,0,0,8,0,17,35,64},

        {7,3,1,0,0,0,0,0,0,0,5,7,0,26,23,0},

        {3,5,0,0,0,0,0,0,0,0,0,15,4,7,130,43},

        {4,33,1,0,0,0,0,0,0,0,4,2,0,10,20,31}

    };



    // A

    static void diaConMasNacimientosPorMunicipio() {

        System.out.println("A) Día con más nacimientos por municipio:");

        for (int i = 0; i < municipios.length; i++) {

            int max = 0, dia = 0;

            for (int j = 0; j < dias.length; j++) {

                if (nacimientos[i][j] > max) {

                    max = nacimientos[i][j];

                    dia = dias[j];

                }

            }

            System.out.println(municipios[i] + ": día " + dia);

        }

        System.out.println();

    }



    // B

    static void municipioConMasNacimientosPorDia() {

        System.out.println("B) Municipio con más nacimientos por día:");

        for (int j = 0; j < dias.length; j++) {

            int max = 0;

            String muni = "";

            for (int i = 0; i < municipios.length; i++) {

                if (nacimientos[i][j] > max) {

                    max = nacimientos[i][j];

                    muni = municipios[i];

                }

            }

            System.out.println("Día " + dias[j] + ": " + muni);

        }

        System.out.println();

    }



    // C

    static void diaConMasNacimientosTotales() {

        int maxTotal = 0, dia = 0;

        for (int j = 0; j < dias.length; j++) {

            int suma = 0;

            for (int i = 0; i < municipios.length; i++) {

                suma += nacimientos[i][j];

            }

            if (suma > maxTotal) {

                maxTotal = suma;

                dia = dias[j];

            }

        }

        System.out.println("C) Día con más nacimientos totales: " + dia);

        System.out.println();

    }



    // D

    static void comprobarNacimiento(int dia, String municipio) {

        for (int i = 0; i < municipios.length; i++) {

            if (municipios[i].equalsIgnoreCase(municipio)) {

                int indexDia = dia - 16;

                if (nacimientos[i][indexDia] > 0) {

                    System.out.println("D) Sí hubo nacimientos en " + municipio + " el día " + dia);

                } else {

                    System.out.println("D) No hubo nacimientos en " + municipio + " el día " + dia);

                }

                return;

            }

        }

        System.out.println("Municipio no encontrado");

    }

}
