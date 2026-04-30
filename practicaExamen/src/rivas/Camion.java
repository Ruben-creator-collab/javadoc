package rivas;

public class Camion extends Vehiculo {

	    private int cargaMaxima;
	    private int numEjes;

	    public Camion(String marca, String modelo, int anio, double precioBase, int cargaMaxima, int numEjes) {
	        super(marca, modelo, anio, precioBase);

	        if (cargaMaxima <= 1000) {
	            this.cargaMaxima = 1001;
	        } else {
	            this.cargaMaxima = cargaMaxima;
	        }

	        this.numEjes = numEjes;
	    }

	    @Override
	    public double calcularPrecio() {
	        double precioFinal = precioBase;

	        precioFinal += (cargaMaxima / 1000) * 100;

	        return precioFinal;
	    }

	    @Override
	    public void mostrarInfo() {
	        super.mostrarInfo();
	        System.out.println("Carga máxima: " + cargaMaxima);
	        System.out.println("Ejes: " + numEjes);
	        System.out.println("Precio final: " + calcularPrecio());
	        System.out.println("----------------------");
	    }
	}
