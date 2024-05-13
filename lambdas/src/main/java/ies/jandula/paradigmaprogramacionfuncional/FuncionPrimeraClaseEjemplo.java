package ies.jandula.paradigmaprogramacionfuncional;

import java.util.Scanner;

import java.util.function.Function;

public class FuncionPrimeraClaseEjemplo {

	public Double funcionFormula(Double x, Function<Double, Double> formula) {

		return formula.apply(x);

	}

	public Double formulaCuadrado(Double x) {

		return x * x;

	}
	
	public Integer formulaCuadrado2(Integer x) {

		return x * x;

	}

	public Double formulaCubo(Double x) {

		return x * x * x;

	}

	public static Double formulaRaizCuadrada(Double x) {

		return Math.sqrt(x);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número en la consola");

		Double numero = sc.nextDouble();

		FuncionPrimeraClaseEjemplo objeto = new FuncionPrimeraClaseEjemplo();

		Double result = objeto.funcionFormula(numero, objeto::formulaCuadrado);
		
		//No se puede, no corresponde con los tipos de la interfaz
		// Double result2 = objeto.funcionFormula(numero, objeto::formulaCuadrado2);

		System.out.println("Calculamos el cuadrado del número  " + result);

		Function<Double, Double> formulaVar = objeto::formulaCuadrado;

		result = objeto.funcionFormula(numero, objeto::formulaCubo);

		System.out.println("Calculamos el cubo del número: " + result);

		result = objeto.funcionFormula(numero, x -> x * x * x * x);

		System.out.println("Calculamos la cuarta potencia del número: " + result);

		result = objeto.funcionFormula(numero, FuncionPrimeraClaseEjemplo::formulaRaizCuadrada);

		System.out.println("Calculamos la raiz cuadrada del número: " + result);

	}

}