package ies.jandula.funcional;

import java.util.Scanner;

import java.util.function.IntFunction;

import java.util.function.IntToDoubleFunction;

import java.util.function.ToIntFunction;

public class PrimitiveTypeSpecialization {

	public static void main(String[] args) {

		Scanner miScanner = new Scanner(System.in);

		System.out.println("Introduce un número entero");

		int numero1 = miScanner.nextInt();

		IntFunction<String> convertdeIntaString = (i) -> String.valueOf(i);

		ToIntFunction<String> convertdeStringaInt = (s -> Integer.valueOf(s));

		IntToDoubleFunction convertdeIntaDouble = (i -> Double.valueOf(i));

		String cadena = convertdeIntaString.apply(numero1);

		System.out.println("Convertir de tipo primitivo int  " + numero1 + " a String " + cadena);

		int numero2 = convertdeStringaInt.applyAsInt(cadena);

		System.out.println("Convertir de String  " + cadena + " a tipo primitivo in " + numero2);

		Double numerodecimal = convertdeIntaDouble.applyAsDouble(numero1);

		System.out.println("Convertir de primitivo int " + numero1 + " a primitivo double " + numerodecimal);

	}

}