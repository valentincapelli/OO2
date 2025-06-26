package ar.edu.unlp.info.oo2.parcial_8_8_2022;

import java.time.LocalDate;

public class Proyecto {
	private State state;
	private String nombre;
	private LocalDate inicio;
	private LocalDate fin;
	private String objetivo;
	private double margenDeGanancia;
	private int numeroDeIntegrantes;
	private double montoDePagoPorIntegrante;
	
	public Proyecto(String nombre, LocalDate inicio, LocalDate fin, String objetivo, 
			int numeroDeIntegrantes, double montoDePagoPorIntegrante) {
		this.state = new Construccion();
		this.margenDeGanancia = 0.07;
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
		this.objetivo = objetivo;
		this.numeroDeIntegrantes = numeroDeIntegrantes;
		this.montoDePagoPorIntegrante = montoDePagoPorIntegrante;
	}
	
	public void aprobarEtapa() {
		this.state.aprobarEtapa(this);
	}
	
	public double costoDelProyecto() {
		return this.state.costoDelProyecto(this);
	}
	
	public double precioDelProyecto() {
		return this.state.precioDelProyecto(this);
	}
	
	public void modificarMargenDeGanancia(int margenDeGanancia) {
		this.state.modificarMargenDeGanancia(this, margenDeGanancia);
	}
	
	public void cancelarProyecto() {
		this.state.cancelarProyecto(this);
	}
	
	protected void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public LocalDate getFin() {
		return fin;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public double getMargenDeGanancia() {
		return margenDeGanancia;
	}

	public int getNumeroDeIntegrantes() {
		return numeroDeIntegrantes;
	}

	public double getMontoDePagoPorIntegrante() {
		return montoDePagoPorIntegrante;
	}

	public void setMargenDeGanancia(int margenDeGanancia) {
		this.margenDeGanancia = margenDeGanancia;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
}
