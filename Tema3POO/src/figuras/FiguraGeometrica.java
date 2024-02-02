package figuras;

public abstract class FiguraGeometrica {

	protected EnumFigura tipoFigura;



	public abstract double calcularArea();

	public abstract double calcularPerimetro();

	public final EnumFigura getTipo() {
		return this.tipoFigura;
	}
}
