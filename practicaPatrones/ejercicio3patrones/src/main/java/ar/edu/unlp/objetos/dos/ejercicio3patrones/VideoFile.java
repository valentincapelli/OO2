package ar.edu.unlp.objetos.dos.ejercicio3patrones;

public class VideoFile implements Media{

	public VideoFile() {
		
	}
	
	@Override
	public void play() {
		System.out.print("Se esta reproduciendo un videofile.");
	}

}
