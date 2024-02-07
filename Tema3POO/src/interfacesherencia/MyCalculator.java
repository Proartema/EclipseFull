package interfacesherencia;

public class MyCalculator implements Calculator {
	@Override
	public void add(double x, double y)
	 {
	 double result = x + y;
	 printResult(result);
	 }
	@Override
	public void subtract(double x, double y)
	 {
	 double result = x - y;
	 printResult(result);
	 }

	 // Implementing the multiplication
	 // method
	@Override
	 public void multiply(double x, double y)
	 {
	 double result = x * y;
	 printResult(result);
	 }

	 // Implementing the division
	 // method
	 @Override
	 public void divide(double x, double y)
	 {
	 double result = x / y;
	 printResult(result);
	 }

	 // Implementing a method
	 // to print the result
	 @Override
	 public void printResult(double result)
	 {
	 System.out.println(
	 "The result is : " + result);
	 }


	} 