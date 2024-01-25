package objetosTema3;

public class CuentaBancariaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaBancaria cuenta1= new CuentaBancaria("Anselmo","Hurtado Mazias",349688282,"Cuenta joven",58.69);
		
		System.out.println(cuenta1);
		System.out.println("El numero de cuenta es= " + cuenta1.getNum());
	}

}
