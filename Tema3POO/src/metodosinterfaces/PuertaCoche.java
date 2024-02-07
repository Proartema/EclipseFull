package metodosinterfaces;

public class PuertaCoche extends ComponenteDeCoche implements Puerta_Bloqueable, Alarma {
	private boolean estaAbierta = false;
	private boolean estaBloqueada = false;
	private boolean estaActivada = false;

	public PuertaCoche() {

	}

	public PuertaCoche(boolean estaAbierta, boolean estaBloqueada, boolean estaActivada) {

		this.estaAbierta = estaAbierta;
		this.estaBloqueada = estaBloqueada;
		this.estaActivada = estaActivada;
	}

	@Override
	public void activarAlarma() {

		System.out.println("Puerta bloqueada.");

	}

	@Override
	public void desactivarAlarma() {

		System.out.println("Puerta bloqueada.");

	}

	@Override
	public boolean alarmaActivada() {

		return estaActivada;
	}

	@Override
	public void abrir() {

		System.out.println("Puerta abierta.");

	}

	@Override
	public void cerrar() {

		System.out.println("Puerta cerrada.");

	}

	@Override
	public void bloquear() {

		System.out.println("Puerta bloqueada.");

	}

	@Override
	public void desbloquear() {

		System.out.println("Puerta desbloqueada.");

	}
}
