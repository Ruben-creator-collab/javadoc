/*
 * Descripción: Programa para getionar productos en bucle hasta que el usuario decida salir
 * Autor: Rubén Rivas
 * Fecha: 26/11/25
 */
package rivas;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean salir = false;
		String nombreProducto;
		int descuento = 0;
		double precio;
		short unidades;
		double precioSinDescuento;
		double descuentoAplicado;
	    double precioFinal;
	    int contador = 0;
		
		System.out.println("Gestión de productos (escribe terminar para salir)");
		System.out.println(" ");
		do {
		System.out.print("Dime el nombre del producto: ");
		nombreProducto = sc.nextLine();
		if (nombreProducto.equalsIgnoreCase("terminar")) {
			salir = true;
		}
		System.out.print("Dime el número de unidades a comprar: ");
		unidades = sc.nextShort();
		if (unidades <= 10 && unidades >= 1) {
			descuento = 5;
		} 
		if (unidades >= 11 && unidades <= 50) {
			descuento = 10;
		}
		if  (unidades >= 51 && unidades <= 100) {
			descuento = 15;
		}
		System.out.print("Dime el precio de la unidad: ");
		precio = sc.nextDouble();
		sc.nextLine();
		System.out.println("----------------------------");
		System.out.println("El nombre del producto: " + nombreProducto);
		System.out.println("Número de unidades a comprar: " + unidades);
		System.out.println("Descuento a aplicar en función de las unidades: " + descuento + "%");
		
		precioSinDescuento = precio * unidades;
		descuentoAplicado = (precioSinDescuento * descuento) / 100;
		precioFinal = precioSinDescuento - descuentoAplicado;
		
		System.out.println("Total a pagar: " + precioFinal);
		System.out.println("------------------------------");
		contador++;
		} while (salir != true);
		
		System.out.print("Los productos procesados fueron : " + contador);
	}

}
