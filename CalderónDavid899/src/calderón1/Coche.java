package calderón1;

public class Coche extends Vehiculo {
	
	//Atributos
	
	private static int contador = 0;
	private Combustible combustible;
	
	//Constructor

	public Coche() {
		super();
		this.combustible = Combustible.GASOIL;
		contador++;
		this.id = generarId();
	}
	
	//Metodos

	private String generarId() {
		int año = fechaFabricacion.getYear() % 100;
		return año + "-C-" + contador;
	}

	@Override
	public double calcularAlquiler(int dias) {
		if (alquilado)
			return 0;

		double total = precioDia * dias;

		if (combustible == Combustible.ELECTRICO) {
			total *= 1.05;
		}

		return total;
	}
}