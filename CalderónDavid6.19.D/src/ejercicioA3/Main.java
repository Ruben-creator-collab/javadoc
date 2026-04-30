/*Descripción: Instacia dos objetos y muestra su informacion
 * Autor:David Calderón Navarro
 * Fecha:27/01/2026
 */

package ejercicioA3;

public class Main {

	public static void main(String[] args) {
		
		//Instancio dos objetos de la clase Rectangulo
		
		Rectangulo r1 = new Rectangulo((byte)0, (byte)0, (byte)5, (byte)5);
		Rectangulo r2 = new Rectangulo((byte)2, (byte)3, (byte)7, (byte)9);
		
		//Muestro toda la informacion de cada rectangulo llamando a cada metodo
		
		r1.setx1((byte)1);
		r2.sety1((byte)2);
		r1.setAll((byte)1,(byte)0,(byte)6,(byte)12);
		
		
		System.out.println("Primer rectnagulo: ");
		r1.imprime();
		
		System.out.println("Segundo rectnagulo: ");
		r2.imprime();
		
	}
	

}
