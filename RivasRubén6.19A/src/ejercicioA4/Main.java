package ejercicioA4;

public class Main {

	public static void main(String[] args) {
		
		Articulo a1 = new Articulo();
		
		a1.nombre = "Leche";
		a1.precio = 4.99f;
		a1.cuantosQuedan = 5;
		
		System.out.println(a1.nombre + " - " + a1.precio + "€" + " - " + a1.iva + "%" + " - " + pvp(a1));
		
	}
	
	public static float pvp(Articulo a) {
		float resultado;
		resultado = a.precio * 1.21f;
		return resultado;
	}

}
