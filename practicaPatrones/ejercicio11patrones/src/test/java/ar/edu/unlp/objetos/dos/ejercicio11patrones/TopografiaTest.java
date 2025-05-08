package ar.edu.unlp.objetos.dos.ejercicio11patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	Agua ejemploA;
	Tierra ejemploB;
	Mixta ejemploC;
	Mixta ejemploD;
	List<Topografia> listaC;
	List<Topografia> listaD2;
	List<Topografia> listaD1;
	
	@BeforeEach
	void setUp() throws Exception {
		ejemploA = new Agua();
		
		ejemploB = new Tierra();
		
		listaC = new LinkedList<>();
		listaC.add(new Agua());
		listaC.add(new Tierra());
		listaC.add(new Tierra());
		listaC.add(new Agua());
		ejemploC = new Mixta(listaC);
		
		listaD2 = new LinkedList<>();
		listaD2.add(new Agua());
		listaD2.add(new Tierra());
		listaD2.add(new Tierra());
		listaD2.add(new Agua());
		listaD1 = new LinkedList<>();
		listaD1.add(new Agua());
		listaD1.add(new Tierra());
		listaD1.add(new Tierra());
		listaD1.add(new Mixta(listaD2));
		ejemploD = new Mixta(listaD1);
	}
	
    @Test
    public void ejemploA() {
    	assertEquals(1, ejemploA.proporcionAgua());
    	assertEquals(0, ejemploA.proporcionTierra());
    	assertFalse(ejemploA.esIgual(ejemploB));
    	assertFalse(ejemploA.esIgual(ejemploC));
    	assertTrue(ejemploA.esIgual(new Agua()));
    }
    
    @Test
    public void ejemploB() {
    	assertEquals(0, ejemploB.proporcionAgua());
    	assertEquals(1, ejemploB.proporcionTierra());
    	assertFalse(ejemploB.esIgual(ejemploA));
    	assertFalse(ejemploB.esIgual(ejemploC));
    	assertTrue(ejemploB.esIgual(new Tierra()));
    }
    
    @Test
    public void ejemploC() {
    	assertEquals(0.5, ejemploC.proporcionAgua());
    	assertEquals(0.5, ejemploC.proporcionTierra());
    	assertFalse(ejemploC.esIgual(ejemploB));
    	assertFalse(ejemploC.esIgual(ejemploA));
    	assertTrue(ejemploC.esIgual(new Mixta(listaD2)));
    }
    
    @Test
    public void ejemploD() {
    	assertEquals((1.5 / 4), ejemploD.proporcionAgua());
    	assertEquals(1 - (1.5 / 4), ejemploD.proporcionTierra());
    	assertFalse(ejemploD.esIgual(ejemploB));
    	assertFalse(ejemploD.esIgual(ejemploC));
    	assertTrue(ejemploD.esIgual(new Mixta(listaD1)));
    }
}
