
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFunciones2 {
	static Funciones funcion = null;
	static int pruebasterminadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando tests, waitee....");
		funcion = new Funciones();
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
	@DisplayName("Caja negra con valores nulas")
	void PruebaFuncion2(){
		assertNull(null, Funciones.Funcion2("Limon", "Limon")); 
		// En el caso de que las dos palabras tengan el mismo numero de consonantes se devolverá un null ya que no nos importa otra cosa de las palabras
	}

	@Test
	@DisplayName("Caja negra con equivalentes, primera palabra wins")
	void Prueba1Funcion2() {
		assertEquals("Limonxelo", Funciones.Funcion2("Limonxelo", "Limon")); //
		//Caso en el que la primera palabra tiene mas consonantes que la segunda por eso imprime "1"
	}
	
	@Test
	@DisplayName("Caja negra con equivalentes, segunda palabra wins")
	void Prueba3Funcion2() {
		assertEquals("Limonxelo", Funciones.Funcion2("Limon", "Limonxelo")); //
		//Caso en el que la segunda palabra tiene mas consonantes que la primera por eso imprime "2"
	}
	
	@Test
	@DisplayName("Caja negra con valores vacios")
	void Prueba4Funcion2() {
		assertEquals(null, Funciones.Funcion2(" ", " ")); //
		//Al estar vacios tienen el mismo numero de consonantes y devolvería un null
	}
	
	@Test
	@DisplayName("Caja blanca de cobertura de caminos")
	void Prueba5Funcion2() {
		assertEquals(null, Funciones.Funcion2("Illo", "Illo")); //
		//Los dos strings tienen el mismo numero de consonantes por lo tanto devolvera null
	}
	
	@Test
	@DisplayName("Caja blanca de cobertura de caminos")
	void Prueba6Funcion2() {
		assertEquals("ttttt", Funciones.Funcion2("ttttt", "tt")); //
		//En este caso la primera palabra tiene mas consonantes que la segunda por lo tanto mostrara "1"
	}
	@Test
	@DisplayName("Caja blanca de cobertura de caminos")
	void Prueba7Funcion2() {
		assertEquals("jjjjjjj", Funciones.Funcion2("jjjj", "jjjjjjj")); //
		//La segunda palabra tiene mas consonantes asi que
	}
	
	@Test
	@DisplayName("Caja blanca de cobertura de decisiones ")
	void Prueba8Funcion1() {
		assertEquals("Hola soy pepito el de los palotes", Funciones.Funcion2("adios", "Hola soy pepito el de los palotes"));
		// Queremos una decision en la que el String de la palabra2 tenga mas consonantes que el String de palabra.
		
	}


}
