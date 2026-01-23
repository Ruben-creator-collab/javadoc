package bombilla;

public class Main {

	public static void main(String[] args) {
		Bombilla bombillon1 = new Bombilla(false);
		
		System.out.println(bombillon1.toString());
		
//		bombillon1.apagar();
		bombillon1.encender();
		bombillon1.getEstado();
		bombillon1.isEncendida();
		bombillon1.isApagada();
		bombillon1.getVecesEncendida();
		
		System.out.println(bombillon1);

	}

}
