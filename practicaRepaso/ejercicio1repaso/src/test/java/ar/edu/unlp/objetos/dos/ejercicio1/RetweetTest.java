package ar.edu.unlp.objetos.dos.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RetweetTest {
	Usuario user1;
	Usuario user2;
	Usuario user3;
	Tweet tweet1;
	
	
	
	@BeforeEach
	public void SetUp() {
		user1 = new Usuario("user1");
		user2 = new Usuario("user2");
		user3 = new Usuario("user3");
	}
	
	@Test
	public void borrarReferenciasAlPostTest() {
		Tweet tweet1 = new Tweet(user1,"Hola");
		user2.retwitear(tweet1);
		user3.retwitear(tweet1);
		assertEquals(2, tweet1.getRetweets().size());
		assertEquals(1, user2.getPosteos().size());
		assertEquals(1, user3.getPosteos().size());
		
		tweet1.borrarReferenciasAlPost();
		assertEquals(0, tweet1.getRetweets().size());
		assertEquals(0, user2.getPosteos().size());
		assertEquals(0, user3.getPosteos().size());
	}
}
