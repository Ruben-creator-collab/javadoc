package ejercicio6.java;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precioVenta1, precioVenta2, precioVenta3, precioVenta4, precioVenta5;
		
		System.out.print("Dime el primer precio de venta: ");
		precioVenta1 = sc.nextDouble();
		System.out.print("Dime el segundo precio de venta: ");
		precioVenta2 = sc.nextDouble();
		System.out.print("Dime el tercer precio de venta: ");
		precioVenta3 = sc.nextDouble();
		System.out.print("Dime el cuarto precio de venta: ");
		precioVenta4 = sc.nextDouble();
		System.out.print("Dime el quinto precio de venta: ");
		precioVenta5 = sc.nextDouble();
		
		System.out.println("El primer precio de venta con el IVA aplicado: " + precioConIVA(precioVenta1));
		System.out.println("El segundo precio de venta con el IVA aplicado: " + precioConIVA(precioVenta2));
		System.out.println("El tercer precio de venta con el IVA aplicado: " + precioConIVA(precioVenta3));
		System.out.println("El cuarto precio de venta con el IVA aplicado: " + precioConIVA(precioVenta4));
		System.out.println("El quinto precio de venta con el IVA aplicado: " + precioConIVA(precioVenta5));
	}
	
	public static double precioConIVA(double precio) {
		double IVA = 0.21;
		double resultado;
		
		resultado = precio * IVA;
		resultado = precio - resultado;
		
		return resultado;
	}
}
