/*Descripción: Clase Alumno con ocho atributos, un constructor y varios metodos
 * Autor:David Calderón Navarro
 * Fecha:20/03/2026
 */

package ejercicio6.java;

import java.time.LocalDate;

public class Alumno {

	// Atributos

	private int codAlumno;
	private String nombre;
	private String apellidos;
	private String direccion;
	private int telefono;
	private String codCiclo;
	private int cantidadCursosAprobados;
	private LocalDate fechaIngreso;

	// Constructor

	public Alumno(int codAlumnop, String nombrep, String apellidosp, String direccionp, int telefonop, String codCiclop,
			int CantCursosApro, LocalDate fechaIngresop) {

		this.codAlumno = codAlumnop;
		this.nombre = nombrep;
		this.apellidos = apellidosp;
		this.direccion = direccionp;
		this.telefono = telefonop;
		this.codCiclo = codCiclop;
		this.cantidadCursosAprobados = CantCursosApro;
		this.fechaIngreso = fechaIngresop;

	}

	// Metodos

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public String getNombre() {

		return this.nombre;

	}

	public void setApellidos(String apellidos) {

		this.apellidos = apellidos;

	}

	public String getApellidos() {

		return this.apellidos;

	}

	public void setCodAlumno(int cod) {

		this.codAlumno = cod;

	}

	public void setDireccion(String direccion) {

		this.direccion = direccion;

	}

	public void setTelefono(int telf) {

		this.telefono = telf;

	}

	public int getTelfono() {

		return this.telefono;

	}
	
	public void setCodCiclo(String cod) {

		this.codCiclo = cod;

	}
	
	public void setCantidadCursosAprobados(int num) {

		this.cantidadCursosAprobados = num;

	}
	
	public void setFechaIngreso(LocalDate fecha) {

		this.fechaIngreso = fecha;

	}
	
	public String toString() {
		
		return " | Codigo de alumno: " + this.codAlumno + "\n | Nombre: " + this.nombre + "\n | Apellidos: " + this.apellidos + "\n | Direccion: " + this.direccion + "\n | Telefono: "
				+ this.telefono + "\n | Codigo de ciclo: " + this.codCiclo + "\n | Cantidad de cursos aprobados: " + this.cantidadCursosAprobados + "\n | Fecha de ingreso: " + this.fechaIngreso;
		
	}

}
