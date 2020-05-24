
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFunciones3 {
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
	@DisplayName("Caja negra con valores limites inferior")
	@Test
	void PruebaFuncion3() {
        assertEquals(30, Funciones.Funciones3(new int[] {9, 10, 11})); 
        // Probamos el limite inferior que en este caso seria 9 que entraria en la suma y para que nos salga una suma, pues hemos añadido los dos siguientes numeros del 9, 10 y 11
	}
	@DisplayName("Caja negra con valores limites inferior -1")
	@Test
	void Prueba2Funcion3() {
        assertEquals(9, Funciones.Funciones3(new int[] {9, 8, 7}));
        // Probamos los numeros de abajo del limite inferior que seria 8 y 7. Podemos comprobar que no hacer ninguna suma con los demas numero y el resultado nos daria es 9.
	}
	@DisplayName("Caja negra con valores superior")
	@Test
	void Prueba3Funcion3() {
        assertEquals(51, Funciones.Funciones3(new int[] {18, 17, 16}));
        
        // Probamos el numero superior que es 18 y despues los numero que esta dentro de ese rango que es 17 y 16 para que nos de una suma de 51.
	}
	@DisplayName("Caja negra con valores superior +1")
	@Test
	void Prueba4Funcion3() {
        assertEquals(18, Funciones.Funciones3(new int[] {18, 25, 26}));
     // Probamos el numero superior que es 18 y despues los numeros que estan arriba de ese rango que es 19 y 20. Podemos comprobar que solo no nos hacer ninguna suma y solo nos devuelve el numero 18.
	}
	@DisplayName("Caja blanca cobertura de sentencia")
	@Test
	void Prueba5Funcion3() {
        assertEquals(34, Funciones.Funciones3(new int[] {9, 14, 11}));
        // Probamos que los numeros 9, 14, 11, entrar en la condicion que le hemos propuesto en la funcion, y que esta entre los rango de los numeros  y nos devuelve una suma de 34.
	}
	@DisplayName("Caja blanca cobertura de condiciones")
	@Test
	void Prueba6Funcion3() {
        assertEquals(0, Funciones.Funciones3(new int[] {4, 2, 20}));
        
        //Queremos hacer una decision en la que los numeros que hemos colocado no entrar en la condicion que le hemos puesto y por lo tanto nos saldria 0. 4,2,20 estan fuera del rango de 9 a 18
	}
	@DisplayName("Caja blanca de cobertura de condiciones")
	@Test
	void Prueba7Funcion3() {
        assertEquals(15, Funciones.Funciones3(new int[] {2, 15, 40}));
        
        //Hacemos una condicion en la que 2 y 40 no entran en el rango, pero si el numero 15 por lo tanto nos devolveria el numero 14.
	}
	@DisplayName("Caja blanca cobertura de condiciones")
	@Test
	void Prueba8Funcion3() {
        assertEquals(0, Funciones.Funciones3(new int[] {0, 0, 0}));
        //Hacemos una condicion en la que los 3 numeros colocados le pongamos 0, para que no nos haga suma, aun asi igualmente nos devolvera el numero 0.
	}

}
