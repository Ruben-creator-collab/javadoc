package ejercicio1.java;

public class Satelite extends Astros {

	private double distanciaPlaneta;
	private double orbitaPlanetaria;
	private Planeta planeta;

	public Satelite(double masa, double radioEcuatorial, double temperaturaMedia, double rotacionEje, double gravedad,
			double distanciaPlaneta, double orbitaPlanetaria, Planeta planeta) {

		super(masa, radioEcuatorial, temperaturaMedia, rotacionEje, gravedad);
		this.distanciaPlaneta = distanciaPlaneta;
		this.orbitaPlanetaria = orbitaPlanetaria;
		this.planeta = planeta;
	}

	@Override
	public void muestra() {
		System.out.println("SATÉLITE");
		System.out.println(this.toString());
		System.out.println("Distancia al planeta: " + distanciaPlaneta);
		System.out.println("Órbita planetaria: " + orbitaPlanetaria);
		System.out.println("Pertenece al planeta: " + planeta.getClass().getSimpleName());
	}
}
