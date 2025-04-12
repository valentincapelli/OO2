package ar.edu.unlp.objetos.dos.ejercicio2patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoPasanteTest {
	private EmpleadoPasante empleadoSinExamenes;
	private EmpleadoPasante empleadoConUnExamen;
	private EmpleadoPasante empleadoConDosExamenes;
	
	@BeforeEach
	public void setUp() {
		empleadoSinExamenes = new EmpleadoPasante(true, 0, 0);
		empleadoConUnExamen = new EmpleadoPasante(true, 0, 1);
		empleadoConDosExamenes = new EmpleadoPasante(true, 0, 2);
	}
	

	@Test
	public void testSueldoBasico() {
		assertEquals(20000, empleadoSinExamenes.sueldoBasico());
		assertEquals(20000, empleadoConUnExamen.sueldoBasico());
		assertEquals(20000, empleadoConDosExamenes.sueldoBasico());
		
	}
	
	@Test
	public void testSueldoAdicional() {
		assertEquals(0, empleadoSinExamenes.sueldoAdicional());
		assertEquals(2000, empleadoConUnExamen.sueldoAdicional());
		assertEquals(4000, empleadoConDosExamenes.sueldoAdicional());
		
	}
	
	@Test
	public void testSueldoDescuento() {
		System.out.print("sueldo descuento: " + empleadoSinExamenes.sueldoDescuento());
		assertEquals(2600, empleadoSinExamenes.sueldoDescuento());
		assertEquals(2700, empleadoConUnExamen.sueldoDescuento());
		assertEquals(2800, empleadoConDosExamenes.sueldoDescuento());
	}
	
	@Test
	public void testSueldo() {
		assertEquals(17400, empleadoSinExamenes.sueldo());
		assertEquals(19300, empleadoConUnExamen.sueldo());
		assertEquals(21200, empleadoConDosExamenes.sueldo());
	}
	
}
