/*
 * Descripción: Uso del objeto cuenta bancaria
 * Autor: Rubén Rivas
 * Fecha: 28/01/26
 */
package rivas;

import libtarea3.CuentaBancaria;
import java.time.LocalDate;

public class Ejercicio1 {

	public static void main(String[] args) {

		// apartado 2
		CuentaBancaria cuenta1 = new CuentaBancaria();
		CuentaBancaria cuenta2 = new CuentaBancaria();
		CuentaBancaria cuenta3 = new CuentaBancaria();
		CuentaBancaria cuenta4 = new CuentaBancaria();
		CuentaBancaria cuenta5 = new CuentaBancaria();
		CuentaBancaria cuenta6 = new CuentaBancaria();
		CuentaBancaria cuenta7 = new CuentaBancaria();
		CuentaBancaria cuenta8 = new CuentaBancaria();
		CuentaBancaria cuenta9 = new CuentaBancaria();
		CuentaBancaria cuenta10 = new CuentaBancaria();

		CuentaBancaria[] cuentas = { cuenta1, cuenta2, cuenta3, cuenta4, cuenta5, cuenta6, cuenta7, cuenta8, cuenta9,
				cuenta10 };

		// apartado 3
		for (int contador = 0; contador < cuentas.length; contador++) {
			try {
				cuentas[contador] = new CuentaBancaria(Math.random()*10000, anyoAleatorio());
			} catch (IllegalArgumentException ex1) {
				cuentas[contador] = new CuentaBancaria();
			}
		}
		
		// apartado 4
		CuentaBancaria CuentaMax = new CuentaBancaria();
		for (int contador = 0; contador < cuentas.length; contador++) {
			double saldoMax = cuentas[0].getSaldo();

			if (saldoMax < cuentas[contador].getSaldo()) {
				CuentaMax = cuentas[contador]; 
			}
		}
		System.out.println("Esta es la cuenta con mayor saldo: ");
		System.out.printf("%s", CuentaMax.toString());
		System.out.println();
		System.out.printf("%s", CuentaMax.getFechaCreacion());
		
		// apartado 5
		System.out.println("");
		System.out.printf("Saldo antes del ingreso: %f", cuentas[0].getSaldo());
		System.out.println();
		cuentas[0].ingresar(1000);
		System.out.printf("Saldo después del ingreso: %f", cuentas[0].getSaldo());

		// apartado 6
		for (int contador = 0; contador == 10; contador++) {
			cuentas[4].ingresar(100);
			cuentas[4].extraer(500);
			System.out.printf("Saldo cuenta numero 5: %f", cuentas[4].getSaldo());
		}
	}
	// metodos

	// apartado 1
	// da un año aleatorio
	public static LocalDate anyoAleatorio() {
		int anno = (int) (Math.random() * 1800 + 1000);
		return LocalDate.of(anno, 01, 1);
	}

}
