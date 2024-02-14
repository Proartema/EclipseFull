package empleadoEducacion;

public class appEducacion {

	public static void main(String[] args) {
		Administrativo Paco= new Administrativo(claseAd.TRES,perfilAd.CONTABLE,"Paco","Palomo",688888888,"Calle los blancos",5000,0.2,8,"");
		Paco.setSueldo(5000);
		Paco.setIrpf(0.2);
		
		System.out.println(Paco.funcion());
		System.out.println(Paco.calculoDeSueldo());
		System.out.println(Paco);
	}

}
