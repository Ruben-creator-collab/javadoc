package operadoresBasicos;

public class OperadoresBasicos {

	public static void main(String[] args) {
		int dato1, dato3;
		double dato2;
		
		dato1 = 5;
		dato2 = 3.0;
		dato3 = 5;
		
		int suma;
		suma = dato1+dato3;
		System.out.println("La suma es: " + suma);
		
		int resta;
		resta = dato1-dato3;
		System.out.println("La resta es: " + resta);
		
		int multiplicacion;
		multiplicacion = dato1*dato3;
		System.out.println("La multiplicación es: " + multiplicacion);
		
		double division;
		division = dato1/dato2;
		System.out.println("La división es: " + division);
		
		int resto;
		resto = dato1%dato3;
		System.out.println("El resto es: " + resto);
		
		int dato1mas, dato1menos;
		dato1mas = dato1++; // dato1mas = dato1 + 1
		dato1menos = dato1--; // dato1menos = dato1 - 1
		
		System.out.println("Incremental posterior " + ++dato1);
		System.out.println(dato1);
		dato1 = dato1 +1;
		
		boolean distinto = dato1 != dato3;
		System.out.println (distinto);
		

	}

}
