package ar.edu.unlp.objetos.dos.primeraFecha_08_06_2024;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private double salarioMensual;
	private List<Prestamo> prestamos;
	
	public Cliente(String nombre, double salarioMensual) {
		this.nombre = nombre;
		this.salarioMensual = salarioMensual;
		this.prestamos = new ArrayList<>();
	}
	
	public double calcularTreinta() {
		return this.salarioMensual * 0.30;
	}
	
	public void agregarPrestamo(Prestamo prestamo) {
		this.prestamos.add(prestamo);
	}
}
