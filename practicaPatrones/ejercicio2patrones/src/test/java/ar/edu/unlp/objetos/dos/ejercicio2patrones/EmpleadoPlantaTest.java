package ar.edu.unlp.objetos.dos.ejercicio2patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoPlantaTest {
	private EmpleadoPlanta empleadoCon0Años;
	private EmpleadoPlanta empleadoCon1Años;
	private EmpleadoPlanta empleadoCon2Años;
	
	@BeforeEach
	public void setUp() {
		empleadoCon0Años = new EmpleadoPlanta(true, 0, 0);
		empleadoCon1Años = new EmpleadoPlanta(true, 0, 1);
		empleadoCon2Años = new EmpleadoPlanta(true, 0, 2);
	}
	

	@Test
	public void testSueldoBasico() {
		assertEquals(50000, empleadoCon0Años.sueldoBasico());
		assertEquals(50000, empleadoCon1Años.sueldoBasico());
		assertEquals(50000, empleadoCon2Años.sueldoBasico());
	}
	
	@Test
	public void testSueldoAdicionalCasado() {
		assertEquals(5000, empleadoCon0Años.sueldoAdicional());
		assertEquals(7000, empleadoCon1Años.sueldoAdicional());
		assertEquals(9000, empleadoCon2Años.sueldoAdicional());
	}
	
	@Test
	public void testSueldo() {
		assertEquals(48250, empleadoCon0Años.sueldo());
		assertEquals(50150, empleadoCon1Años.sueldo());
		assertEquals(52050, empleadoCon2Años.sueldo());
	}
	
}
