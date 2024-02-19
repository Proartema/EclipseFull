package IESJANDULA.proyectounidad4.ejercicios.eningles.exercise16_17_18_19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import IESJANDULA.proyectounidad4.arrays.ArrayMetodos;

class Exercise16_17Test {

	@Test
	void returnArrayWithPositives() {
		
		Integer[] arrayInit = ArrayMetodos.llenarArrayDecimalesWrap(20, -50, 50);
		
		Integer[] arrayTest = Exercise16_17.returnArrayWithNegatives(arrayInit);
		
		for (Integer item: arrayTest) {
			assertNotNull(item);
			
			assertTrue(item<0,"Item tiene que ser positivo");
		}
	}

}
