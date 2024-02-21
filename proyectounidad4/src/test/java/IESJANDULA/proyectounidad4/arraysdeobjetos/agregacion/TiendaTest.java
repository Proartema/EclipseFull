package IESJANDULA.proyectounidad4.arraysdeobjetos.agregacion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiendaTest {
	
	private Cliente mockclient;
	private Tienda mockTienda;
	
	@BeforeEach
	void setup() {
			
		mockclient = new Cliente("Jesus", "Soto", "444444");
		
		mockTienda = new Tienda("Software J&P","C. San Vicente Paul, 32, 23740 Andújar Jaén");
	}
	
	@Test
	void addClienteTest() {
		
		mockTienda.addCliente(mockclient);
		
		Cliente[] array = mockTienda.getClientes();
		Arrays.parallelSort(array);
		Arrays.parallelSort(array, (cl1,cl2)-> cl1.getNombre().compareTo(cl2.getNombre()));
		assertTrue(buscarElemArray(array, mockclient));
		
	}
	
	@Test
	void borrarClienteTest() {
		
		mockTienda.addCliente(mockclient);
		
		mockTienda.borrarCliente(mockclient);
		
		for(Cliente cliente: mockTienda.getClientes()) {
			
			assertNotEquals(cliente,mockclient);
		}
		
	}
	
	private boolean buscarElemArray(Cliente[] clientes, Cliente cliente) {
		
		boolean encontrado=false;
		
		for (int i=0 ; i<clientes.length && !encontrado; i++) {
			
			if (cliente.equals(clientes[i])) {
				encontrado=true;
			}
		}
		
		return encontrado;
	}

}
