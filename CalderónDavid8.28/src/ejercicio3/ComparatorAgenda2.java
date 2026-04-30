/*Descripción: Hago un compare para mostrar de forma ordenada por nombre
 * Autor:David Calderón Navarro
 * Fecha:19/03/2026
 */

package ejercicio3;

import java.util.Comparator;

import ejercicio2.Agenda;

public class ComparatorAgenda2 implements Comparator<Agenda>{

	@Override
	public int compare(Agenda agenda1, Agenda agenda2) {
		
		return agenda1.getNombre().compareTo(agenda2.getNombre());
		
	}

}
