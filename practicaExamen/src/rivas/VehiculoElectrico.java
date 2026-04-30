package rivas;

public class VehiculoElectrico extends Vehiculo {

	    private int autonomia;
	    private int tiempoCarga;

	    public VehiculoElectrico(String marca, String modelo, int anio, double precioBase, int autonomia, int tiempoCarga) {
	        super(marca, modelo, anio, precioBase);

	        if (autonomia <= 100) {
	            this.autonomia = 101;
	        } else {
	            this.autonomia = autonomia;
	        }

	        this.tiempoCarga = tiempoCarga;
	    }

	    @Override
	    public double calcularPrecio() {
	        double precioFinal = precioBase;

	        // descuento del 10%
	        precioFinal = precioFinal * 0.9;

	        return precioFinal;
	    }

	    @Override
	    public void mostrarInfo() {
	        super.mostrarInfo();
	        System.out.println("Autonomía: " + autonomia);
	        System.out.println("Tiempo de carga: " + tiempoCarga);
	        System.out.println("Precio final: " + calcularPrecio());
	        System.out.println("----------------------");
	    }
	}
