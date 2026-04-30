package atleta.java;

public class Atleta implements Comparable<Atleta> {
	
	// atributos
	private String nombre;
	private int edad;
	private double altura;
	
	
	// constructores
	public Atleta(String nombre, int edad, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}
	
	// getters
	public int getEdad() {
		return this.edad;
	}
	public String getNombre() {
		return this.nombre;
	}
	public double getAltura() {
		return this.altura;
	}
	
	
	// Método compareTo
	@Override
	public int compareTo(Atleta atleta) {
		return Integer.compare(this.edad, atleta.edad);
	}
}
