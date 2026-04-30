package ejercicio5;

public class ComparatorPublicacion {
	
	public int compare(Libro p1, Libro p2) {
		
		return Integer.compare(p1.getPaginas(), p2.getPaginas());
		
	}
	
}
