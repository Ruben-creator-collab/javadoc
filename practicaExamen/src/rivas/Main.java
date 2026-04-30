package rivas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Vehiculo> lista = new ArrayList<>();

		// 🔹 Crear vehículos automáticamente
		lista.add(new Coche("Toyota", "Corolla", 2020, 20000, 5, "gasolina"));
		lista.add(new Coche("Tesla", "Model 3", 2023, 35000, 4, "electrico"));

		lista.add(new Moto("Yamaha", "R6", 2019, 12000, 600, "deportiva"));
		lista.add(new Moto("Honda", "Scoopy", 2021, 3000, 125, "scooter"));

		lista.add(new Camion("Volvo", "FH", 2018, 60000, 5000, 4));

		lista.add(new VehiculoElectrico("Nissan", "Leaf", 2022, 30000, 250, 8));

		// 🔹 Mostrar todos los vehículos
		System.out.println("=== LISTA DE VEHICULOS ===");
		for (Vehiculo v : lista) {
			v.mostrarInfo();
		}

		// 🔹 Crear vehículo con Scanner (ejemplo coche)
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un coche:");

		System.out.print("Marca: ");
		String marca = sc.nextLine();

		System.out.print("Modelo: ");
		String modelo = sc.nextLine();

		System.out.print("Año: ");
		int anio = sc.nextInt();

		System.out.print("Precio base: ");
		double precio = sc.nextDouble();

		System.out.print("Número de puertas: ");
		int puertas = sc.nextInt();
		sc.nextLine(); // limpiar buffer

		System.out.print("Combustible: ");
		String combustible = sc.nextLine();

		Coche cocheUsuario = new Coche(marca, modelo, anio, precio, puertas, combustible);

		lista.add(cocheUsuario);

		// 🔹 Mostrar todos otra vez
		System.out.println("\n=== LISTA ACTUALIZADA ===");
		for (Vehiculo v : lista) {
			v.mostrarInfo();
		}

		sc.close();
	}

}
