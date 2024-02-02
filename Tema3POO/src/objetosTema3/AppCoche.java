package objetosTema3;

public class AppCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche MiCoche = new Coche("verde", "fiat", "Acapulco", 35000, 30000);

		System.out.println("Beneficios: " + MiCoche.beneficios(0.18));
		SUV miTeslaSUV = new SUV("Rojo", "Tesla", "Model E", 35000, 30000);

		System.out.println("Mi USV " + miTeslaSUV);

		Coche coche1 = new SUVElectrico("rojo", "Tesla", "Model S High Performace", 50000, 30000);
		Coche coche2 = new Sedan("azul", "BMW", "320", 50000, 30000);
		coche1.toString();
		coche2.toString();

	}

}
