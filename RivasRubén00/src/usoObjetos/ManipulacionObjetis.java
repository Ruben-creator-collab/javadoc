package usoObjetos;

import java.awt.Rectangle;

public class ManipulacionObjetis {

	public static void main(String[] args) {
		Rectangle r1, r2;	// Declaración objeto
		
		r1 = new Rectangle();	// Instanciación de un objeto
		
		System.out.println(r1.toString());
		
		r1.x = 10;
		System.out.println(r1.toString());
		
		r2 = r1;
		System.out.println(r2.toString());
		
		r2.x = 20;
		System.out.println("El contenido de r1 es: " + r1);
		
		r1.setLocation(50, 50);
		r1.setSize(10, 10);
		System.out.println(r2);
		
		double coordenadaX = r1.getX();
		System.out.println(coordenadaX);
		
	}

}
