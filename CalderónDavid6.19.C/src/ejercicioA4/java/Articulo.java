/*Descripción: Declaro cuatro atributos, un constructor Articulo y metodos getters y setters
 * Autor:David Calderón Navarro
 * Fecha:27/01/2026
 */

package ejercicioA4.java;

public class Articulo {

	// Atributos

	private byte iva;

	private String nombre;
	private double precio;
	private short cuantosQuedan;

	// Constructor

	public Articulo(String nombre, double precio, byte iva, short cuantosQuedanp) throws IllegalArgumentException {

		if (nombre == null || precio <= 0 || iva <= 0 || cuantosQuedanp <= 0) {

			throw new IllegalArgumentException("Algun parametro es inválido");

		}

		if (nombre.isEmpty()) {

			throw new IllegalArgumentException("El nombre esta vacio");

		}

		this.nombre = nombre;
		this.precio = precio;
		this.iva = iva;
		this.cuantosQuedan = cuantosQuedanp;

	}

	public String getnombre() {

		return this.nombre;

	}

	public double getprecio() {

		return this.precio;

	}

	public short getcuantosQuedan() {

		return this.cuantosQuedan;

	}

	public byte getiva() {

		return this.iva;

	}

	public void setnombre(String nombre) {

		if (nombre == null) {

			throw new IllegalArgumentException("El nombre es null");

		} else if (nombre.isEmpty()) {

			throw new IllegalArgumentException("El nombre esta vacio");

		} else {

			this.nombre = nombre;

		}

	}

	public void setprecio(double precio) {

		if (precio <= 0) {

			throw new IllegalArgumentException("El precio no puede ser menor a 0");

		} else {

			this.precio = precio;

		}

	}

	public void setcuantosQuedan(short cuantos) {

		if (cuantos <= 0) {

			throw new IllegalArgumentException("El numero de articulos no puede ser menor a 0");

		} else {

			this.cuantosQuedan = cuantos;

		}

	}
	
	public void setiva(byte iva) {
		
		if (iva <= 0) {

			throw new IllegalArgumentException("El numero de articulos no puede ser menor a 0");

		} else {

			this.iva = iva;

		}
		
	}

}
