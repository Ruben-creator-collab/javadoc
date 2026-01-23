package bombilla;

public class Bombilla {
	
	// Atributos de clase constantes
	public static final boolean ESTADO_DEFAULT = false;
	
	// Atributos de clase
	private static int nBombillasCreadas = 0;	// Número de bombillas creadas hasta el momento
	private static int nBombillasEncendidas = 0; // Número de bombillas que se encuentran encendidas
	
	// Atributos de objeto
	private boolean estado;
	private int nVecesEncendida;	// Número de veces que se ha encendido desde que se fabricó
	
	// constructor con 1 parámetro
	public Bombilla (boolean estado) {
		this.estado = estado;
		this.nVecesEncendida = 0;
		nBombillasCreadas++;
		
		if (estado == true) {
			nVecesEncendida++;
			nBombillasEncendidas++;
		} 
		
	}
	
	// constructor sin parámetros
	public Bombilla () {
		this(ESTADO_DEFAULT);
	}
	
	// Métodos
	
	public String toString() {
		String resultado = String.format("Bombilla %s. Se ha encendido %d %s",
				this.estado ? "encendida" : "apagada",
				this.nVecesEncendida, 
				this.nVecesEncendida == 1 ? "vez" : "veces");

				    return resultado;
	}
	public boolean getEstado() {
		return this.estado;
	}

	public boolean isEncendida() {
		return this.estado;
	}

	public boolean isApagada() {
		return !this.estado;
	}

	public int getVecesEncendida() {
		return this.nVecesEncendida;
	}
	
	public void encender() throws IllegalStateException {
		if (this.estado) {
			throw new IllegalStateException("Ya está encendida");
		}
		this.estado = true;
		this.nVecesEncendida++;
		nBombillasEncendidas++;
	}
	public void apagar() throws IllegalStateException {
		if (!this.estado) {
			throw new IllegalStateException("Ya está apagada");
		}
		this.estado = false;
		nBombillasEncendidas--;
	}
	public void conmutar() throws IllegalStateException {
		if (this.estado) {
			apagar();
		} else {
			encender();
		}
	}
}
