/*Descripción: Hago un compareto para mostrar de forma ordenada
 * Autor:David Calderón Navarro
 * Fecha:19/03/2026
 */

package ejercicio4.java;

import java.util.Comparator;

import ejercicio2.Agenda;

public class ComparadorTrabajador implements Comparator<Trabajador>{

	@Override
	public int compare(Trabajador trabajador1, Trabajador trabajador2) {
		
		int Sexo = trabajador1.getSexo().compareTo(trabajador2.getSexo());
		
		if(Sexo != 0) {
			
			return Sexo;
			
		}
		
		return trabajador1.getEstadoCivil().compareTo(trabajador2.getEstadoCivil());
		
	}
	
}
