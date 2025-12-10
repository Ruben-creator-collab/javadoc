package ejercicio2.java;

import java.util.Arrays;

import libtarea3.Dado;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		// apartado 1
		// apartado 1.1
		System.out.printf("Número total de dados creados hasta el momento %d \n", Dado.getNumeroDadosCreados());
		System.out.println();
		
		// apartado 1.2
		System.out.printf("Número total de lanzamientos llevados a cabo hasta el momento %d \n", Dado.getNumeroLanzamientosGlobal());
		System.out.println();
		
		// apartado 1.3
		System.out.printf("Cantidad de veces que han salido las caras con valores 1 en total %d \n", Dado.getNumeroVecesCaraGlobal(1));
		System.out.printf("Cantidad de veces que han salido las caras con valores 2 en total %d \n", Dado.getNumeroVecesCaraGlobal(2));
		System.out.printf("Cantidad de veces que han salido las caras con valores 3 en total %d \n", Dado.getNumeroVecesCaraGlobal(3));
		System.out.printf("Cantidad de veces que han salido las caras con valores 4 en total %d \n", Dado.getNumeroVecesCaraGlobal(4));
		System.out.println();
		
		// apartado 2
		// apartado 2.1
		Dado[] dados = new Dado[10];

        for (int i = 0; i < dados.length; i++) {

            int numCaras = (int)(Math.random() * 9); // valores 0–8

            try {
                // Intento de creación
                dados[i] = new Dado(numCaras);

         // apartado 2.2
                for (int j = 0; j < dados[i].getNumeroCaras(); j++) {
                    dados[i].lanzar();
                }

            } catch (IllegalArgumentException ex) {
                System.out.printf("Error creando dado con %d caras: %s\n", numCaras, ex.getMessage());
            }
        }

        System.out.println();
        
        
        
		// apartado 2.3
		for (int contador = 0; contador < dados.length; contador++) {

			if (dados[contador] != null) {
				System.out.printf("La serie histórica de lanzamientos del dado: %s \n", dados[contador].getSerieHistoricaLanzamientos());
				System.out.printf("La suma total de todos los lanzamientos del dado: %d \n", dados[contador].getSumaPuntuacionHistorica());
			} else {

			}

		}
		
		System.out.println();
		
		// apartado 3
		// apartado 3.1
		System.out.printf("Dados creados finalmente: %d\n", Dado.getNumeroDadosCreados());
		
		// apartado 3.2
        System.out.printf("Lanzamientos globales finales: %d\n", Dado.getNumeroLanzamientosGlobal());
        
        // apartado 3.3
        System.out.printf("Veces que salió cara 1: %d\n", Dado.getNumeroVecesCaraGlobal(1));
        System.out.printf("Veces que salió cara 2: %d\n", Dado.getNumeroVecesCaraGlobal(2));
        System.out.printf("Veces que salió cara 3: %d\n", Dado.getNumeroVecesCaraGlobal(3));
        System.out.printf("Veces que salió cara 4: %d\n", Dado.getNumeroVecesCaraGlobal(4));

		
	}

}
