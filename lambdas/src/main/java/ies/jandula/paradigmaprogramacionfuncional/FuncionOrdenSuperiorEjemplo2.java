package ies.jandula.paradigmaprogramacionfuncional;

import java.util.function.Function;

public class FuncionOrdenSuperiorEjemplo2 {

	public Function<Double, Double> componeFormulaSeleccionadayRedondea(Function<Double, Double> function) {

		return function.andThen(FuncionOrdenSuperiorEjemplo2::redondea);

	}

	public static Double raizCuadrada(Double a) {

		return Math.sqrt(a);

	}

	public static Double cuadrado(Double a) {

		return a * a;

	}

	public static double redondea(Double a) {

		return (double) Math.round(a);

	}

	public static void main(String[] args) {

		FuncionOrdenSuperiorEjemplo2 objectHighOrder = new FuncionOrdenSuperiorEjemplo2();

		Function<Double, Double> miFormula = objectHighOrder
				.componeFormulaSeleccionadayRedondea(FuncionOrdenSuperiorEjemplo2::cuadrado);

		System.out.println("La función obtenida de componer finalmente calcula el cuadrado"
				+ " y redondea el resultado del cuadrado: " + miFormula.apply(24.2));

	}

}