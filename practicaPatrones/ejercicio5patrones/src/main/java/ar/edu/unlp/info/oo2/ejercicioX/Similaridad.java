package ar.edu.unlp.info.oo2.ejercicioX;

public class Similaridad implements EstrategiaSugerencia {

	public Similaridad() {
		super();
	}
	
	@Override
	public String sugerir(Decodificador decodificador) {
		return decodificador.getPeliculasReproducidas().get(0).getSimilares().stream()
				.sorted((p1,p2) -> Integer.compare(p2.getAñoDeEstreno(), p1.getAñoDeEstreno()))
				.limit(3)
				.toList()
				.toString();
	}

}
