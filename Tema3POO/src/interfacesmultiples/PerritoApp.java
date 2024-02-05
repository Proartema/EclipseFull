package interfacesmultiples;

public class PerritoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Perro perro = new Perro();
		Gato gato = new Gato();
		
		Alimento alimento = perro;
		
		Sonido sonido = perro;
		
		alimento.seAlimenta();
		sonido.produceSonido();
		
		perro.seAlimenta();
		perro.produceSonido();
		
		Sonido[] sonidosAnimales= new Sonido[2];
		
		System.out.println("Programamos para las abstracciones " + 
		"no para las implementaciones");
		sonidosAnimales[0]=perro;
		sonidosAnimales[1]=gato;
		
		for (Sonido sonidos:sonidosAnimales) {
			
				sonidos.produceSonido();
			
		}
	}

}
