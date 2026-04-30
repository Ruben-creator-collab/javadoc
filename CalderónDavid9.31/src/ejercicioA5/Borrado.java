package ejercicioA5;

import java.io.File;

public class Borrado {

	public static void main(String[] args) {

		try {
			
			System.out.println(borraTodo(new File("C:/Users/DAW1/eclipse-workspace/CalderónDavid9.31/DOCS/Mis Cosas/LECTURAS")));
			
		} catch (Exception e) {
			
			System.out.println("Error: " + e.getMessage());
			
		}
		
	}

	public static boolean borraTodo(File f) throws Exception {
		
		if (f == null || !f.exists()) {
			
			throw new Exception("El archivo o directorio no existe: " + f);
			
		}

		if (f.isFile()) {
			
			return f.delete();
			
		}

		if (f.isDirectory()) {
			
			File[] contenido = f.listFiles();

			if (contenido != null) {
				
				for (File hijo : contenido) {
					borraTodo(hijo);
					
				}
				
			}

			return f.delete();
		}

		return false;
	}

}
