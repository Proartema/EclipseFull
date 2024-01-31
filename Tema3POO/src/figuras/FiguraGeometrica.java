package figuras;

public class FiguraGeometrica {
	
		protected EnumFigura tipoFigura;
		
		public FiguraGeometrica() {
			tipoFigura= EnumFigura.FIGURA_GEOMETRICA;
		}

		public double calcularArea() {
			
			return 0.0;
		}
		public double calcularPerimetro() {
			
			return 0.0;
		}
		public EnumFigura getTipo() {
			return this.tipoFigura;
		}
}
