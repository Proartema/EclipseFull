package clone;

class Referencia implements Cloneable{
	public Referencia() {
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Referencia();
	}
}

public class ClonacionEstudiante implements Cloneable {
	private int estId;
	private String nombre;
	private Referencia referencia;

	public int getEstId() {
		return estId;
	}

	public void setEstId(int estId) {
		this.estId = estId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Referencia getReferencia() {
		return referencia;
	}

	public void setReferencia(Referencia referencia) {
		this.referencia = referencia;
	}

	ClonacionEstudiante(int rollno, String nombre) {
		this.estId = rollno;
		this.nombre = nombre;
		this.referencia = new Referencia();
	}
	ClonacionEstudiante(int rollno, String nombre,Referencia referencia) {
		this.estId = rollno;
		this.nombre = nombre;
		this.referencia = referencia();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new ClonacionEstudiante(this.getEstId(),this.getNombre(),(Referencia)this.getReferencia().clone());
	}

	public static void main(String args[]) {
		try {
			ClonacionEstudiante s1 = new ClonacionEstudiante(1, "Carlos");
			ClonacionEstudiante s2 = (ClonacionEstudiante) s1.clone();
			System.out.println(s1.getEstId() + " Objeto String nombre " + s1.getNombre().getBytes() + " referencia : "
					+ s1.getReferencia());
			System.out.println(s2.getEstId() + " Objeto String nombre " + s2.getNombre().getBytes() + " referencia : "
					+ s2.getReferencia());
		} catch (CloneNotSupportedException c) {
		}
	}

}