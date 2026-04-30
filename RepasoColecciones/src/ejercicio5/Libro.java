package ejercicio5;

public class Libro extends Publicacion{
	
	//Atributos
	
	private String autor;
	private int numPaginas;
	
	//Constructores
	
	public Libro(String id, String titulo, double precio, boolean disponible, String autor, int paginas) {
        super(id, titulo, precio, disponible);
        
        this.autor = autor;
        this.numPaginas = paginas;
    }
	
	public Libro() {
		
		super("001", "Titulo1", 25, true);
		
		this.autor = "Autor1";
		this.numPaginas = 250;
		
	}
	
	//Metodos
	
	@Override
	public String toString() {
		
		return "ID: " + this.identificador + "| Titulo: " + this.titulo + "| Precio: " + this.precio + 
				"\n| Disponible: " + this.disponible + "| Autor: " + this.autor + "| Numero de paginas: " + this.numPaginas;
		
	}
	
	public int getPaginas() {
		
		return this.numPaginas;
		
	}
	
	@Override
	
	public double calcularPrecioFinal() {
		
		double precioFinal = 0;
		
		if(this.numPaginas > 300) {
			
			precioFinal = precio * 1.1;
			
		}
		
		return precioFinal;
		
	}

}
