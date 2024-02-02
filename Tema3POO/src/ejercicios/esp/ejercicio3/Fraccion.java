package ejercicios.esp.ejercicio3;

public class Fraccion extends numerico{
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



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public numerico sumar(numerico numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public numerico restar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public numerico multiplicar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public numerico dividir() {
		// TODO Auto-generated method stub
		return null;
	}

}
