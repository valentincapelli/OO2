package ar.edu.unlp.objetos.dos.ejercicio3patrones;

public class Audio implements Media{

	public Audio() {
		
	}

	@Override
	public void play() {
		System.out.print("Se esta reproduciendo un audio.");
	}

}
