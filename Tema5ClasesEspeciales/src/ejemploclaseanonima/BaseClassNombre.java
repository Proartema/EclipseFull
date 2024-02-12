package ejemploclaseanonima;

public class BaseClassNombre {
	public BaseClassNombre() {
	}

	public void metodoNombre(String nombre) {
		System.out.println("Clase creada normal: " + nombre);
	}

	public static void main(String[] args) {
		BaseClassNombre objetoNormal = new BaseClassNombre();

		objetoNormal.metodoNombre("Betty");

		BaseClassNombre anon = new BaseClassNombre() {
			@Override
			public void metodoNombre(String name) {

				System.out.println("Clase anonima creada sobreescrita:" + name);
			}

		};
		anon.metodoNombre("Mildred");

	}
}
