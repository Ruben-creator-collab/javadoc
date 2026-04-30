package playamarbank;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Clase PlayamarBank que representa una cuenta bancaria con funcionalidades de
 * saldo, descubierto, embargo y transferencias.
 * 
 * <p>El identificador de la cuenta tiene formato AAAA-NNNN, donde AAAA es el año
 * de creación y NNNN un número consecutivo que se resetea cada año.</p>
 * 
 * <p>La clase mantiene información global sobre todas las cuentas creadas, incluyendo
 * saldo global, número de cuentas embargadas y fecha de la cuenta más moderna.</p>
 */
public class PlayamarBank {

	// Atributos de la clase

	// Atributos constantes de la clase

	public static final double DEFAULT_MAX_DESCUBIERTO = 0.0;
	public static final double DEFAULT_SALDO = 0.0;

	public static final double MAX_DESCUBIERTO = -2000.0;
	public static final double MAX_EMBARGO = 100.0;
	public static final double MAX_SALDO = 5.0E7;
	public static final double MIN_EMBARGO = 0.0;

	public static final int MIN_YEAR = 1900;

	// Atributos variables de la clase
	private static int contadorPorAño = 0;
	private static LocalDate fechaMasModerna = LocalDate.MIN;
	private static double saldoGlobal = 0.0;
	private static int numCuentasEmbargadas = 0;

	// Atributos del objeto

	// Atributos Variables
	private double saldo;
	private double saldoMaximo;
	private double limiteDescubierto;
	private LocalDate fechaCreacion;
	private double porcentajeEmbargo;
	private String id;

	// Constructores

    /**
     * Constructor sin parámetros.
     * Crea una cuenta con saldo y descubierto por defecto, y fecha de creación actual.
     */
	public PlayamarBank() {
		this(DEFAULT_SALDO, LocalDate.now(), DEFAULT_MAX_DESCUBIERTO);
	}

    /**
     * Constructor con saldo inicial.
     * 
     * @param saldoInicial saldo inicial de la cuenta
     * @throws IllegalArgumentException si el saldo inicial está fuera de los límites permitidos
     */
	public PlayamarBank(double saldoInicial) {
		this(saldoInicial, LocalDate.now(), DEFAULT_MAX_DESCUBIERTO);
	}

    /**
     * Constructor con saldo inicial y fecha de creación.
     * 
     * @param saldoInicial saldo inicial de la cuenta
     * @param fechaCreacion fecha de creación de la cuenta
     * @throws IllegalArgumentException si el saldo está fuera de los límites o el año de creación es menor que MIN_YEAR
     */
	public PlayamarBank(double saldoInicial, LocalDate fechaCreacion) {
		this(saldoInicial, fechaCreacion, DEFAULT_MAX_DESCUBIERTO);
	}


    /**
     * Constructor con saldo inicial, fecha de creación y límite de descubierto.
     * 
     * @param saldoInicial saldo inicial de la cuenta
     * @param fechaCreacion fecha de creación de la cuenta
     * @param limiteDescubierto límite de descubierto permitido
     * @throws IllegalArgumentException si algún parámetro está fuera de los límites establecidos
     */
    public PlayamarBank(double saldoInicial, LocalDate fechaCreacion, double limiteDescubierto) throws IllegalArgumentException {
        if (saldoInicial < MAX_DESCUBIERTO || saldoInicial > MAX_SALDO) {
            throw new IllegalArgumentException("Saldo inicial fuera de límites permitidos.");
        }
        if (limiteDescubierto < MAX_DESCUBIERTO || limiteDescubierto > DEFAULT_MAX_DESCUBIERTO) {
            throw new IllegalArgumentException("Límite descubierto fuera de rango.");
        }
        if (fechaCreacion.getYear() < MIN_YEAR) {
            throw new IllegalArgumentException("El año de creación es menor que el mínimo permitido.");
        }
    	
        this.saldo = saldoInicial;
        this.saldoMaximo = saldoInicial;
        this.limiteDescubierto = limiteDescubierto;
        this.fechaCreacion = fechaCreacion;
        this.porcentajeEmbargo = 0.0;

        // actualizar fecha más moderna
        if (fechaCreacion.isAfter(fechaMasModerna)) {
            fechaMasModerna = fechaCreacion;
        }

        // Generar ID AAAA-NNNN
        if (fechaCreacion.getYear() != LocalDate.now().getYear()) {
            contadorPorAño = 0; // reset para nuevo año
        }
        this.id = String.format("%04d-%04d", fechaCreacion.getYear(), contadorPorAño++);
        
        // actualizar saldo global
        saldoGlobal += saldoInicial;
    }
    
