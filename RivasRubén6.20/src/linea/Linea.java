package linea;

public class Linea {

	// Atributos de objeto

	// Atributos variables
	private Punto puntoA;
	private Punto puntoB;

	// Constructores

	// Constructor con dos parámetros
	public Linea(Punto puntoA, Punto puntoB) {
		if (puntoA == null || puntoB == null) {
			throw new IllegalArgumentException("Los puntos no pueden ser null");
		}
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}

	// Constructor sin parámetros
	public Linea() {
		this.puntoA = new Punto(0, 0);
		this.puntoB = new Punto(0, 0);
	}
	
	// Métodos
	
	// Metodo para mover la línea a la derecha
	public void mueveDerecha (double x) {
		puntoA.setX(x + puntoA.getX());
		puntoB.setX(x + puntoB.getX());
	}
	
	

}
