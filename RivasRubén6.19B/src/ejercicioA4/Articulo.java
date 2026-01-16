package ejercicioA4;

public class Articulo {
	
	public final byte iva;
	
	public String nombre;
	public float precio;
	public short cuantosQuedan;
	
	public Articulo (String nombre, float precio, byte iva, short cuantosQuedan) throws IllegalArgumentException {
		
		if (nombre == null || precio <= 0 || iva <= 0 || cuantosQuedan < 0) {
			throw new IllegalArgumentException("alguno de los parámetros de entrada es null");
		}
		if (nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío");
		}
		
		this.nombre = nombre;
		
		this.precio = precio;
		this.iva = iva;
		this.cuantosQuedan = cuantosQuedan;
	}
}
