package empleadoEducacion;

public class Profesor extends EmpleadoEducacion{
	
	private String especialidad;
	private cuerpoEducativo cuerpo;
	private int experiencia;
	public Profesor() {
		
	}
	public Profesor(String especialidad, cuerpoEducativo cuerpo, int experiencia) {
		
		this.especialidad = especialidad;
		this.cuerpo = cuerpo;
		this.experiencia = experiencia;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public cuerpoEducativo getCuerpo() {
		return cuerpo;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public void setCuerpo(cuerpoEducativo cuerpo) {
		this.cuerpo = cuerpo;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public double calculoDeSueldo() {
		return this.sueldo-calculoDeImpuesto()+(20*this.experiencia);
		
	}
	@Override
	public double calculoDeImpuesto() {
		return (this.sueldo + (20*this.experiencia))*this.irpf;
		// TODO Auto-generated method stub
		
	}
	@Override
	public String funcion() {
		// TODO Auto-generated method stub
		return this.funciones="Enseñar materias de su especialidad";
	}
	
	
}
