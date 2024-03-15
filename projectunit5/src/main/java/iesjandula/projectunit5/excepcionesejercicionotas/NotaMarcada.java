package iesjandula.projectunit5.excepcionesejercicionotas;

public class NotaMarcada extends Nota implements Comparable<Nota> {

		private String color;

		public NotaMarcada(int identificador, String contenido, int numPalabraComienzo, String color) {
			super(identificador, contenido, numPalabraComienzo);
			this.color = color;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "NotaMarcada [color=" + color + ", getIdentificador()=" + getIdentificador() + ", getContenido()="
					+ getContenido() + ", getNumPalabraComienzo()=" + getNumPalabraComienzo() + "]";
		}

		@Override
		public int enTexto() {
			// TODO Auto-generated method stub
			return this.getNumPalabraComienzo();
		}

		@Override
		public EnumNota tipoNota() {
			// TODO Auto-generated method stub
			return EnumNota.NOTA_MARCADA;
		}
		@Override
		public int compareTo(Nota o) {
			int compare;

			if (this.getNumPalabraComienzo() == o.getNumPalabraComienzo()) {

				compare = this.getContenido().compareTo(o.getContenido());

			} else {

				compare = this.getNumPalabraComienzo() - o.getNumPalabraComienzo();
			}

			return compare;
			
		}
		
		
}
