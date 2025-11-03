package cadenas;

public class FormatoCadenas {

	public static void main(String[] args) {
		String nombre = "Juan";
		int edad = 34;
		double altura = 1.87;
		double peso = 75.4;
		double alturaMetrosCuadrado = altura * altura;
		double masaCorporal = peso / alturaMetrosCuadrado;
		
		
		String cadena = String.format("Nombre: %s ** Edad: %d ** Altura: %.2f ** Masa corporal: %.3f ", nombre, edad, altura, masaCorporal);
		System.out.println(cadena);
		
		System.out.printf("Nombre: %s // Edad: %d", nombre, edad);

	}

}
