package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;


public class BibliotecaTest {


	@BeforeEach
	public void SetUp() {
		Biblioteca biblioteca = new Biblioteca();
	}
	
	@Test
	public void borrarReferenciasAlPostTest() throws JsonProcessingException {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		
		System.out.println("Formato json manual");
		System.out.println(biblioteca.exportarSocios());
		
		System.out.println("Formato json con JSON adapter");
		biblioteca.setExporter(new JsonAdapter());
		System.out.println(biblioteca.exportarSocios());
		
		System.out.println("Formato json con Jackson adapter");
		biblioteca.setExporter(new JacksonAdapter());
		System.out.println(biblioteca.exportarSocios());
		
		// CONSULTAR TEST
		
	}
}
