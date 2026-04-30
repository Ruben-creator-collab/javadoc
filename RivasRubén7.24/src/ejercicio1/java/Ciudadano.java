package ejercicio1.java;

public class Ciudadano extends Humano{
	// Atributos
	
	protected String documento;
	
	// Constructores
	
	public Ciudadano(String nombre, String apellido, String documento) {
		super(nombre, apellido);
		this.documento = documento;
	}
	
	// Métodos
	public String identificacion() {
		return super.getNombreCompleto() + ", " + this.documento;
	}
}
