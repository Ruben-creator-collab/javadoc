package matrices;

public class Temperaturas2 {

	public static void main(String[] args) {
		
			final int TOTAL_MESES = 12; 
			final int TOTAL_DIAS = 30;
			
			
			int [][] temperatura; // Declaracion de un array bidimensional
			temperatura = new int[TOTAL_MESES][TOTAL_DIAS];
			
			String [] textoMes;
			textoMes = new String [TOTAL_MESES];
			
			int diaMasCalor = 0, tempMaxima = 0, mesMax = 0;
			
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
			
			for (int dia = 0; dia < 30; dia++) {
				for (int mes = 0; mes < 12; mes++) {
					if (tempMaxima < temperatura[dia][mes]) {
						tempMaxima = temperatura[dia][mes];
					}
				}
			}
			String[] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
			
			System.out.println(tempMaxima);
			System.out.println(meses[mesMax]);
	}
}
