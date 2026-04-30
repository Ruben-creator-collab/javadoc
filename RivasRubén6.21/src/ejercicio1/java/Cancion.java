package ejercicio1.java;

public class Cancion {
	// Atributo de clase
	
	// Atributos constantes
	private static final String TITULO_DEFAULT = "Sin titulo";
	private static final String AUTOR_DEFAULT = "Sin autor";
	
	// Atributos de objeto
	
	// Atributos variables
	private String titulo;
	private String autor;
	
	
	// Constructores
	
	// Constructor con dos parámetros
	public Cancion (String titulo, String autor) throws IllegalArgumentException{
		if (titulo == null || autor == null || titulo.isEmpty() || autor.isEmpty()) {
			throw new IllegalArgumentException("Los parámetros no pueden ser nulos");
		}
		this.titulo = titulo;
		this.autor = autor;
	}
	
	// Constructor sin parámetros
	public Cancion () {
		this(TITULO_DEFAULT, AUTOR_DEFAULT);
	}
	
	// Constructor copia
	public Cancion(Cancion copia) {

	    if (copia == null) {
	        throw new IllegalArgumentException("No se puede copiar una canción null");
	    }

	    this.titulo = copia.titulo;
	    this.autor = copia.autor;
	}
	
	// Métodos
	
	// Metodo para dar el titulo de la cancion
	public String dameTitulo() {
		return this.titulo;
	}
	
	// Método que devuelve el autor de la canción
	public String dameAutor() {
		return this.autor;
	}
	
	// Método para establecer el título de la canción
	public void ponTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	// Método para establecer el autor de la canción
	public void ponAutor(String autor) {
		this.autor = autor;
	}
}
