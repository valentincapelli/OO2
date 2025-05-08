package ar.edu.unlp.info.oo2.ejercicio11bpatrones;

import java.util.LinkedList;
import java.util.List;

public class Mixta implements Topografia{
	private List<Topografia> topografias;
	
	public Mixta(List<Topografia> topografias) {
		if (topografias.size() == 4)
			this.topografias = new LinkedList<>(topografias);
		else
			throw new RuntimeException("La lista de topografias debe contener 4 topografias.");
	}
	
	public double proporcionAgua() {
		return this.topografias.stream()
				.mapToDouble(t -> t.proporcionAgua())
				.average().orElse(0);
	}

	public double proporcionTierra() {
		return this.topografias.stream()
				.mapToDouble(t -> t.proporcionTierra())
				.average().orElse(0);
	}

	public boolean esIgual(Topografia topografia) {
		return topografia.esIgualMixta(this);
	}

	public boolean esIgualTierra() {
		return false;
	}

	public boolean esIgualAgua() {
		return false;
	}
	
	public boolean esIgualMixta(Mixta unaMixta) {
		//return this.topografias.equals(unaMixta.getTopografias());
		return java.util.stream.IntStream.range(0, 4)
				.allMatch(i -> this.topografias.get(i)
				.esIgual(unaMixta.getTopografias().get(i)));		
	}
	
	public List<Topografia> getTopografias() {
		return topografias;
	}

	@Override
	public boolean esIgualPantano() {
		return false;
	}

}
