package IESJANDULA.proyectounidad4.ejercicio44;

public class NotaAlarma extends Nota{
		
	private int hora;

	public NotaAlarma(int identificador, String contenido, int numPalabraComienzo,EnumNota tipo, int hora) {
		super(identificador, contenido, numPalabraComienzo, EnumNota tipo);
		this.hora = hora;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	

	@Override
	public String toString() {
		return "NotaAlarma [hora=" + hora + ", getIdentificador()=" + getIdentificador() + ", getContenido()="
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
		return EnumNota.NOTA_ALARMA;
	}
	
	
}
