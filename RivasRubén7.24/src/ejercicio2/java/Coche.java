package ejercicio2.java;

import java.time.LocalDate;

public class Coche {

    private String matricula;
    private String propietario;
    private final LocalDate fechaMatriculacion;
    private int cilindrada;
    private int potencia;

    // Constructor sin parámetros
    public Coche() {
        this.cilindrada = 2000;
        this.potencia = 150;
        this.fechaMatriculacion = LocalDate.now();
    }

    // Constructor con parámetros
    public Coche(String matricula, String propietario, LocalDate fecha,
                 int cilindrada, int potencia) {

        setMatricula(matricula);
        setPropietario(propietario);
        setCilindrada(cilindrada);
        setPotencia(potencia);

        this.fechaMatriculacion = fecha;
    }

    // Validar matrícula: 9999 AAA
    public void setMatricula(String matricula) {

        if (matricula == null || !matricula.matches("\\d{4} [A-Z]{3}")) {
            throw new IllegalArgumentException("Matrícula no válida");
        }

        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setPropietario(String propietario) {

        if (propietario == null || propietario.trim().isEmpty()) {
            throw new IllegalArgumentException("Propietario no válido");
        }

        this.propietario = propietario;
    }

    public String getPropietario() {
        return propietario;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setCilindrada(int cilindrada) {

        if (cilindrada < 0) {
            throw new IllegalArgumentException("Cilindrada negativa");
        }

        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setPotencia(int potencia) {

        if (potencia < 0) {
            throw new IllegalArgumentException("Potencia negativa");
        }

        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {

        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", propietario='" + propietario + '\'' +
                ", fechaMatriculacion=" + fechaMatriculacion +
                ", cilindrada=" + cilindrada +
                ", potencia=" + potencia +
                '}';
    }
}