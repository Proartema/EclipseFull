package ejercicios.esp.ejercicio3;

public class CuentaAhorros extends Cuenta{
	private boolean activa=true;

	public CuentaAhorros() {
		
	}

	public CuentaAhorros(boolean activa) {
		
		this.activa = activa;
	}

	public boolean isActiva() {
		if (saldo>10000) {
			this.activa = true;
			}
		else {
			this.activa = false;
		}
		return activa;
	}

	public void setActiva(boolean activa) {
		if (saldo>10000) {
			this.activa = true;
			System.out.println("Activa");}
		else {
			this.activa = false;
			System.out.println("Inactiva");}
	}

	@Override
	public String toString() {
		return "CuentaAhorros [activa=" + activa + "]";
	}
	@Override
	public void retirar(float cantidad) {
		if (this.activa=true) {
		
		
		this.saldo-=cantidad;}
		else
			System.out.println("Cuenta Inactiva");
		this.nRetiro++;
	}
	@Override
	public void depositar(float cantidad) {
		if (this.activa=true) {
			
			
			this.saldo+=cantidad;}
			else
				System.out.println("Cuenta Inactiva");
			this.nDepositos++;
	}
	@Override
	public void extractoMensual() {
		if (nRetiro>4)
			this.comisionMensual=comisionMensual+1000;
		else if (this.saldo>10000) {
			this.activa=true;
			
		}
	}
	public void imprimir() {
		System.out.println(this.saldo + this.comisionMensual + (this.nDepositos+this.nRetiro));
	}
	
}
