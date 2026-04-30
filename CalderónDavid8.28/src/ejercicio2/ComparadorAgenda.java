/*Descripción: Hago un compare para mostrar de forma ordenada por nombre
 * Autor:David Calderón Navarro
 * Fecha:18/03/2026
 */

package ejercicio2;

import java.util.Comparator;

public class ComparadorAgenda implements Comparator<Agenda>{

	@Override
	public int compare(Agenda agenda1, Agenda agenda2) {
		
		return agenda1.getNombre().compareTo(agenda2.getNombre());
		
	}
	
}
