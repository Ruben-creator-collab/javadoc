package rivas2;

import java.util.Comparator;

public class ComparadorPorOrdenDecrecienteDni implements Comparator<Empleado> {
	@Override
	public int compare(Empleado o1, Empleado o2) {
        return Integer.compare(o1.getDni().codePointAt(0), o2.getDni().codePointAt(0));
	}
}
