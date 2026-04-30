package trabajador;

public class Trabajador {
	// Enum
	public enum Sexo {
		MASCULINO, FEMENINO
	}

	public enum EstadoCivil {
		CASADO, DIVORCIADO, VIUDO, SOLTERO
	}

	// Atributos
	private String nombre;
	private int edad;
	private double salarioBase;
	private Sexo sexo;
	private EstadoCivil estadoCivil;

	// Constructores
	public Trabajador(String nombre, int edad, Sexo sexo, EstadoCivil estadoCivil, double salarioBase) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.salarioBase = salarioBase;
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

}
