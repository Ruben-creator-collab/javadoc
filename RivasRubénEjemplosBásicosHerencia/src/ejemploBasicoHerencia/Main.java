package ejemploBasicoHerencia;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Producto p1 = new ProductoFresco("Manzana", LocalDate.of(2026, 3, 10), 1, LocalDate.of(2026, 2, 1), "España");

		Producto p2 = new ProductoRefrigerado("Yogur", LocalDate.of(2026, 2, 20), 2, "AESAN-123", 4,
				LocalDate.of(2026, 2, 15));

		Producto p3 = new ProductoCongelado("Pizza", LocalDate.of(2027, 1, 1), 3, -18, 12);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
