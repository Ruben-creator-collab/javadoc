package rivas;

public class PrincipalVehiculo {

	public static void main(String[] args) {

		// 1. Crear camión 20tn
		Camion camion1 = new Camion(20);
		camion1.mostrarInfo();

		// 2. Calcular precio 3 días
		if (camion1.getItv() == false) {
			System.out.println("No se puede hacer el calculo ya que la itv no esta en vigor.");
		} else {
			System.out.println(camion1.calcularPrecio((short) 3));
			System.out.println("----------------------");
		}
		System.out.println("----------------------");
		// 3. Crear furgoneta con volumen máx. y refrigerado
		Entrada sc = new Entrada();
		Furgoneta furgoneta1;

		System.out.print("Dime el volumen máximo que va a tener tu furgoneta: ");
		double volMax = sc.real();
		System.out.print("Dime si tu furgoneta tiene sistema de refrigeración (si o no): ");
		String boleano = sc.cadena();
		boolean refrigerado;
		if (boleano.equalsIgnoreCase("si")) {
			refrigerado = true;
		} else {
			refrigerado = false;
		}
		System.out.println("----------------------");
		furgoneta1 = new Furgoneta((float) volMax, refrigerado);
		furgoneta1.mostrarInfo();

		// 4. Calcular precio 5 días
		if (furgoneta1.getItv() == false) {
			System.out.println("No se puede hacer el calculo ya que la itv no esta en vigor.");
		} else {
			System.out.println(furgoneta1.calcularPrecio((short) 5));
		}
		// 5. Modificar ITV camión
		camion1.cambiarItv();
		camion1.mostrarInfo();
		// 6. Calcular precio 3 días
		if (camion1.getItv() == false) {
			System.out.println("No se puede hacer el calculo ya que la itv no esta en vigor.");
		} else {
			System.out.println(camion1.calcularPrecio((short) 3));
		}
		System.out.println("----------------------");
		// 7. Indica si la furgoneta tiene refrigeración
		if (furgoneta1.getRefrigeracion() == true) {
			System.out.println("Si, esta furgoneta tiene refrigeración");
		} else {
			System.out.println("No, esta furgoneta no tiene refrigeración");
		}
		System.out.println("----------------------");
		// 8. Modifica el valor del precio por día de la furgoneta
		furgoneta1.cambiarPrecioDia(30);
		System.out.println(furgoneta1.getPrecioDia());
		System.out.println("----------------------");
		// 9. Camión por método (el objeto debe ser creado por un método)

		// 10. Número total vehículos
		System.out.println(Vehiculo.contadorVehiculo);
	}
}
