package ar.edu.unlp.info.oo2.ejercicio11bpatrones;

public class Pantano implements Topografia{

	@Override
	public double proporcionAgua() {
		return 0.7;
	}

	@Override
	public double proporcionTierra() {
		return 0.3;
	}

	@Override
	public boolean esIgual(Topografia topografia) {
		return topografia.esIgualPantano();
	}

	@Override
	public boolean esIgualTierra() {
		return false;
	}

	@Override
	public boolean esIgualAgua() {
		return false;
	}

	@Override
	public boolean esIgualMixta(Mixta unaMixta) {
		return false;
	}
	
	@Override
	public boolean esIgualPantano() {
		return true;
	}

}
