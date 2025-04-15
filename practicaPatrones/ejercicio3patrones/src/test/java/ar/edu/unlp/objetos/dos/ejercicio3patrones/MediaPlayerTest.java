package ar.edu.unlp.objetos.dos.ejercicio3patrones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaPlayerTest {
	private MediaPlayer mp;
	private Audio audio;
	private VideoFile videoFile;
	private VideoStreamAdapter vsa;
	
	@BeforeEach
	public void SetUp() {
		mp = new MediaPlayer();
		audio = new Audio();
		videoFile = new VideoFile();
		vsa = new VideoStreamAdapter();
	}
	
	@Test
	public void playTest() {
		mp.play(); // no imprime nada
		System.out.print("No se imprime nada \n");
		
		mp.addMedia(audio);
		mp.play(); // imprime que se reproduce audio
		System.out.print("\n");
		
		mp.addMedia(videoFile);
		mp.play(); // imprime que se reproduce audio y videofile
		System.out.print("\n");
		
		mp.addMedia(vsa);
		mp.play(); // imprime que se reproduce audio, videofile y videostream
	}
}
