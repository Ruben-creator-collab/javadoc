/*
 * Autor: Daniel Santana Bueno
 * Descripción: Operaciones con ArrayList
 * Fecha: 20/04/2026
 */
package operacionesArraylist;

import java.io.File;
import java.util.*;

public class Ejercicio {

	public static void main(String[] args) {

		ArrayList<Alumno> lista = new ArrayList<>();

		// 1. Importar información de notas1.txt
		System.out.println("1. Añadiendo registros...");
		lista = importarDeArchivo("notas1.txt");

		// 2. Número de registros
		System.out.println("2. Total registros: " + lista.size());

		// 3. Ordenar por grupo y nombre
		System.out.println("3. Ordenando lista...");
		Collections.sort(lista);

		// 4. Insertar registro
		System.out.println("4. Insertando registro...");
		lista.add(new Alumno("1º ESO D", "López Muro, Rosario", 3, 3, 4, 4, 3));

		// 5. Insertar en mitad
		System.out.println("5. Insertando en mitad...");
		int mitad = lista.size() / 2;
		lista.add(mitad, new Alumno("1º ESO B", "Duarte Durán, Alba", 2, 3, 4, 1, 3));

		// 6. Mostrar posición
		System.out.println("6. Posición del registro insertado: " + mitad);

		// 7. Importar notas2.txt
		System.out.println("7. Añadiendo lista auxiliar...");
		ArrayList<Alumno> listaAux = importarDeArchivo("notas2.txt");

		System.out.println("Antes: " + lista.size());
		lista.addAll(listaAux);
		System.out.println("Después: " + lista.size());

		// 8. Buscar alumno
		System.out.println("8. Buscar alumno:");
		Alumno a1 = buscarRegistro(lista, "Cordero Benítez, Alejandro");
		System.out.println(a1);

		// 9. Buscar alumno inexistente
		System.out.println("9. Buscar alumno:");
		Alumno a2 = buscarRegistro(lista, "Fernández Villalón, Carlos");
		System.out.println(a2);

		// 10. Borrar posición mitad+1
		System.out.println("10. Borrando registro...");
		int pos = (lista.size() / 2) + 1;

		if (pos < lista.size()) {
			System.out.println("Registro eliminado: " + lista.get(pos));
			lista.remove(pos);
		}

		// 11. Borrar primeros 10
		System.out.println("11. Borrando primeros 10...");
		for (int i = 0; i < 10 && !lista.isEmpty(); i++) {
			lista.remove(0);
		}
		System.out.println("Total: " + lista.size());

		// 12. Borrar matemáticas = 2
		System.out.println("12. Eliminando matemáticas = 2...");
		int eliminados = 0;

		Iterator<Alumno> it = lista.iterator();
		while (it.hasNext()) {
			Alumno a = it.next();
			if (a.getMatematicas() == 2) {
				it.remove();
				eliminados++;
			}
		}
		System.out.println("Eliminados: " + eliminados);

		// 13. Nota media por alumno
		System.out.println("Nota media por alumno \n");
		for (Alumno a : lista) {
			double media = calcularMediaAlumno(a);
			System.out.println(a + ", NOTA MEDIA: " + media);
		}

		// 14. Crea una sublista por cada grupo y ordénala por nota y nombre
		ArrayList<Alumno> grupoA = new ArrayList<>();
		ArrayList<Alumno> grupoB = new ArrayList<>();
		ArrayList<Alumno> grupoC = new ArrayList<>();
		ArrayList<Alumno> grupoD = new ArrayList<>();
		ArrayList<Alumno> grupoE = new ArrayList<>();

		for (Alumno a : lista) {
			if (a.getGrupo().equals("1º ESO A")) {
				grupoA.add(a);
			} else if (a.getGrupo().equals("1º ESO B")) {
				grupoB.add(a);
			} else if (a.getGrupo().equals("1º ESO C")) {
				grupoC.add(a);
			} else if (a.getGrupo().equals("1º ESO D")) {
				grupoD.add(a);
			} else if (a.getGrupo().equals("1º ESO E")) {
				grupoE.add(a);
			}
		}

		System.out.println("GRUPO A");
		ordenarSublista(grupoA);
		for (Alumno a : grupoA) {
			System.out.println(a);
		}

		System.out.println("GRUPO B");
		ordenarSublista(grupoB);
		for (Alumno a : grupoB) {
			System.out.println(a);
		}

		System.out.println("GRUPO C");
		ordenarSublista(grupoC);
		for (Alumno a : grupoC) {
			System.out.println(a);
		}

		System.out.println("GRUPO D");
		ordenarSublista(grupoD);
		for (Alumno a : grupoD) {
			System.out.println(a);
		}

		System.out.println("GRUPO E");
		ordenarSublista(grupoE);
		for (Alumno a : grupoE) {
			System.out.println(a);
		}

		// 15. Calcula para cada grupo la nota media de cada materia
		System.out.println("\nMedias Grupo A\n");
		System.out.println("Matemáticas: " + mediaMatematicas(grupoA) + "\n");
		System.out.println("Lengua: " + mediaLengua(grupoA) + "\n");
		System.out.println("Ingles: " + mediaIngles(grupoA) + "\n");
		System.out.println("Fisica: " + mediaFisica(grupoA) + "\n");
		System.out.println("Quimica: " + mediaQuimica(grupoA) + "\n");

		System.out.println("\nMedias Grupo B\n");
		System.out.println("Matemáticas: " + mediaMatematicas(grupoB) + "\n");
		System.out.println("Lengua: " + mediaLengua(grupoB) + "\n");
		System.out.println("Ingles: " + mediaIngles(grupoB) + "\n");
		System.out.println("Fisica: " + mediaFisica(grupoB) + "\n");
		System.out.println("Quimica: " + mediaQuimica(grupoB) + "\n");

		System.out.println("\nMedias Grupo C\n");
		System.out.println("Matemáticas: " + mediaMatematicas(grupoC) + "\n");
		System.out.println("Lengua: " + mediaLengua(grupoC) + "\n");
		System.out.println("Ingles: " + mediaIngles(grupoC) + "\n");
		System.out.println("Fisica: " + mediaFisica(grupoC) + "\n");
		System.out.println("Quimica: " + mediaQuimica(grupoC) + "\n");

		System.out.println("\nMedias Grupo D\n");
		System.out.println("Matemáticas: " + mediaMatematicas(grupoD) + "\n");
		System.out.println("Lengua: " + mediaLengua(grupoD) + "\n");
		System.out.println("Ingles: " + mediaIngles(grupoD) + "\n");
		System.out.println("Fisica: " + mediaFisica(grupoD) + "\n");
		System.out.println("Quimica: " + mediaQuimica(grupoD) + "\n");

		System.out.println("\nMedias Grupo E\n");
		System.out.println("Matemáticas: " + mediaMatematicas(grupoE) + "\n");
		System.out.println("Lengua: " + mediaLengua(grupoE) + "\n");
		System.out.println("Ingles: " + mediaIngles(grupoE) + "\n");
		System.out.println("Fisica: " + mediaFisica(grupoE) + "\n");
		System.out.println("Quimica: " + mediaQuimica(grupoE) + "\n");

		// 16. Para cada grupo muestra las diez mejores notas en matemáticas ordenadas
		// por nota y nombre
		System.out.println("\n10 Mejores matemáticos del Grupo A\n");
		mostrar10MejoresNotas(grupoA);
		System.out.println("\n10 Mejores matemáticos del Grupo B\n");
		mostrar10MejoresNotas(grupoB);
		System.out.println("\n10 Mejores matemáticos del Grupo C\n");
		mostrar10MejoresNotas(grupoC);
		System.out.println("\n10 Mejores matemáticos del Grupo D\n");
		mostrar10MejoresNotas(grupoD);
		System.out.println("\n10 Mejores matemáticos del Grupo E\n");
		mostrar10MejoresNotas(grupoE);
	}

