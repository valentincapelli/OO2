package ar.edu.unlp.info.oo2.ejercicio11bpatrones;

public interface Topografia {
	
	public double proporcionAgua();
	
	public double proporcionTierra();
	
	public boolean esIgual(Topografia topografia);
	
	public boolean esIgualTierra();
	
	public boolean esIgualAgua();
	
	public boolean esIgualMixta(Mixta unaMixta);
	
	public boolean esIgualPantano();
	
}
