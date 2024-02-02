package ejercicios.esp.ejercicio3;

public class Square extends Rectangle {
	
	public Square() {
		
	}
	
	public Square(double side) {
		this.width=side;
		this.length=side;
	}
	
	public Square(double side, String color, boolean filled) {
		super();
		this.width=side;
		this.length=side;
		
	}
	
	public double getSide() {
		return this.width;
	}
	public void setSide(double side) {
		this.width=side;
		this.length=side;
	}
	public void setWidth(double side) {
		this.width=side;
		this.length=side;
	}
	public void setLength(double side) {
		this.width=side;
		this.length=side;
	}

	@Override
	public String toString() {
		return "Square [width=" + width + ", length=" + length + ", getSide()=" + getSide() + ", getArea()=" + getArea()
				+ ", getPerimeter()=" + getPerimeter() + "]";
	}
	
}
