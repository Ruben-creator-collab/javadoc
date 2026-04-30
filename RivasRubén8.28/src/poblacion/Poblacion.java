package poblacion;

public class Poblacion {
	// Enum
		public enum Sexo {
			MASCULINO, FEMENINO
		}

		public enum EstadoCivil {
			CASADO, DIVORCIADO, VIUDO, SOLTERO
		}

		// Atributos
		private String nombre;
		private int edad;
		private Sexo sexo;
		private EstadoCivil estadoCivil;
	
}
