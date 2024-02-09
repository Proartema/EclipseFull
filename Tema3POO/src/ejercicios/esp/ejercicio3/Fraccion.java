package ejercicios.esp.ejercicio3;

import java.util.Scanner;

public class Fraccion{
	private int numerador;
	private int denominador;
	
	

	public Fraccion() {
		
	}
	
	

	public Fraccion(int numerador, int denominador) {
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	


	public int getNumerador() {
		return numerador;
	}



	public int getDenominador() {
		return denominador;
	}



	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}



	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public int Calcular_mcd (int x, int y) {
		int max = (x>=y)?x:y;
		int min = (x<y)?x:y;
		
		while (min>0) {
			int i= max%min;
			max=min;
			min=i;
		}
		return max;
	}
	public String Simplificar_fraccion(int numerador,int denominador) {
		  int nuevoNumerador= numerador/Calcular_mcd(numerador, denominador);
	        int nuevoDenominador= denominador/Calcular_mcd(numerador, denominador);

	        return (nuevoNumerador+ (" / ")+ nuevoDenominador);
	
	}
	public String Leer_fraccion() {
		Scanner input = new Scanner(System.in);
		System.out.println("Dime el numerador.");
		this.numerador= input.nextInt();
		System.out.println("Dime el denominador.");
		this.denominador=input.nextInt();
		
		return Simplificar_fraccion(numerador,denominador);
	}
	public void Escribir_fraccion() {
		
		if (denominador>=1)
			System.out.println(numerador + "/" + denominador);
		else
			System.out.println(numerador);
		
		
	}
	
	public String Sumar_fracciones(int x2, int y2) {
		  int nuevoNumerador= numerador/Calcular_mcd(numerador, denominador);
	        int nuevoDenominador= denominador/Calcular_mcd(numerador, denominador);
	        int nuevoNumerador2= x2/Calcular_mcd(x2, y2); 
	        int nuevoDenominador2= y2/Calcular_mcd(x2, y2); 
	      int numeradorFinal = nuevoNumerador*nuevoDenominador2+ nuevoDenominador*nuevoNumerador2;
	      int denominadorFinal = nuevoDenominador*nuevoDenominador2;
	        return Simplificar_fraccion(numeradorFinal,denominadorFinal);
	}
	public String Restar_fracciones(int x2, int y2) {
		  int nuevoNumerador= numerador/Calcular_mcd(numerador, denominador);
	        int nuevoDenominador= denominador/Calcular_mcd(numerador, denominador);
	        int nuevoNumerador2= x2/Calcular_mcd(x2, y2); 
	        int nuevoDenominador2= y2/Calcular_mcd(x2, y2); 
	      int numeradorFinal = nuevoNumerador*nuevoDenominador2 - nuevoDenominador*nuevoNumerador2;
	      int denominadorFinal = nuevoDenominador*nuevoDenominador2;
	        return Simplificar_fraccion(numeradorFinal,denominadorFinal);
	}
	public String Multiplicar_fracciones(int x2, int y2) {
		  int nuevoNumerador= numerador/Calcular_mcd(numerador, denominador);
	        int nuevoDenominador= denominador/Calcular_mcd(numerador, denominador);
	        int nuevoNumerador2= x2/Calcular_mcd(x2, y2); 
	        int nuevoDenominador2= y2/Calcular_mcd(x2, y2); 
	      int numeradorFinal = nuevoNumerador*nuevoNumerador2;
	      int denominadorFinal = nuevoDenominador*nuevoDenominador2;
	        return Simplificar_fraccion(numeradorFinal,denominadorFinal);
	}
	public String Dividir_fracciones(int x2, int y2) {
		  int nuevoNumerador= numerador/Calcular_mcd(numerador, denominador);
	        int nuevoDenominador= denominador/Calcular_mcd(numerador, denominador);
	        int nuevoNumerador2= x2/Calcular_mcd(x2, y2); 
	        int nuevoDenominador2= y2/Calcular_mcd(x2, y2); 
	      int numeradorFinal = nuevoNumerador*nuevoDenominador2;
	      int denominadorFinal = nuevoDenominador*nuevoNumerador2;
	        return Simplificar_fraccion(numeradorFinal,denominadorFinal);
	}
	


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
