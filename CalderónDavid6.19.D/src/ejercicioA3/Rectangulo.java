/*Descripción: Declaro cuatro atributos, un constructor Rectangulo y metodos getters y setters
 * Autor:David Calderón Navarro
 * Fecha:27/01/2026
 */

package ejercicioA3;

import java.time.LocalDate;

public class Rectangulo {
	
	//Atributos
	
	private byte x1;
	private byte x2;
	private byte y1;
	private byte y2;
	
	//Constructor
	
	public Rectangulo(byte x1, byte y1, byte x2, byte y2) throws IllegalArgumentException{
		
		if (x2 <= x1 || y2 <= y1) {
            throw new IllegalArgumentException("x2 debe ser mayor que x1 y y2 mayor que y1");
        }
		
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		
	}
	

	public byte getx1() {
		
		return this.x1;
		
	}
	
	public byte getx2() {
		
		return this.x2;
		
	}

	public byte gety1() {
	
	return this.y1;
	
}

	public byte gety2() {
	
	return this.y2;
	
}
	
	public void setx1(Byte x1) {
		
		if(this.x2 > x1) {
		
			this.x1 = x1;
		
		}else {
			
			throw new IllegalArgumentException("X1 es mayor que X2");
			
		}
		
	}
	
	public void setx2(Byte x2) {
		
		if(x2 > x1) {
			
			this.x2 = x2;
		
		}else {
			
			throw new IllegalArgumentException("X2 es menor que X1");
			
		}
		
		
	}
	
	public void sety1(Byte y1) {
		
		if(this.y2 > y1) {
			
			this.y1 = y1;
		
		}else {
			
			throw new IllegalArgumentException("Y1 es mayor que Y2");
			
		}
		
	}
	
	public void sety2(Byte y2) {
		
		if(y2 > y1) {
			
			this.y2 = y2;
		
		}else {
			
			throw new IllegalArgumentException("Y1 es mayor que Y2");
			
		}
		
	}
	
	public int getPerimetro() {
		
		 int ancho = this.x2 - this.x1;
		 int alto  = this.y2 - this.y1;

		 return 2 * (ancho + alto);
	    
	}

	public int getArea() {
		
		int ancho = this.x2 - this.x1;
	    int alto  = this.y2 - this.y1;

	    return ancho * alto;
	    
	}
	
	public void imprime() {
	    
		System.out.printf("Coordenadas: (%d,%d),(%d,%d)%nPerímetro: %d%nÁrea: %d%n%n", this.x1, this.y1, this.x2, this.y2, this.getPerimetro(), this.getArea());
	
	}
	
	public void setX1Y1(byte x1, byte y1) {
		
		this.x1 = x1;
		this.y1 = y1;
		
	}
	
	public void setX2Y2(byte x2, byte y2) {
		
		this.x2 = x2;
		this.y2 = y2;
		
	}
	
	public void setAll(byte x1, byte y1, byte x2, byte y2) {
		
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		
	}
	
	
	
}
