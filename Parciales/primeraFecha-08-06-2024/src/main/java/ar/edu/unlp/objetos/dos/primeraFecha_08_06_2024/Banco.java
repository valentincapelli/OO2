package ar.edu.unlp.objetos.dos.primeraFecha_08_06_2024;

import java.util.*;

public class Banco {
	private double interesSimple; 
	private List<Cliente> clientes;
	private List<Prestamo> prestamos;
	
	public Banco(double interesSimple) {
		this.interesSimple = interesSimple;
		this.clientes = new ArrayList<>();
		this.prestamos = new ArrayList<>();
	}
	
	public void registrarCliente(Cliente cliente) {
		if (!clientes.contains(cliente)) {
			this.clientes.add(cliente);
		}
	}
	
	public void agregarPrestamo(Prestamo prestamo) {
		this.prestamos.add(prestamo);
	}
	
	public PrestamoSimple solicitarPrestamoSimple(double montoSolicitado, int cantCuotas, Cliente cliente) {
		PrestamoSimple simple =  new PrestamoSimple(montoSolicitado, cantCuotas, cliente, this.interesSimple);
		this.agregarPrestamo(simple);
		return simple;
	}
	
	public PrestamoUVA solicitarPrestamoUVA(double montoSolicitado, int cantCuotas, Cliente cliente) {
		PrestamoUVA uva =  new PrestamoUVA(montoSolicitado, cantCuotas, cliente);
		this.agregarPrestamo(uva);
		return uva;
	}
}
