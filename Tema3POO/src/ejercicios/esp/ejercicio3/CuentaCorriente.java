package ejercicios.esp.ejercicio3;

public class CuentaCorriente extends Cuenta {
	private float sobregiro=0;

	public CuentaCorriente() {
		
	}

	public CuentaCorriente(float sobregiro) {
		
		this.sobregiro = sobregiro;
	}

	public float getSobregiro() {
		return sobregiro;
	}

	public void setSobregiro(float sobregiro) {
		this.sobregiro = sobregiro;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [sobregiro=" + sobregiro + "]";
	}
	@Override
	public void retirar(float cantidad) {
		saldo=- cantidad;
		if (saldo<0)
			this.sobregiro=saldo;
		else 
			this.saldo=saldo;
		this.nRetiro++;
	}
	@Override
	public void depositar(float cantidad) {
		if (saldo>0) 
			this.saldo=saldo+cantidad;
		else
			this.sobregiro=sobregiro+cantidad;
		
		this.nDepositos++;
	}
	@Override
	public void extractoMensual() {
		this.saldo= saldo-comisionMensual;
	}
	
	public void imprimir() {
		System.out.println(this.saldo + this.comisionMensual + (this.nDepositos+this.nRetiro) + this.sobregiro);
	}
	
}
