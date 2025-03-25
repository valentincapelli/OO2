package ar.edu.unlp.objetos.dos.ejercicio1;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Post> posteos;
	
	public Usuario(String string) {
		this.screenName = string;
		this.posteos = new LinkedList<Post>();
	}

	public String getScreenName() {
		return this.screenName;
	}
	
	public List<Post> getPosteos() {
		return this.posteos;
	}
	
	private void agregarPost(Post post) {
		this.posteos.add(post);
	}
	
	public void eliminarPost(Post post) {
		this.posteos.remove(post);
	}
	
	public void twitear(String texto) {
		Tweet tweet = new Tweet(this, texto);
		if (tweet.cumpleFormato()) {
			this.agregarPost(tweet);
		}
	}
	
	public Retweet retwitear(Post post) {
		Retweet retweet = new Retweet(this, post);
		this.agregarPost(retweet);
		post.agregarRetweet(retweet);
		return retweet;
	}
	
	public void borrarPosteos() {
		this.posteos.stream().forEach(post -> post.borrarReferenciasAlPost());
		this.posteos.clear();
	}
}
