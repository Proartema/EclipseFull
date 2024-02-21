package IESJANDULA.proyectounidad4.arraysdeobjetos.agregacion;

public class AppClientes {
	
		public static void main(String[] args) {
			
			
			Cliente c1= new Cliente("Jesus", "Soto", "444444");
			Cliente c2= new Cliente("Pablo", "Martinez", "555555");
			
			Tienda t1 = new Tienda("Software J&P","C. San Vicente Paul, 32, 23740 Andújar Jaén");
			
			t1.addCliente(c1);
			t1.addCliente(c2);
			
			t1.borrarCliente(c2);
			
			System.out.println(t1);
			
			
		}
}
