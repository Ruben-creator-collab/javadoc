/*Descripción: Instancio 3 objetos de la clase Punto y los muestro
 * Autor:David Calderón Navarro
 * Fecha:16/01/2026
 */

package ejercicioA1.java;

public class Main {

	public static void main(String[] args) {
		
		//Instancio tres objetos de la clase punto
		
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10, 10);
		Punto p3 = new Punto(3, 7);
		
		//Muestro las coordenadas de los puntos
		
		p1.setX(2);
		p2.setY(5);
		p3.setX(6);
		
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		System.out.println(p3.getX());
		System.out.println(p3.getY());
		
		
	}

}
