package ejemploclaseanonima;

public class ClasesAnonimasDesdeInterfaz {
	interface InterfaceNombre {
		public void metodoNombre(String name);
	}

	public static void main(String[] args) {
		InterfaceNombre anon = new InterfaceNombre() {
			@Override
			public void metodoNombre(String name) {
				System.out.println("Sobreescribimos el método demanera anónima:" + name);
			}
		};
		anon.metodoNombre("Mildred");
		anon.getClass();
		InterfaceNombre anon2 = (name) -> System.out.println("Sobreescribimos el método de manera anónima con una lambda:" + name);

	    anon2.metodoNombre("Pablo");
	}
}