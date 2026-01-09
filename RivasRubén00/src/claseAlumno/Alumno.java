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


	private static final short MAX_NUM_ALUMNOS_CENTRO = 1500;
	private static final byte MAX_NUM_ALUMNOS_GRUPO = 30;
	private static final byte MIN_NUM_ALUMNOS_GRUPO = 10;
	private static final LocalTime MAX_HORA = LocalTime.of(21,30);

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
	
	public static boolean verificarPeso(float a) {
		boolean correcto = true;
		if (a < 10 || a > 300) {
			correcto = false;
		}
		return correcto;
	}
	
	public static boolean verificarAltura(float a) {
		boolean correcto = true;
		if (a < 0) {
			correcto = false;
		}
		return correcto;
	}
	
	public static boolean verificarHermn(byte a) {
		boolean correcto = true;
		if (a > 0) {
			correcto = false;
		}
		return correcto;
	}
	
	public static boolean verificarEdad(byte a) {
		boolean correcto = true;
		if (a < 18) {
			correcto = false;
		}
		return correcto;
	}
	
	public static boolean verificarDni(String a) {

	    Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
	    Matcher texto = patron.matcher(a);

	    // Comprobar formato
	    if (!texto.matches()) {
	        return false;
	    }

	    // Calcular letra correcta
	    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	    int num = Integer.parseInt(a.substring(0, 8));
	    char letraCorrecta = letras.charAt(num % 23);

	    // Comparar con la letra del DNI
	    char letraDni = a.charAt(8);

	    return letraDni == letraCorrecta;
	}
	
	
	
}


