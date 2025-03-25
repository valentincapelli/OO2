package ar.edu.unlp.objetos.dos.ejercicio1;

public class Tweet extends Post{
	private String texto;
	
	public Tweet(Usuario usuario, String texto) {
		super(usuario);
		this.texto = texto;
	}
	
	public boolean cumpleFormato() {
		return this.texto.length() >= 1 && this.texto.length() <= 280;
	}

}
