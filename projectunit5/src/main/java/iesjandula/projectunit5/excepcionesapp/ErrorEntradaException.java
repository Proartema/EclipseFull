package iesjandula.projectunit5.excepcionesapp;

import java.util.InputMismatchException;

public class ErrorEntradaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	
	
	public ErrorEntradaException(String mensaje,InputMismatchException em) {
		
		
		super("Error en la entrada de teclado",em, false,false);
	
				
	}
	
	
	
	
}
