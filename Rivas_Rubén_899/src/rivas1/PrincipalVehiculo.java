package rivas1;

public class PrincipalVehiculo {

	public static void main(String[] args) {
		// apartado 1
		Coche coche1 = new Coche();
		coche1.mostrarInfo();
		System.out.println();
		
		// apartado 2
		System.out.println("El precio del alquiler será: ");
		System.out.println(coche1.calcularPrecio(10));

		// apartado 3
		System.out.println("");
		Moto moto1 = new Moto("1234 ABC");
		moto1.mostrarInfo();
		// apartado 4
		System.out.println(moto1.calcularPrecio(5));
	}

}
