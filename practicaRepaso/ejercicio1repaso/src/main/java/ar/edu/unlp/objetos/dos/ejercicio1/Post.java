package ar.edu.unlp.objetos.dos.ejercicio1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Post {
	private Usuario usuario;
	private List<Retweet> retweets;
	
	public Post(Usuario usuario) {
		this.usuario = usuario;
		this.retweets = new LinkedList<>();
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public void agregarRetweet(Retweet retweet) {
		this.retweets.add(retweet);
	}
	
	private void borrarRetweetsDelPost() {
		this.retweets.clear();
	}
	
	public List<Retweet> getRetweets(){
		return this.retweets;
	}
	
	public void borrarReferenciasAlPost() {
		this.retweets.stream().forEach(retweet -> retweet.getUsuario().eliminarPost(retweet));
		this.borrarRetweetsDelPost();
	}
	
}
