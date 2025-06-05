package ar.edu.unlp.objetos.dos.parcial_29_06_2024;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class PC {
	private List<Componente> componentes;
	private String nombre;
	private LocalDate fecha;
	
	public PC(String nombre, LocalDate fecha) {
		this.componentes = new LinkedList<>();
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public void agregarComponente(Componente componente) {
		this.componentes.add(componente);
	}
	
	public double calcularConsumo() {
		return this.componentes.stream()
						.mapToDouble(comp -> comp.getConsumo())
						.sum();
	}
	
	public double calcularPrecio() {
		double total = this.componentes.stream()
				.mapToDouble(comp -> comp.getPrecio())
				.sum();
		return total + (total * 0.21);
	}
}
