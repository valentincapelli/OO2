package ar.edu.unlp.objetos.dos.ejercicio2patrones;

public class EmpleadoPasante extends Empleado{
	private int cantidadDeExamenesQueRindio;
	
	public EmpleadoPasante(boolean estaCasado, int cantidadDeExamenesQueRindio) {
		super(estaCasado);
		this.cantidadDeExamenesQueRindio = cantidadDeExamenesQueRindio;
	}


	public Double sueldoAdicional() {
		return 2000.0 * this.cantidadDeExamenesQueRindio;
	}
	
}