    // Métodos
    

    /**
     * Extrae una cantidad de la cuenta.
     * 
     * @param cantidad cantidad a extraer
     * @throws IllegalArgumentException si la cantidad es negativa o excede el saldo disponible considerando embargo
     */
    public void extraer(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("No se puede extraer una cantidad negativa.");
        }
        double maxDisponible = saldo - saldo * (porcentajeEmbargo / 100);
        if (cantidad <= maxDisponible) {
            saldo -= cantidad;
        } else {
            throw new IllegalArgumentException("No se puede extraer: embargo aplicado o saldo insuficiente.");
        }
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * 
     * @param cantidad cantidad a ingresar
     * @throws IllegalArgumentException si la cantidad es negativa
     */
    public void ingresar(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("No se puede ingresar una cantidad negativa.");
        }
        saldo += cantidad;
        if (saldo > saldoMaximo) saldoMaximo = saldo;
        saldoGlobal += cantidad;
    }

    /**
     * Indica si la cuenta está embargada.
     * 
     * @return true si la cuenta tiene embargo aplicado, false en caso contrario
     */
    public boolean isEmbargada() {
        return porcentajeEmbargo > 0;
    }

    /**
     * Indica si la cuenta está en descubierto (saldo negativo).
     * 
     * @return true si el saldo es negativo, false en caso contrario
     */
    public boolean isDescubierta() {
        return saldo < 0;
    }

    /**
     * Obtiene la antigüedad de la cuenta en días.
     * 
     * @return número de días desde la creación de la cuenta
     */
    public long getDiasCuenta() {
        return ChronoUnit.DAYS.between(fechaCreacion, LocalDate.now());
    }

    /**
     * Devuelve la fecha de creación de la cuenta.
     * 
     * @return fecha de creación
     */
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Devuelve la fecha más moderna entre todas las cuentas.
     * 
     * @return fecha más reciente registrada
     */
    public static LocalDate getFechaMasModerna() {
        return fechaMasModerna;
    }

    /**
     * Devuelve el identificador de la cuenta.
     * 
     * @return ID en formato AAAA-NNNN
     */
    public String getId() {
        return id;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return saldo disponible
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Devuelve el límite de descubierto permitido.
     * 
     * @return límite de descubierto
     */
    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    /**
     * Devuelve el porcentaje de embargo aplicado.
     * 
     * @return porcentaje de embargo
     */
    public double getPorcentajeEmbargo() {
        return porcentajeEmbargo;
    }

    /**
     * Devuelve el saldo máximo alcanzado por la cuenta.
     * 
     * @return saldo máximo registrado
     */
    public double getSaldoMaximo() {
        return saldoMaximo;
    }

    /**
     * Devuelve el saldo global acumulado de todas las cuentas.
     * 
     * @return saldo global
     */
    public static double getSaldoGlobal() {
        return saldoGlobal;
    }

    /**
     * Devuelve el número de cuentas actualmente embargadas.
     * 
     * @return número de cuentas con embargo activo
     */
    public static int getNumCuentasEmbargadas() {
        return numCuentasEmbargadas;
    }

    /**
     * Devuelve información básica de la cuenta en forma de cadena.
     * 
     * @return cadena con ID, saldo y porcentaje de embargo
     */
    @Override
    public String toString() {
        return String.format("Cuenta %s - Saldo: %.2f€ - Embargo: %.2f%%", id, saldo, porcentajeEmbargo);
    }

    /**
     * Transfiere una cantidad específica a otra cuenta.
     * 
     * @param cantidad cantidad a transferir
     * @param destino cuenta destino
     * @throws IllegalArgumentException si la cantidad es negativa o excede el saldo disponible considerando embargo
     */
    public void transferir(double cantidad, PlayamarBank destino) {
        if (cantidad < 0) throw new IllegalArgumentException("No se puede transferir cantidad negativa.");
        double maxDisponible = saldo - saldo * (porcentajeEmbargo / 100);
        if (cantidad <= maxDisponible) {
            saldo -= cantidad;
            destino.ingresar(cantidad);
        } else {
            throw new IllegalArgumentException("No se puede transferir: embargo aplicado o saldo insuficiente.");
        }
    }

    /**
     * Transfiere todo el saldo disponible a otra cuenta.
     * 
     * @param destino cuenta destino
     */
    public void transferir(PlayamarBank destino) {
        double cantidad = saldo - saldo * (porcentajeEmbargo / 100);
        transferir(cantidad, destino);
    }
}
