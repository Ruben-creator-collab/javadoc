package ejercicioA4;

public class Main {

	public static void main(String[] args) {
		
		Articulo a1 = new Articulo("", 1.99f, (byte)21, (short)3);
//		Articulo a2 = new Articulo();
//		Articulo a3 = new Articulo();
		
		System.out.println(a1.nombre + " - " + a1.precio + "€" + " - " + a1.iva + "%" + " - " + pvp(a1));
		
	}
	
	public static float pvp(Articulo a) {
		float resultado;
		resultado = a.precio * 1.21f;
		return resultado;
	}

}
