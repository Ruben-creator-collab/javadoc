package estructuraSi;

public class EjercicioResuletoDowhile {

	public static void main(String[] args) {
		
		int inicio = 100;
		int fin = 0;
		
		System.out.println("Cuenta atrás desde 100 hasta 0, de 10 en 10: ");
		do {
			System.out.print(inicio + " ");
			inicio = inicio - 10;
			
		} while (inicio >= fin);
		
		
	}

}
