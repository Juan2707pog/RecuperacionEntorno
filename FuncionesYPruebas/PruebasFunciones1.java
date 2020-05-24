

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFunciones1 {

	static Funciones1 funcion = null;
	static int pruebasterminadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando tests, waitee....");
		funcion = new Funciones1();
	}
	
	@BeforeEach
	private void EjecutarPruebas() {
		pruebasterminadas++;
		System.out.println("Ejecutando un test.........");
	}
	
	@AfterEach
	private void terminadoPruebas() {
		System.out.println("Se ha ejecutado el test numero...   " + pruebasterminadas);
	}
	
	@AfterAll
	static void finPruebas() {
		System.out.println("Todas laos tests se han realizado correctamente. Nos vemo");
		funcion = null;
	}
	
	@Test
	@DisplayName("Caja negra con valores limites inferior")
	void PruebaFuncion1(){
		assertEquals(true, Funcion1.Funcion1("eeeeeeeeeeeeeeeeee")); // Hay 18 e por lo tanto sería true 
	}
	
	@Test
	@DisplayName("Caja negra con valores limites inferior -1")
	void Prueba2Funcion1(){
		assertEquals(false, Funcion1.Funcion1("ooooooooooooooooo")); // Hay 17 o por lo tanto sería false
	}
	
	@Test
	@DisplayName("Caja negra con equivalentes")
	void Prueba4Funcion1() {

		assertEquals(null, Funcion1.Funcion1("32323243"));
		// Probamos un caso invalido dado que la funcione te pide letras para contar las vocales no numeros
	}
	@Test
	@DisplayName("Caja negra con valores nulas")
	void Prueba3Funcion1() {
		assertNull(null, Funcion1.Funcion1("")); 
	}
	

	@Test
	@DisplayName("Caja negra con equivalentes")
	void Prueba5Funcion1() {
		assertEquals(false, Funcion1.Funcion1("Limonxelo de todos los santos")); // Cuenta como valor válido ya que si son letras, aunque salga false es valido
	}
	
	
	@Test
	@DisplayName("Caja blanca de cobertura de decisiones")
	void Prueba6Funcion1() {
		assertEquals(true, Funcion1.Funcion1("Mi campeón favorito, sin duda alguna Anivia, la criofenix. No tendrá mucho ataque, no tendrá mucha defensa... pero me encanta."));
		// Una de las decisiones posibles es que sea true, como en este caso, que supera las 18 vocales
	}
		
	@Test
	@DisplayName("Caja blanca de cobertura de decisiones ")
	void Prueba7Funcion1() {
		assertEquals(false, Funcion1.Funcion1("Viva er beti"));
		// Otra decision posible es que sea false, como en este caso, ya que no supera las 18 vocales
	}

	
	@Test
	@DisplayName("Caja blanca de cobertura de condiciones ")
	void Prueba8Funcion1() {
		assertEquals(true, Funcion1.Funcion1("yeeeeeeeeeeeeeeeeee"));
		//Otra posibilidad es que el numero de vocales sea igual a mi edad, eso lo haría true también
	}
	@Test
	@DisplayName("Caja blanca de cobertura de condiciones ")
	void Prueba9Funcion1() {
	assertEquals(false, Funcion1.Funcion1("holita"));
		
		//La Edad es superior al numero de vocales por lo tanto false
		
	}
	@Test
	@DisplayName("Caja blanca de cobertura de condiciones ")
	void Prueba10Funcion1() {
	assertEquals(true, Funcion1.Funcion1("illooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo"));
	//La edad es inferior al numero de vocales
	}
}
