/*
 * Descripción: Programa que trabaja con el objeto CuentaBancaria
 * Autor: Rubén Rivas
 * Fecha: 17/12/25
 */
package ejercicio2.java;

import libtarea3.CuentaBancaria;

public class Ejercicio2 {

	public static void main(String[] args) {

		// apartado 1
		double limiteAleatorio = (double) (Math.random() * (-4000.00));

		// apartado 2
		CuentaBancaria rivas_1 = new CuentaBancaria();
		CuentaBancaria rivas_2 = new CuentaBancaria();
		CuentaBancaria rivas_3 = new CuentaBancaria();

		// apartado 3
		// apartado 3.1
		do {
			try {
				rivas_1 = new CuentaBancaria(1000.00);
			} catch (java.lang.IllegalArgumentException ex1) {
				System.out.println("La primera cuenta no se ha podido crear por argumentos ilegales");
			}
		} while ((rivas_1 == new CuentaBancaria(1000.00)));

		// apartado 3.2
		do {
			try {
				rivas_2 = new CuentaBancaria(2000.00);
			} catch (java.lang.IllegalArgumentException ex1) {
				System.out.println("La segunda cuenta no se ha podido crear por argumentos ilegales");
			}
		} while (rivas_2 == new CuentaBancaria(2000.00));

		// apartado 3.3
		do {
			try {
				rivas_3 = new CuentaBancaria(3000.00);
			} catch (java.lang.IllegalArgumentException ex1) {
				System.out.println("La tercera cuenta no se ha podido crear por argumentos ilegales");
			}
		} while (rivas_3 == new CuentaBancaria(3000.00));
		System.out.printf("Informacion cuenta rivas_1: %s\n", rivas_1.toString());
		System.out.printf("Informacion cuenta rivas_2: %s\n", rivas_2.toString());
		System.out.printf("Informacion cuenta rivas_3: %s\n", rivas_3.toString());
		
		// apartado 5
		try {
			for (int contador = 0; contador <= 5; contador++) {
				rivas_1.transferir(300, rivas_2);
				System.out.printf("Saldo de la cuenta rivas_1 %f\n", rivas_1.getSaldo());
				System.out.printf("Saldo de la cuenta rivas_2 %f\n", rivas_2.getSaldo());
			}
		} catch (java.lang.IllegalStateException ex2) {
			System.out.println("No se puede hacer otra transferencia a la cuenta rivas_2 porque rivas_1 no tiene suficiente saldo");
		}
		
		// apartado 6
		rivas_3.embargar(50);
		System.out.printf("El porcentaje embargado de la cuenta rivas_3: %.0f\n", rivas_3.getPorcentajeEmbargo());

		
		// apartado 7
		System.out.printf("Saldo de la primera cuenta: %.2f\n", rivas_1.getSaldo());
		System.out.printf("Saldo de la segunda cuenta: %.2f\n", rivas_2.getSaldo());
		System.out.printf("Saldo de la tercera cuenta: %.2f\n", rivas_3.getSaldo());
		
		System.out.printf("Número de cuentas embargadas: %d\n", CuentaBancaria.getNumCuentasEmbargadas());
	}

}
