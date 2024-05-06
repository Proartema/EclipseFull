package ies.jandula.funcional;

import java.util.Random;

import java.util.Scanner;

import java.util.function.Supplier;

public class SupplierInterface {

	private static int i = 0;

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		Supplier<String> supNombre = () -> {

			i = 5;

			System.out.println("¿Puedes introducir tu nombre, por favor?");

			return sc.nextLine();

		};

		System.out.println("Nombre leido por la consola: " + supNombre.get());

		Supplier<Integer> supRandom = () -> new Random().nextInt(20);

		System.out.println("Genera un número aleatorio: " + supRandom.get());

	}

}