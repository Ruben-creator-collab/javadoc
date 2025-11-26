package ejercicio20.java;

public class Ejercicio20 {

    public static void main(String[] args) {

        // imprimir las tablas del 1 al 10
        for (int i = 1; i <= 10; i++) {
            imprimirTabla(i);
            System.out.println();
        }
    }

    // función que imprime la tabla de multiplicar de un número
    public static void imprimirTabla(int numero) {
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
