import libtarea3.Dado;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// apartado 1
		int maxPuntos = (int)(Math.random()*30) + 30;
		
		// apartado 2
		Dado jugador1 = new Dado(6);
		Dado jugador2 = new Dado(6);
		Dado jugador3 = new Dado(6);
		
		// apartado 3
		long sumaTotal;
		
		do {
			jugador1.lanzar();
			System.out.print("Lanzamientos jugador 1: ");
			jugador2.lanzar();
			System.out.print("Lanzamientos jugador 2: ");
			jugador3.lanzar();
			System.out.print("Lanzamientos jugador 3: ");
			sumaTotal = jugador1.getSumaPuntuacionHistorica() + jugador2.getSumaPuntuacionHistorica() + jugador3.getSumaPuntuacionHistorica();
		} while (sumaTotal < maxPuntos);
		
		
	}

}
