/*Descripción: Clase atleta con tres atributos, un constructor y varios metodos
 * Autor:David Calderón Navarro
 * Fecha:16/03/2026
 */

package ejercicio1;

public class Atleta implements Comparable<Atleta>{

	//Atributos
	
	private String nombre;
	private int edad;
	private double altura;
	
	//Constructor
	
	public Atleta(String nombrep, int edadp, double alturap) {
		
		this.nombre = nombrep;
		this.edad = edadp;
		this.altura = alturap;
		
	}
	
	//Metodos
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public int getEdad() {
		
		return this.edad;
		
	}
	
	public double getAltura() {
		
		return this.altura;
		
	}
	
	@Override
	public int compareTo(Atleta atleta) {
		
		return Integer.compare(this.edad, atleta.edad);
		
	}
	
}
