package ar.edu.unlp.info.oo2.ejercicioX;

public class Puntaje implements EstrategiaSugerencia {
	
	public Puntaje() {
		super();
	}

	@Override
	public String sugerir(Decodificador decodificador) {
		return decodificador.getPeliculasDisponibles().stream()
				.sorted((p1, p2) -> {
					int cmp = Double.compare(p2.getPuntaje(), p1.getPuntaje()); // primero por puntaje
					if (cmp == 0) {
						return Integer.compare(p2.getAñoDeEstreno(), p1.getAñoDeEstreno()); // si empatan, por año
					}
					return cmp;
				})
				.limit(3)
				.toList()
				.toString();
	}

}
