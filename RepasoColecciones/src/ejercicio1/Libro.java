package ejercicio1;

public class Libro {
	
	//Atributos
	
	private String titulo;
	private String autor;
	private int numPaginas;
	
	//Constructor
	
	public Libro(String titulop, String autorp, int numPaginasp) {
		
		this.titulo = titulop;
		this.autor = autorp;
		this.numPaginas = numPaginasp;
		
	}
	
	//Metodos
	
	public int getNumPaginas() {
		
		return this.numPaginas;
		
	}
	
	public String getTitulo() {
		
		return this.titulo;
		
	}
	

}
