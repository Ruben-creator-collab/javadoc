package ejercicio1.java;

import java.util.ArrayList;

public class Planeta extends Astros {
	private double distanciaSol;
	private double orbitaSol;
	private ArrayList<Satelite> satelites;

	public Planeta(double masa, double radioEcuatorial, double temperaturaMedia, double rotacionEje, double gravedad,
			double distanciaSol, double orbitaSol) {
		super(masa, radioEcuatorial, temperaturaMedia, rotacionEje, gravedad);
		this.distanciaSol = distanciaSol;
		this.orbitaSol = orbitaSol;
		this.satelites = new ArrayList<>();
	}

	public void addSatelite(Satelite a) {
		satelites.add(a);
	}

	public ArrayList<Satelite> getSatelites() {
		return satelites;
	}

	@Override
	public void muestra() {
		System.out.println("PLANETA");
		System.out.println(this.toString());
		System.out.println("Distancia al Sol: " + distanciaSol);
		System.out.println("Órbita al Sol: " + orbitaSol);

		if (satelites.isEmpty()) {
			System.out.println("No tiene satélites");
		} else {
			System.out.println("Satélites:");
			for (Satelite a : satelites) {
				a.muestra();
			}
		}
	}
}
