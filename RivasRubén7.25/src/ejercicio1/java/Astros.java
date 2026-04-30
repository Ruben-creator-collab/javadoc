package ejercicio1.java;

public abstract class Astros {
	// atributos
	protected double radioEcuatorial;
	protected double masa;
	protected double temperaturaMedia;
	protected double rotacionEje;
	protected double gravedad;

	protected Astros(double masa, double radioEcuatorial, double temperaturaMedia, double rotacionEje,
			double gravedad) {
		this.masa = masa;
		this.radioEcuatorial = radioEcuatorial;
		this.temperaturaMedia = temperaturaMedia;
		this.rotacionEje = rotacionEje;
		this.gravedad = gravedad;
	}

	// Métodos

	// Métodos getters
	public double getMasa() {
		return this.masa;
	}

	public double getRadioEcuatorial() {
		return this.radioEcuatorial;
	}

	public double getTemperaturaMedia() {
		return this.temperaturaMedia;
	}

	public double getRotacionEje() {
		return this.rotacionEje;
	}

	public double getGravedad() {
		return this.gravedad;
	}

	// método muestra
	public void muestra() {
		System.out.println("Masa: " + masa);
		System.out.println("Radio ecuatorial: " + radioEcuatorial);
		System.out.println("Temperatura: " + temperaturaMedia);
		System.out.println("Rotación: " + rotacionEje);
		System.out.println("Gravedad: " + gravedad);
	}
}
