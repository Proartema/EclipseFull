package objetosTema3;

public class Persona {
		//atributos
		private String nombre;
		private String apellidos;
		private String DNI;
		private int AñoNacimiento;
		private static int numPersonas=0;
		
		//constructor
		public Persona() {
			
			numPersonas++;
		}
		
		public Persona(String nombre, String apellidos,String DNI,int AñoNacimiento) {
			
			this.nombre=nombre;
			this.apellidos=apellidos;
			this.DNI=DNI;
			this.AñoNacimiento=AñoNacimiento;
			numPersonas++;
		}
		//Metodo acceso
		public static int getNumPersonas() {
			
			return numPersonas;
		}
		public String getNombre() {
			
			return nombre;
		}
		
		public void setNombre(String nombre) {
			
			this.nombre=nombre;
		}
		public String getApellidos() {
			
			return apellidos;
		}
		
		public void setApellidos(String apellidos) {
			
			this.apellidos=apellidos;
		}
		public String getDNI() {
			
			return DNI;
		}
		
		public void setDNI(String DNI) {
			
			this.DNI=DNI;
		}
		public int getAñoNacimiento() {
			
			return AñoNacimiento;
		}
		
		public void setAñoNacimiento(int AñoNacimiento) {
			
			this.AñoNacimiento=AñoNacimiento;
		}
		//Metodo funcional
		public int calculaEdad(int añoActual) {
			
			return añoActual - AñoNacimiento;
		}
		@Override
		public String toString() {
			
			return "Persona [nombre= " + nombre + ", apellidos= " + apellidos + ", DNI= " + DNI + ", AñoNacimiento= " + AñoNacimiento + "]";
			}
}
