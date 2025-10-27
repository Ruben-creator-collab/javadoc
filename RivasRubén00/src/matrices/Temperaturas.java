/*
 * Descripción:
 * Autor:
 * Fecha:
 */
package matrices;

public class Temperaturas {

	public static void main(String[] args) {
		final int TOTAL_MESES = 12; 
		final int TOTAL_DIAS = 30;
		
		
		int [][] temperatura; // Declaracion de un array bidimensional
		temperatura = new int[TOTAL_MESES][TOTAL_DIAS];
		
		int diaMasCalor = 0, tempMasAlta = 0, diaTemp10;

		
		for (int mes = 0; mes < temperatura.length; mes++) {		// Inicialización
			for (int dia = 0; dia < temperatura[mes].length; dia++) {
				temperatura [mes][dia] = (int)(Math.random()*40);
			}
		}
		for (int mes = 0; mes < temperatura.length; mes++) {		// Mostrando las temperaturas
			for (int dia = 0; dia < temperatura[mes].length; dia++) {
				System.out.print(temperatura[mes][dia] + "\t");
			}
			System.out.println();
		}
		for (int mes = 0; mes < temperatura.length; mes++) {
			tempMasAlta = temperatura[mes][0];		// Cada mes inicializo la temperatura más alta a la temperatura del primer dia
			for (int dia = 1; dia < temperatura[mes].length; dia++) {	// empiezo a comparar temperaturas a partir del segundo día
				if (tempMasAlta < temperatura[mes][dia]) {
					tempMasAlta = temperatura[mes][dia];
					diaMasCalor = dia;
				}
			}
			System.out.println("El dia " + diaMasCalor + " hubo " + tempMasAlta);
		}
		// Para cada mes, mostrar el primer dia con temperatura inforior a 10 grados
		for (int mes = 0; mes < temperatura.length; mes++) {
			diaTemp10 = -1; // Se inicia a -1 porque si no, se compararía en 1
			do {
				diaTemp10++;
			}while (temperatura[mes][diaTemp10] >= 10);
			System.out.println("Para el mes " + mes + " el primer día con menos de 10 grados es: " + diaTemp10);
		}
	}

}
