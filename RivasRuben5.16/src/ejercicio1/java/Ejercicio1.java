/*
 * Descripción: programa que crea 3 cuentas bancarias, hace transferencias, extrae dinero e ingresa, después lo muestra
 * Autor: Rubén Rivas
 * Fecha: 01/12/25
 */
package ejercicio1.java;

import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// apartado 1
		CuentaBancaria cuentaPrivada, cuentaConjunta, cuentaFamiliar;
		// apartado 2
		// apartado 2.1
		try {
			LocalDate fechaErronea = LocalDate.of(2027, 9, 01);
			CuentaBancaria cuenta = new CuentaBancaria(0, fechaErronea);
		} catch (IllegalArgumentException fechaIlegal) {
			System.out.println("Fecha errónea");
		}
		
		// apartado 2.2
		try {
			CuentaBancaria cuentaSaldoNoValido = new CuentaBancaria(-200.00);
		} catch (IllegalArgumentException saldoIlegal) {
			System.out.println("Saldo de cuenta erróneo");
		}
		
		// apartado 2.3
		try {
			LocalDate fechaValida = LocalDate.of(2021, 7, 1);
			cuentaPrivada = new CuentaBancaria(1000.00, fechaValida, -200.00);
		} catch (IllegalArgumentException saldoIlegal) {
			System.out.println("Saldo de la cuenta erróneo");
			LocalDate fechaValida = LocalDate.of(2021, 7, 1);
			cuentaPrivada = new CuentaBancaria();
		} catch (Exception ex231) {
			System.out.println("Error desconocido");
			LocalDate fechaValida = LocalDate.of(2021, 7, 1);
			cuentaPrivada = new CuentaBancaria();
		}

		
		// apartado 2.4
		try {
			LocalDate fechaValida = LocalDate.of(2021, 7, 1);
			cuentaConjunta = new CuentaBancaria(200, fechaValida);
		} catch (IllegalArgumentException saldoIlegal) {
			System.out.println("Saldo de la cuenta erróneo");
			LocalDate fechaValida = LocalDate.of(2021, 7, 1);
			cuentaConjunta = new CuentaBancaria();
		} catch (Exception ex231) {
			System.out.println("Error desconocido");
			LocalDate fechaValida = LocalDate.of(2021, 7, 1);
			cuentaConjunta = new CuentaBancaria();
		}

		
		// apartado 2.5
		cuentaFamiliar = new CuentaBancaria();
		
		// apartado 3
		System.out.printf("id: %d \n", cuentaPrivada.getId());
		System.out.printf("Fecha de creación: %s \n", cuentaPrivada.getFechaCreacion());
		System.out.printf("Limite descubiero: %f \n", cuentaPrivada.getLimiteDescubierto());
		System.out.printf("¿Está embargada? %s \n", cuentaPrivada.isEmbargada());
		System.out.printf("¿Está descubierta? %s \n", cuentaPrivada.isDescubierta());
		System.out.printf("Dias de la cuenta: %d \n", cuentaPrivada.getDiasCuenta());
		
		// apartado 4
		try {
			cuentaFamiliar.ingresar(100.00);
		} catch (IllegalArgumentException valorIlegal) {
			System.out.println("Operación incorrecta");
		} catch (IllegalStateException estadoIlegal) {
			System.out.println("El ingreso supera el saldo máximo");
		}

		try {
			cuentaConjunta.extraer(100.00);
		} catch (IllegalArgumentException valorIlegal) {
			System.out.println("Operación incorrecta");
		} catch (IllegalStateException estadoIlegal) {
			System.out.println("El ingreso supera el saldo máximo");
		}

		try {
			cuentaPrivada.transferir(1100.00, cuentaFamiliar);
		} catch (IllegalArgumentException valorIlegal) {
			System.out.println("Operación incorrecta");
		} catch (IllegalStateException estadoIlegal) {
			System.out.println("El ingreso supera el saldo máximo");
		}

		
		// apartado 5
		System.out.printf(cuentaPrivada.toString() + "\n");
		System.out.printf(cuentaConjunta.toString() + "\n");
		System.out.printf(cuentaFamiliar.toString() + "\n");
	}
		
}
