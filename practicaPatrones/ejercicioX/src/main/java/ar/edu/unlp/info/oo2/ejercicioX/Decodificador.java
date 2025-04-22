package ar.edu.unlp.info.oo2.ejercicioX;

import java.util.LinkedList;
import java.util.List;

public class Decodificador {
	private EstrategiaSugerencia estrategiaSugerencia;
	private List<Pelicula> peliculasDisponibles;
	private List<Pelicula> peliculasReproducidas;
	
	public Decodificador() {
		peliculasDisponibles = new LinkedList<>();
		peliculasReproducidas = new LinkedList<>();
	}
	public void setEstrategiaSugerencia(EstrategiaSugerencia estrategiaSugerencia) {
		this.estrategiaSugerencia = estrategiaSugerencia;
	}
	public EstrategiaSugerencia getEstrategiaSugerencia() {
		return estrategiaSugerencia;
	}
	public List<Pelicula> getPeliculasDisponibles() {
		return peliculasDisponibles;
	}
	public List<Pelicula> getPeliculasReproducidas() {
		return peliculasReproducidas;
	}
	public String mostrarGrilla() {
		return this.peliculasDisponibles.toString();
	}
	public String sugerir() {
		return this.estrategiaSugerencia.sugerir(this);
	}
	public void addPeliculaDisponible(Pelicula pelicula) {
		this.peliculasDisponibles.add(pelicula);
	}
	public void addPeliculaVista(Pelicula pelicula) {
		this.peliculasReproducidas.add(pelicula);
	}
	protected List<Pelicula> getPeliculasDiponiblesNoVistas() {
		return this.peliculasDisponibles.stream()
				.filter(pelicula -> !peliculasReproducidas.contains(pelicula)).toList();
	}
	
}
