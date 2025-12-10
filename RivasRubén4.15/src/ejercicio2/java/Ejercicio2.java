package ejercicio2.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime la cantidad de productos comprados: ");
		int cantidad = sc.nextInt();
		System.out.print("Dime el precio en euros de la unidad: ");
		double precio = sc.nextDouble();
		System.out.print("Dime el descuento: ");
		int descuento = sc.nextInt();
		sc.nextLine();
		System.out.print("Dime el nombre del producto: ");
		String nombreProducto = sc.nextLine();
		System.out.println(" ");
		System.out.println("Usted ha adquirido " + cantidad + " de productos " + nombreProducto + ", a un precio " + precio + " euros la unidad.");
		System.out.println(" ");
		System.out.println("El precio a pagar es " + (cantidad * precio) + ", pero al aplicarle el descuento del " + descuento + "%" + " el precio final a pagar es: " + productosDescuento(precio, cantidad, descuento));
		
	}
	// Método para calcular el precio a pagar con el descuento 
	public static double productosDescuento (double precio, int cantidad, int descuento) {
	    double precioSinDescuento = cantidad * precio;
	    double descuentoAplicado = (precioSinDescuento * descuento) / 100;
	    double precioFinal = precioSinDescuento - descuentoAplicado;
	    
	    return precioFinal;
	}

}
