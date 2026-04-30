package ejercicio2.java;

import java.time.LocalDate;

public class Deportivo extends Coche {

    private String traccion;

    // Constructor único
    public Deportivo(String matricula, String propietario, LocalDate fecha,
                     int cilindrada, int potencia, String traccion) {

        super(matricula, propietario, fecha, cilindrada, potencia);

        setTraccion(traccion);
    }

    public void setTraccion(String traccion) {

        if (!traccion.equalsIgnoreCase("total")
                && !traccion.equalsIgnoreCase("delantera")) {

            throw new IllegalArgumentException("Tracción no válida");
        }

        this.traccion = traccion.toLowerCase();
    }

    public String getTraccion() {
        return traccion;
    }

    @Override
    public String toString() {

        return super.toString() +
                ", traccion='" + traccion + "'";
    }
}
