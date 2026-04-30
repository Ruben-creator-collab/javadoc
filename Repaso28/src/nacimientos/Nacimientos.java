package nacimientos;

import java.util.Scanner;
import java.util.Scanner;

public class Nacimientos {

    static final int DIAS = 16; // del 16 al 31

    public static void main(String[] args) {

        String[] municipios = {
            "Antequera", "Ardales", "Benagalbon", "Coin", "Estepona",
            "Marbella", "Mijas", "Nerja", "Ronda", "Torrox"};

        int[][] nacimientos = {
            {0,31,1,0,0,0,0,0,0,0,0,7,0,33,42,22},
            {24,56,7,0,0,0,0,0,0,0,2,12,2,10,30,29},
            {17,22,5,0,0,0,0,0,0,1,2,9,1,13,36,32},
            {2,41,2,0,0,0,0,0,0,1,7,0,11,13,32,32},
            {0,3,0,0,0,0,0,0,0,0,6,0,11,58,3,0},
            {18,8,2,0,0,0,0,0,0,0,11,1,7,50,36,0},
            {1,14,0,0,0,0,0,0,0,0,8,0,17,35,64,0},
            {7,3,1,0,0,0,0,0,0,5,7,0,26,23,0,0},
            {3,5,0,0,0,0,0,0,0,0,15,4,7,130,43,0},
            {4,33,1,0,0,0,0,0,0,0,4,2,0,10,20,31}};

        nacimientoMunicipio(municipios, nacimientos);
        nacimientoDia(municipios, nacimientos);
        masNacimientos(nacimientos);
        MunicipioDia(municipios, nacimientos);
    }
    
    public static void nacimientoMunicipio(String[] municipios, int[][] nacimientos) {
        System.out.println("\nA) Día con más nacimientos por municipio");

        for (int i = 0; i < municipios.length; i++) {
            int max = nacimientos[i][0];
            int dia = 16;

            for (int j = 1; j < DIAS; j++) {
                if (nacimientos[i][j] > max) {
                    max = nacimientos[i][j];
                    dia = 16 + j;
                }
            }
            System.out.println(municipios[i] + ": día " + dia);
        }
    }


    public static void nacimientoDia(String[] municipios, int[][] nacimientos) {
        System.out.println("\nB) Municipio con más nacimientos por día");

        for (int j = 0; j < DIAS; j++) {
            int max = nacimientos[0][j];
            String municipio = municipios[0];

            for (int i = 1; i < municipios.length; i++) {
                if (nacimientos[i][j] > max) {
                    max = nacimientos[i][j];
                    municipio = municipios[i];
                }
            }
            System.out.println("Día " + (16 + j) + " → " + municipio);
        }
    }

    public static void masNacimientos(int[][] nacimientos) {
        int maxTotal = 0;
        int diaMax = 16;

        for (int j = 0; j < DIAS; j++) {
            int suma = 0;

            for (int i = 0; i < nacimientos.length; i++) {
                suma = suma + nacimientos[i][j];
            }

            if (suma > maxTotal) {
                maxTotal = suma;
                diaMax = 16 + j;
            }
        }

        System.out.println("\nC) Día con más nacimientos totales: " + diaMax);
    }

    public static void MunicipioDia(String[] municipios, int[][] nacimientos) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Municipio: ");
        String muni = sc.nextLine();

        System.out.println("Día (16-31): ");
        int dia = sc.nextInt();

        int pos = -1;
        for (int i = 0; i < municipios.length; i++) {
            if (municipios[i].equalsIgnoreCase(muni)) {
                pos = i;
            }
        }

        if (pos == -1 || dia < 16 || dia > 31) {
            System.out.println("Datos incorrectos");
        } else {
            int valor = nacimientos[pos][dia - 16];
            if (valor > 0) {
                System.out.println("Sí hubo nacimientos: " + valor);
            } else {
                System.out.println("No hubo nacimientos");
            }
        }
    }
}
