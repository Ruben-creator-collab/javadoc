package ejercicio5;

public abstract class Publicacion {

	// Atributos

	protected String identificador;
	protected String titulo;
	protected double precio;
	protected boolean disponible;
	protected static int contador = 0;

	// Constructor

	public Publicacion(String idp, String titulop, double preciop, boolean disponiblep) {

		this.identificador = idp;
		this.titulo = titulop;
		this.precio = preciop;
		this.disponible = disponiblep;

		contador++;

	}

	// Metodos

	public abstract double calcularPrecioFinal();
	
	public abstract String toString();
	
	public static int ContarPublicaciones() {
		
		return contador;
		
	}

	public String getId() {

		return this.identificador;

	}

}
