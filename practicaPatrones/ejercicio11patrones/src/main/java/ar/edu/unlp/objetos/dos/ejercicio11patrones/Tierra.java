package ar.edu.unlp.objetos.dos.ejercicio11patrones;

public class Tierra implements Topografia{

	public Tierra() {
		
	}
	
	public double proporcionAgua() {
		return 0;
	}

	public double proporcionTierra() {
		return 1;
	}

	public boolean esIgual(Topografia topografia) {
		return topografia.esIgualTierra();
	}

	public boolean esIgualTierra() {
		return true;
	}

	public boolean esIgualAgua() {
		return false;
	}

	public boolean esIgualMixta(Mixta unaMixta) {
		return false;
	}

}
