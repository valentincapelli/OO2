package ar.edu.unlp.info.oo2.ejercicioX;

import java.util.LinkedList;
import java.util.List;

public class Novedad implements EstrategiaSugerencia {
	
	public Novedad() {
		super();
	}

	public String sugerir(Decodificador decodificador) {
		return decodificador.getPeliculasDiponiblesNoVistas().stream()
				.sorted((p1,p2) -> Integer.compare(p2.getAñoDeEstreno(), p1.getAñoDeEstreno()))
				.limit(3)
				.toList()
				.toString();
	}

}
