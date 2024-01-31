package figuras;

public class TrianguloRectangulo extends FiguraGeometrica{
	 private int base;
	    private int altura;

	    public TrianguloRectangulo() {
	    	this.tipoFigura=EnumFigura.POLIGONOS;
	    }

	    public TrianguloRectangulo(int base, int altura) {
	    	this();
	        this.base=base;
	        this.altura=altura;
	    }

	    public int getBase() {

	        return base;
	    }

	    public void setBase(int base) {

	        this.base=base;
	    }

	    public int getAltura() {

	        return altura;
	    }

	    public void setAltura(int altura) {

	        this.altura=altura;
	    }
	    @Override
	    public double calcularArea() {

	        return (base*altura)/2;
	    }
	    @Override
	    public double calcularPerimetro() {

	        double c = (Math.pow(altura, 2)) + (Math.pow(base, 2));

	        double hipotenusa= Math.sqrt(c);

	        return altura+base+hipotenusa;
	    }

	    public double calcularHipotenusa(double hipotenusa) {

	        hipotenusa= (Math.pow(altura, 2)) + (Math.pow(base, 2));

	        return Math.sqrt(hipotenusa);
	    }

	    public double determinarTipoTriangulo(double tipoTriangulo) {

	        return tipoTriangulo;
	    }


	    @Override
	    public String toString() {
	        return "TrianguloRectangulo [base = " + base + ", altura = " + altura + "]";
	    }


}
