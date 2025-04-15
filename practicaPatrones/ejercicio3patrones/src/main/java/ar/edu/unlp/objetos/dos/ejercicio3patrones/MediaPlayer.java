package ar.edu.unlp.objetos.dos.ejercicio3patrones;

import java.util.LinkedList;
import java.util.List;

public class MediaPlayer {
	private List<Media> medias;
	
	public MediaPlayer() {
		this.medias = new LinkedList<>();
	}
	
	public void addMedia(Media media) {
		this.medias.add(media);
	}
	
	public void play() {
		this.medias.stream().forEach(m -> m.play());
	}
	
}
