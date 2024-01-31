package ejercicios.esp.ejercicio3;

public class Cuenta {
	private float saldo;
	private int deposito=0;
	private int retiro=0;
	private float tasaAnual;
	private float comisionMensual=0;
	public Cuenta() {
		
	}
	
	
	public Cuenta(float saldo, int deposito, int retiro, float tasaAnual, float comisionMensual) {
		
		this.saldo = saldo;
		this.deposito = deposito;
		this.retiro = retiro;
		this.tasaAnual = tasaAnual;
		this.comisionMensual = comisionMensual;
	}
	

	public float getSaldo() {
		return saldo;
	}


	public int getDeposito() {
		return deposito;
	}


	public int getRetiro() {
		return retiro;
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


	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}


	public void setRetiro(int retiro) {
		this.retiro = retiro;
	}


	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}


	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

	
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", deposito=" + deposito + ", retiro=" + retiro + ", tasaAnual=" + tasaAnual
				+ ", comisionMensual=" + comisionMensual + "]";
	}


	public float depositar(int cantidad) {
		return this.saldo=saldo + cantidad;
	}
	
}
