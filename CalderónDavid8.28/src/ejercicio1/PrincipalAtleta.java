/*Descripción: Implemento un ArrayList para hacer este ejercicio
 * Autor:David Calderón Navarro
 * Fecha:16/03/2026
 */

package ejercicio1;

import java.util.ArrayList;
import java.util.Random;

public class PrincipalAtleta {

	public static void main(String[] args) {
		
		ArrayList<Atleta> Atletas = new ArrayList<Atleta>();
		
		Random num = new Random();
		
		double sumaEdades = 0;
		double sumaAlturas = 0;
		int menores = 0;
		int mayores = 0;
		
		int cantidad = num.nextInt(11) + 20;
		
		for(int i = 0; i < cantidad; i++) {
			
			String nombre = "Atleta" + (i + 1);
			int edad = num.nextInt(30) + 10;
			double altura = num.nextDouble(1.90) + 0.70;
			
			Atletas.add(new Atleta(nombre, edad, altura));
			
		}
		
		for(Atleta i: Atletas) {
			
			sumaEdades = sumaEdades + i.getEdad();
			sumaAlturas = sumaAlturas + i.getAltura();
			
			if(i.getEdad() < 18) {
				
				menores++;
				
			}else {
				
				mayores++;
				
			}
			
		}
		
		double promedioEdad = sumaEdades / Atletas.size();
		double promedioAlturas = sumaAlturas / Atletas.size();
		
		//A
		
		System.out.println("Promedio de edades:" + promedioEdad);
		System.out.println("Promedio de las alturas:" + promedioAlturas);
		
		//B
		
		System.out.println("Atletas mayores de edad:" + mayores);
		System.out.println("Atletas menores de edad:" + menores);
		
		//C
		
		for(Atleta a: Atletas) {
			
			if(a.getAltura() > promedioAlturas) {
				
				System.out.println("Nombre: " + a.getNombre());
				
			}
			
		}
		
	}

}
