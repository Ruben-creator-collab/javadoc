package rivas;

public abstract class Vehiculo {

	    protected String marca;
	    protected String modelo;
	    protected int anio;
	    protected double precioBase;

	    // Constructor
	    public Vehiculo(String marca, String modelo, int anio, double precioBase) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.anio = anio;
	        this.precioBase = precioBase;
	    }

	    // Método abstracto
	    public abstract double calcularPrecio();

	    // Mostrar info
	    public void mostrarInfo() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Año: " + anio);
	        System.out.println("Precio base: " + precioBase);
	    }
	}
