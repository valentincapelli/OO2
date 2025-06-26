package ar.edu.unlp.objetos.dos.ejercicio2patrones;

public abstract class EmpleadoConHijos extends Empleado{
	private int cantidadDeHijos;
	
	public EmpleadoConHijos(boolean estaCasado, int cantidadDeHijos) {
		super(estaCasado);
		this.cantidadDeHijos = cantidadDeHijos;
		// TODO Auto-generated constructor stub
	}
	
	public Double sueldoAdicional() { //
		double result = 0;
		if (this.isEstaCasado())
			result = 5000;
		if (this.cantidadDeHijos > 0)
			result = result + (this.cantidadDeHijos * 2000);
		return result;
	}
	
}
