package ar.edu.unlp.objetos.dos.ejercicio1;

import java.util.List;
import java.util.Set;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		
	}
	
	private boolean existeUsuario(Usuario usuario) {
		return this.usuarios.stream()
				.anyMatch(usu -> usu.getScreenName().equals(usuario.getScreenName()));
	}
	
	public void agregarUsuario(Usuario usuario) {
		if (!this.existeUsuario(usuario)) {
			this.usuarios.add(usuario);
		}		
	}
	
	public void eliminarUsuario(Usuario usuario) {
		if (this.existeUsuario(usuario)) {
			this.usuarios.remove(usuario);
			usuario.borrarPosteos();
		}
	}

}
