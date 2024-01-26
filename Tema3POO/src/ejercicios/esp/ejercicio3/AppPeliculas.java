package ejercicios.esp.ejercicio3;

public class AppPeliculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pelicula pell= new Pelicula("El Señor de los Anillos","Peter Jackson", 228,EnumPeliculas.ACCION, 2001,9.0);
		
		System.out.println(pell);
		
		pell.calcularValoracion();
	}

}
