package empleadoEducacion;

public class Administrativo extends EmpleadoEducacion{
	private claseAd clase;
	private perfilAd perfil;
	public Administrativo() {
		
	}
	public Administrativo(claseAd clase, perfilAd perfil,String nombre, String apellido, long telefono, String direccion, double sueldo,
			double irpf, int horarioPermanencia, String funciones) {
		super(nombre, apellido, telefono, direccion, sueldo,
				 irpf,  horarioPermanencia, funciones);
		this.clase = clase;
		this.perfil = perfil;
	}
	public claseAd getClase() {
		return clase;
	}
	public perfilAd getPerfil() {
		return perfil;
	}
	public void setClase(claseAd clase) {
		this.clase = clase;
	}
	public void setPerfil(perfilAd perfil) {
		this.perfil = perfil;
	}
	@Override
	public double calculoDeSueldo() {
		// TODO Auto-generated method stub
		return this.sueldo + clase.getCategoriaBonus()-this.calculoDeImpuesto();
	}
	@Override
	public double calculoDeImpuesto() {
		// TODO Auto-generated method stub
		return (this.sueldo + clase.getCategoriaBonus())*this.irpf;
	}
	@Override
	public String funcion() {
		// TODO Auto-generated method stub
		return this.funciones="Realizar labores administrativas y ganar pasta.";
	}
	@Override
	public String toString() {
		return "Administrativo [clase=" + clase + ", perfil=" + perfil + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", sueldo=" + sueldo + ", irpf=" + irpf + ", funciones=" + funciones + "]";
	}
	
}
