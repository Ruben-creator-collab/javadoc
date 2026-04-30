package ejercicio1.java;

import java.util.ArrayList;
import java.util.Random;

import atleta.java.Atleta;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		ArrayList<Atleta> atletas = new ArrayList<>();
		
		// generar entre 20 y 30 atletas
		Random num = new Random();
		
		int cantidadAtletas = num.nextInt(11)+20;
		
		for(int j = 0; j < cantidadAtletas; j++) {
			
			String nombre = "Atleta" + (j + 1);
			int edad = (int) (Math.random()*23)+10;
			double altura = (Math.random()*0.5)+1.5;
			
			atletas.add(new Atleta (nombre, edad, altura));
		}
		int sumaEdades = 0;
		double sumaAltura = 0;
		
		for (Atleta i: atletas) {
			sumaEdades += i.getEdad();
			sumaAltura += i.getAltura();
		}
		// apartado A)
		double mediaEdad = (double) sumaEdades / atletas.size();
		double mediaAltura = sumaAltura / atletas.size();
		System.out.println("Esta es la media aritmética de las edades: " + mediaEdad + " y las tallas: " + mediaAltura);
		
		// apartado B)
		int mayores = 0,menores = 0;
		for (Atleta i: atletas) {
			if(i.getEdad() > 18) {
				mayores++;
			} else {
				menores++;
			}
		}
		System.out.println("Hay: " + mayores + " mayores de edad y hay: " + menores + " menores de edad.");
		
		// apartado C)
		for (Atleta i: atletas) {
			if (i.getAltura() > mediaAltura) {
				System.out.println("El atleta: " + i.getNombre() + " es mas alto que el promedio");
			}
		}
	}
}
