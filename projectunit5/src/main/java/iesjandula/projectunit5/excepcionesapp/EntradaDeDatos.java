package iesjandula.projectunit5.excepcionesapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDeDatos {

	private Scanner sc = null;
	public EntradaDeDatos() {
		
		
		Scanner sc = new Scanner(System.in);
		
	}
	
	public String leerString() throws ErrorEntradaException {
		
		try {
		return sc.next();
		} catch (InputMismatchException ime) {
			
			 throw new ErrorEntradaException("ERROR AL LEER DE CADENA",ime);
			
		}
	}
	
	public double leerDouble() throws ErrorEntradaException {
		
		
		try {
			return sc.nextDouble();
			} catch (InputMismatchException ime) {
				
				 throw new ErrorEntradaException("ERROR AL LEER DE NUMERO DECIMAL",ime);
				
			}
		
	}
	
public int leerEntero() throws ErrorEntradaException {
		
		
		try {
			return sc.nextInt();
			} catch (InputMismatchException ime) {
				
				 throw new ErrorEntradaException("ERROR AL LEER DE NUMERO ENTERO",ime);
				
			}
		
	}
public void pulsaEnterParaContinuar() {
	
	System.out.println("Pulsa enter para continuar....");
	sc.nextLine();
	sc.nextLine();
}


	
	
}
