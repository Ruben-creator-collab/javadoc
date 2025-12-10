package ejerciciosResueltos;

import java.util.Scanner;

public class Ejercicio2 {

    static final int DIAS = 16;   // Del 16 al 31
    static final int DIA_INICIAL = 16;

    public static void main(String[] args) {

        String[] municipios = {
            "Antequera", "Ardales", "Benagalbon", "Coin", "Estepona",
            "Marbella", "Mijas", "Nerja", "Ronda", "Torrox"
        };

        int[][] datos = {
            {0,31,1,0,0,0,0,0,0,0,7,0,0,33,42,22},
            {24,56,7,0,0,0,0,0,0,0,2,12,2,10,30,29},
            {17,22,5,0,0,0,0,0,0,1,2,9,1,13,36,32},
            {2,41,2,0,0,0,0,0,0,0,1,7,0,11,13,32},
            {0,3,0,0,0,0,0,0,0,0,6,0,0,11,58,3},
            {18,8,2,0,0,0,0,0,0,0,0,11,1,7,50,36},
            {1,14,0,0,0,0,0,0,0,0,8,8,0,17,35,64},
            {7,3,1,0,0,0,0,0,0,0,5,7,0,26,23,0},
            {3,5,0,0,0,0,0,0,0,0,15,4,7,130,43,0},
            {4,33,1,0,0,0,0,0,0,0,4,2,0,10,20,31}
        };

        Scanner sc = new Scanner(System.in);

        // A) Día de más nacimientos por municipio
        System.out.println("\nA) Día con más nacimientos por municipio:");
        for (int i = 0; i < municipios.length; i++) {
            int d = diaMaxMunicipio(datos[i]);
            System.out.println(municipios[i] + " → día " + (DIA_INICIAL + d));
        }

        // B) Municipio con más nacimientos por día
        System.out.println("\nB) Municipio con más nacimientos por día:");
        for (int d = 0; d < DIAS; d++) {
            int m = municipioMaxDia(datos, d);
            System.out.println("Día " + (DIA_INICIAL + d) + " → " + municipios[m]);
        }

        // C) Día con más nacimientos totales
        int diaMax = diaMaxTotal(datos);
        System.out.println("\nC) Día con más nacimientos totales: " + (DIA_INICIAL + diaMax));

        // D) Consulta
        System.out.println("\nD) Consulta de municipio y día");
        System.out.print("Municipio: ");
        String muni = sc.nextLine();
        System.out.print("Día (16 a 31): ");
        int dia = sc.nextInt();

        consultar(municipios, datos, muni, dia);
    }

    // ------------ MÉTODOS -------------

    public static int diaMaxMunicipio(int[] fila) {
        int max = -1, dia = 0;
        for (int i = 0; i < DIAS; i++) {
            if (fila[i] > max) {
                max = fila[i];
                dia = i;
            }
        }
        return dia;
    }

    public static int municipioMaxDia(int[][] datos, int dia) {
        int max = -1, mun = 0;
        for (int i = 0; i < datos.length; i++) {
            if (datos[i][dia] > max) {
                max = datos[i][dia];
                mun = i;
            }
        }
        return mun;
    }

    public static int diaMaxTotal(int[][] datos) {
        int mejorDia = 0;
        int maxTotal = -1;

        for (int d = 0; d < DIAS; d++) {
            int suma = 0;
            for (int m = 0; m < datos.length; m++) {
                suma += datos[m][d];
            }
            if (suma > maxTotal) {
                maxTotal = suma;
                mejorDia = d;
            }
        }
        return mejorDia;
    }

    public static void consultar(String[] municipios, int[][] datos, String muni, int dia) {
        int index = -1;

        for (int i = 0; i < municipios.length; i++) {
            if (municipios[i].equalsIgnoreCase(muni)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Municipio no encontrado.");
            return;
        }

        int valor = datos[index][dia - DIA_INICIAL];

        if (valor > 0)
            System.out.println("Sí hubo nacimientos: " + valor);
        else
            System.out.println("Ese día no hubo nacimientos.");
    }
}
