import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebasFunciones5{
    static Funciones funcion = null;
    static int pruebasRealizadas = 0;
    @BeforeAll
    static void prepararPruebas() {
        System.out.println("Preparando Tests");
        funcion = new Funciones();
    }
    @BeforeEach
    private void preparaPruebaEjecutar() {
        pruebasRealizadas++;
        System.out.println("Ejecutando test " + pruebasRealizadas);
    }
    @AfterEach
    private void terminadaPrueba() {
        System.out.println("Se ha ejecutado el test: " + pruebasRealizadas);
    }
    @AfterAll
    static void terminarPruebas() {
        System.out.println("Se ha terminado de ejecutar todas las pruebas");
        funcion = null;
    }

	@DisplayName("Primera prueba caja negra, con cadena vacia")
	@Test
	void test1() {
		assertEquals(0, funcion.funcion5("", 7, 8));
		
		// Cuando dejamos un hueco vacio en el signo de la operacion, nos devuelve 0.
	}
	@DisplayName("Segunda prueba caja negra, con un caracter")
	@Test
	void test2() {
		assertEquals(0, funcion.funcion5("Q", 10, 10));
		// q no esta registrado como un signo de operacion, asi que da 0
	}

	@DisplayName("Tercera prueba caja negra, al azar")
	@Test
	void test3() {
		assertEquals(944982, funcion.funcion5("*", 2234, 423));
		
		// He elegido dos numero al azar
	}

	@DisplayName("Cuarta prueba caja negra, valores limite inferior")
	@Test
	void test4() {
		assertEquals(0, funcion.funcion5("-", 2147483647, 2147483647));
		
		// El valor limite inferior de Int es de 2147483647 y nos daria como resultado 0.
	}
	@DisplayName("Primera prueba caja blanca de condiciones")
	@Test
	void test5() {
		assertEquals(11, funcion.funcion5("+", 1, 10));
		
		// + suma los dos numeros.
	}
	@DisplayName("Segunda prueba caja blanca de condiciones")
	@Test
	void test6() {
		assertEquals(-9, funcion.funcion5("-", 1, 10));
		
		// - resta los dos numeros.
	}
	@DisplayName("Tercera prueba caja blanca de condiciones")
	@Test
	void test7() {
		assertEquals(10, funcion.funcion5("*", 1, 10));
		
		// * multiplica los dos numeros.
	}
	@DisplayName("Cuarta prueba caja blanca de condiciones")
	@Test
	void test8() {
		assertEquals(0, funcion.funcion5("%", 1, 10));
		
		//% no esta recogido como signo de operacion
	}	

}