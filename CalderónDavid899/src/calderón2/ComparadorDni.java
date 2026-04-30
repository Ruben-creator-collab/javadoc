package calderón2;

import java.util.Comparator;

public class ComparadorDni implements Comparator<Empleado>{
	
	public int compare(Empleado emp1, Empleado emp2) {
		
		return emp2.getDni().compareTo(emp1.getDni());
		
	}

}