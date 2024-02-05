package figurasconinterfaces;

public abstract class FiguraGeometrica implements IFigura {

	protected EnumFigura tipoFigura;
	

	public final EnumFigura getTipo() {
		return this.tipoFigura;
	}
}
