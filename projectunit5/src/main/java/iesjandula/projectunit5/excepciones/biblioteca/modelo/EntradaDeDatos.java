package iesjandula.projectunit5.excepciones.biblioteca.modelo;

import java.util.Scanner;
import java.util.StringTokenizer;

import iesjandula.projectunit5.excepciones.biblioteca.modelo.EnumLibro;

public class EntradaDeDatos {
   
   private static final Scanner sc= new Scanner(System.in);
   
   public static int leerOpcionMenu(int min, in max) {
       
       
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
   /*
    * Formato
    * 978-84-2834-286-5
    *
    */

   public static String leeReferenciaLibro() {
       
       
   
   }
   
   /*
    * es un numero entre -5000 y 2020
    *
    */
   
   
   
   public static int leerAnnio() {
       boolean esNumero= true;
       boolean correcto= false;
       int annioNum = 0;
	   String annio=sc.nextLine();
	   
	   
	   if (esCadenaNumerica(annio)){  
		   annioNum = Integer.valueOf(annio);
	   }
	   	if (annioNum >= -5000 && annioNum <=2020) {
					  
	   		correcto=true;
					   
				   }
	   
	   
	   
	   
	   return annioNum;

       
   }    
   
   /*
    *
    * un numero entre 0 y 3
    *
    */
   
   public static int leerTipo() {
       
       
   }
   
   /*
    *
    * Asegurarse de poner todo en minusculas menos las mayusculas
    *
    */
   
   public static String leerNombreAutor() {
	  
	   String nombreApellidosFormateado="";
       String nombreApellidos=sc.nextLine();
       nombreApellidos.trim();
       StringTokenizer tokens = new StringTokenizer(nombreApellidos);
       while (tokens.hasMoreTokens()) {
    	   
    	   nombreApellidosFormateado = nombreApellidosFormateado + " " + primeraMayuscula(tokens.nextToken());
       }
       
	return nombreApellidosFormateado;
       
       
   }
   
   
   /*
    *
    * Leer DNI formato XXXXXXXL o XXXXXXXXL donde X es numero y L letra
    *
    */
   
   public static String leerDniAutor() {
      
	   String dni=sc.nextLine();
       dni.trim();
       boolean bCorrecto= false;
       if (dni.length()==8 || dni.length()==9 && esCadenaNumerica(dni.substring(0,dni.length()-2)) && Character.isLetter(dni.charAt(dni.length()-1))) {
    	   bCorrecto=true;
       }
      
       return dni;
       
   }
   
   
   public static EnumLibro leerTipoLibro() {
       
	   EnumLibro tipoRetornado = EnumLibro.NOVELA;
	   String numTipo=sc.nextLine();
	   int tipoLibIndex=0;
	   
	   if(esCadenaNumerica(numTipo)) {
		   
		   tipoLibIndex= Integer.valueOf(tipoLibIndex);
	   }
       
	   tipoRetornado= EnumLibro.values()[tipoLibIndex];  
	return tipoRetornado;   
   }

   
   public void pulsaEnterParaContinuar() {

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
