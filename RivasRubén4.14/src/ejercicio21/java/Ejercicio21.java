package ejercicio21.java;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		int opcion;
		do {
			opcion = menu();
				switch (opcion) {
		
				case 1:{
					circunferencia(pideRadio());
					break;
				}
				case 2:{
					area(pideRadio());
					break;
				}
				case 3:{
					volumen(pideRadio());
					break;
				}
				case 4:{
					double r = pideRadio();
					circunferencia(r);
					area(r);
					volumen(r);
					break;
				}
				case 5:{
					
				}
			}
			System.out.println(" ");
		} while (opcion != 5);
		
	}
	
	// Método que muestra un menú y devuelve el número elegido
	public static int menu () {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("Elige una opción");
		System.out.println("-------------------");
		System.out.println("(1) Circunferencia");
		System.out.println("(2) Área");
		System.out.println("(3) Volumen");
		System.out.println("(4) Todas");
		System.out.println("(5) Salir");
		return a = sc.nextInt();
	}
	// Método para calcular la circunferencia y devolverla
	public static double circunferencia (double r) {
		double calculo;
		
		calculo = 2 * Math.PI * r;
		System.out.println("La circunferencia es: " + calculo);
		return calculo;
	}
	// Método para calcular el área y devolverla
	public static double area (double r) {
		double calculo;
		
		calculo = Math.PI * Math.pow(r, 2);
		System.out.println("El área es: " + calculo);
		return calculo;
	}
	// Método para pedir el radio y devolverlo
	public static double pideRadio () {
		Scanner sc = new Scanner(System.in);
		double r;
		
		System.out.print("Dime el radio: ");
		return r = sc.nextDouble();
	}
	
	public static double volumen (double r) {
		double calculo;
		calculo = (4.0/3.0) * Math.PI * Math.pow(r,3);
		
		System.out.println("El volumen es: " + calculo);
		return calculo;
	}
	
	
}
