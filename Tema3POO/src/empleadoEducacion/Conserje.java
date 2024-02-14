package empleadoEducacion;

public class Conserje extends EmpleadoEducacion{
	private String horario;
	private posicionCon posicion;
	public Conserje() {
		
	}
	public Conserje(String horario, posicionCon posicion) {
		
		this.horario = horario;
		this.posicion = posicion;
	}
	public String getHorario() {
		return horario;
	}
	public posicionCon getPosicion() {
		return posicion;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void setPosicion(posicionCon posicion) {
		this.posicion = posicion;
	}
	@Override
	public double calculoDeSueldo() {
		
		return this.sueldo-calculoDeImpuesto();
	}
	@Override
	public double calculoDeImpuesto() {
		
		return this.sueldo*this.irpf;
	}
	@Override
	public String funcion() {
		// TODO Auto-generated method stub
		return this.funciones="Realizar labores de atencion al publico y mantenimiento.";
	}
	
	
}
