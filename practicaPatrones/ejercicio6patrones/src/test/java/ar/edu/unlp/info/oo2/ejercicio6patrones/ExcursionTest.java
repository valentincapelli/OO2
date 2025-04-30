package ar.edu.unlp.info.oo2.ejercicio6patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	/* 4.- Escriba un test para inscribir a un usuario en la excursión “Dos días en kayak 
	  bajando el Paraná”, con cupo mínimo de 1 persona y cupo máximo 2, con dos personas 
	  ya inscriptas. Implemente todos los mensajes que considere necesarios.*/
	
	Excursion excursion;
	Usuario usuario1;
	Usuario usuario2;
	Usuario usuario3;
	
	@BeforeEach
	void setUp() throws Exception {
		LocalDate inicio = LocalDate.of(2025, 4, 29);
		LocalDate fin = LocalDate.of(2025, 5, 3);
		excursion = new Excursion("Dos días en kayak bajando el Paraná", inicio, fin, "8 y 44", 250, 1, 2);
		usuario1 = new Usuario("Leo", "Messi", "leomessi@gmail.com");
		usuario2 = new Usuario("Lamine", "Yamal", "lamineyamal@gmail.com");
		usuario3 = new Usuario("Franco", "Mastantuono", "francomastantuono@gmail.com");
	}
	
    @Test
    public void inscribirTest() {
    	assertEquals(0, excursion.getCantidadInscriptos());
    	
    	excursion.inscribir(usuario1);
    	assertEquals(1, excursion.getCantidadInscriptos());
    	assertEquals("[leomessi@gmail.com]", excursion.getMailsDeInscriptos());

    	excursion.inscribir(usuario2);
    	assertEquals(2, excursion.getCantidadInscriptos());
    	assertEquals("[leomessi@gmail.com, lamineyamal@gmail.com]", excursion.getMailsDeInscriptos());
    	
    	excursion.inscribir(usuario3);
    	assertEquals(2, excursion.getCantidadInscriptos());
    	assertEquals("[leomessi@gmail.com, lamineyamal@gmail.com]", excursion.getMailsDeInscriptos());
    }
    
    @Test
    public void ofercerInformacionTest() {
    	assertEquals("Nombre: Dos días en kayak bajando el Paraná Costo: 250.0 Inicio: 2025-04-29 Fin: 2025-05-03 Punto de encuentro: 8 y 44 Usuarios faltantes para cupo minimo: 1", excursion.ofrecerInformacion());
    	excursion.inscribir(usuario1);
    	assertEquals("Nombre: Dos días en kayak bajando el Paraná Costo: 250.0 Inicio: 2025-04-29 Fin: 2025-05-03 Punto de encuentro: 8 y 44 Mails de inscriptos: [leomessi@gmail.com] Usuarios faltantes para cupo maximo: 1", excursion.ofrecerInformacion());
    	excursion.inscribir(usuario2);
    	assertEquals("Nombre: Dos días en kayak bajando el Paraná Costo: 250.0 Inicio: 2025-04-29 Fin: 2025-05-03 Punto de encuentro: 8 y 44", excursion.ofrecerInformacion());
    }
}
