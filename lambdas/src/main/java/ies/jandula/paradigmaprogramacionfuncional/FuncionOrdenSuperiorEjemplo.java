package ies.jandula.paradigmaprogramacionfuncional;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FuncionOrdenSuperiorEjemplo {

	public Supplier<Double> funcionOrdenSuperior(Supplier<Double> number, Function<Double, Double> function) {

		return (() -> function.apply(number.get()));

	}
	public Function<Integer,Integer> funcionOrdenSuperiorCompuesta ( Function<Integer,Integer> func1, Function<Integer,Integer> func2) {
        
        
        
        return func1.andThen(func2);
        
        
    }
	public Function<Integer,Integer> funcionOrdenSuperiorCompuestaVarArgs ( Function<Integer,Integer> ... funcs ) {
		Function<Integer,Integer> resul= Function.identity();
		
		for (Function<Integer,Integer> func:funcs) {
			resul = resul.andThen(func);
		}
		
		return resul;
	}

	public static void main(String[] args) {

		Scanner miScanner = new Scanner(System.in);

		System.out.println("Introduce un número decimal");

		Double numero1 = miScanner.nextDouble();

		FuncionOrdenSuperiorEjemplo highOrder = new FuncionOrdenSuperiorEjemplo();

		Supplier<Double> supplierNumerico = highOrder.funcionOrdenSuperior(() -> numero1, (x) -> x * x);

		System.out.println(" Función de orden superior que retorna un supplier " + supplierNumerico.get());

		System.out.println(" Función de orden superior que retorna un supplier directamente"
				+ highOrder.funcionOrdenSuperior(() -> numero1, (x) -> x * x).get());
		
		Function<Integer,Integer> resultado = highOrder.funcionOrdenSuperiorCompuesta((n)-> 5, (n)-> n*2 ) ;
		Function<Integer,Integer> resultado2 = highOrder.funcionOrdenSuperiorCompuestaVarArgs((n)-> 5, (n)-> n*2, n-> n+7, n-> n/3 ) ;
		
		System.out.println(" Función de orden superior que retorna multiples funciones: " + resultado2.apply(numero1.intValue()));

	}

}