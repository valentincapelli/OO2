package ar.edu.unlp.info.oo2.ejercicioX;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecodificadorTest {
	public Decodificador decodificador;
	public Pelicula thor;
	public Pelicula capitanAmerica;
	public Pelicula ironman;
	public Pelicula dunkirk;
	public Pelicula rocky;
	public Pelicula rambo;
		
	@BeforeEach
	public void SetUp() {
		decodificador = new Decodificador();
		thor = new Pelicula("Thor", 7.9, 2007);
		capitanAmerica = new Pelicula("Capitan america", 7.8, 2016);
		ironman = new Pelicula("Iron Man", 7.9, 2010);
		dunkirk = new Pelicula("Dunkirk", 7.9, 2017);
		rocky = new Pelicula("Rocky", 8.1, 1976);
		rambo = new Pelicula("Rambo", 7.8, 1979);
	}
		
	@Test
	public void testSimilaridad() {
		
	}
}
		
