import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class CalculadoraTest {
	
		Calculadora c;
		
		@Before
		public void setUp(){
			c = new Calculadora();
			System.out.println("setUp");
		}
		
		@BeforeClass
		public static void setUpBeforeClass(){
			System.out.println("BeforeClass");
		}
		
		@After
		public void after(){
			c=null;
			System.out.println("After");
		}
		
		@AfterClass
		public static void afterClass(){
			System.out.println("After Class");
		}

		@Test
		public void sumarTest(){
			double valorEsperado=4;
			double valorReal= Calculadora.sumar(2,2); //2+2=4
			
			assertEquals(valorEsperado,valorReal,2);
			System.out.println("sumarTest");
		}
		
		@Test
		public void restarTest(){
			double valorEsperado=4;
			double valorReal= Calculadora.restar(6,2); //2-2=4
			
			assertEquals(valorEsperado,valorReal,0.001);
			System.out.println("restarTest");
		}
		
		@Test
		public void multiplicarTest(){
			double valorEsperado=4;
			double valorReal= Calculadora.multiplicar(2,2); //2-2=4
			
			assertEquals(valorEsperado,valorReal,0.001);
			System.out.println("multiplicarTest");
		}
		
		@Test
		public void dividirTest(){
			double valorEsperado=4;
			double valorReal= Calculadora.dividir(8,2); //2-2=4
			
			assertEquals(valorEsperado,valorReal,0.001);
			System.out.println("dividirTest");
		}
}
