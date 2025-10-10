package estructuraSi;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el primer número: ");
        int inicio = sc.nextInt();

        System.out.print("Dime el segundo número: ");
        int fin = sc.nextInt();

  //    int secuencia = inicio;
        int contador;
        
        
        
        if (inicio <= fin) { 
        	System.out.println("Esta es la secuencia de números desde " + inicio + " hasta " + fin + ":");
        	contador = inicio;
        	do  {
        	if (contador % 3 == 0) {
            System.out.print(contador + " " );
        	}
            contador++;
        	} while (contador <= fin);
        
        } else {        	
        	System.out.println("Secuencia decreciente desde " + inicio + " hasta " + fin);
        	contador = inicio;
        	do {
        	if (contador % 3 == 0) {
        		System.out.print(contador + " ");
        		contador--;
        	}
        	} while (contador >= fin);
        }
    }
}

