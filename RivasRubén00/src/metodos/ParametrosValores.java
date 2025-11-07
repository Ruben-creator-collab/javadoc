package metodos;

public class ParametrosValores {

	public static void main(String[] args) {
		int num = 5;
		cambioValor(num);
		System.out.println("El valor de num es: " + num);

	}
	
	public static void cambioValor (int numero) {
		numero = 10;
		System.out.println("El valor de numero es" + numero);
	}
}