	// metodos

	public static ArrayList<Alumno> importarDeArchivo(String ruta) {
		ArrayList<Alumno> lista = new ArrayList<>();

		try (Scanner sc = new Scanner(new File(ruta))) {
			while (sc.hasNextLine()) {
				String[] d = sc.nextLine().split(";");
				lista.add(new Alumno(d[0], d[1], Byte.parseByte(d[2]), Byte.parseByte(d[3]), Byte.parseByte(d[4]),
						Byte.parseByte(d[5]), Byte.parseByte(d[6])));
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		return lista;
	}

	public static Alumno buscarRegistro(ArrayList<Alumno> lista, String nombre) {
		for (Alumno a : lista) {
			if (a.getNombre().equalsIgnoreCase(nombre)) {
				return a;
			}
		}
		return null;
	}

	public static double calcularMediaAlumno(Alumno a) {
		return (a.getMatematicas() + a.getLengua() + a.getFisica() + a.getQuimica() + a.getIngles()) / 5.0;
	}

	public static double mediaMatematicas(ArrayList<Alumno> lista) {
		double sumaMatematicas = 0;

		for (Alumno a : lista) {
			sumaMatematicas += a.getMatematicas();
		}

		double media = sumaMatematicas / lista.size();

		return media;
	}

	public static double mediaLengua(ArrayList<Alumno> lista) {
		double sumaLengua = 0;

		for (Alumno a : lista) {
			sumaLengua += a.getLengua();
		}

		double media = sumaLengua / lista.size();

		return media;
	}

	public static double mediaIngles(ArrayList<Alumno> lista) {
		double sumaIngles = 0;

		for (Alumno a : lista) {
			sumaIngles += a.getIngles();
		}

		double media = sumaIngles / lista.size();

		return media;

	}

	public static double mediaFisica(ArrayList<Alumno> lista) {
		double sumaFisica = 0;

		for (Alumno a : lista) {
			sumaFisica += a.getFisica();
		}

		double media = sumaFisica / lista.size();

		return media;

	}

	public static double mediaQuimica(ArrayList<Alumno> lista) {
		double sumaQuimica = 0;

		for (Alumno a : lista) {
			sumaQuimica += a.getQuimica();
		}
		double media = sumaQuimica / lista.size();
		return media;

	}

	public static void mostrar10MejoresNotas(ArrayList<Alumno> lista) {

		int limite = 10;
		for (int i = 0; i < limite; i++) {
			Alumno a = lista.get(i);

			System.out.println(a.getNombre() +" Nota: "+ a.getMatematicas());
		}
	}

	public static void ordenarSublista(ArrayList<Alumno> lista) {
		Collections.sort(lista, new Comparator<Alumno>() {
			public int compare(Alumno a1, Alumno a2) {
				int res = Integer.compare(a2.getMatematicas(), a1.getMatematicas());

				if (res == 0) {
					res = a1.getNombre().compareToIgnoreCase(a2.getNombre());
				}
				return res;
			}
		});
	}
}