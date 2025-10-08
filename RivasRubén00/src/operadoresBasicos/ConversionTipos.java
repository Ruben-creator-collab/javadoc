package operadoresBasicos;

public class ConversionTipos {

	public static void main(String[] args) {
		byte monederoPequenno = 10;
		int monederoMediano = 10000;
		long monederoGrande = 10000000000l;
		
		//monederoGrande = monederoMediano; // Conversión automática
		//monederoMediano = monederoPequenno; 
		
		
		monederoPequenno = (byte) monederoMediano; // Esto es un "cast"
		
		System.out.println("Monedero pequeño: " + monederoPequenno);
		System.out.println("Monedero mediano: " + monederoMediano);
		System.out.println("Monedero grande: " + monederoGrande);
		
	}

}
