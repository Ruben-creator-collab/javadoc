package ejercicio2;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparadorEvento implements Comparator<Evento>{

	@Override
	public int compare(Evento evento1, Evento evento2) {
		
		return evento1.getFecha().compareTo(evento2.getFecha());
	
	}
	
}