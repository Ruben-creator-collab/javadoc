package ejercicio1.java;

import libtarea3.Bombilla;
import libtarea3.Utilidades;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// apartado 1
		Bombilla obj1;
		Bombilla obj2;
		Bombilla obj3;
		
		// apartado 2
		// apartado 2.1
		System.out.printf("Bombillas creadas hasta el momento: %d",Bombilla.getBombillasCreadas());
		System.out.println();
		
		// apartado 2.2
		System.out.printf("Bombillas encendidas hasta el momento: %d",Bombilla.getBombillasEncendidas());
		System.out.println();
		
		// apartado 3
		// apartado 3.1
		Bombilla objNoValido;
		try {
			objNoValido = new Bombilla(true, 250);
		} catch (IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			objNoValido = new Bombilla();
		}
		
		
		// apartado 3.2
		try {
			objNoValido = new Bombilla(5);
		} catch (IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			objNoValido = new Bombilla();
		}
		
		// apartado 3.3
		obj1 = new Bombilla(true, 100);
		
		// apartado 3.4
		obj2 = new Bombilla(true);
		
		// apartado 3.5
		obj3 = new Bombilla();
		
		// apartado 4
		// apartado 4.1
		try {
			obj1.encender();
		} catch (IllegalStateException ex2) {
			ex2.getMessage();
		}
		
		// apartado 4.2
		for (int contador = 0; contador < 6; contador++) {
			obj1.conmutar();
			Utilidades.esperar(1);
		}
		
		// apartado 4.3
		obj2.apagar();
		
		// apartado 4.4
		obj3.encender();
		
		// apartado 5
		// apartado 5.1
		System.out.printf("Potencia de la primera bombilla: %.2f", obj1.getPotencia());
		System.out.println();
		
		// apartado 5.2
		System.out.printf("Estado de la primera bombilla: %b\n", obj1.getEstado());
		
		// apartado 5.3
		DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		System.out.printf("La última vez que se encendió la primera bombilla: %s\n", obj1.getUltimaVezEncendida().format(formatoFechaHora));
		
		// apartado 5.4
		System.out.printf("El número de veces encendidas: %d\n", obj1.getVecesEncendida());
		
		// apartado 5.5
		System.out.printf("Tiempo que lleva encendida (en segundos): %.2f\n", obj1.getTiempoEncendida());
		
		// apartado 5.6
		System.out.printf("Potencia consumida: %.2f\n", obj1.getPotenciaConsumida());
		
		// apartado 6
		// apartado 6.1
		System.out.printf("Bombillas creadas hasta el momento: %d\n",Bombilla.getBombillasCreadas());
		
		// apartado 6.2
		System.out.printf("Bombillas encendidas hasta el momento: %d\n",Bombilla.getBombillasEncendidas());
	}

}
