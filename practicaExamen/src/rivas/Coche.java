package rivas;

public class Coche extends Vehiculo {

	    private int numPuertas;
	    private String combustible;

	    public Coche(String marca, String modelo, int anio, double precioBase, int numPuertas, String combustible) {
	        super(marca, modelo, anio, precioBase);

	        if (numPuertas < 2) {
	            this.numPuertas = 2;
	        } else {
	            this.numPuertas = numPuertas;
	        }

	        this.combustible = combustible;
	    }

	    @Override
	    public double calcularPrecio() {
	        double precioFinal = precioBase;

	        if (combustible.equalsIgnoreCase("electrico")) {
	            precioFinal += 2000;
	        }

	        if (numPuertas > 4) {
	            precioFinal += 500;
	        }

	        return precioFinal;
	    }

	    @Override
	    public void mostrarInfo() {
	        super.mostrarInfo();
	        System.out.println("Puertas: " + numPuertas);
	        System.out.println("Combustible: " + combustible);
	        System.out.println("Precio final: " + calcularPrecio());
	        System.out.println("----------------------");
	    }
	}
