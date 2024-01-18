package objetosTema3;

import java.util.Scanner;

public class PersonaClasePrincipal {
	public int variableObjeto;
	static boolean enEjecucion=false;
	
	static {
		
		enEjecucion=true;
	}
	
	public int getVariableObjeto() {
		
		return variableObjeto;
	}
	
	public void setVariableObjeto(int variableObjeto) {
		
		this.variableObjeto=variableObjeto;
	}

	public static void main(String[] args) {
		
		
		PersonaClasePrincipal app= new PersonaClasePrincipal();
		
		app.variableObjeto=2;
		app.setVariableObjeto(2);
		
		enEjecucion=true;
		System.out.println("Programa en ejecución " + PersonaClasePrincipal.enEjecucion);
		
		System.out.println("Personas creadas:" + Persona.getNumPersonas());
		
		Scanner sc = new Scanner(System.in);
		
		Persona Anselmo = new Persona("Anselmo","Niordo","45783450S",2012);
		
		
		
		System.out.println(Anselmo.toString());
		
		Persona Agapito = new Persona("Agapito","DiSousa","15386497D",2011);
		
		System.out.println(Agapito.toString());
		
		System.out.println("Personas creadas:" + Persona.getNumPersonas());
		
		Persona alumno = new Persona();
		System.out.println("Vamos a crear un objeto persona Introduce el nombre.");
		String nombre = sc.nextLine();
		alumno.setNombre(nombre);
		
		System.out.println("Introduce el apellido.");
		String apellidos = sc.nextLine();
		alumno.setApellidos(apellidos);
		
		System.out.println("Introduce el DNI");
		String DNI = sc.nextLine();
		alumno.setDNI(DNI);
		
		System.out.println("Introduce el año de nacimiento.");
		int AñoNacimiento = sc.nextInt();
		alumno.setAñoNacimiento(AñoNacimiento);
		
		System.out.println("Personas creadas:" + Persona.getNumPersonas());
	}

}
