package dado;

public class Dado {
	
	// Atributos de clase
	
	// Atributos variables
	private static int contadorLanzamientos = 0;
	
	// Atributos de objeto
	
	// Atributos variables
	private int nCaras;
	
	
	// Constructores
	
	// Constructor con un parámetro
	public Dado (int nCaras) throws IllegalArgumentException {
		if (nCaras <= 0 || nCaras % 2 != 0) {
			throw new IllegalArgumentException("El número de caras no puede ser menor o igual a cero ni impar");
		}
		this.nCaras = nCaras;
	}
	
	// Constructor sin parámetros
	public Dado () {
		this.nCaras = 6;
	}
}
