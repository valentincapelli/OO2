package ar.edu.unlp.objetos.dos.ejercicio7patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	Calculadora c;
	
	@BeforeEach
	void setUp() throws Exception {
		c = new Calculadora();
	}
	
    @Test
    public void testSuma() {
        c.setValor(4);
        c.mas();
        c.setValor(6);
        assertEquals("10.0", c.resultado());
        c.mas();
        c.setValor(5);
        assertEquals("15.0", c.resultado());
    }
    
    @Test
    public void testResta() {
    	c.setValor(4);
        c.menos();
        c.setValor(1);
        assertEquals("3.0", c.resultado());
        c.menos();
        c.setValor(2);
        assertEquals("1.0", c.resultado());
    }
    
    @Test
    public void testMultiplicacion() {
    	c.setValor(10);
        c.por();
        c.setValor(2);
        assertEquals("20.0", c.resultado());
        c.por();
        c.setValor(3);
        assertEquals("60.0", c.resultado());
    }
    
    @Test
    public void testDivision() {
    	c.setValor(10);
        c.dividido();
        c.setValor(2);
        assertEquals("5.0", c.resultado());
        c.dividido();
        c.setValor(5);
        assertEquals("1.0", c.resultado());
    }
    
    public void testErrror() {
    	c.setValor(10);
        c.dividido();
        c.dividido();
        assertEquals("Error", c.resultado());
        c.setValor(10);
        c.mas();
        c.mas();
        assertEquals("Error", c.resultado());
        c.setValor(10);
        c.menos();
        c.menos();
        assertEquals("Error", c.resultado());
        c.setValor(10);
        c.menos();
        c.menos();
        assertEquals("Error", c.resultado());
        c.setValor(0);
        assertEquals("Error", c.resultado());
    }
}
