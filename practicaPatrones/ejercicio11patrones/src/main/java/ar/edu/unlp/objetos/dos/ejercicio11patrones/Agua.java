package ar.edu.unlp.objetos.dos.ejercicio11patrones;

public class Agua implements Topografia{
	
	public Agua() {
		
	}

	public double proporcionAgua() {
		return 1;
	}

	public double proporcionTierra() {
		return 0;
	}

	public boolean esIgual(Topografia topografia) {
		return topografia.esIgualAgua();
	}

	public boolean esIgualTierra() {
		return false;
	}

	public boolean esIgualAgua() {
		return true;
	}

	public boolean esIgualMixta(Mixta unaMixta) {
		return false;
	}
	
}
