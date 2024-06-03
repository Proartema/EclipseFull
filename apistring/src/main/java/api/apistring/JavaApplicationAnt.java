package api.apistring;

import com.google.common.collect.*;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author carlo
 */
public class JavaApplicationAnt {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		List<String> lista = Arrays.asList("hola", "mundo", "como estas");

		ImmutableList<String> listaInmutable = ImmutableList.copyOf(lista);
// TODO code application logic here

		listaInmutable.stream().forEach(System.out::println);

	}

}