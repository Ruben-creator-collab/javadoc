package ejercicio4;

public abstract class Persona {

	// Atributos

	protected final String dni;
	protected String nombre;
	protected int edad;

	// Constructor

	public Persona(String dnip, String nombrep, int edadp) throws IllegalArgumentException {

		if (dnip == null || dnip.isEmpty()) {

			throw new IllegalArgumentException("El dni no puede ser nulo ni vacio");

		}
		
		if(!validarDNI(dnip)) {
			
			throw new IllegalArgumentException("El dni no es valido");
			
		}

		if (nombrep == null) {

			throw new IllegalArgumentException("El nombre no puede ser nulo");

		}

		if (edadp < 16) {

			throw new IllegalArgumentException("La edad no puede estar por debajo de 16");

		}

		this.dni = dnip;
		this.nombre = nombrep;
		this.edad = edadp;

	}

	// Metodos

	public String getDni() {

		return this.dni;

	}

	public String getNombre() {

		return this.nombre;

	}

	public int getEdad() {

		return this.edad;

	}

	public static boolean validarDNI(String dni) {

		if (dni == null || dni.length() != 9) {
			
			return false;
			
		}

		String numeros = dni.substring(0, 8);
		char letra = dni.charAt(8);

		if (!numeros.matches("\\d{8}")) {
			
			return false;
			
		}

		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

		int num = Integer.parseInt(numeros);
		char letraCorrecta = letras.charAt(num % 23);

		return Character.toUpperCase(letra) == letraCorrecta;
	}

	public abstract String toString();
	
	@Override
	public boolean equals(Object o) {
		
	    Persona p = (Persona) o;
	    return this.dni.equals(p.dni);
	    
	}

	@Override
	public int hashCode() {
		
	    return dni.hashCode();
	    
	}

}
