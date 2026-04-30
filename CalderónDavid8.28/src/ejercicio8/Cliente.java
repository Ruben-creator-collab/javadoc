package ejercicio8;

import java.util.*;

public class Cliente {

	private int codigoCliente;
	private String nombre;
	private String email;

	private ArrayList<String> telefonos;
	private HashMap<String, Integer> compras;

	public Cliente(int codigoCliente, String nombre, String email) {
		this.codigoCliente = codigoCliente;
		this.nombre = nombre;
		this.email = email;
		this.telefonos = new ArrayList<>();
		this.compras = new HashMap<>();
	}

	public void addTelefono(String telefono) {
		if (!telefonos.contains(telefono)) {
			telefonos.add(telefono);
		}
	}

	public String getTelefono(int indice) {
		if (indice >= 0 && indice < telefonos.size()) {
			return telefonos.get(indice);
		}
		return "";
	}

	public ArrayList<String> buscarTelefono(String cadena) {
		ArrayList<String> resultado = new ArrayList<>();

		for (String t : telefonos) {
			if (t.contains(cadena)) {
				resultado.add(t);
			}
		}
		return resultado;
	}

	public void addCompra(String producto, int cantidad) {
		compras.put(producto, compras.getOrDefault(producto, 0) + cantidad);
	}

	public void eliminarProducto(String producto) {
		compras.remove(producto);
	}

	public ArrayList<String> verProductos() {
		ArrayList<String> lista = new ArrayList<>(compras.keySet());
		Collections.sort(lista);
		return lista;
	}

	public int totalUnidades() {
		int total = 0;

		for (int cantidad : compras.values()) {
			total += cantidad;
		}

		return total;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Cliente{" + "codigo=" + codigoCliente + ", nombre='" + nombre + '\'' + ", email='" + email + '\''
				+ ", telefonos=" + telefonos + ", compras=" + compras + '}';
	}
}