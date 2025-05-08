package ar.edu.unlp.objetos.dos.ejercicio11patrones;

public interface Topografia {
	
	public double proporcionAgua();
	
	public double proporcionTierra();
	
	public boolean esIgual(Topografia topografia);
	
	public boolean esIgualTierra();
	
	public boolean esIgualAgua();
	
	public boolean esIgualMixta(Mixta unaMixta);
	
}
