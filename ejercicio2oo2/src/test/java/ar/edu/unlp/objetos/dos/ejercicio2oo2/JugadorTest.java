package ar.edu.unlp.objetos.dos.ejercicio2oo2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadorTest {
	private Objeto piedra;
	private Objeto tijera;
	private Objeto papel;
	private Objeto spock;
	private Objeto lagarto;
	
	@BeforeEach
	public void setUp() {
		piedra = new Piedra();
		tijera = new Tijera();
		papel = new Papel();
		spock = new Spock();
		lagarto = new Lagarto();
	}
	
	@Test
	public void jugarTest() {
		Jugador j1 = new Jugador(piedra);
		Jugador j2 = new Jugador(papel);
		Jugador j3 = new Jugador(tijera);
		Jugador j4 = new Jugador(spock);
		Jugador j5 = new Jugador(lagarto);
		
		
		assertEquals("Gana piedra", j1.Jugar(j3));
		assertEquals("Gana papel", j1.Jugar(j2));
		assertEquals("Empate", j1.Jugar(j1));
		assertEquals("Gana spock", j1.Jugar(j4));
		assertEquals("Gana piedra", j1.Jugar(j5));
	}
	
}
