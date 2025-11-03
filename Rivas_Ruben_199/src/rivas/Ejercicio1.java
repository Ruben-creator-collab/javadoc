/*
 * Descripción: Calculo básico de nómina de empleado
 * Autor: Rubén Rivas
 * Fecha: 29/10/25
 */
package rivas;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		long numEmp = 2055; // variable long porque tiene que estar en el rango de -32,768 a 32,767
		int edad = 35; // variable int porque tiene que estar en el rango de -128 a 127
		float salarioHora = 15.50f; // variable float porque tiene que ser un valor preciso
		boolean jornadaCompleta = true;
		
		int horasTrabajadas = 40;
		final double IRPF = 0.12;
		
		double salarioBruto = salarioHora * horasTrabajadas;
		double irpfRetenido = salarioBruto * IRPF;
		double salarioNeto = salarioBruto - irpfRetenido;
		String elegibleParaBono = "inactivo";
		if (jornadaCompleta == true && horasTrabajadas == 40) {
			elegibleParaBono = "activo";
		} 
		
		
		System.out.println("El número de empleado: " + numEmp + " y la edad del empleado " + edad);
		System.out.println("El Salario hora: " + salarioHora);
		System.out.println("El salario bruto semanal: " + salarioBruto);
		System.out.println("El importe de IRPF Retenido: " + irpfRetenido);
		System.out.println("El salario neto: " + salarioNeto);
		System.out.println("El estado de Elegibilidad para Bono esta: " + elegibleParaBono);
		
	}

}
