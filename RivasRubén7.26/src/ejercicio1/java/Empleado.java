package ejercicio1.java;

public class Empleado {
	// Atributos
	private final String nombre;
	private final String dni;
	
	private float sueldoBruto;		// El sueldo bruto mensual del trabajador
	private int edad;
	private int telefono;
	private String direccion;
	
	
	public Empleado (String nombre, String dni, float sueldoBruto) throws IllegalArgumentException {
		this.nombre = nombre;
		this.dni = dni;
		this.sueldoBruto = sueldoBruto;
		this.edad = 30;
		this.telefono = 123456789;
		this.direccion = "Calle Manzanilla";
	}
	
	// Metodo para imprimir por pantalla la informacion de un empleado
	public void mostrarEmpleado() {
		System.out.println("Nombre del empleado: " + nombre);
		System.out.println("Dni del empleado: " + dni);
		System.out.println("Sueldo bruto del empleado: " + sueldoBruto);
		System.out.println("Edad del empleado: " + edad);
		System.out.println("Teléfono del empleado: " + telefono);
		System.out.println("Dirección del empleado: " + direccion);
	}
	
	// Metodo para calcular sueldo mensual con el descuento del irpf
	public float calcularSueldo() {
		float sueldoAnual = sueldoBruto * 12;
		float porcentajeIrpf;
		if (sueldoAnual < 12000) {
			porcentajeIrpf = 0.2f;
		} else if (sueldoAnual <= 25000) {
			porcentajeIrpf = 0.3f;
		} else {
			porcentajeIrpf = 0.4f;
		}
		float descuento = sueldoBruto * porcentajeIrpf;
		float sueldoNetoMensual = sueldoBruto - descuento;
		return sueldoNetoMensual;
	}
	
}
