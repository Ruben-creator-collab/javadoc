package practicaExamen3;

/*
 * Objetivo: clase que modela al objeto de tipo Socio
 * Autor: Profe
 * Fecha: 29/04/26
 */

import java.util.Objects;

public class Socio {
    private int id;
    private String nombre;
    private byte antiguedad; // en años

    public Socio(int id, String nombre, byte antiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getAntiguedad() {
        return antiguedad;
    }

    @Override
    public String toString() {
        return id + ";" + nombre + ";" + antiguedad;
    }

    // 🔑 CLAVE: igualdad por ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Socio)) return false;
        Socio socio = (Socio) o;
        return id == socio.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
