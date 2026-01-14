/*
 * Descripción: Clase alumnos con 10 atributos
 * Autor: Rubén Rivas
 * Fecha: 08/01/26
 */
package claseAlumno;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno {

	// Atributos
	private static final short MAX_NUM_ALUMNOS_CENTRO = 1500;
	private static final byte MAX_NUM_ALUMNOS_GRUPO = 30;
	private static final byte MIN_NUM_ALUMNOS_GRUPO = 10;
	private static final LocalTime MAX_HORA = LocalTime.of(21,30);
	private static final String DNI_DEFAULT = "00000000A";
	private static final String NOMBRE_DEFAULT = "Juan";
	private static final String APELLIDOS_DEFAULT = "Diaz Carmona";
	private static final LocalDate FECHA_NAC_DEFAULT = LocalDate.of(2026, 01, 01);
	private static final float PESO_DEFAULT = 50;
	private static final float ALTURA_DEFAULT = 1.50f;
	private static final byte NUM_HERMANOS_DEFAULT = 0;
	
	
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNac;
	private float peso;
	private float altura;
	private byte numHermanos;
	private static short numAlum;			// Representa la cantidad de alumnos existentes
	private boolean mayorEdad;
	private LocalTime maxHora;
	
	// Constructores
	public Alumno(String dniP, String nombreP, String apellidosP, LocalDate fechaNacP, 
			float pesoP, float alturaP, byte numHermanosP) throws IllegalArgumentException {
		if (dniP == null || nombreP == null || apellidosP == null|| fechaNacP == null || pesoP <= 0 || alturaP <= 0 || numHermanosP < 0 ) {
			throw new IllegalArgumentException ("alguno de los parámetros de entrada es null");
		} else if (dniP.isEmpty() || nombreP.isEmpty() || apellidosP.isEmpty()) {
			throw new IllegalArgumentException ("algunos de los parámetros de entrada estan vacios");
		} else if (verificarDni(dniP)) {
			throw new IllegalArgumentException ("El DNI es incorrecto");
		}
	}
	
	public Alumno(String dniP, String nombreP, String apellidosP) throws IllegalArgumentException {
		
		this(dniP, nombreP, apellidosP, Alumno.FECHA_NAC_DEFAULT, Alumno.PESO_DEFAULT, Alumno.ALTURA_DEFAULT, Alumno.NUM_HERMANOS_DEFAULT);
	}
	
	public Alumno() throws IllegalArgumentException {
		
		this(Alumno.DNI_DEFAULT, Alumno.NOMBRE_DEFAULT, Alumno.APELLIDOS_DEFAULT, Alumno.FECHA_NAC_DEFAULT, Alumno.PESO_DEFAULT, Alumno.ALTURA_DEFAULT, Alumno.NUM_HERMANOS_DEFAULT);
	}
	
	
	// Métodos
	public static boolean verificarPeso(float peso) {
		boolean correcto = true;
		if (peso < 10 || peso > 300) {
			correcto = false;
		}
		return correcto;
	}
	
	public static boolean verificarAltura(float altura) {
		boolean correcto = true;
		if (altura < 0) {
			correcto = false;
		}
		return correcto;
	}
	
	public static boolean verificarHermn(byte hrmn) {
		boolean correcto = true;
		if (hrmn > 0) {
			correcto = false;
		}
		return correcto;
	}
	
	public static boolean verificarEdad(byte edad) {
		boolean correcto = true;
		if (edad < 18) {
			correcto = false;
		}
		return correcto;
	}
	
	public static boolean verificarDni(String dni) {

	    Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
	    Matcher texto = patron.matcher(dni);

	    // Comprobar formato
	    if (!texto.matches()) {
	        return false;
	    }

	    // Calcular letra correcta
	    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	    int num = Integer.parseInt(dni.substring(0, 8));
	    char letraCorrecta = letras.charAt(num % 23);

	    // Comparar con la letra del DNI
	    char letraDni = dni.charAt(8);

	    return letraDni == letraCorrecta;
	}
	
	
	
}


