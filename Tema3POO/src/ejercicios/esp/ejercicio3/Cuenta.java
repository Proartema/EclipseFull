package ejercicios.esp.ejercicio3;

public class Cuenta {
	protected float saldo;
	protected int nDepositos=0;
	protected int nRetiro=0;
	protected float tasaAnual;
	protected float comisionMensual=0;
	public Cuenta() {
		
	}
	
	
	public Cuenta(float saldo, float tasaAnual) {
		
		this.saldo = saldo;
		
		
		this.tasaAnual = tasaAnual;
		
	}
	
	public float getSaldo() {
		return saldo;
	}


	public int getnDepositos() {
		return nDepositos;
	}


	public int getnRetiro() {
		return nRetiro;
	}


	public float getTasaAnual() {
		return tasaAnual;
	}


	public float getComisionMensual() {
		return comisionMensual;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public void setnDepositos(int nDepositos) {
		this.nDepositos = nDepositos;
	}


	public void setnRetiro(int nRetiro) {
		this.nRetiro = nRetiro;
	}


	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}


	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}


	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", deposito=" + nDepositos + ", retiro=" + nRetiro + ", tasaAnual=" + tasaAnual
				+ ", comisionMensual=" + comisionMensual + "]";
	}


	public void depositar(float cantidad) {
		
		this.saldo=saldo + cantidad;
		this.nDepositos++;
		
	}
	public void retirar(float cantidad ) {
		
		 this.saldo-= cantidad;
		 this.nRetiro++;
	}
	public void calcularInteres() {
		System.out.println ("El interes es " + saldo * this.tasaAnual);
	}
	public void extractoMensual() {
		this.saldo=saldo - comisionMensual;
		this.calcularInteres();
	}
}
