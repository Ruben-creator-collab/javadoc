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
		
		double precioconiva = aplicarIva(a1.getprecio());
		double precioconiva2 = aplicarIva(a2.getprecio());
		
		mostrarMensaje(a1 , precioconiva);
		mostrarMensaje(a2 , precioconiva2);
		
	}
	
	
	//Metodo que muestra el mensaje completo del articulo y no delvuelve nada
	public static void mostrarMensaje(Articulo a, double precioconiva) {
		
		System.out.println(a.getnombre() + " - Precio:" + a.getprecio() + " - IVA:" + a.getiva() + "% - PVP:" + precioconiva + "€");
		
	}
	
	
	//Metodo que calcula el precio con iva y devuelve un double
	public static double aplicarIva(double precio) {
		
		double precioconiva;
		
		precioconiva = precio * 1.21;
		
		return precioconiva;
		
	}

}
