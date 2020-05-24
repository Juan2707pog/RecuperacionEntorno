
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFunciones4 {
	
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
	
	@DisplayName("Caja negra particiones equivalentes Entrada Valida")
	@Test
	void PruebaFuncion4() {
		assertEquals("Insuficiente", Funciones.funcion4( new int[] {4, 4, 4, 4, 3}));
		
		// Queremos que dé de resultado insuficiente así que hemos colocado unas notas que dan de media suspenso(insuficiente) 
	}
	@DisplayName("Caja negra particiones equivalentes Entrada Invalida")
	@Test
	void Prueba2Funcion4() {
		assertNotEquals("Suficiente", Funciones.funcion4( new int[] {4, 4, 4, 4, 3}));
		
		// Queremos que de un resultado suficiente pero hemos colocado notas para que de media suspensa, por lo tanto no es valida la respuesta dada .
	}
	@DisplayName("Caja negra valores limite inferior Notable")
	@Test
	void Prueba3Funcion4() {
		assertEquals("Notable", Funciones.funcion4( new int[] {7, 7, 7, 7}));
		
		// las notas colocadas buscan llegar al limite inferior del notable que es el 7
	}
	@DisplayName("Caja negra valores limite inferior -1 Notable")
	@Test
	void Prueba4Funcion4() {
		assertEquals("Bien", Funciones.funcion4( new int[] {6, 6, 6, 6, 6}));
		
		// Ahora probamos el valor limite inferior de Notable, que debería dar de nota media bien
	}
	@DisplayName("Caja blanca de decisiones Notable")
	@Test
	void Prueba5Funcion4() {
		assertEquals("Suficiente", Funciones.funcion4( new int[] {9, 8, 5, 2, 1}));
		// Colocamos varias notas y el resultado de todas ella es 5, por lo tanto nos saldria Suficiente por lo tanto es falso, porque buscamos un Notable
	}
	@DisplayName("Caja blanca de decisiones (Notable)")
	@Test
	void Prueba6Funcion4() {
		assertEquals("Notable", Funciones.funcion4( new int[] {7, 7, 8, 7, 8}));
		
		// Colocamos las notas y el resultado de la media es notable por lo tanto nos saldria Notable y es lo que estamos buscando realmente.
	}
	@DisplayName("Caja blanca cobertura de camino")
	@Test
	void Prueba7Funcion4() {
		assertEquals("Insuficiente", Funciones.funcion4( new int[] {0, 0}));
		
		//al poner dos 0 nos daria la nota como insuficiente
	}
	@DisplayName("Caja blanca cobertura de camino")
	@Test
	void Prueba8Funcion4() {
		assertEquals("Notable", Funciones.funcion4( new int[] {7}));
		
		// comrpobamos de que al dar de nota media 7 da de resultado notable 
	}
	
	
}
