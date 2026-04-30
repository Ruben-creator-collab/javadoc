/*Descripción: Muestra el perimetro, area y coordenadas de un rectangulo
 * Autor:David Calderón Navarro
 * Fecha:27/01/2026
 */

package ejercicioA4.java;

public class Main {

	public static void main(String[] args) {
		
		//Instancio dos constructores
		
		Articulo a1 = new Articulo("Pepe", 249.99, (byte)21, (short)5);
		Articulo a2 = new Articulo("Juan", 149.99, (byte)21, (short)2);
		
		
		a1.setprecio(56.99);
		a2.setnombre("David");
		
		//Llamo al metodo aplicarIva
		
		System.out.println(a1.getPVP());
		System.out.println(a2.getPVP());
		System.out.println(a1.getPVPDescuento(20));
		
		a1.imprime();
		a2.imprime();
		
	}
	

}
