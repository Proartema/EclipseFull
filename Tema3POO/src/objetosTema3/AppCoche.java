package objetosTema3;

public class AppCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		SUV miTeslaSUV = new SUV("Rojo", "Tesla", "Model E", 35000, 30000);

		System.out.println("Mi USV " + miTeslaSUV);

		Coche coche1 = new SUVElectrico("rojo", "Tesla", "Model S High Performace", 50000, 30000,75,15,5);
		
		coche1.toString();
		
		System.out.println("Mi USV " + miTeslaSUV);
		

	}

}
