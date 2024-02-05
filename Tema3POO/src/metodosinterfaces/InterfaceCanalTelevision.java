package metodosinterfaces;

public interface InterfaceCanalTelevision {
	public int getCanal();

	public void setCanal(int canal);

	default void subirCanal() {
		setCanal(getCanal() + 1);
	}

	default void bajarCanal() {
		int canalActual = getCanal();
		if (canalActual > 0) {
			setCanal(getCanal() - 1);
		} else {
			setCanal(0);
		}
	}

	static void cambiamosCanal() {
		System.out.println("Publicamos el canal en internet");
	}

}
