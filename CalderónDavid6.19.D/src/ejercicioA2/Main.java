/*Descripción: Instancio dos objetos y muestro los datos
 * Autor:David Calderón Navarro
 * Fecha:27/01/2026
 */

package ejercicioA2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Instancio dos objetos de la clase Persona
		
		Persona p1 = new Persona("08114685D", "David", "Calderon", 20);
		Persona p2 = new Persona("43819043L", "Pepe", "Garcia", 27);
		
		p1.setnombre("Juan");
		p2.setedad(22);
		p2.diferenciaEdad(p1);
		p1.esJubilado(20);
		p1.esMayorEdad(20);
		
		p1.imprime();
		p2.imprime();
		
		
	}
	
	

}
