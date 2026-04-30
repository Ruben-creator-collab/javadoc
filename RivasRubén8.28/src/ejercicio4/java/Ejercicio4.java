package ejercicio4.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

import trabajador.Trabajador;

public class Ejercicio4 {

    public static void main(String[] args) {

        HashSet<Trabajador> trabajadores = new HashSet<>();
        Random r = new Random();

        int cantidad = r.nextInt(11) + 20;

        for (int i = 0; i < cantidad; i++) {

            String nombre = "Trabajador" + i;
            int edad = r.nextInt(30) + 20;

            Trabajador.Sexo sexo = Trabajador.Sexo.values()[r.nextInt(Trabajador.Sexo.values().length)];
            Trabajador.EstadoCivil estado = Trabajador.EstadoCivil.values()[r.nextInt(Trabajador.EstadoCivil.values().length)];

            double salario = 1000 + r.nextDouble() * 2000;

            trabajadores.add(new Trabajador(nombre, edad, sexo, estado, salario));
        }

        // apartado a
        System.out.println("\n--- ORDENADOS ---");

        ArrayList<Trabajador> lista = new ArrayList<>(trabajadores);

        Collections.sort(lista, new Comparator<Trabajador>() {
            @Override
            public int compare(Trabajador t1, Trabajador t2) {
                int compSexo = t1.getSexo().compareTo(t2.getSexo());
                if (compSexo != 0) {
                    return compSexo;
                }
                return t1.getEstadoCivil().compareTo(t2.getEstadoCivil());
            }
        });

        for (Trabajador t : lista) {
            System.out.println(t);
        }

        // apartado b
        int hombres = 0;
        for (Trabajador t : trabajadores) {
            if (t.getSexo() == Trabajador.Sexo.MASCULINO) {
                hombres++;
            }
        }
        System.out.println("\nHombres: " + hombres);

        // apartado c
        int mujeresCasadas = 0;
        for (Trabajador t : trabajadores) {
            if (t.getSexo() == Trabajador.Sexo.FEMENINO &&
                t.getEstadoCivil() == Trabajador.EstadoCivil.CASADO) {
                mujeresCasadas++;
            }
        }
        System.out.println("Mujeres casadas: " + mujeresCasadas);

        // apartado d
        double sumaSalarios = 0;
        for (Trabajador t : trabajadores) {
            sumaSalarios += t.getSalarioBase();
        }
        System.out.println("Suma salarios: " + sumaSalarios);
    }
}
