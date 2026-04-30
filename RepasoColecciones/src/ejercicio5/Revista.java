package ejercicio5;

public class Revista extends Publicacion {

	// Atributos

	private int numero;
	private String periodicidad;

	// Constructor
	
	public Revista(String id, String titulo, double precio, boolean disponible, int numero, String periodicidad) {
        super(id, titulo, precio, disponible);
        this.numero = numero;
        this.periodicidad = periodicidad;
    }

	public Revista() {

		super("002", "Titulo2", 25, true);

		this.numero = 1;
		this.periodicidad = "mensual";

	}
	
	@Override
	public String toString() {
		
		return "ID: " + this.identificador + "| Titulo: " + this.titulo + "| Precio: " + this.precio + 
				"\n| Disponible: " + this.disponible + "| Numero: " + this.numero + "| Periodicidad: " + this.periodicidad;
		
	}
	
	@Override
	public double calcularPrecioFinal() {

		double precioFinal = 0;

		if (this.periodicidad.equalsIgnoreCase("semanal")) {

			precioFinal = precio * 1.05;

		}

		return precioFinal;

	}

}
