package IESJANDULA.proyectounidad4.ejercicios.eningles.exercise24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import IESJANDULA.proyectounidad4.arrays.ArrayMetodos;
import IESJANDULA.proyectounidad4.ejercicios.eningles.exercise16_17_18_19.Exercise16_17;

class Exercise24Test {

	@Test
	void evenArrayTest() {
		
		//Necesito dos arrays enteros
		// ejecutar el metodo con esos 2 arrays
		//Comprobar que sale bien y que los numeros dentro son pares
		
		Integer[] array1 = ArrayMetodos.llenarArrayDecimalesWrap(20, -50, 50);
		Integer[] array2 = ArrayMetodos.llenarArrayDecimalesWrap(20, -50, 50);
		
		Integer[] arrayTest = Exercise24.evenArray(array1,array2);
		
		for (Integer item: arrayTest) {
			assertNotNull(item);
			
			assertTrue(item%2==0,"Tiene que ser par");
	}
	
	

}
}
