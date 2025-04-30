package ar.edu.unlp.info.oo2.ejercicio6patrones;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	private String nombre;
	private LocalDate fechaDeInicio;
	private LocalDate fechaDeFin;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private Situacion situacion;
	private List<Usuario> usuariosInscriptos;
	private List<Usuario> listaDeEspera;
	
	public Excursion(String nombre, LocalDate fechaDeInicio, LocalDate fechaDeFin, String puntoDeEncuentro,
			double costo, Integer cupoMinimo, Integer cupoMaximo) {
		this.nombre = nombre;
		this.fechaDeInicio = fechaDeInicio;
		this.fechaDeFin = fechaDeFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.situacion = new Provisoria();
		this.usuariosInscriptos = new LinkedList<>();
		this.listaDeEspera = new LinkedList<>();
	}
	
	public String ofrecerInformacion() {
		return this.situacion.ofrecerInformacion(this);
	}

	public void inscribir(Usuario usuario) {
		this.situacion.inscribir(usuario, this);
	}
	
	protected void setSituacion(Situacion situacion) {
		this.situacion = situacion;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeInicio() {
		return fechaDeInicio;
	}

	public LocalDate getFechaDeFin() {
		return fechaDeFin;
	}

	public String getPuntoDeEncuentro() {
		return puntoDeEncuentro;
	}

	public double getCosto() {
		return costo;
	}
	
	public void agregarInscripto(Usuario usuario) {
		this.usuariosInscriptos.add(usuario);
	}
	
	public void agregarAEspera(Usuario usuario) {
		this.listaDeEspera.add(usuario);
	}

	public Integer getCupoMinimo() {
		return cupoMinimo;
	}

	public Integer getCupoMaximo() {
		return cupoMaximo;
	}
	
	public int getCantidadInscriptos() {
		return this.usuariosInscriptos.size();
	}
	
	public int usuariosFaltantesParaCupoMinimo() {
		return this.cupoMinimo - this.usuariosInscriptos.size();
	}
	
	public int usuariosFaltantesParaCupoMaximo() {
		return this.cupoMaximo - this.usuariosInscriptos.size();
	}
	
	public String getMailsDeInscriptos() {
		return this.usuariosInscriptos.stream()
				.map(usuario -> usuario.getEmail())
				.collect(Collectors.toList()).toString();
	}
}
