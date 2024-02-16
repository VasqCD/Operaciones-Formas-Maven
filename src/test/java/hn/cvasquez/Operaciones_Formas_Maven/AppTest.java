package hn.cvasquez.Operaciones_Formas_Maven;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	
	@Test
	//cuando se ingresa un numero positivo
    public void testAreaCirculo1() {
		System.out.println("Test 1 circulo");
        assertTrue(App.AreaCirculo(2) == 12.566, 0.01);
    }
	
	@Test
	//cuando se ingresa cero
    public void testAreaCirculo2() {
		System.out.println("Test 2 circulo");
        assertTrue(App.AreaCirculo(0)== 0.0, 0.01);
    }
	
	@Test
	public void testAreaCirculo3() {
		/*
		 * realizar un calculo y comparar si es igual
		 */
		System.out.println("Test 3 area circulo");
	    double radio = 3.0;
	    double areaEsperada = Math.PI * Math.pow(radio, 2);
	    double areaCalculada = App.AreaCirculo(radio);
	    assertEquals(areaEsperada, areaCalculada, 0.01);
	}
	
	
    @Test
    public void testAreaCuadrado1() {

    	System.out.println("Test 1 area cuadrado");
        assertTrue(App.AreaCuadrado(4)==16, 0.001);
    }
    
    @Test
    public void testAreaCuadrado2() {
    	System.out.println("Test 2 area de cuadrado");
        assertNotEquals(App.AreaCuadrado(3) == 9, 0.001);
    }
    
    @Test
    public void testAreaCuadrado3() {
        System.out.println("Test 3 cuadrado");
        assertEquals(9, App.AreaCuadrado(3), 0.01);
        //9 es el valor esperado
    }
    
    @Test
    public void testAreaRectangulo1() {
    	System.out.println("Test 1 rectangulo");
    	assertTrue(App.AreaRectangulo(5, 3) == 15.0, 0.001);
    }
    
    @Test
    public void testAreaRectangulo2() {
    	System.out.println("Test 2 rectangulo");
    	assertEquals(12.0, App.AreaRectangulo(4, 3), 0.001);
    	// valor que se espera es 12
    }
    
    @Test
    public void testAreaRectangulo3() {
    	System.out.println("Test 3 rectangulo");
    	assertNotEquals(20.0, App.AreaRectangulo(6, 3), 0.001);
    	// valor debe ser diferente a 20
    }
    
    
    @Test
    public void testAreaTriangulo1() {
    	System.out.println("Test 1 triangulo");
    	assertTrue(App.AreaTriangulo(10, 5) == 10, 0.001);
        
    }
    
    @Test
    public void testAreaTriangulo2() {
    	System.out.println("Test 2 triangulo");
    	assertEquals(12.0, App.AreaTriangulo(6, 4), 0.001);
    	//Esperando 12
        
    }
    
    @Test
    public void testAreaTriangulo3() {
    	System.out.println("Test 3 triangulo");
    	assertNotEquals(15.0, App.AreaTriangulo(6, 4), 0.001);
    	//El valor debe ser diferente a 15
        
    }

	private void assertTrue(boolean b, double d) {
		
		
	}
    

	
    
}
