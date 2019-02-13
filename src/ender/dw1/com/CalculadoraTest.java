package ender.dw1.com;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;


class CalculadoraTest {
	//@ParameterizedTest
	@DisplayName("Prueba con ternas para el método suma")
	@ParameterizedTest(name = "{index} => a={0}, b={1}, resutadoTeorico={2}")		
	@CsvSource({"3,4,7","5,6,11","9,10,0", "100,100,300"}) //pares con los que probar separados por comas
	void pruebasParametricasSuma(int a, int b, int resultadoTeorico) {
		Calculadora micalculadora = new Calculadora(a,b);				
		assertEquals(micalculadora.suma(),resultadoTeorico);		
	}
	
	@Test
	void testResta() {
		Calculadora micalculadora = new Calculadora(5, 3);			
		// El assertEquals no dara error siempre que el
		// primer parametro sea igual al segundo
		// Nosotros sabemos que 2 es la resta de 5 y 3
		// que son los valores con los que hemos creado el objeto		
		assertEquals(2, micalculadora.resta());
		
	}

	@Test
	void testMultiplica() {
		Calculadora micalculadora = new Calculadora(5, 3);
		int resultado = micalculadora.multiplica();	
		// El assertEquals no dara error siempre que el
		// primer parametro sea igual al segundo
		// Nosotros sabemos que 15 es el producto de 5 y 3
		// que son los valores con los que hemos creado el objeto
		
		assertEquals(15, resultado);
	}

	@Test
	void testDivide() {
		Calculadora micalculadora = new Calculadora(5, 1);
		int resultado = micalculadora.divide();
		assertEquals(5, resultado);
	}
	
	

	@ParameterizedTest(name = "{index} => a={0}, b={1}, resutadoTeorico={2}")		
	@CsvSource({"3,4,7","5,6,11","9,10,0", "100,100,200"}) //pares con los que probar separados por comas
	public void sumaFunciona(int a, int b, int valorEsperado){		
		Calculadora micalcu = new Calculadora(a,b);
		int resultado = micalcu.suma();
		//ahora miro si es cierto
		assertEquals(valorEsperado,resultado);
	}
	
	
	
	
	@Test 
	public void testExcepcion() {
		try {
			Calculadora micalculadora = new Calculadora(5, 0);
			int resultado = micalculadora.divide();			
			//si ha llegado hasta aquí es uue no ha funcionado la division por cero
			fail("Fallo, debería haber dado división entre cero");
		}catch (ArithmeticException e) {
			//ha fallado con division por cero	
			
		}
		
		
		
	}

}
