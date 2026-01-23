package ticket;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {

	// Atributos de clase

	// Atributos constantes
	public static final int SECUENCIA_MAX = 99_999_999; // Número máximo de secuencia en la id

	// Atributos variables
	private static short ultimoAnno = (short) LocalDate.now().getYear(); // Año actual
	private static int contadorSecuencia = 0;

	// Atributos de objetos

	// Atributos constantes
	private final LocalDate fecha;

	// Atributos variables
	private LocalTime usado; // Momento de uso del ticket
	private String id;

	// CONSTRUCTORES

	// Constructor con 1 parámetro
	public Ticket(LocalDate fecha) throws IllegalArgumentException, IllegalStateException {
		LocalDate hoy = LocalDate.now();
		if (fecha == null) {
			throw new IllegalArgumentException("La fecha es inválida");
		}
		if (fecha.isBefore(hoy)) {
			throw new IllegalArgumentException("fecha de uso anterior a la actual");
		}
		if (fecha.getYear() > hoy.getYear()) {
			throw new IllegalArgumentException("fecha de uso posterior al año actual");
		}
		if (Ticket.contadorSecuencia == Ticket.SECUENCIA_MAX) {
			throw new IllegalStateException("expedidos el número máximo de tickets para este año");
		}

		this.fecha = fecha;
		this.id = generarId();
		this.usado = null;

		if (Ticket.ultimoAnno != hoy.getYear()) {
			Ticket.contadorSecuencia = 0;
			Ticket.ultimoAnno = (short) hoy.getYear();
		}
	}

	// Constructor sin parámetros
	public Ticket() throws IllegalStateException {
		this(LocalDate.now());
	}

	// METODOS GETTER

	public String getId() {
		return this.id;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public boolean isUsado() {
		return this.usado != null;
	}

	public boolean isFinDeSemana() {
		if (fecha.getDayOfWeek() == DayOfWeek.SATURDAY || fecha.getDayOfWeek() == DayOfWeek.SUNDAY) {
			return true;
		} else {
			return false;
		}
	}

	// METODOS

	// Metodo que genera id de ticket
	private String generarId() {
		id = String.format("%04d-%08d", ultimoAnno, ++Ticket.contadorSecuencia);
		return id;
	}

	// Metodo para usar el ticket
	public void usarTicket() throws IllegalStateException {
		if (!this.fecha.isEqual(LocalDate.now())) {
			throw new IllegalStateException(String.format("el ticket no es para hoy: %s", String.format(
					"%02d/%02d/%02d", this.fecha.getDayOfMonth(), this.fecha.getMonthValue(), this.fecha.getYear())));
		}

		if (isUsado()) {
			throw new IllegalStateException(String.format("el ticket ya ha sido usado: %s", this.usado));
		}

		// Si es posible usar el ticket lo marcamos como usado
		usado = LocalTime.now();
	}

	// Metodo toString()
	public String toString() {
		return String.format("{ID: %s, Fecha:%02d/%02d/%04d, Usado: %s}", this.id, this.fecha.getDayOfMonth(), this.fecha.getMonthValue(), this.fecha.getYear(), this.usado == null ? "no" : String.format("%02d:%02d", usado.getHour(), usado.getMinute()));
	}

	// Pseudoconstructores

	public static Ticket randomEsteMes() {
		LocalDate hoy = LocalDate.now(); // Fecha actual

		// Calculo día de mes actual
		int diaActual = hoy.getDayOfMonth();

		// Calculo último día de mes del mes actual
		int ultimoDiaMes = hoy.lengthOfMonth();

		// Calculo número aleatorio entre ambos
		int diasRandom = (int) (Math.random() * (ultimoDiaMes - diaActual + 1));

		// Generamos fecha del mes actual con día aleatorio y a partir de hoy
		LocalDate fechaRandom = hoy.plusDays(diasRandom);

		// Generamos ticket con la fecha aleatoria (dentro del mes actual)
		Ticket ticket = new Ticket(fechaRandom);

		// Devolvemos referencia a objeto ticket con fecha aleatoria
		return ticket;
	}

	public static Ticket random() {
		LocalDate hoy = LocalDate.now(); // Fecha actual

		// Calculo día del año para hoy (entre 1-365 o 366)
		int diaActual = hoy.getDayOfYear();

		// Calculo último día del año actual (365 o 366)
		int ultimoDia = 365 + (hoy.isLeapYear() ? 1 : 0);

		// Calculo número aleatorio entre ambos
		int diasRandom = (int) (Math.random() * (ultimoDia - diaActual + 1));

		// Generamos fecha del año actual con día aleatorio y a partir de hoy
		LocalDate fechaRandom = hoy.plusDays(diasRandom);

		// Generamos ticket con la fecha aleatoria (dentro del año actual)
		Ticket ticket = new Ticket(fechaRandom);

		// Devolvemos objeto ticket con fecha aleatoria
		return ticket;
	}
}
