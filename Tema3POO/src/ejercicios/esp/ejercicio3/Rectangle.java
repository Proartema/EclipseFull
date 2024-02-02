package ejercicios.esp.ejercicio3;

public class Rectangle extends Shape {
	protected double width=1.0;
	protected double length=1.0;
	public Rectangle() {
		
	}
	public Rectangle(double width, double length) {
		
		this.width = width;
		this.length = length;
	}
	public Rectangle(double width, double length,String color,boolean filled) {
		
		this.width = width;
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		return width*length;
	}
	@Override
	public double getPerimeter() {
		return width*length;
	}
	
	
}
