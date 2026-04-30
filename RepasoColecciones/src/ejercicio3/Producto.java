package ejercicio3;

public class Producto {
	
	//Atributos
	
	private String nombre;
	private int precio;
	private String categoria;
	
	//Constructor
	
	public Producto(String nombrep, int preciop, String categoriap) {
		
		this.nombre = nombrep;
		this.precio = preciop;
		this.categoria = categoriap;
		
	}
	
	//Metodos
	
	public double getPrecio() {
		
		return this.precio;
		
	}
	
	public String getCategoria() {
		
		return this.categoria;
		
	}
	
	public String toString() {
		
		return "\nNombre: " + this.nombre + "| Precio: " + this.precio + "€ | Categoria: " + this.categoria;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;

	    Producto p = (Producto) obj;
	    return nombre.equals(p.nombre);
	    
	}

	@Override
	public int hashCode() {
		
	    return nombre.hashCode();
	    
	}
	
}
