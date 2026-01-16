package ejercicioA3;

public class Main {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(0,0,5,5);
		Rectangulo r2 = new Rectangulo(7,9,2,3);
		
		System.out.println("(" + r1.x1 + "," + r1.y1 + ")" + "(" + r1.x2 + "," + r1.y2 + ")");
		System.out.println("(" + r2.x1 + "," +  r2.y1 + ")" + "(" + r2.x2 + "," + r2.y2 + ")");
		System.out.println();
		System.out.println("Perímetro y área del primer rectangulo: ");
	    System.out.println("Perímetro: " + perimetro(r1));
	    System.out.println("Área: " + area(r1));
		System.out.println();
		System.out.println("Perímetro y área del segundo rectangulo: ");
	    System.out.println("Perímetro: " + perimetro(r2));
	    System.out.println("Área: " + area(r2));
	    
	}
	
	public static int perimetro(Rectangulo r) {
	    int ancho = Math.abs(r.x2 - r.x1);
	    int alto = Math.abs(r.y2 - r.y1);
	    return 2 * (ancho + alto);
	}
	
	public static int area(Rectangulo r) {
	    int ancho = Math.abs(r.x2 - r.x1);
	    int alto = Math.abs(r.y2 - r.y1);
	    return ancho * alto;
	}

}
