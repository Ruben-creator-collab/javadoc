package ejercicioA4;

import java.io.File;

public class Principal {

    public static void main(String[] args) {

        // Ruta base
        File documentos = new File("DOCS");

        // Carpetas principales
        File misCosas = new File(documentos, "Mis Cosas");
        File alfabeto = new File(documentos, "Alfabeto");

        misCosas.mkdirs();
        alfabeto.mkdirs();

        // Carpetas que están dentro de "Mis Cosas"
        File fotografias = new File(documentos, "FOTOS");
        File libros = new File(documentos, "LECTURAS");

        // Destino final: volver a DOCS
        File nuevoFotografias2 = new File(misCosas, "FOTOS");
        File nuevoLibros2 = new File(misCosas, "LECTURAS");

        // MOVER de nuevo a DOCS
        fotografias.renameTo(nuevoFotografias2);
        libros.renameTo(nuevoLibros2);

        // Crear carpetas A-Z
        for (char letra = 'A'; letra <= 'Z'; letra++) {

            File carpetaLetra = new File(alfabeto, String.valueOf(letra));
            carpetaLetra.mkdir();

        }

        System.out.println("Estructura de carpetas creada correctamente.");
    }
}