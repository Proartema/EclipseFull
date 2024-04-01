package iesjandula.projectunit5.excepciones.notas.datos;

import java.util.Scanner;
import java.util.StringTokenizer;

import iesjandula.projectunit5.excepciones.notas.exception.EntradaDeDatosException;



public class EntradaDatos {
	
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
	 public static String getHora() {
		 String texto = sc.nextLine();
		 
		 StringTokenizer tokens = new StringTokenizer(texto,":");
		 
		 if (tokens.countTokens()>3||)
		 return null;
		 
		 
	 }
	 
}
