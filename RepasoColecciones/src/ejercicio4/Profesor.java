package ejercicio4;

public class Profesor extends Persona{
	
	//Atributos
	
	private String especialidad;
	private double salario;
	
	//Constructor
	
	public Profesor(String dnip, String nombrep, int edadp, String especialidadp, 
			double salariop) {
		
		super(dnip, nombrep, edadp);
		
		if(salariop <= 0) {
			
			throw new IllegalArgumentException("El salario no puede ser menor o igual a cero");
			
		}
		
	}
	
	//Metodos
	
	@Override
	public String toString() {
		
		return "\nDni: " + this.dni + "| Nombre: " + this.nombre + "| Edad: " + this.edad + "| Especialidad: " + this.especialidad + "| Salario: " + this.salario;
		
	}
	
}
