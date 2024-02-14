package clasegenerica;

public class Operaciones implements GenericInterfaceExample<Double>{

	@Override
	public Double suma(Double op1, Double op2) {
		// TODO Auto-generated method stub
		return op1+op2;
	}

	@Override
	public Double resta(Double op1, Double op2) {
		// TODO Auto-generated method stub
		return op1-op2;
	}

	@Override
	public Double producto(Double op1, Double op2) {
		// TODO Auto-generated method stub
		return op1*op2;
	}

	@Override
	public Double division(Double op1, Double op2) {
		// TODO Auto-generated method stub
		return op1/op2;
	}

}
