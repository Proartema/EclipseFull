package objetosTema3;

public class CocheDeportivo extends Coche {
	
		public static final String TYPE_CD="Coche Deportivo";
		public CocheDeportivo(String color, String marca, String modelo, double precio, double coste) {
			super();

		}
		
		public String getTipoCoche() {
			
			return TYPE_CD;
		}
		
		@Override
		public String toString() {
			return "Coche Deportivo [getColor()=" + getColor() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
					+ ", getPrecio()=" + getPrecio() + ", getCoste()=" + getCoste() + "]";
		}
		
}
