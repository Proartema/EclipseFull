package figurasconinterfaces;

public class Rectangulo extends FiguraGeometrica {


    private int base;
    private int altura;

    public Rectangulo () {
    	this.tipoFigura=EnumFigura.POLIGONOS;
    }

    public Rectangulo (int base, int altura) {
    	this();
        this.altura=altura;
        this.base=base;
    }

    public int getBase() {

        return base;
    }

    public void setBase (int base) {

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

        return base*altura;
    }
    @Override
    public double calcularPerimetro() {

        return (2*base)+(2*altura);
    }

    @Override
    public String toString() {

        return "Rectangulo [base = " + base + ", altura = " + altura + "]";
    }
}
