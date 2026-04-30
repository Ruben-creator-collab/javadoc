package ejercicio7.java;

public class Venta {
	
	//Atributos
	
	private String nombreMes;
	private int ventaCoches;
	
	//Constructores
	
	public Venta(String nombreMesp, int ventaCochesp) {
		
		this.nombreMes = nombreMesp;
		this.ventaCoches = ventaCochesp;
		
	}
	
	//Metodos
	
	public void setNombreMes(String nombre) {
		
		this.nombreMes = nombre;
		
	}
	
	public void setVentaCoches(int num) {
		
		this.ventaCoches = num;
		
	}
	
	public String getNombreMes() {
		
		return this.nombreMes;
		
	}
	
	public int getVentaCoches() {
		
		return this.ventaCoches;
		
	}
	
	public String toString() {
		
		return "Nombre del mes: " + this.nombreMes + " | Venta de coches: " + this.ventaCoches;
		
	}

}
