package ejercicio8;

import java.util.*;

public class Principal {

	static ArrayList<Cliente> clientes = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		generarClientesAleatorios();

		int opcion;

		do {
			System.out.println("\n===== MENU =====");
			System.out.println("1. Ver clientes");
			System.out.println("2. Añadir teléfono a cliente");
			System.out.println("3. Buscar teléfono");
			System.out.println("4. Añadir compra");
			System.out.println("5. Ver productos cliente");
			System.out.println("6. Total unidades cliente");
			System.out.println("7. Eliminar producto");
			System.out.println("0. Salir");

			opcion = sc.nextInt();

			switch (opcion) {

			case 1 -> verClientes();
			case 2 -> addTelefono();
			case 3 -> buscarTelefono();
			case 4 -> addCompra();
			case 5 -> verProductos();
			case 6 -> totalUnidades();
			case 7 -> eliminarProducto();
			}

		} while (opcion != 0);
	}

	// ---------------- MENU OPCIONES ----------------

	static void verClientes() {
		for (Cliente c : clientes) {
			System.out.println(c);
		}
	}

	static Cliente seleccionarCliente() {
		System.out.print("Código cliente: ");
		int codigo = sc.nextInt();

		for (Cliente c : clientes) {
			if (c.getCodigoCliente() == codigo)
				return c;
		}

		System.out.println("Cliente no encontrado");
		return null;
	}

	static void addTelefono() {
		Cliente c = seleccionarCliente();
		if (c != null) {
			System.out.print("Teléfono: ");
			String t = sc.next();
			c.addTelefono(t);
		}
	}

	static void buscarTelefono() {
		Cliente c = seleccionarCliente();
		if (c != null) {
			System.out.print("Cadena: ");
			String cad = sc.next();

			System.out.println(c.buscarTelefono(cad));
		}
	}

	static void addCompra() {
		Cliente c = seleccionarCliente();
		if (c != null) {
			System.out.print("Producto: ");
			String p = sc.next();

			System.out.print("Cantidad: ");
			int cant = sc.nextInt();

			c.addCompra(p, cant);
		}
	}

	static void verProductos() {
		Cliente c = seleccionarCliente();
		if (c != null) {
			System.out.println(c.verProductos());
		}
	}

	static void totalUnidades() {
		Cliente c = seleccionarCliente();
		if (c != null) {
			System.out.println("Total unidades: " + c.totalUnidades());
		}
	}

	static void eliminarProducto() {
		Cliente c = seleccionarCliente();
		if (c != null) {
			System.out.print("Producto: ");
			String p = sc.next();

			c.eliminarProducto(p);
		}
	}

	// ---------------- GENERADOR ALEATORIO ----------------

	static void generarClientesAleatorios() {

		Random r = new Random();

		for (int i = 1; i <= 25; i++) {

			Cliente c = new Cliente(i, "Cliente" + i, "cliente" + i + "@mail.com");

			// teléfonos aleatorios
			int numTel = 2 + r.nextInt(4);

			for (int j = 0; j < numTel; j++) {
				c.addTelefono("6" + (10000000 + r.nextInt(90000000)));
			}

			// compras aleatorias
			String[] productos = { "Pan", "Leche", "Arroz", "Huevos", "Café" };

			int numCompras = 2 + r.nextInt(4);

			for (int k = 0; k < numCompras; k++) {
				String prod = productos[r.nextInt(productos.length)];
				int cant = 1 + r.nextInt(5);
				c.addCompra(prod, cant);
			}

			clientes.add(c);
		}
	}
}