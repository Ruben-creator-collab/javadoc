package operacionesArraylist;


public class Alumno implements Comparable<Alumno> {
	private String grupo;
	private String nombre;
	private int matematicas;
	private int lengua;
	private int fisica;
	private int quimica;
	private int ingles;

	public Alumno(String grupo, String nombre, int matematicas, int lengua, int fisica, int quimica, int ingles)
			throws IllegalArgumentException {
		if (matematicas < 0 || matematicas > 10 || lengua < 0 || lengua > 10 || fisica < 0 || fisica > 10 || quimica < 0
				|| quimica > 10 || ingles < 0 || ingles > 10) {
			throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
		}
		this.grupo = grupo;
		this.nombre = nombre;
		this.matematicas = matematicas;
		this.lengua = lengua;
		this.fisica = fisica;
		this.quimica = quimica;
		this.ingles = ingles;
	}
	
	

	public Alumno() {
		super();
	}



	protected String getGrupo() {
		return grupo;
	}

	public String getNombre() {
		return nombre;
	}

	protected int getMatematicas() {
		return matematicas;
	}

	protected int getLengua() {
		return lengua;
	}

	protected int getFisica() {
		return fisica;
	}

	protected int getQuimica() {
		return quimica;
	}

	protected int getIngles() {
		return ingles;
	}

	protected void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void setMatematicas(byte matematicas) {
		this.matematicas = matematicas;
	}

	protected void setLengua(byte lengua) {
		this.lengua = lengua;
	}

	protected void setFisica(byte fisica) {
		this.fisica = fisica;
	}

	protected void setQuimica(byte quimica) {
		this.quimica = quimica;
	}

	protected void setIngles(byte ingles) {
		this.ingles = ingles;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(grupo+";");
		builder.append(nombre+";");
		builder.append(matematicas+";");
		builder.append(lengua+";");
		builder.append(fisica+";");
		builder.append(quimica+";");
		builder.append(ingles);
		return builder.toString();
	}

	public int compareTo(Alumno a) {
		int grp = this.grupo.compareToIgnoreCase(a.grupo);
		if (grp != 0) {
			return grp;
		}
		return this.nombre.compareToIgnoreCase(a.nombre);
	}
	
	

}
