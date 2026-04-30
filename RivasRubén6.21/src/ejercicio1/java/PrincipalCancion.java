package ejercicio1.java;

public class PrincipalCancion {
	public static void main(String[] args) {
		// Apartado 1
		Cancion cancion1;
		try {
			cancion1 = new Cancion("", "");
		} catch (IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			cancion1 = new Cancion();
		}

		
		// Apartado 2
		Cancion cancion2 = new Cancion();
		
		// Apartado 3
		cancion1.ponTitulo("Titulo 1");
		cancion2.ponTitulo("Titulo 2");
		
		// Apartado 4
		Cancion clon = new Cancion(cancion2);
		
		// Apartado 5
		Cancion ref = clon;
		
		// Apartado 6
		ref.ponAutor("Autor Nuevo");
		
		// Apartado 7
		System.out.println("Cancion 1: " + cancion1.dameTitulo() + " - " + cancion1.dameAutor());
		System.out.println("Cancion 2: " + cancion2.dameTitulo() + " - " + cancion2.dameAutor());
		System.out.println("Clon: " + clon.dameTitulo() + " - " + clon.dameAutor());
		
	}
}
