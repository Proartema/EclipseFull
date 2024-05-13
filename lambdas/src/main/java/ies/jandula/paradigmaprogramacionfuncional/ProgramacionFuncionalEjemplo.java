package ies.jandula.paradigmaprogramacionfuncional;

import java.util.Scanner;

public class ProgramacionFuncionalEjemplo {

	public static double potenciaCubo(double x) {

		return x * x * x;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribir un número para calcular el cubo");

		double numero = sc.nextInt();

		// Imperative solution

		double result = numero * numero * numero;

		System.out.println("El cubo de " + numero + " es " + result);

		// Declarative and functional solution

		System.out.println("El cubo de " + numero + " es " + ProgramacionFuncionalEjemplo.potenciaCubo(numero));

	}

}