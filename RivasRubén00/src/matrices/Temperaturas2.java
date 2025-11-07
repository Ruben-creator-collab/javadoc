package matrices;

public class Temperaturas2 {

	public static void main(String[] args) {
		
			final int TOTAL_MESES = 12; 
			final int TOTAL_DIAS = 30;
			
			
			int [][] temperatura; // Declaracion de un array bidimensional
			temperatura = new int[TOTAL_MESES][TOTAL_DIAS];
			
			inicializacion(temperatura);
			mostrar(temperatura);
			System.out.println("La temperatura maxima de todo el año ha sido: " + tempMaxima(temperatura));
			
			

//			String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
			
//			System.out.println(tempMaxima);
//		System.out.println(meses[mesMax]);
	}
	
	// Inicialización a un valor aleatorio entre 0 y 40 todos los dias
	public static void inicializacion (int[][] temperatura) {		
		for (int mes = 0; mes < temperatura.length; mes++) {		
			for (int dia = 0; dia < temperatura[mes].length; dia++) {
				temperatura [mes][dia] = (int)(Math.random()*40);
			}
		}
	}
	// Muestra las temperaturas
	public static void mostrar (int[][] temperatura) {
		for (int mes = 0; mes < temperatura.length; mes++) {
			for (int dia = 0; dia < temperatura[mes].length; dia++) {
				System.out.print(temperatura[mes][dia] + "\t");
			}
			System.out.println();
		}
	}
	// Calcula la temperatura máxima de todo el año
	public static int tempMaxima (int[][] temperatura) {
		int  tempMaxima = temperatura [0][0];
		for (int dia = 0; dia < 30; dia++) {
			for (int mes = 0; mes < 12; mes++) {
				if (tempMaxima < temperatura[mes][dia]) {
					tempMaxima = temperatura[mes][dia];
				}
			}
		}
		return tempMaxima;
	}
	
}
