package iesjandula.projectunit5.excepciones.biblioteca.modelo;

import java.util.Scanner;
import java.util.StringTokenizer;

import iesjandula.projectunit5.excepciones.biblioteca.excepciones.EntradaDatosException;
import iesjandula.projectunit5.excepciones.biblioteca.excepciones.MenuException;
import iesjandula.projectunit5.excepciones.biblioteca.modelo.EnumLibro;

public class EntradaDeDatos {
   
   private static final Scanner sc= new Scanner(System.in);
   private static final String SEPARADOR_REFERENCIA="-";
   private static final int LONGITUD_REFERENCIA=17;
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
   /*
    * Poner la primera letra con mayusculas
    *
    */
   
   public static String leerTitulo() {
       String titulo = sc.nextLine();
       
       
       
       primeraMayuscula(titulo);
	return titulo;
   }
   
   public static String leerEditorial() {
       String editorial = sc.nextLine();
       
       
       
       primeraMayuscula(editorial);
	return editorial;
   }
   /*
    * Formato
    * 978-84-2834-286-5
    *
    */

   public static String leeReferenciaLibro() throws EntradaDatosException {
       
       boolean bCorrecto= true;
       int cont=0;
       int [] longitudes= {3,1,2,1,4,1,3,1,1};
       String referencia =sc.nextLine();
       String token="";
       
       if(referencia.length() != LONGITUD_REFERENCIA && !referencia.contains(SEPARADOR_REFERENCIA)) {
    	   bCorrecto= false;
       }
       StringTokenizer sToken = new StringTokenizer(referencia,SEPARADOR_REFERENCIA,true);
       
       while (sToken.hasMoreTokens()) {
    	   
    	   token= sToken.nextToken();
    	   
    	   if (cont%2==0 && token.length()!=longitudes[cont] && !esCadenaNumerica(token)) {
    	   
    		   bCorrecto= false;
       }
    	   if (cont%2==1 && token.length()!=longitudes[cont] && !token.equals(SEPARADOR_REFERENCIA)) {
    		   
    		   bCorrecto= false;
    	   }
    	   cont++;
    	   
    	   	
   } if (!bCorrecto) {
	   throw new EntradaDatosException("Incorrecto, siga el tipo de referencia.");
   }
       return referencia;
  }
   
   /*
    * es un numero entre -5000 y 2020
    *
    */
   
   
   
   public static int leerAnnio() throws EntradaDatosException {
       
       boolean bCorrecto= false;
       int annioNum = 0;
	   String annio=sc.nextLine();
	   
	   
	   if (esCadenaNumerica(annio)){  
		   annioNum = Integer.valueOf(annio);
	   }
	   	if (annioNum >= -5000 && annioNum <=2020) {
					  
	   		bCorrecto=true;
					   
	   }
	   	
	   	if (!bCorrecto) {
	 	   throw new EntradaDatosException("Incorrecto, el año tiene que ser un numero entre -5000 y 2020");
	    }
	   
	   
	   
	   
	   return annioNum;

       
   }    
   
   /*
    *
    * un numero entre 0 y 3
    *
    */
   
   public static int leerTipo() {
	return 0;
       
       
   }
   
   /*
    *
    * Asegurarse de poner todo en minusculas menos las mayusculas
    *
    */
   
   public static String leerNombreYApellidosAutor() {
	  
	   String nombreApellidosFormateado="";
       String nombreApellidos=sc.nextLine();
       nombreApellidos.trim();
       StringTokenizer tokens = new StringTokenizer(nombreApellidos);
       while (tokens.hasMoreTokens()) {
    	   
    	   nombreApellidosFormateado = nombreApellidosFormateado + " " + primeraMayuscula(tokens.nextToken());
       }
       
       nombreApellidosFormateado.trim();
	return nombreApellidosFormateado;
       
       
   }
   
   public static String getNombreAutor(String nombreYApellidos) {
	   
	   StringTokenizer tokens = new StringTokenizer(nombreYApellidos);
	   
	   
	   
	   return tokens.nextToken();
   }
  public static String getApellidosAutor(String nombreYApellidos) {
	   
	  String apellidos="";
	   StringTokenizer tokens = new StringTokenizer(nombreYApellidos);
	   
	   tokens.nextToken();
	   while(tokens.hasMoreTokens()) {
		   apellidos =  apellidos +  tokens.nextToken()+" " ;
	   }
	   apellidos.trim();
	   
	   
	   
	   return apellidos;
   }
   
   
   /*
    *
    * Leer DNI formato XXXXXXXL o XXXXXXXXL donde X es numero y L letra
    *
    */
   
   public static String leerDniAutor() throws EntradaDatosException {
      
	   
	   boolean bCorrecto = false;
	   String dni=sc.nextLine();
       dni.trim();
      
       if (dni.length()==8 || dni.length()==9 && esCadenaNumerica(dni.substring(0,dni.length()-2)) && Character.isLetter(dni.charAt(dni.length()-1))) {
    	   bCorrecto=true;
       }
       if (!bCorrecto) {
	 	   throw new EntradaDatosException("Incorrecto, el formato del Dni esta mal");
	    }
      
       return dni;
       
   }
   
   
   public static EnumLibro leerTipoLibro() throws EntradaDatosException {
       
	   EnumLibro tipoRetornado = EnumLibro.NOVELA;
	   String numTipo=sc.nextLine();
	   int tipoLibIndex=-1;
	   
	   if(esCadenaNumerica(numTipo)) {
		   
		   tipoLibIndex= Integer.valueOf(tipoLibIndex);
	   }
       if(tipoLibIndex<0 && (tipoLibIndex>EnumLibro.values().length-1))
    		   throw new EntradaDatosException("Introduce un numero entre 0 y el indice");
	   tipoRetornado= EnumLibro.values()[tipoLibIndex];  
	return tipoRetornado;   
   }

   
   public static void pulsaEnterParaContinuar() {

       System.out.println("Pulsa enter para continuar.........");
       sc.nextLine();
       
   }
   
   public static String primeraMayuscula(String cadena) {
	   
	   cadena= cadena.trim();
	   cadena= cadena.toLowerCase();
	   cadena= cadena.substring(0,1).toUpperCase()+ cadena.substring(1,cadena.length()-1);;
	return cadena;
	   
   }
   
   private static boolean esCadenaNumerica(String cad) {
   boolean esNumero= true;
   
   for (int i=0; i<cad.length(); i++) {
	   if (!Character.isDigit(cad.charAt(i))) {
		   
		   esNumero=false;
	   }
	   
   }
   return esNumero;
   }
}
