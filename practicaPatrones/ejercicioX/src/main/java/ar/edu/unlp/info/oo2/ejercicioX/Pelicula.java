package ar.edu.unlp.info.oo2.ejercicioX;

import java.util.LinkedList;
import java.util.List;

public class Pelicula {
	private String nombrePelicula;
	private int añoDeEstreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String nombrePelicula, double puntaje, int añoDeEstreno) {
		this.nombrePelicula = nombrePelicula;
		this.añoDeEstreno = añoDeEstreno;
		this.puntaje = puntaje;
		this.similares = new LinkedList<>();
	}
	
	public String getNombrePelicula() {
		return nombrePelicula;
	}
	public int getAñoDeEstreno() {
		return añoDeEstreno;
	}
	public double getPuntaje() {
		return puntaje;
	}
	public List<Pelicula> getSimilares() {
		return similares;
	}
	private void agregarse(Pelicula pelicula) {
		this.similares.add(pelicula);
	}
	public void agregarSimilar(Pelicula pelicula) {
		this.similares.add(pelicula);
		pelicula.agregarse(this);
	}
}
