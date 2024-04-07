package iesjandula.projectunit5.excepciones.notas.datos;

import java.util.Scanner;
import java.util.StringTokenizer;

import iesjandula.projectunit5.excepciones.notas.exception.EntradaDeDatosException;
import iesjandula.projectunit5.excepciones.notas.exception.MenuException;



public class EntradaDatos {
	
	protected static long nuevoId=0; 
	
	 private static final Scanner sc= new Scanner(System.in);
	
	private static boolean esCadenaNumerica(String cad) {
		   boolean esNumero= true;
		   
		   for (int i=0; i<cad.length(); i++) {
			   if (!Character.isDigit(cad.charAt(i))) {
				   
				   esNumero=false;
			   }
			   
		   }
		   return esNumero;
		   }
	
	 public static int leerOpcionMenu(int min, int max) throws MenuException {
		   int opcion = -1;
	       String opcionInput = sc.nextLine();

	       if (esCadenaNumerica(opcionInput)) {

	           opcion = Integer.valueOf(opcionInput);

	       }

	       if (opcion < min || opcion > max)
	           throw new MenuException("Opcion Incorrecta", min, max);

	       return 0;

	   }
	 
	 public static String getTexto() throws EntradaDeDatosException {
		 String texto = sc.nextLine();
	       
	      if (texto.length()==0) {
	    	  
	    	  throw new EntradaDeDatosException("La nota no puede estar vacía");
	    	  
	      }
	       
	       
	       
		 return texto;
		 
	 }
	 
	 public static String getColor() throws EntradaDeDatosException {
		 String texto = sc.nextLine();
		 
		 StringTokenizer tokens = new StringTokenizer(texto);
		 
		 if (texto.length()==0 || tokens.countTokens()>=2) {
			 throw new EntradaDeDatosException("El color no puede estar vacio o tener mas de una palabra.");
			
		 }
		 return texto;
		 
		 
	 }
	 
	 public static String getNumPalabraComienzo() throws EntradaDeDatosException {
		String num = sc.nextLine();
		 int numNumerico =0;
		 numNumerico=Integer.valueOf(num);
		if (numNumerico <0 || !esCadenaNumerica(num)) {
			
			throw new EntradaDeDatosException("No se pueden introducir letras ni números negativos.");
		}
		 return num;
		
		 
		 
	 }
	 public static String getHora() throws EntradaDeDatosException {
		 String texto = sc.nextLine();
		 
		 StringTokenizer tokens = new StringTokenizer(texto,":");
		 int horas=tokens.countTokens();
		 int tiempo[]= new int[horas];
		 for (int i=0; i<tiempo.length; i++) {
			 String num =tokens.nextToken();
			 
			 tiempo[i]= Integer.valueOf(num).intValue();
		 }
		if (tokens.countTokens()>3||tokens.countTokens()<3) {
			throw new EntradaDeDatosException("Solo se permiten horas, minutos y segundos.");
		 }
		
		 else if (tiempo[0]<00||tiempo[0]>23||tiempo[1]<00||tiempo[1]>59||tiempo[2]<00||tiempo[2]>59){
			throw new EntradaDeDatosException("No puede tener un formato distinto de hh:mm:ss."); 
		 }
		 
		
		 return texto;
		 
		 
	 }
	 public static void incrementaId() {
		 nuevoId++;
	 }
	 
	 
}
