/*Descripción: Declaro dos atributos, un constructor Punto y metodos getters y setters
 * Autor:David Calderón Navarro
 * Fecha:27/01/2026
 */

package ejercicioA1.java;

public class Punto {
	
	//Atributo

	private int x;
	private int y;
	
	//Constructor
	
	public Punto(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	//Metodos
	
	public int getX() {
		
		return this.x;
		
	}
	
	public int getY() {
		
		return this.y;
		
	}
	
	public void setX(int x) {
		
		this.x = x;
		
	}
	
	public void setY(int y) {
		
		this.y = y;
		
	}
	
	//Metodo que muestra las coordenadas
	public void imprime() {
		
		System.out.println("(" + getX() + "," + getY() + ")");
		
	}
	
	//Metodo que modifica ambas coordenadas
	public void setXY(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	//Metodo que desplaza el punto
	public void desplaza(int dx, int dy) {
		
		int sumax, sumay;
		
		sumax = this.x + dx;
		sumay = this.y + dy;
		
		this.x = sumax;
		this.y = sumay;
		
	}
	
	//Metodo que calcula la distancia del punto (Objeto) al que le pasas por parametro
	public int distancia(Punto p) {
		
		int dx = p.getX() - this.x;
	    int dy = p.getY() - this.y;

	    return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
		
	}
	
}
