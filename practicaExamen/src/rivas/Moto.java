package rivas;

public class Moto extends Vehiculo {

	    private int cilindrada;
	    private String tipo;

	    public Moto(String marca, String modelo, int anio, double precioBase, int cilindrada, String tipo) {
	        super(marca, modelo, anio, precioBase);

	        if (cilindrada <= 50) {
	            this.cilindrada = 51;
	        } else {
	            this.cilindrada = cilindrada;
	        }

	        this.tipo = tipo;
	    }

	    @Override
	    public double calcularPrecio() {
	        double precioFinal = precioBase;

	        if (cilindrada > 500) {
	            precioFinal += 1000;
	        }

	        return precioFinal;
	    }

	    @Override
	    public void mostrarInfo() {
	        super.mostrarInfo();
	        System.out.println("Cilindrada: " + cilindrada);
	        System.out.println("Tipo: " + tipo);
	        System.out.println("Precio final: " + calcularPrecio());
	        System.out.println("----------------------");
	    }
	}
