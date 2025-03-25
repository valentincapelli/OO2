package ar.edu.unlp.objetos.dos.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	Usuario user1;
	Usuario user2;
	Usuario user3;
	
	
	
	@BeforeEach
	public void SetUp() {
		user1 = new Usuario("user1");
		user2 = new Usuario("user2");
		user3 = new Usuario("user3");
	}
	
	@Test
	public void twitearTest() {
		assertEquals(0, user1.getPosteos().size());
		user1.twitear("Hola");
		assertEquals(1, user1.getPosteos().size());
	}
	
	public void retwitearTest() {
		assertEquals(0, user1.getPosteos().size());
		Tweet tweet1 = new Tweet(user2,"hola");
		user1.retwitear(tweet1);
		assertEquals(1, user1.getPosteos().size());
	}
	
	public void borrarPosteosTest() {
		assertEquals(0, user1.getPosteos().size());
		Tweet tweet1 = new Tweet(user2,"hola");
		user1.retwitear(tweet1);
		user1.borrarPosteos();
		assertEquals(0, user1.getPosteos().size());
	}
	
}
