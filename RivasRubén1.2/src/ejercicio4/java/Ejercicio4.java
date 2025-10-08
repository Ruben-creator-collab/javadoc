package ejercicio4.java;

public class Ejercicio4 {
    
    enum Talla {
        PEQUEÑA, MEDIANA, GRANDE, EXTRAGRANDE
    }

    public static void main(String[] args) {

        Talla S = Talla.PEQUEÑA;
        Talla M = Talla.MEDIANA;
        Talla XL = Talla.GRANDE;
        Talla XXL = Talla.EXTRAGRANDE;

        System.out.println("La talla S es: " + S + " Es la más chica.");
        System.out.println("La talla M es: " + M + " Es una talla intermedia.");
        System.out.println("La talla XL es: " + XL + " Es una talla grande.");
        System.out.println("La talla XXL es: " + XXL + " Es la más grande de todas.");
    }
}

