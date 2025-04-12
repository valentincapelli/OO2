package ar.edu.unlp.objetos.dos.ejercicio2patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTemporarioTest {
	private EmpleadoTemporario empleadoCon0Horas;
	private EmpleadoTemporario empleadoCon1Horas;
	private EmpleadoTemporario empleadoCon2Horas;
	private EmpleadoTemporario empleadoCon0HorasNoCasado;
	private EmpleadoTemporario empleadoCon1HorasNoCasado;
	private EmpleadoTemporario empleadoCon2HorasNoCasado;
	
	
	@BeforeEach
	public void setUp() {
		empleadoCon0Horas = new EmpleadoTemporario(true, 0, 0);
		empleadoCon1Horas = new EmpleadoTemporario(true, 1, 1);
		empleadoCon2Horas = new EmpleadoTemporario(true, 2, 2);

		empleadoCon0HorasNoCasado = new EmpleadoTemporario(false, 0, 0);
		empleadoCon1HorasNoCasado = new EmpleadoTemporario(false, 1, 1);
		empleadoCon2HorasNoCasado = new EmpleadoTemporario(false, 2, 2);
	}
	

	@Test
	public void testSueldoBasico() {
		assertEquals(20000, empleadoCon0Horas.sueldoBasico());
		assertEquals(20300, empleadoCon1Horas.sueldoBasico());
		assertEquals(20600, empleadoCon2Horas.sueldoBasico());
	}
	
	@Test
	public void testSueldoAdicionalCasado() {
		assertEquals(5000, empleadoCon0Horas.sueldoAdicional());
		assertEquals(7000, empleadoCon1Horas.sueldoAdicional());
		assertEquals(9000, empleadoCon2Horas.sueldoAdicional());
	}
	
	@Test
	public void testSueldoAdicionalNoCasado() {
		assertEquals(0, empleadoCon0HorasNoCasado.sueldoAdicional());
		assertEquals(2000, empleadoCon1HorasNoCasado.sueldoAdicional());
		assertEquals(4000, empleadoCon2HorasNoCasado.sueldoAdicional());
	}
	
	@Test
	public void testSueldo() {
		assertEquals(17400, empleadoCon0HorasNoCasado.sueldo());
		assertEquals(19561, empleadoCon1HorasNoCasado.sueldo());
		assertEquals(21722, empleadoCon2HorasNoCasado.sueldo());
	}
	
	
	
}
