package interfacesmultiples;

public class Perro implements Sonido, Alimento {

	@Override
	public void seAlimenta() {
		// TODO Auto-generated method stub
		System.out.println("Se alimenta de carne.");
		if(this.animal || Alimento.animal) {
			System.out.println("Soy un animal.");
		}
	}

	@Override
	public void produceSonido() {
		System.out.println("Bark bark");
		
	}
	
	
	
}
