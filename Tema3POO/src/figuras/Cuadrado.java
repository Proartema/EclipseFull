package figuras;

public class Cuadrado extends FiguraGeometrica{
	 private int lado;

	    public Cuadrado () {
	    	this.tipoFigura= EnumFigura.POLIGONOS;
	    }

	    public Cuadrado (int lado) {
	    	this();
	        this.lado=lado;
	    }

	    public int getLado() {

	        return lado;
	    }

	    public void setLado(int lado) {

	        this.lado=lado;
	    }
	    @Override
	    public double calcularArea() {

	        return lado * lado;
	    }
	    @Override
	    public double calcularPerimetro() {

	        return lado+lado+lado+lado;
	    }

	    @Override
	    public String toString() {
	        return "Cuadrado [lado = " + lado + "]";
	    }

}
