package agenda;

import java.time.LocalDate;

public class Agenda {
	
	// atributos
	private String nombre;
	private String telefono;
	private String email;
	private LocalDate fechaNac;
	
	// Constructores
	public Agenda(String nombre, String telefono, String email, LocalDate fechaNac) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.fechaNac = fechaNac;
	}
	
	// getters
	public String getNombre() {
		return this.nombre;
	}
	public String getTelefono() {
		return this.telefono;
	}
	public String getEmail() {
		return this.email;
	}
	public LocalDate getFechaNac() {
		return this.fechaNac;
	}
	
	// toString
    @Override
    public String toString() {
        return nombre + " | " + telefono + " | " + email + " | " + fechaNac;
    }
}
