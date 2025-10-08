/*
 * Descripción: Un programa de java que calcule el salario neto y total con un aumento del 2%
 * Autor: Rubén Rivas
 * Fecha: 01/10/25
 */

package ejercicio1.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		String nombreUsu;
		System.out.print("Dame tu nombre: ");
		nombreUsu = datos.nextLine();
		
		String apellidos;
		System.out.print("Dame tus apellidos: ");
		apellidos = datos.nextLine();
		
		String fechaNacimiento;
		System.out.print("Dime tu fecha de nacimiento: ");
		fechaNacimiento = datos.nextLine();
		
		int annosTrabajando;
		System.out.print("Dame los años que llevas trabajando en la empresa: ");
		annosTrabajando = datos.nextInt();
		
		double salarioBruto;
		System.out.print("Dime tu salario bruto: ");
		salarioBruto = datos.nextDouble();
		
		double salarioNeto;
		salarioNeto = salarioBruto - (salarioBruto * 0.15);
		
		double aumento;
		aumento = salarioBruto * (0.02 * annosTrabajando);
		
		double salarioTotal;
		salarioTotal = salarioNeto + aumento;
		
		System.out.println("Estimad@ " + nombreUsu + apellidos + ", su salario bruto es " + salarioBruto + ", teniendo en cuenta un IRPF del 15% su salario neto es " + salarioNeto + ".");
		System.out.println("Debido a sus " + annosTrabajando + " años trabajando en la empresa su salario se incrementará en un 2% por cada año. El aumento es de " + aumento + " y el salario total es " + salarioTotal);
		
		

	}

}
