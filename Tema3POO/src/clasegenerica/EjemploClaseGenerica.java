package clasegenerica;

public class EjemploClaseGenerica<T> {

	private T operando1;

	private T operando2;

	public EjemploClaseGenerica(T operando1, T operando2) {

		this.operando1 = operando1;

		this.operando2 = operando2;

	}

	public T getOperando1() {

		return operando1;

	}

	public void setOperando1(T operando1) {

		this.operando1 = operando1;

	}

	public T getOperando2() {

		return operando2;

	}

	public void setOperando2(T operando2) {

		this.operando2 = operando2;

	}

	public String muestraTipo() {

		return operando1.getClass().toString();

	}

	public boolean comparacion() {

		return operando1.equals(operando2);

	}

	public boolean comparacionExterna(T op3) {

		return operando1.equals(op3);

	}

	@Override

	public String toString() {

		return "EjemploClaseGenerica[operando1=" + operando1 + ", operando2=" + operando2 + "]";

	}

	public static void main(String[] args) {

		Double param = 1.0;

		EjemploClaseGenerica<Double> dobleGenerico = new EjemploClaseGenerica<Double>(Double.valueOf(1),
				Double.valueOf(2));

		System.out.println("El tipo de mi clase genérica es " + dobleGenerico.muestraTipo());

		System.out.println("¿Son iguales los dos operandos? La respuestaes " + dobleGenerico.comparacion());

		System.out.println(" Operando 1 es elparámetro. La respuesta es " + dobleGenerico.comparacionExterna(param));

		EjemploClaseGenerica<Integer> integerGenerico = new EjemploClaseGenerica<Integer>(Integer.valueOf(1),
				Integer.valueOf(2));

		System.out.println("El tipo de mi clase genérica es " + integerGenerico.muestraTipo());

		System.out.println("¿Son los dos operandos iguales? La respuestaes " + integerGenerico.comparacion());

	}

}