package ejercicioA3;

public class Rectangulo {
	
	public int x1;
	public int y1;
	public int x2;
	public int y2;
	
	public Rectangulo(int x1, int y1, int x2, int y2) throws IllegalArgumentException {
		if (x1 >= x2 || y1 >= y2) {
			throw new IllegalArgumentException("X2 no puede ser mas pequeño que X1 y Y2 no puede ser mas pequeño que Y1");
		}
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
}
